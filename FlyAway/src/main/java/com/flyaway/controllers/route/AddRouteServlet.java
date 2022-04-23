package com.flyaway.controllers.route;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flyaway.dao.RouteDao;
import com.flyaway.dao.RouteDaoImpl;
import com.flyaway.dto.Route;


public class AddRouteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String source = request.getParameter("source");
		String destination = request.getParameter("destination");
		
		Route route = new Route(source, destination);
		RouteDao dao = new RouteDaoImpl();
		Integer id = dao.addRoute(route);
		if(id > 0) {
			System.out.println("Route added. id is : " + id);
		} else {
			System.out.println("Route not added");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
