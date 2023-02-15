package com.josh.demo.business;

import java.util.List;
import com.josh.model.OrderModel;

public interface OrdersBusinessServiceInterface {
	public void test();
	public List<OrderModel> getOrders();
	public String getTitle();
	public void init();
	public void destroy();
}
