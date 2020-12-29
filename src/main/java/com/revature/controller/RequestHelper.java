package com.revature.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestHelper {
	static String currentAPI = "CafeProject2";
	
	public static void process(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			
			System.out.println(req.getRequestURI());
			
			String endpoint = req.getRequestURI();
			
			switch(endpoint) {
				case currentAPI + "/api/Food":
					switch(req.getMethod()) {
						case "POST":
							FoodController.postPlanet(req, resp);
							break;
						case "GET":
							FoodController.getPlanet(req, resp);
							break;
						case "DELETE":
							FoodController.deletePlanet(req, resp);
							break;
						case "PUT":
							break;
					}
					break;
				case currentAPI + "/api/home":
					HomeController.getHomePage(req, resp);
					break;
				case currentAPI + "/api/landing":
					LoginController.getLandingPage(req,resp);
					break;
				case currentAPI + "/api/login":
					LoginController.login(req,resp);
					break;
				case currentAPI + "/api/logout":
					LoginController.logout(req, resp);
					break;
//				default:
//					HomeController.resetToHome(req, resp);
//					//Put an error page here as well
					
			}
		}
}
