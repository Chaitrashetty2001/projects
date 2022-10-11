<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<H1>REGISTER HERE</H1>

<form action =" RegistrationForm" method="post">

FirstName:<input type = "text" name="FirstName" required><br><br>

LastName:<input type = "text" name ="LastName" required><br><br>

PhoneNumber:<input type="tel" name="PhoneNumber" required><br><br>

Email:<input type="email" name = "Email" required><br><br>

Language : <input type="checkbox"  name="lang"value="C"  >

  <label for="c">C</label>

  <input type="checkbox"  name="lang"  value="C++">

  <label for="c++">C++</label>

  <input type="checkbox"  name="lang" value="Java">

  <label for="Java">Java</label><br><br>

 

  <input type="submit" value="Submit">

  <input type="reset" value="Reset">


 

 

</form>

 
</body>
</html>