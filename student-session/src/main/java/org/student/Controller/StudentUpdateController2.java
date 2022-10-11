package org.student.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.student.dao.StudentDao;
import org.student.dto.Student;

public class StudentUpdateController2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Student student = new Student();	
		student.setStudentid(Integer.parseInt(req.getParameter("id")));
		student.setStudentemail(req.getParameter("email"));
		student.setStudentname(req.getParameter("name"));
		
		StudentDao dao = new StudentDao();		
		dao.updateStudentById(student,student.getStudentid());
		
		if(student != null) {
			 RequestDispatcher dispatcher = req.getRequestDispatcher("display.jsp");
			 req.setAttribute("student",student);
			 dispatcher.forward(req, resp);
		 }
		 else {
			PrintWriter pw = resp.getWriter();
			pw.print("Student not Found");
		}
	}

}
