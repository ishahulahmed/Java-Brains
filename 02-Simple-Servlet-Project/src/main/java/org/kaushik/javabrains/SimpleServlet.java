package org.kaushik.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(description = "A Simple Servlet", urlPatterns = { "/SimpleServletPath" }, initParams = {
		@WebInitParam(name = "defaultUser", value = "Jhon Doe") })
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter writer = response.getWriter();
		String userName = request.getParameter("name");
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		if (userName != "" && userName != null) {
			session.setAttribute("savedUserName", userName);
			context.setAttribute("savedUserName", userName);
		}

		writer.println("Request parameter has username as " + userName);
		writer.println("Session parameter has username as " + (String) session.getAttribute("savedUserName"));
		writer.println("Context parameter has username as " + (String) context.getAttribute("savedUserName"));
		writer.println("Init parameter has default username as "+ this.getServletConfig().getInitParameter("defaultUser"));

	}

}
