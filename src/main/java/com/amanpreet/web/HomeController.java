package com.amanpreet.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
	@RequestMapping(value = "/")
	public String giveWelcomeMessage(ModelMap model) {
		//model.addAttribute("message","This is dynamic message");
		return "welcome";
	}
	
	@RequestMapping("/test")
	public String giveWelcomeMessageRest(ModelMap model) {
		model.addAttribute("message","This is dynamic message");
		return "welcome";
	}

}
