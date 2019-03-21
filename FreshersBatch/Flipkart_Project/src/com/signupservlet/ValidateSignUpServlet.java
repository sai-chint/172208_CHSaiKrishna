package com.signupservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.flipkart.connection.FlipkartDAO;
import com.flipkart.connection.SignUpPojo;

/**
 * Servlet implementation class SignUp
 */
@WebServlet("/ValidateSignUpServlet")
public class ValidateSignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateSignUpServlet() {
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		FlipkartDAO fd= new FlipkartDAO();
		HttpSession session = request.getSession();
		
		String firstName = request.getParameter("FirstName");
		String lastName = request.getParameter("LastName");
		String email = request.getParameter("Email");
		String password = request.getParameter("Password");
		String repassword = request.getParameter("Re-Password");
		String mobileNumber = request.getParameter("mobileNumber");
		String gender = request.getParameter("Gender");
		
		int i=0;
		if(password.equals(repassword)) {
		
		SignUpPojo supo = new SignUpPojo(firstName, lastName, email, repassword, mobileNumber, gender);
		
		try {
				i=fd.signUp(supo);
				if(i==1 ) {
					response.sendRedirect("Login.html");
				}
		} catch (SQLException e) {
			if(i!=0) {
				session.setAttribute("Emessage", "Username already exixts");
				request.getRequestDispatcher("Register.jsp").forward(request, response);
			}
			e.printStackTrace();
		
		}
		}
		else
		{
			PrintWriter out = response.getWriter();
			out.print("Re-Type Correct Password");
		}
		
	}

}
