package com.demo.beans;

public class AccessModifiers 
{
	public int id;
	private String name;
	protected String email;
	
	public AccessModifiers() 
	{
		id=2;
		name="Harshvardhan_Patil";
		email="Harshvardhan@gmail.com";
	}

	
	public AccessModifiers(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	

}
