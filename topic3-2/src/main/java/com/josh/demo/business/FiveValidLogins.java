package com.josh.demo.business;

import com.josh.model.LoginModel;

public class FiveValidLogins implements SecurityServiceInterface{

	@Override
	public boolean isAuthenticated(LoginModel loginModel) 
	{
		String[][] validLogins = new String[][] 
			{ 
				{ "Josh", "123" }, 
				{ "Ace", "Gock" }, 
				{ "Zack", "30s0v" },
				{ "Brayan", "6969" }
			};
				
			//CHeck to see if the login matches our users list
			boolean success = false;
			for(int i =0; i < validLogins.length; i++)
			{
				if(loginModel.getUsername().equals(validLogins[i][0]) && loginModel.getPassword().equals(validLogins[i][1]))
				{
					success = true;
				}
			}
		return success;
	}

}
