<%@page import="java.util.*,com.derp.servlet.*,com.derp.*"%>
<html>
<head>
<title>Hunter Tracker</title>
</head>
<%
	List<Hunter> hList = (List<Hunter>) request.getAttribute("HUNTERLIST");
%>
<body>
	<div id="wrapper">
		<div id="header">
			<h1 align="center">Hunter Tracker</h1>
		</div>
		<div id="container">
			<div id="content">
				<table border = 2, align = "center">
					<tr>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Email</th>
						<th>id</th>
					</tr>
					<%
						for (Hunter h : hList) {
					%>
					<tr>
						<td ><%=h.getFirstName()%></td>
						<td ><%=h.getLastName()%></td>
						<td ><%=h.getEmail()%></td>
						<td ><%=h.getId()%></td>
						<%
							}
						%>
					</tr>
				</table>
			</div>
		</div>
	</div>

</body>
</html>