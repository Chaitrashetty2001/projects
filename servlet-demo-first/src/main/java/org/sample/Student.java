package org.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Student extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("name");
	
		String email = req.getParameter("email");
		
		System.out.println(name);
		System.out.println(email);
		
		String html = "<html><body><h1>"+name+"</h1><br><h2>"+email+"</h2></body></html>";
		PrintWriter pw = res.getWriter();
		pw.append(html);
	}


}
