package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {

	@RequestMapping("/hello")
	public ModelAndView homedemo() {
		
		ModelAndView mav = new ModelAndView("home");
		mav.addObject("welcome", "hello user!!!");
		
		return mav;
		
	}
}
