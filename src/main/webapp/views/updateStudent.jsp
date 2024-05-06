<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 5/6/2024
  Time: 8:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="update" method="post" enctype="multipart/form-data">
    <label name="studentId">Student Id</label>
    <input type="number" name="studentId" id="studentId" value="${updateStudent.studentId}"><br>
    <label name="studentName">Student name</label>
    <input type="text" name="studentName" id="studentName" value="${updateStudent.studentName}"><br>
    <label name="address" >Address</label>
    <input type="text" name="address" id="address" value="${updateStudent.address}"><br>
    <label name="birthDay">Birth day</label>
    <input type="date" name="birthDay" id="birthday" value="${updateStudent.birthDay}"><br>
    <label name="file">Image</label>
    <img src="/uploads/${updateStudent.imageUrl}" width="100" height="100" style="object-fit: cover">
    <input type="file" name="file" id="file"><br>
    <label name="phoneNumber">Phone number</label>
    <input type="text" name="phoneNumber" id="phoneNumber" value="${updateStudent.phoneNumber}"><br>
    <label>Gender</label>
    <input type="radio" name="sex" id="sex" value="true" ${updateStudent.sex? "checked": ""}><label name="sex">Male</label>
    <input type="radio" name="sex" id="gender" ${!updateStudent.sex? "checked": ""}><label name="sex">Female</label><br>
    <input type="submit" value="Update">
</form>
</body>
</html>
