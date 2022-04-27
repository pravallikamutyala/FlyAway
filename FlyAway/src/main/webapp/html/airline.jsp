<%@page import="com.flyaway.dto.Airline"%>
<%@page import="java.util.Set"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Airline</title>
<style>
table, th, td {
  border: 1px solid black;
}
</style>
</head>
<body>
	<a href="airline/addairline.html"><button>Add Airline</button></a>
	<a href="airline/airlineupdate.html"><button>Update Airline</button></a>
	<a href="airline/airlinedelete.html"><button>Delete Airline</button></a><br>
	<table>
	<thead><td>id</td><td>IATA</td><td>Name</td></thead>
    <%
		//session.getAttributeNames()
		Set<Airline> allAirlines = (Set<Airline>)session.getAttribute("airlines");
		for(Airline airline : allAirlines){
			out.println("<tr>");
			out.println("<td>"+airline.getId() + "</td>");
			out.println("<td>"+airline.getIata() + "</td>");
			out.println("<td>"+airline.getName() + "</td>");
			out.println("</tr>");
		}
	%>
	
</body>
</html>