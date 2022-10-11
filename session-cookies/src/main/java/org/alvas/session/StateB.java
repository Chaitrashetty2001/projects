package org.alvas.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/stateb")
public class StateB  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
	Cookie []  cookies = req.getCookies();
	PrintWriter pw = resp.getWriter();
	
	for(Cookie cookie : cookies)
	{
		if(cookie.getValue() != null)
		{
			String html = "<html><body><h1>My first cookies :"+cookie.getName()+""+cookie.getValue()+"</h1></body></html>";
			pw.append(html);
		}
		
	}
	
	
	}

}
