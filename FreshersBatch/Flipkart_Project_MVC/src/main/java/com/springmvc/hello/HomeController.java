package com.springmvc.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/Home")
	public ModelAndView home() {
		
		ModelAndView mav = new ModelAndView("Home");
		return mav;
	}
	
	@RequestMapping("/Apple iphone 8plus")
	public ModelAndView apple() {
		
		ModelAndView mav = new ModelAndView("Apple iphone 8plus");
		return mav;
	}
	
	@RequestMapping("/Google Pixel 3")
	public ModelAndView google() {
		
		ModelAndView mav = new ModelAndView("Google Pixel 3");
		return mav;
	}
	
	@RequestMapping("/Laptops")
	public ModelAndView laptop() {
		
		ModelAndView mav = new ModelAndView("Laptops");
		return mav;
	}
	
	@RequestMapping("/Login")
	public ModelAndView login() {
		
		ModelAndView mav = new ModelAndView("Login");
		return mav;
	}
	
	@RequestMapping("/Mobiles")
	public ModelAndView mobiles() {
		
		ModelAndView mav = new ModelAndView("Mobiles");
		return mav;
	}
	
	@RequestMapping("/Payment")
	public ModelAndView payment() {
		
		ModelAndView mav = new ModelAndView("Payment");
		return mav;
	}
	@RequestMapping("/Play Station")
	public ModelAndView playstation() {
		
		ModelAndView mav = new ModelAndView("Play Station");
		return mav;
	}
	@RequestMapping("/Realme 2-pro")
	public ModelAndView realme() {
		
		ModelAndView mav = new ModelAndView("Realme 2-pro");
		return mav;
	}
	@RequestMapping("/Redmi Y2")
	public ModelAndView redmi() {
		
		ModelAndView mav = new ModelAndView("Redmi Y2");
		return mav;
	}
	@RequestMapping("/Samsung Galaxy note")
	public ModelAndView samsung() {
		
		ModelAndView mav = new ModelAndView("Samsung Galaxy note");
		return mav;
	}
	@RequestMapping("/Shopping Cart")
	public ModelAndView cart() {
		
		ModelAndView mav = new ModelAndView("Shopping Cart");
		return mav;
	}
	@RequestMapping("/Sign Up")
	public ModelAndView signup() {
		
		ModelAndView mav = new ModelAndView("Sign Up");
		return mav;
	}
	@RequestMapping("/Vivo V15")
	public ModelAndView vivo() {
		
		ModelAndView mav = new ModelAndView("Vivo V15");
		return mav;
	}
	
	
}
