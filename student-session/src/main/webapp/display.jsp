<%@page import="org.student.dto.Student"%>
<%@page import="java.util.List"%>
<%@page import="org.student.dao.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
StudentDao dao = new StudentDao();
List<Student> student = dao.getAllStudent();
%>
<table border="3px solid black" >
<tr>

<th>Id</th>
<th>Name</th>
<th>Email</th>
<th>Delete</th>
<th>Update</th>
</tr>

<% 
for(Student s : student ) {
%>
<tr>
<td><%= s.getStudentid() %></td>
<td><%= s.getStudentname() %></td>
<td><%= s.getStudentemail() %></td>
<td><a href="#"><button style="background-color: red">Delete</button></a></td>
<td> <a href="update1?id=<%= s.getStudentid()%>"><button style="background-color: red">Update</button></a></td>
</tr>
<% 	
}
%>

</table>

</body>
</html>