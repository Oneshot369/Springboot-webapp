package com.josh.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.josh.demo.business.MemBusinessServiceInterface;
import com.josh.model.MemModel;

@Controller
@RequestMapping("/orders")
public class MemController {
	
	@Autowired
	private MemBusinessServiceInterface ordersService;
	
	@GetMapping("/")
	public String showAllOrders(Model model)
	{
		List<MemModel> orders = ordersService.getOrders();
		
		model.addAttribute("title", ordersService.getTitle());
		model.addAttribute("mems", orders);
		ordersService.test();
		return "mem";
	}
}