<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <% String message=""; 
 message=(String)session.getAttribute("enter");
if(message!="omi")
   {
	//session.setAttribute("log","please login to continue");
	response.sendRedirect("login.jsp");
	session.setAttribute("log","please login to continue");
	
   }
%>
 


<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">

<meta charset="ISO-8859-1">
<title>Surprise!</title>
</head>
<body>
 <div class="container-fluid">
 <div class="row">
 <div class="col-12 bg-dark text-light d-flex justify-content-end align-items-center" style="height:80px;">
 <form action="Logoutservlet" method="post">
 
 				
	<button type="submit" class="btn btn-primary">Logout</button>
				
			</form>
 
 </div>
 </div>
 </div>
</body>
</html>