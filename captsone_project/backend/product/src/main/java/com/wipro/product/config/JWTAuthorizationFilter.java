package com.wipro.product.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.ws.rs.HttpMethod;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;
import com.wipro.product.util.AppConstant;
import java.io.IOException;
import java.security.Key;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;

public class JWTAuthorizationFilter extends OncePerRequestFilter {

    private static final String HEADER = "Authorization";
    private static final String PREFIX = "Bearer ";

    @Override
    protected void doFilterInternal(HttpServletRequest req, HttpServletResponse res, FilterChain chain)
            throws IOException, ServletException {

        if (HttpMethod.OPTIONS.matches(req.getMethod())) {
            chain.doFilter(req, res);
            return;
        }

        try {
            if (hasToken(req)) {
                Claims claims = parseToken(req);
                if (claims.get("authorities") != null) {
                    setAuth(claims);
                }
            }
            chain.doFilter(req, res);
        } catch (ExpiredJwtException eje) {
            res.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            res.getWriter().write("Token expired");
        } catch (JwtException e) {
            res.setStatus(HttpServletResponse.SC_FORBIDDEN);
            res.getWriter().write(e.getMessage());
        }
    }

    private boolean hasToken(HttpServletRequest req) {
        String header = req.getHeader(HEADER);
        return header != null && header.startsWith(PREFIX);
    }

    private Claims parseToken(HttpServletRequest req) {
        String token = req.getHeader(HEADER).replace(PREFIX, "");
        Key key = Keys.hmacShaKeyFor(Base64.getDecoder().decode(AppConstant.SECRET));
        return Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token).getBody();
    }

    private void setAuth(Claims claims) {
        List<String> roles = (List<String>) claims.get("authorities");
        var auth = new UsernamePasswordAuthenticationToken(
                claims.getSubject(), null,
                roles.stream().map(SimpleGrantedAuthority::new).toList());
        SecurityContextHolder.getContext().setAuthentication(auth);
    }
}
