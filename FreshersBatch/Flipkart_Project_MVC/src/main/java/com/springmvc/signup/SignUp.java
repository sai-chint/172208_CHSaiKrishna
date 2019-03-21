package com.springmvc.signup;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.flipkart.connection.FlipkartDAO;
import com.springmvc.flipkart.connection.SignUpPojo;

@Controller
    public class SignUp {
	
	  @Autowired
	  public UserService userService;
	  @RequestMapping(value = "/register", method = RequestMethod.GET)
	  public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("register");
	    mav.addObject("user", new User());
	    return mav;
	  }
	  @RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
	  public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("user") User user) {
	  userService.register(user);
	  return new ModelAndView("welcome", "firstname", user.getFirstname());
	  }
	}

//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//	}
//
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		FlipkartDAO fd= new FlipkartDAO();
//		HttpSession session = request.getSession();
//		
//		String firstName = request.getParameter("FirstName");
//		String lastName = request.getParameter("LastName");
//		String email = request.getParameter("Email");
//		String password = request.getParameter("Password");
//		String repassword = request.getParameter("Re-Password");
//		String mobileNumber = request.getParameter("mobileNumber");
//		String gender = request.getParameter("Gender");
//		
//		int i=0;
//		if(password.equals(repassword)) {
//		
//		SignUpPojo supo = new SignUpPojo(firstName, lastName, email, repassword, mobileNumber, gender);
//		
//		try {
//				i=fd.signUp(supo);
//				if(i==1 ) {
//					response.sendRedirect("Login.html");
//				}
//		} catch (SQLException e) {
//			if(i!=0) {
//				session.setAttribute("Emessage", "Username already exixts");
//				request.getRequestDispatcher("Register.jsp").forward(request, response);
//			}
//			e.printStackTrace();
//		
//		}
//		}
//		else
//		{
//			PrintWriter out = response.getWriter();
//			out.print("Re-Type Correct Password");
//		}
//		
//	}

}
