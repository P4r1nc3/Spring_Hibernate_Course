package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("hello")
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String processForm(HttpServletRequest request, Model model) {
		
		// get name from HTML form
		String theName = request.getParameter("studentName");
		
		// make name upper case
		theName = theName.toUpperCase();
		
		// create the message 
		String result = "Yo " + theName;
		
		// add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String rocessFormVersionThree(@RequestParam("studentName") String theName, Model model) {
		
		// make name upper case
		theName = theName.toUpperCase();
		
		// create the message 
		String result = "Hello " + theName + "!";
		
		// add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
