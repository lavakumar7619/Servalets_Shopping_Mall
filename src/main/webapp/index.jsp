<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
     <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" 
crossorigin="anonymous">
<title>Home Page</title>
</head>
<body>
		<%@ include file="Navbar.jsp"%>
		<h1>Avilable Customers Are</h1>
		<a href="addCus" class="btn bg-success">addCus</a>
		 <table class="table table-hover">
        <thead>
          <tr>
            <th scope="col">Customer Id</th>
            <th scope="col">Name</th>
            <th scope="col">Phone No</th>
            <th scope="col">Email</th>   
            <th></th>   
            <th></th>     
          </tr>
        </thead>
        <tbody>
      <c:forEach items="${cus}" var="c">
          <tr>
            <th scope="row">${c.id}</th>
            <td>${c.name}</td>
            <td>${c.phone}</td>
            <td>${c.email}</td>
            <td><a href="deleteCus" class="btn bg-warning">Delete</a></td>
            <td><a href="edit" class="btn bg-info">Edit</a></td>
          </tr>
      </c:forEach>
        </tbody>
      </table>
</body>
</html>