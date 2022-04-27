<%@page import="java.util.Collections"%>
<%@page import="java.util.List"%>
<%@page import="com.flyaway.dto.Destination"%>
<%@page import="java.util.Set"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Destination</title>
<style>
table, th, td {
  border: 1px solid black;
}
</style>
</head>
<body>
	<a href="destination/adddestination.html"><button>Add Destination</button></a>
	<a href="destination/destinationupdate.html"><button>Update Destination</button></a>
	<a href="destination/destinationdelete.html"><button>Delete Destination</button></a><br>
	<table>
	<thead><td>id</td><td>Destination</td><td>Destination</td></thead>
    <%
		//session.getAttributeNames()
		Set<Destination> allDestinations = (Set<Destination>)session.getAttribute("destinations");
		for(Destination destination : allDestinations){
			out.println("<tr>");
			out.println("<td>"+destination.getId() +"</td>");
			out.println("<td>"+destination.getDestination() +"</td>");
			out.println("</tr>");
		}
	%>
	</table>
</body>
</html>