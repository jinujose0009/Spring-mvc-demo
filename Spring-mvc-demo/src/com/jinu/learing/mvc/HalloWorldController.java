package com.jinu.learing.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HalloWorldController {
	
	//Need a controller method to show the initial html form
	@RequestMapping("/showForm")
	public String showF(){
		return "Helloworld-form";
	} 
	
	//Need a controller method to process the html form
	@RequestMapping("/processForm")
	public String processFo(){
		return "Helloworld";
	}

}
