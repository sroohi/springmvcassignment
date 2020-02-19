<html>
<body>

	<h2>This is Spring MVC Framework ${Information }</h2>

	<h1>User Information</h1>
	<table>
		<tr>
			<td>User Name :</td>
			<td>${LoggedInUser.name }</td>
		</tr>
		<tr>
			<td>EMAIL :</td>
			<td>${LoggedInUser.email }</td>
		</tr>
	</table>

	<h2>Adminstration</h2>
	<table>
		<tr>
			<td>Admin ID :</td>
			<td>${Adminstration.id }</td>
		</tr>
		<tr>
			<td>Admin Name :</td>
			<td>${Adminstration.name }</td>
		</tr>
		<tr>
			<td>Admin is Authorized :</td>
			<td>${Adminstration.isAuthorized }</td>
		</tr>
	</table>

</body>

</html>