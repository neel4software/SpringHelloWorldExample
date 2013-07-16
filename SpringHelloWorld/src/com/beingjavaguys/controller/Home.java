package com.beingjavaguys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home {
	
	@RequestMapping("/hello")
		public ModelAndView hello(){
			return new ModelAndView("hello","message","HelloWorld");
		}
}
