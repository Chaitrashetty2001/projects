package org.sample.calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Calculator extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method 
Integer integer1  = Integer.parseInt(req.getParameter("number1"));
Integer integer2  = Integer.parseInt(req.getParameter("number2"));

int sum = integer1+integer2;
PrintWriter pw = res.getWriter();
String html = "<html><body><h1>sum of two numbers"+sum+"</h1></body></html>";
pw.append(html);

int sub = integer1-integer2;
PrintWriter pw2 = res.getWriter();
String html2 = "<html><body><h1>difference of two numbers"+sub+"</h1></body></html>";
pw.append(html2);





		
	}

}
