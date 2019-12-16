<%@ page import="java.util.*, com.derp.Student"%>
<html>
<body>

<h1>White pages</h1>
<h2>Peter Bakers students:</h2>
<% 
	ArrayList<Student> students = (ArrayList<Student>)request.getAttribute("student-list");
	for (int i=0; i < students.size(); i++) {
	out.print("<li>" + students.get(i).getFirstName() + " | " + students.get(i).getLastName() + " | "+ students.get(i).getRole() + "</li>");
	}
%>
</body>
</html>