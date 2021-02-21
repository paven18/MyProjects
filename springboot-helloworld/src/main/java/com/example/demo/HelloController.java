package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HelloController {
	@RequestMapping ("/")
	public String index() {
		return "redirect:/index";
	}
	
	@RequestMapping ("/index")
	public String helloworld () {
		return "index";//this returns to the controller itself. modify the ViewResolver setup
	}
}
	