package com.josh.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.josh.model.MemModel;
import org.springframework.ui.Model;


@Controller
@RequestMapping("/addMem")
public class AddMemController 
{
	@GetMapping("/")
	public String showMem(Model model)
	{
		model.addAttribute("memModel", new MemModel());
		return "addMem";
	}
	@PostMapping("/add")
	public String addMem(MemModel mem, Model model)
	{
		model.addAttribute("memModel2", mem);
		return "addMem";
	}
}
