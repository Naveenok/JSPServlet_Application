package com.naveen.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.naveen.web.DAO.StudentDAO;
import com.naveen.web.model.Student;

/**
 * Servlet implementation class GetStudentController
 */
public class GetStudentController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("stid"));
		StudentDAO dao=new StudentDAO();
		Student obj=dao.getStudent(id);
		request.setAttribute("student", obj);
		RequestDispatcher rd=request.getRequestDispatcher("showStudent.jsp");
		rd.forward(request, response);
		
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
