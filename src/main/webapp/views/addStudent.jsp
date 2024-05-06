<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 5/6/2024
  Time: 7:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add</title>
</head>
<body>
<form action="add" method="post" enctype="multipart/form-data">
    <label name="studentName">Student name</label>
    <input type="text" name="studentName" id="studentName"><br>
    <label name="address" >Address</label>
    <input type="text" name="address" id="address"><br>
    <label name="birthDay">Birthday</label>
    <input type="date" name="birthDay" id="birthday"><br>
    <label name="file">Image</label>
    <input type="file" name="file" id="file"><br>
    <label name="phoneNumber">Phone number</label>
    <input type="text" name="phoneNumber" id="phoneNumber"><br>
    <label>Gender</label>
    <input type="radio" name="sex" id="sex"><label name="sex">Male</label>
    <input type="radio" name="sex" id="gender"><label name="sex">Female</label><br>
    <input type="submit" value="Add">
</form>
</body>
</html>
