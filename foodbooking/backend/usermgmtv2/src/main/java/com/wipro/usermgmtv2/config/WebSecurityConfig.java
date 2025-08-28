package com.wipro.usermgmtv2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.cors.CorsConfigurationSource;

import java.util.Arrays;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
	
	  @Bean
	    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	        return http
	            .csrf(csrf -> csrf.disable())
	            .authorizeHttpRequests(auth -> auth
	                .requestMatchers("/user/login").permitAll()   // allow login without auth
	                .anyRequest().permitAll()  // or secure other user endpoints if you want
	            )
	            .build();
	    }

}






//@EnableWebSecurity
//@Configuration
//public class WebSecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        return http
//            .cors() // enable CORS
//            .and()
//            .addFilterAfter(new JWTAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class)
//            .csrf(csrf -> csrf.disable())
//            .authorizeHttpRequests(
//                auth -> auth
//                    .requestMatchers("/user/login/**", "/user/register/**", "/user").permitAll()
//                    .anyRequest().authenticated()
//            )
//            .build();
//    }
//
//    // Define global CORS configuration
//    @Bean
//    public CorsConfigurationSource corsConfigurationSource() {
//        CorsConfiguration configuration = new CorsConfiguration();
//        configuration.setAllowedOrigins(Arrays.asList("http://localhost:4200")); // allow Angular
//        configuration.setAllowedMethods(Arrays.asList("GET","POST","PUT","DELETE","OPTIONS"));
//        configuration.setAllowedHeaders(Arrays.asList("*"));
//        configuration.setAllowCredentials(true);
//
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", configuration); // apply to all endpoints
//        return source;
//    }
//}
