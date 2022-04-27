package com.flyaway.dto;

import java.time.LocalDate;
import java.util.Date;

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
	
	@Column(name = "airline")
	private String airline;
	
	@Column(name = "source")
	private String source;
	
	@Column(name = "destination")
	private String destination;
	
	@Column(name = "date_of_travel")
	private LocalDate date_of_travel;
	
	@Column(name = "price")
	private String price;
	
	public Flight() {}

	public Flight(String flight_name, String airline, String source, String destination, LocalDate date_of_travel,
			String price) {
		this.flight_name = flight_name;
		this.airline = airline;
		this.source = source;
		this.destination = destination;
		this.date_of_travel = date_of_travel;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", flight_name=" + flight_name + ", source=" + source + ", destination="
				+ destination + ", date_of_travel=" + date_of_travel + ", price=" + price + "]";
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

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public LocalDate getDate_of_travel() {
		return date_of_travel;
	}

	public void setDate_of_travel(LocalDate date_of_travel) {
		this.date_of_travel = date_of_travel;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}



}
