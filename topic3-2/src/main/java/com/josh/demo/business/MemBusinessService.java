package com.josh.demo.business;

import java.util.ArrayList;
import java.util.List;

import com.josh.model.MemModel;

public class MemBusinessService implements MemBusinessServiceInterface{
	
	private List<MemModel> orders;
	@Override
	public void test() {
		System.out.println("If you can see this OrdersBusinessService looks like it works");
	}

	@Override
	public List<MemModel> getOrders() {
		orders.add(new MemModel(0L, "000", "Darth Vadars Mask", 900000.0f, "It is what the bad guy wheres in the star wars movie"));
		orders.add(new MemModel(1L, "001", "Rock Climbing", 200.0f, "null"));
		orders.add(new MemModel(2L, "002", "Shark Cage", 2000.0f, "null"));
		orders.add(new MemModel(3L, "003", "Sky Diving", 339.0f, "null"));
		orders.add(new MemModel(4L, "004", "Hiking", 10.0f, "null"));
		orders.add(new MemModel(5L, "005", "Ice pick Climbing", 3000.0f, "null"));
		
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
		orders = new ArrayList<MemModel>();
		System.out.println("Init method of the OrdersBusinessService was called");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy method of the OrdersBusinessService was called");
	}

}
