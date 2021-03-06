package com.revature.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController {
	public static void getHomePage(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException{
		// checking that session exists and session attributes match (access - true)
		if(req.getSession(false) != null) {
			RequestDispatcher redis = req.getRequestDispatcher("/login.html");
			System.out.println("Logging in !");
			redis.forward(req, resp);
		}else {
			resp.sendRedirect("http://localhost:8080/CafeProject/cafe/landing");
		}

		
		
	}

	public static void resetToHome(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException{
		
		RequestDispatcher redis = req.getRequestDispatcher("/");
		
		redis.forward(req, resp);
	}
}
