package com.springmvc.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;

import com.springmvc.flipkart.connection.FlipkartDAO;

@Controller
public class Login {

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		FlipkartDAO fd = new FlipkartDAO();
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		String email = request.getParameter("Email");
		String password = request.getParameter("Password");
		
		try {
				if(fd.read(email, password)==true) {
					response.sendRedirect("Home.jsp");
					session.setAttribute("user", email);
					session.setAttribute("welcome", email);
				}
				else {
					out.println(email+"-->"+password);
					System.out.println("You have entered wrong credentials.");
				}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
