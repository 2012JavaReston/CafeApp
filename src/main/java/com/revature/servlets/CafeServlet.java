package com.revature.servlets;

import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.json.simple.JSONArray;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.Foods;






public class CafeServlet extends HttpServlet{
	private static List<Foods>foods= new ArrayList<Foods>(); 
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		resp.setContentType("application/json");
		System.out.println("In get");
		String name = req.getParameter("name"); 
//		JSONArray food = new JSONArray(); 
//		food.addAll(foods); 
		
		PrintWriter pw = resp.getWriter(); 
		
		
		for(Foods f : foods) {
			if(f.getName().equals(name)) {
				pw.write(f.toString());
				break; 
			}
		}
		
		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("In POST");
		resp.setContentType("application/json"); 
		
		ObjectMapper om = new ObjectMapper(); 
		
		Foods f = om.readValue(req.getReader(), com.revature.models.Foods.class); 
		
		System.out.println("Foodssss" + f);

		f.setName(f.getName());
		f.setPrice(f.getPrice());
		System.out.println("Inside post method of direct servlet");
		foods.add(f); 
		resp.getWriter().write(om.writeValueAsString(f));
//		

	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("In PUT");
		String name = req.getParameter("name");
		String price = req.getParameter("price"); 
		boolean found = false; 
		
//		resp.setContentType("application/json"); 
//		
//		ObjectMapper om = new ObjectMapper(); 
//		
//		Foods f2 = om.readValue(req.getReader(), com.revature.models.Foods.class); 
		
		
		for(Foods f : foods) {
			if(f.getName().equals(name)) {
				f.setPrice(Double.parseDouble(price));
				found = true;
				break; 
//			} else if(f.getName().equals(f2.getName())) {
//				f.setPrice(f2.getPrice());
//				found = true; 
//				break; 
			}
		}
		if(!found) {
			Foods newFood = new Foods(name, Double.parseDouble(price)); 
			foods.add(newFood); 
		}
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("In DELETE");
		String name = req.getParameter("name");
		
		for(Foods f : foods) {
			if(f.getName().equals(name)) {
				foods.remove(f);
				break; 
			}

		}
	}

}
