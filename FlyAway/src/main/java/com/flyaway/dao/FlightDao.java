package com.flyaway.dao;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

import com.flyaway.dto.Flight;

public interface FlightDao {
	public Integer addFlight(Flight flight);
	public void updateFlight(int id, String flight_name, String airline, String source, String destination, LocalDate date_of_travel,
			String price);
	public void deleteFlight(int id);
	public Set<Flight> getAllFlights();
}
