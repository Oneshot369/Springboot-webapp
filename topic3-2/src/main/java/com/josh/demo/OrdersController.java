package com.josh.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.josh.demo.business.OrdersBusinessServiceInterface;
import com.josh.model.OrderModel;

@Controller
@RequestMapping("/orders")
public class OrdersController {
	
	@Autowired
	private OrdersBusinessServiceInterface ordersService;
	
	@GetMapping("/")
	public String showAllOrders(Model model)
	{
		List<OrderModel> orders = ordersService.getOrders();
		
		model.addAttribute("title", ordersService.getTitle());
		model.addAttribute("orders", orders);
		ordersService.test();
		return "orders";
	}
}
