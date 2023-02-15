package com.josh.demo.business;

import java.util.ArrayList;
import java.util.List;

import com.josh.model.OrderModel;

public class AnotherOrdersBusinessService implements OrdersBusinessServiceInterface{
	private List<OrderModel> orders;
	@Override
	public void test() {
		System.out.println("If you can see this AnotherOrdersBusinessService looks like it works");
	}

	@Override
	public List<OrderModel> getOrders() {
		orders.add(new OrderModel(10L, "AAA", "Big Mac", 5.34f, 76));
		orders.add(new OrderModel(11L, "AAB", "McChicken", 2.39f, 20));
		orders.add(new OrderModel(12L, "AAC", "Large Fry", 3.39f, 3));
		orders.add(new OrderModel(13L, "AAD", "10 PC Nugget", 2.76f, 60));
		orders.add(new OrderModel(14L, "AAE", "Apple Pie", 0.50f, 10));
		
		return orders;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "Food I want at Mcdonalds";
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		orders = new ArrayList<OrderModel>();
		System.out.println("Init method of the AnotherOrdersBusinessService was called");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy method of the AnotherOrdersBusinessService was called");
	}

}
