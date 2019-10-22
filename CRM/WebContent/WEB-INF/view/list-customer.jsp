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
		<input type="button" value="Add Customer"
				onclick="window.location.href='showFormForAdd'; return false;"
				class="add-button"/>
			<table>
				<tr>
				<th>First Name</th>
				<th>Lats Name</th>
				<th>Email</th>
				<th>Action</th>
				</tr>
				
				<c:forEach var="data" items="${customers}">
					<c:url var="updateLink" value="/customer/showFormForUpdate">
						<c:param name="customerId" value="${data.id }" />
					</c:url>
					<tr>
						<td>${data.firstName}</td>
						<td>${data.lastName}</td>
						<td>${data.email}</td>
						<td>
							<a href="${updateLink }">Update</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
		
</body>

</html>

