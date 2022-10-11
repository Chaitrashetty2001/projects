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
@WebServlet(value = "/student")
public class StudentController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String studentName = req.getParameter("studentName");
	String studentEmail = req.getParameter("studentEmail");
	
	Student student = new Student();
	student.setStudentname(studentName);
	student.setStudentemail(studentEmail);
	
	StudentDao dao = new StudentDao();
	dao.saveStudent(student);
	
	PrintWriter pw = resp.getWriter();
pw.write("<html><body><h1>Data Insrted sucessfully</h1></body></html>");	
RequestDispatcher dispatcher = req.getRequestDispatcher("RegistrationStudent.jsp");
	
		dispatcher.include(req, resp);
	}

}


