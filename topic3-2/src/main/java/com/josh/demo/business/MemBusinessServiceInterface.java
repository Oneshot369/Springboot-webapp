package com.josh.demo.business;

import java.util.List;
import com.josh.model.MemModel;

public interface MemBusinessServiceInterface {
	public void test();
	public List<MemModel> getOrders();
	public String getTitle();
	public void init();
	public void destroy();
}
