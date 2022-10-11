package org.student.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.student.dao.StudentDao;
@WebServlet(value = "/updatestudent")
public class StudentUpdateController extends HttpServlet {

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentDao dao = new 	StudentDao();
		Integer id = Integer.parseInt(req.getParameter("studentId"));
		
		dao.updateStudent(id, req.getParameter("studentName"),req.getParameter("studentEmail"));
		PrintWriter pw = resp.getWriter();
		pw.write("<html><body><h1>Data updated sucessfully</h1></body></html>");	
		RequestDispatcher dispatcher = req.getRequestDispatcher("updatestudent.jsp");
			
				dispatcher.include(req, resp);
			}

	}

