package com.group3.jetty_jersey.entity;

import java.util.Date;

public class Event {
	private long id_event;
	private static long id=0;
	private String name;
	private double coordonate_x,coordonate_y;
	private String place;
	private String picture;
	private Date startingDate,endingDate;
	
	
	public long getId_event() {
		return id_event;
	}
	public void setId_event(long id_event) {
		this.id_event = id_event;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCoordonate_x() {
		return coordonate_x;
	}
	public void setCoordonate_x(double coordonate_x) {
		this.coordonate_x = coordonate_x;
	}
	public double getCoordonate_y() {
		return coordonate_y;
	}
	public void setCoordonate_y(double coordonate_y) {
		this.coordonate_y = coordonate_y;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public Date getStartingDate() {
		return startingDate;
	}
	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}
	public Date getEndingDate() {
		return endingDate;
	}
	public void setEndingDate(Date endingDate) {
		this.endingDate = endingDate;
	}
	public Event(String name, double coordonate_x, double coordonate_y, String place, String picture, Date startingDate,
			Date endingDate) {
		super();
		this.id_event=id;id++;
		this.name = name;
		this.coordonate_x = coordonate_x;
		this.coordonate_y = coordonate_y;
		this.place = place;
		this.picture = picture;
		this.startingDate = startingDate;
		this.endingDate = endingDate;
		
	}
	
}
