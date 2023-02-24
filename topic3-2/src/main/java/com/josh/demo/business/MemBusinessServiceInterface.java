package com.josh.demo.business;

import java.util.List;
import com.josh.model.MemModel;

public interface MemBusinessServiceInterface {
	//accessing data
	public List<MemModel> getMem();
	public List<MemModel> searchMem(String name);
	//getting the title of our list
	public String getTitle();
	public String getSearchTitle(String search);

	public void test();
	public void init();
	public void destroy();
}
