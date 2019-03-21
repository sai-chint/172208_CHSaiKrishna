//package com.springmvc.cart;
//
//import org.springframework.stereotype.Controller;
//
//import com.springmvc.flipkart.connection.FlipkartDAO;
//
//@Controller
//public class CartController {
//	
//		FlipkartDAO fd = new FlipkartDAO();
//		
//		String productName = (String)request.getSession().getAttribute("productName") ;	
//		String price = request.getParameter("price");
//		
//		try {
//			if(fd.add(productName, price)) {
//				response.sendRedirect("Shopping Cart.html");
//			}
//			
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//
//}
