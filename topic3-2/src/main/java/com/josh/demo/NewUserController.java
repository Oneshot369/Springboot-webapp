package com.josh.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("/newUser")
public class NewUserController 
{
	@GetMapping("/")
	public String showAllOrders(Model model)
	{

		return "newUser";
	}
	
}
