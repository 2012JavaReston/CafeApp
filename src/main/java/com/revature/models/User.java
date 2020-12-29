package com.revature.models;

public class User {

	private String usernmame;
	private String password;
	
	public User(String usernmame, String password) {
		super();
		this.usernmame = usernmame;
		this.password = password;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUsernmame() {
		return usernmame;
	}

	public void setUsernmame(String usernmame) {
		this.usernmame = usernmame;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [usernmame=" + usernmame + ", password=" + password + "]";
	}
	
}
