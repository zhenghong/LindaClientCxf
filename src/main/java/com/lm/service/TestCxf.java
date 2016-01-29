package com.lm.service;

import com.lm.api.LoginDataI;
import com.lm.api.LoginDataO;

public interface TestCxf {
	
	public String test(String id);
	
	public LoginDataO test2(LoginDataI in);
}
