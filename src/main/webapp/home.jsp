<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<style>
body {
			display: flex;
			justify-content: center;
			align-items: center;
			height: 100vh;
			margin: 0;
		}
		form {
			display: flex;
			flex-direction: column;
			align-items: center;
			padding: 20px;
			border: 1px solid #ccc;
			border-radius: 5px;
		}
		
		input[type="text"], input[type="password"] {
			margin-bottom: 10px;
			padding: 10px;
			border: 1px solid #ccc;
			border-radius: 5px;
			font-size: 16px;
		}
		
		input[type="submit"] {
			background-color: #4CAF50;
			color: white;
			padding: 10px 20px;
			border: none;
			border-radius: 5px;
			cursor: pointer;
			font-size: 16px;
		}

	</style>
	
<body>




 <form action="addStudent">
 	<label>Enter Id</label><br>
		<input type="text" name="id"><br><br>
		
		<label>Enter Name</label><br>
		<input type="text" name="name"><br><br>
		
		<label>Enter Password</label><br>
		<input type="text" name="password"><br><br>
		
		
		<input type = "submit"><br>
	</form>

</body>
</html>