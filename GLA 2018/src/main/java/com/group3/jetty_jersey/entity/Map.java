package com.group3.jetty_jersey.entity;

import java.util.List;

public class Map {

	private String name;
	private long id_map;
	private static int id=0;
	private boolean privacy;
	
	
	public Map(String name, boolean privacy) {
		super();
		this.setId_map(id);
		id++;
		this.name = name;
		this.privacy = privacy;
	}
	
	public Map()
	{
		name="";
		privacy=false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isPrivacy() {
		return privacy;
	}

	public void setPrivacy(boolean privacy) {
		this.privacy = privacy;
	}

	public long getId_map() {
		return id_map;
	}

	public void setId_map(long id_map) {
		this.id_map = id_map;
	}
	
	
}
