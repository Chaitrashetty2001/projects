<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div style="text-align: center;">
<h1>Update Here</h1>
<form action="updatestudent" method="post">
  <div class="mb-3 row">
    <label for="inputPassword" class="col-sm-2 col-form-label">Id</label>
    <div class="col-sm-10">
      <input type="number" class="form-control" id="inputPassword" name="studentId">
    </div>
  </div>
<div class="mb-3 row">
    <label for="staticEmail" class="col-sm-2 col-form-label">Name</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="staticEmail" name="studentName">
    </div>

  <div class="mb-3 row">
    <label for="staticEmail" class="col-sm-2 col-form-label">Email</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="staticEmail" name="studentEmail">
    </div>
  </div>
  <div style="text-align: center;">
  <input type="submit" class="btn btn-success" value="Success"></div>


</form>
</div>
</body>
</html>