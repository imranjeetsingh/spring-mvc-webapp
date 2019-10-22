<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<!DOCTYPE html>

<html>
	
	<head>
		<title>List Customer</title>
		<link type="text/css"
			  rel="stylesheet"
			  href="${pageContext.request.contextPath}/resources/css/style.css"/>
	</head>

<body>
	<h1>List of Customer</h1>
	<div id="wrapper">
		<div id="header">
		</div>
	</div>
	<div id="container">
		<div id="content">
			<table>
				<tr>
				<th>First Name</th>
				<th>Lats Name</th>
				<th>Email</th>
				</tr>
				
				<c:forEach var="data" items="${customers}">
					<tr>
						<td>${data.firstName}</td>
						<td>${data.lastName}</td>
						<td>${data.email}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
		
</body>

</html>

