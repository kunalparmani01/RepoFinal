package com.jda.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringController {

	@RequestMapping(value = "/hello")
	public ModelAndView helloWorld(){
		ModelAndView model = new ModelAndView("sample");
		return  model;
	}
}
