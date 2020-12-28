package com.revature.models;

public class Foods {
	private String name; 
	private  double price;
//	private int id; 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Foods(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public Foods() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Foods [name=" + name + ", price=" + price + "]";
	}
	
	public Foods(String name) {
		super();
		this.name = name;
		
	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	} 
	
	
	
	
}
