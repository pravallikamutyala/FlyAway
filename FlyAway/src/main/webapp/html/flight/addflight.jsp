<%@page import="com.flyaway.dto.Route"%>
<%@page import="com.flyaway.dao.RouteDaoImpl"%>
<%@page import="com.flyaway.dto.Airline"%>
<%@page import="com.flyaway.dao.AirlineDaoImpl"%>
<%@page import="java.util.Set"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="AddAirlineServlet" method="post">
		Airline Name: 
		<select name="airline" id="airline">
  		<%
		//session.getAttributeNames()
		Set<Airline> allAirlines = new AirlineDaoImpl().getAllAirlines();
		for(Airline airline : allAirlines){
			out.println("<option value='"+airline.getName()+"'>"+airline.getName()+"</option>");
			
		}
		%>
  		</select><br>
		Source: 
		<select name="source" id="source">
  		<%
		//session.getAttributeNames()
		Set<Route> allRoutes = new RouteDaoImpl().getAllRoutes();
		for(Route route : allRoutes){
			out.println("<option value='"+route.getSource()+"'>"+route.getSource()+"</option>");
			
		}
		%>
		</select><br>
		Destination: 
		<select name="source" id="source">
  		<%
		//session.getAttributeNames()
		for(Route route : allRoutes){
			out.println("<option value='"+route.getDestination()+"'>"+route.getDestination()+"</option>");
			
		}
		%>
		</select><br>
	</form>
</body>
</html>