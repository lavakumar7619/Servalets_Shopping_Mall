<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer-Signup</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
     crossorigin="anonymous">
</head>
<body>
	<div class="container">
        <h1 class="text-center">Cutomer Register</h1>
        <form class="form-control" method="post" action="sendCus">
        	<div class="mb-3">
                <label for="userid" class="form-label">USER ID</label>
                <input type="number" class="form-control" name="userId">
            </div>
            <div class="mb-3">
              <label for="Email" class="form-label">Email address</label>
              <input type="email" class="form-control" name="email" aria-describedby="emailHelp">
              <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
            </div>
            <div class="mb-3">
              <label for="name" class="form-label">Name</label>
              <input type="text" class="form-control" name="name">
            </div>
            <div class="mb-3">
                <label for="phno" class="form-label">Phone Number</label>
                <input type="number" class="form-control" name="phno" >
            </div>           
           <div class="mb-3 text-center">
            <button type="submit" class= "btn btn-primary">Create </button>
           </div>
          </form>
    </div>
	
</body>
</html>