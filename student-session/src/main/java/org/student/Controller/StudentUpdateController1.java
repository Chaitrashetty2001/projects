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
import org.student.dto.Student;
@WebServlet(value = "/update1")
public class StudentUpdateController1  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentDao dao = new StudentDao();	
		Integer id = Integer.parseInt(req.getParameter("id"));
		Student student = dao.getStudentById(id);
		 if(student != null) {
			 RequestDispatcher dispatcher = req.getRequestDispatcher("studentupdate.jsp");
			 req.setAttribute("student",student);
			 dispatcher.forward(req, resp);
		 }
		 else {
			PrintWriter pw = resp.getWriter();
			pw.print("");
		}
		
		
		
		
		super.doGet(req, resp);
	}

}
