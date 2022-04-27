package com.flyaway.controllers.airline;

import java.io.IOException;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.flyaway.dao.AirlineDaoImpl;
import com.flyaway.dto.Airline;


public class GetAllAirlinesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Set<Airline> allAirlines = new AirlineDaoImpl().getAllAirlines();
		HttpSession session = request.getSession();
		if(allAirlines.size() > 0) {
			session.setAttribute("students", allAirlines);
		} else {
			session.setAttribute("msg", "No airline data found");
		}
		
		response.sendRedirect("allAirlines.jsp");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
