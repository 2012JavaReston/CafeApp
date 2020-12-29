package com.revature.models;

public class User {

	private String username;
	private String password;
	
	public User(String usernmame, String password) {
		super();
		this.username = usernmame;
		this.password = password;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUsername() {
		return username;
	}

	public void setUsernmame(String usernmame) {
		this.username = usernmame;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	
}
