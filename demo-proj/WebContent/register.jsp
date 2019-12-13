<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">

<title>Register page</title>
</head>

<%
	String errorMessage = "";
	if (session.getAttribute("Error") != null) {
		errorMessage = (String) session.getAttribute("Error");
		session.removeAttribute("Error");
	}
%>

<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-12 text-light"
				style="background-color: orange; height: 100px; box-shadow: 2px 10px 8px #888888;">

				<div
					class="col-6 text-light d-flex justify-content-start align-items-center display-4 ">
					<div class="font-weight-bold"
						style="text-shadow: 1px 7px 10px white;">CODE</div>
					<div class="font-italic">stack</div>

				</div>


			</div>
		</div>
		<div class="row justify-content-center">
			<div class="col-6 d-flex justify-content-center display-4"
				style="top: 80px; text-shadow: 2px 2px 4px black;">REGISTER
				HERE!</div>

		</div>
		<div class="row justify-content-center">
			<div
				class=" col-6 rounded bg-light d-flex align-items-center  border border-white border-bottom-0"
				style="top: 100px; box-shadow: 0px 15px 8px #888888; height: 450px; width: 450px; background-color: #FAFAD2;">
				<form action="Register-servlet" method="get">



					<div class="form-group">
						<label>Username</label> <input type="text" name="username"
							class="form-control" style="width: 450px">
						<% if(errorMessage!="") { %>
						<div class="alert alert-warning" role="alert">
							<%=errorMessage %>
						</div>
						<%} %>
					</div>
					<div class="form-group">
						<label>Email</label> <input type="email" name="email"
							class="form-control">
					</div>
					<div class="form-group">
						<label>Password</label> <input type="password" name="password"
							class="form-control">
					</div>
					<div class="form-group">
						<label>Mobile</label> <input type="text" name="mobile"
							class="form-control">
					</div>

					<button type="submit" class="btn btn-primary">Register</button>

					<a class="btn btn-primary " href="login.jsp" role="button">Login</a>


				</form>

			</div>


		</div>
		        <div class="row" >
        <div class="col-12 text-light "
				style="background-color: orange; height: 150px;top:350px; box-shadow: 2px 10px 8px #888888;">
				<div class="col text-light d-flex  justify-content-center align-items-center " style="top:30px;">Copyrights © Codestack 2019 | Developed at CDAC</div>
				

         </div>
		</div>

		</div>




</body>
</html>