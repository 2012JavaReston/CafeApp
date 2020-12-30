package com.revature.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestHelper {
	
	public static void process(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			
			System.out.println(req.getRequestURI());
			
			String endpoint = req.getRequestURI();
			
			switch(endpoint) {
				case "/CafeProject":
					switch(req.getMethod()) {
						case "POST":
							FoodController.postFood(req, resp);
							break;
						case "GET":
							FoodController.getFood(req, resp);
							break;
						case "DELETE":
							FoodController.deleteFood(req, resp);
							break;
						case "PUT":
							break;
					}
					break;
				case "CafeProject/home":
					HomeController.getHomePage(req, resp);
					break;
				case "CafeProject/landing":
					LoginController.getLandingPage(req,resp);
					break;
				case "/CafeProject/login":
					LoginController.login(req,resp);
					break;
				case "/CafeProject/logout":
					LoginController.logout(req, resp);
					break;
//				default:
//					HomeController.resetToHome(req, resp);
//					//Put an error page here as well
					
			}
		}
}
