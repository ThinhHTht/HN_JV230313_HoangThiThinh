<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 5/6/2024
  Time: 7:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List student</title>
</head>
<body>
<a href="add">Add student</a>
<form action="search" method="post">
    <lable>Search by name</lable>
   <input type="text">
    <input type="submit" value="search">
</form>
<table border="1">
    <thead>
    <tr>
        <th>No.</th>
        <th>Student id</th>
        <th>Student name</th>
        <th>Address</th>
        <th>Gender</th>
        <th>Image</th>
        <th>Phone number</th>
        <th>Birth day</th>
        <th>Action</th>
    </tr>
    </thead>
    <tbody>
     <c:forEach items="${listStudent}" varStatus="loop" var="student">
         <tr>
             <td>${loop.count}</td>
             <td>${student.studentId}</td>
             <td>${student.studentName}</td>
             <td>${student.address}</td>
             <td>${student.sex? 'Male' : 'Female'}</td>
             <td><img src="/uploads/${student.imageUrl}" width="100" height="100" style="object-fit: cover"></td>
             <td>${student.phoneNumber}</td>
             <td>${student.birthDay}</td>
             <td>
                 <a href="update?studentId=${student.studentId}">Update</a>
                 <a href="delete?studentId=${student.studentId}">Delete</a>
             </td>
         </tr>

     </c:forEach>
    </tbody>
</table>
</body>
</html>
