package org.alvas.session;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/statea")
public class StateA extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String name = req.getParameter("name");
		
		Cookie cookie = new Cookie("chaitra", name);
		resp.addCookie(cookie);
		
		 RequestDispatcher dispatcher = req.getRequestDispatcher("/stateb");
		 dispatcher.forward(req, resp);
		
	}
	

}
