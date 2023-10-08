package org.kaushik.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String userName = req.getParameter("userName");
		out.println("Hello from the GET method! " + userName);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String userName = req.getParameter("userName");
		String fullName = req.getParameter("fullName");
		out.println("Hello from POST method! " + userName + "! We know your full name is " + fullName);
		String prof = req.getParameter("prof");
		out.println("You are a " + prof);
		// String location = req.getParameter("location");
		String[] location = req.getParameterValues("location");
		out.println("You are at " + location.length + "places");
		for (int i = 0; i < location.length; i++) {
			out.println(location[i]);
		}

	}

}
