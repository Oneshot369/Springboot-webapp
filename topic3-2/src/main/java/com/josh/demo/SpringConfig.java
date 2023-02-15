package com.josh.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import com.josh.demo.business.AnotherOrdersBusinessService;
import com.josh.demo.business.FiveValidLogins;
import com.josh.demo.business.OrdersBusinessService;
import com.josh.demo.business.OrdersBusinessServiceInterface;
import com.josh.demo.business.SecurityServiceInterface;

@Configuration
public class SpringConfig 
{
	@Bean(name = "ordersBusinessService", initMethod="init", destroyMethod="destroy")
	@Scope(value="prototype", proxyMode=ScopedProxyMode.TARGET_CLASS)
	public OrdersBusinessServiceInterface getOrdersBusiness()
	{
		return new OrdersBusinessService();
	}
	@Bean(name="securitySevice")
	public SecurityServiceInterface getSecurityService()
	{
		return new FiveValidLogins();
	}
	
}
