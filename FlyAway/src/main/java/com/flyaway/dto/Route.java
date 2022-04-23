package com.flyaway.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "routes")
public class Route {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "source")
	private String source;
	
	@Column(name = "destination")
	private String destination;
	

	public Route() {
		// TODO Auto-generated constructor stub
	}


	public Route(String source, String destination) {
		this.source = source;
		this.destination = destination;
	}


	@Override
	public String toString() {
		return "Route [id=" + id + ", source=" + source + ", destination=" + destination + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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
	

}
