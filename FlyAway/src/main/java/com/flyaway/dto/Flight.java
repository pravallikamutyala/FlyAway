package com.flyaway.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flights")
public class Flight {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "flight_name")
	private String flight_name;
	
	@Column(name = "source")
	private String source;
	
	@Column(name = "destination")
	private String destination;
	
	@Column(name = "arrival_time")
	private String arrival_time;
	
	@Column(name = "departure_time")
	private String departure_time;
	
	public Flight() {}

	public Flight(int id, String flight_name, String source, String destination, String arrival_time,
			String departure_time) {
		this.id = id;
		this.flight_name = flight_name;
		this.source = source;
		this.destination = destination;
		this.departure_time = departure_time;
		this.arrival_time = arrival_time;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", flight_name=" + flight_name + ", source=" + source + ", destination="
				+ destination + ", arrival_time=" + arrival_time + ", departure_time=" + departure_time + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFlight_name() {
		return flight_name;
	}

	public void setFlight_name(String flight_name) {
		this.flight_name = flight_name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getArrival_time() {
		return arrival_time;
	}

	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}

	public String getDeparture_time() {
		return departure_time;
	}

	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}

}
