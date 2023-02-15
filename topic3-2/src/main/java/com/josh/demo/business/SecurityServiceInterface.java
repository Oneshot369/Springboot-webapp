package com.josh.demo.business;

import com.josh.model.LoginModel;

public interface SecurityServiceInterface {
	public boolean isAuthenticated(LoginModel loginModel);
}
