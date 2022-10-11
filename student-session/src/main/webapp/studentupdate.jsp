<%@page import="org.student.dto.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% Student student  = (Student)  request.getAttribute("student"); %>
<form action="update1">
<input type="number" name="id" value="<%= student.getStudentid() %>" readonly="readonly" hidden="true">
<input type="text" name="email" value="<%= student.getStudentemail() %>" > 
<input type="text" name="name" value="<%= student.getStudentname() %>">
<input type="submit" value = "update">




</form>
</body>
</html>