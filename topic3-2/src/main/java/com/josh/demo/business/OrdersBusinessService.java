package com.josh.demo.business;

import java.util.ArrayList;
import java.util.List;

import com.josh.model.OrderModel;

public class OrdersBusinessService implements OrdersBusinessServiceInterface{
	
	private List<OrderModel> orders;
	@Override
	public void test() {
		System.out.println("If you can see this OrdersBusinessService looks like it works");
	}

	@Override
	public List<OrderModel> getOrders() {
		orders.add(new OrderModel(0L, "000", "Scuba Diving", 1000.0f, 3));
		orders.add(new OrderModel(1L, "001", "Rock Climbing", 200.0f, 20));
		orders.add(new OrderModel(2L, "002", "Shark Cage", 2000.0f, 2));
		orders.add(new OrderModel(3L, "003", "Sky Diving", 339.0f, 5));
		orders.add(new OrderModel(4L, "004", "Hiking", 10.0f, 10));
		orders.add(new OrderModel(5L, "005", "Ice pick Climbing", 3000.0f, 4));
		
		return orders;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "These are the items on my bucket list";
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		orders = new ArrayList<OrderModel>();
		System.out.println("Init method of the OrdersBusinessService was called");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy method of the OrdersBusinessService was called");
	}

}
