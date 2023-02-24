package com.josh.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;

import com.josh.demo.business.ValidLogins;
import com.josh.demo.business.MemBusinessService;
import com.josh.demo.business.MemBusinessServiceInterface;
import com.josh.demo.business.SecurityServiceInterface;

@Configuration
public class SpringConfig 
{
	@Bean(name = "ordersBusinessService", initMethod="init", destroyMethod="destroy")
	@RequestScope
	public MemBusinessServiceInterface getOrdersBusiness()
	{
		return new MemBusinessService();
	}
	@Bean(name="securityService")
	public SecurityServiceInterface getSecurityService()
	{
		return new ValidLogins();
	}
	
}
