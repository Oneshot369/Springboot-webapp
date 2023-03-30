package com.josh.demo.springstuff;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import com.josh.demo.business.ValidLogins;
import com.josh.demo.business.MemBusinessService;
import com.josh.demo.business.MemBusinessServiceInterface;
import com.josh.demo.business.SecurityServiceInterface;

@Configuration
public class SpringConfig 
{
	@Bean(name = "ordersBusinessService", initMethod="init", destroyMethod="destroy")
	@SessionScope
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
