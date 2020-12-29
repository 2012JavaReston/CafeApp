package com.revature.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.dao.*;
import com.revature.models.Foods;

public class FoodController {
	private static FoodsDao foodsDao = new FoodsDaoImpl(); 

	public static void getFood(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		if(req.getMethod().equals("GET")) {
			Foods food = null; 
			resp.setContentType("application/json"); 
			
			String foodName = req.getParameter("name"); 
			
			food = foodsDao.findFoodByName(foodName);
			
			ObjectMapper om = new ObjectMapper(); 
			resp.getWriter().write(om.writeValueAsString(food));
			
			
			
		} else {
			resp.setStatus(405);
			System.out.println("No food found with that name");
		}
		
	}
	
	
	public static void postFood(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		if(req.getMethod().equals("POST")) {
			ObjectMapper om = new ObjectMapper(); 
			Foods food = om.readValue(req.getReader(), com.revature.models.Foods.class); 
			
			foodsDao.createFood(food); 
			
			resp.setStatus(201);
			
		} else {
			resp.setStatus(405); 
			System.out.println("Could not create new Food Item");
		}
		
	}
	
	
	public static void deleteFood(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		if(req.getMethod().equals("DELETE")) {
			ObjectMapper om = new ObjectMapper(); 
			Foods food = om.readValue(req.getReader(), com.revature.models.Foods.class); 
			
			foodsDao.removeFood(food); 
			
		}else {
			System.out.println("Was not successful delete");
		}
	}
	
}
