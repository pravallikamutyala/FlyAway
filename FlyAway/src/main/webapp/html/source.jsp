<%@page import="java.util.Collections"%>
<%@page import="java.util.List"%>
<%@page import="com.flyaway.dto.Source"%>
<%@page import="java.util.Set"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Source</title>
<style>
table, th, td {
  border: 1px solid black;
}
</style>
</head>
<body>
	<a href="source/addsource.html"><button>Add Source</button></a>
	<a href="source/sourceupdate.html"><button>Update Source</button></a>
	<a href="source/sourcedelete.html"><button>Delete Source</button></a><br>
	<table>
	<thead><td>id</td><td>Source</td><td>Destination</td></thead>
    <%
		//session.getAttributeNames()
		Set<Source> allSources = (Set<Source>)session.getAttribute("sources");
		for(Source source : allSources){
			out.println("<tr>");
			out.println("<td>"+source.getId() +"</td>");
			out.println("<td>"+source.getSource() +"</td>");
			out.println("</tr>");
		}
	%>
	</table>
</body>
</html>