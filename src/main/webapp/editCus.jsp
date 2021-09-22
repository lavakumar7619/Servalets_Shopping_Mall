<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer-Edit</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
     crossorigin="anonymous">
</head>
<body>
	<%@ include file="Navbar.jsp"%>
	<div class="container">
        <h1 class="text-center">Cutomer Edit</h1>
        <form class="form-control" method="post" action="editCus">
        	<div class="mb-3">
                <label for="userid" class="form-label">Customer ID</label>
                <input type="number" class="form-control" name="cusId" disabled value='<c:out value="${c.getId()}"></c:out>'>
            </div>
            <div class="mb-3">
              <label for="Email" class="form-label">Email address</label>
              <input type="email" class="form-control" value='<c:out value="${c.getEmail()}"></c:out>' name="email" aria-describedby="emailHelp">
              <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
            </div>
            <div class="mb-3">
              <label for="name" class="form-label">Name</label>
              <input type="text" class="form-control" value='<c:out value="${c.getName()}"></c:out>' name="name">
            </div>
            <div class="mb-3">
                <label for="phno" class="form-label">Phone Number</label>
                <input type="number" class="form-control" value='<c:out value="${c.getPhone()}"></c:out>' name="phno" >
            </div>           
           <div class="mb-3 text-center">
            <button type="submit" class= "btn btn-primary">Create </button>
           </div>
          </form>
    </div>
</body>
</html>