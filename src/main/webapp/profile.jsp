<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
</head>
<body>
	<%@ include file="Navbar.jsp"%>
	<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/mall" user="root" password="lava" />
	<sql:query var="row" dataSource="${db}">select * from customer where customer_id=1;</sql:query>
	 <div class="container">
    <h1 class="text-center">Edit User profile</h1>
    <form class="form-control">
     <c:forEach items="${rs.rows}" var="row">
        <div class="mb-3">
          <label for="Email" class="form-label">Email address</label>
          <input type="email" class="form-control" name="email" value="<c:out value=""></c:out>" aria-describedby="emailHelp">
          <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
        </div>
        <div class="mb-3">
          <label for="name" class="form-label">Name</label>
          <input type="text" class="form-control" value="<c:out value=""></c:out>" name="name">
        </div>
        <div class="mb-3">
            <label for="phno" class="form-label">Phone Number</label>
            <input type="number" class="form-control" value="<c:out value=""></c:out>" name="phno">
        </div>        
       <div class="mb-3 text-center">
        <button type="submit" class= "btn btn-success">Update</button>
       </div>
      </form>
       </c:forEach>
</div>

<script>
    const form=document.querySelector("form")
    form.addEventListener('submit',(e)=>{
        e.preventDefault();
        const name=form.querySelector("input[name='name']").value
        const email=form.querySelector("input[name='email']").value
        const phno=form.querySelector("input[name='phno']").value

        fetch("/editCus",{
            method: 'PUT',
            headers: {
                'Content-type': 'application/json'
            },
            body: JSON.stringify({
                "id":1,
                "email":email,
                "name":name,
                "phone":phno,
                "user":{
                    "id":1,
                    
                }   
            })
        })
        .then(res=>res.json())
        .then(data=>{
            console.log(data);
            alert("updated Succesfully")
            window.location.href="/editUser"
        })
        .catch(err=>console.log(err))
        
    })
</script>
</body>
</html>