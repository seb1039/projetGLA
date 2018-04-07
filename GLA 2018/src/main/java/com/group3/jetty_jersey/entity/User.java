package com.group3.jetty_jersey.entity;

import java.util.Date;

public class User {
	private  long id_user;
	private static long id=0;
	private String user_name; 
	private String password;
	private Date birthDate;
	private String email;
	private String lastName;
	private String firstName;
	private String gender;
	

	
	public User(String user_name, String password, Date birthDate, String email, String lastName, String firstName,
			String gender) {
		super();
		this.id_user=id;id++;
		this.user_name = user_name;
		this.password = password;
		this.birthDate = birthDate;
		this.email = email;
		this.lastName = lastName;
		this.firstName = firstName;
		this.gender = gender;
	}
	
	
	public long getId_user() {
		return id_user;
	}


	public void setId_user(long id_user) {
		this.id_user = id_user;
	}


	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [username=" + user_name + ", name=" + firstName + ", mail=" + email + "]";
	}
	
	
	
	
}
