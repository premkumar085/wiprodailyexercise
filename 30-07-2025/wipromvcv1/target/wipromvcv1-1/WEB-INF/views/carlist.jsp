<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Cars List</h1>
  <c:forEach var="prod" items="${carlist}">
    ${list}
      <br/>
</c:forEach>
</body>
</html>