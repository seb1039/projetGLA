package com.group3.jetty_jersey.entity;

import java.util.List;

public class Map {

	private String name;
	private boolean privacy;
	
	
	public Map(String name, boolean privacy) {
		super();
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
	
	
}
