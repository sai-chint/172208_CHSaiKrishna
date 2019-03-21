package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		 String FirstName=request.getParameter("FirstName");
		 String LastName=request.getParameter("LastName");
		 String Email=request.getParameter("Email");
		 String MobileNmber=request.getParameter("Mobile Nmber");
		 String Gender=request.getParameter("Gender");
		 String location=request.getParameter("location");
		 pw.println("<h2>Welcome " +FirstName+""+LastName+"</h2>");
		 pw.println("<br />Full Name : <div style=\"text-align:center\">  "+FirstName+" "+LastName+"</div>");
		 pw.println("<br />Email : <div style=\"text-align:center\">  "+Email+"</div>");
		 pw.println("<br />Mobile Number : <div style=\"text-align:center\"> "+MobileNmber+"</div>");
		 pw.println("<br />Sex : <div style=\"text-align:center\"> "+Gender+"</div>");
		 pw.println("<br />Location : <div style=\"text-align:center\"> "+location+"</div>");
	}

}
