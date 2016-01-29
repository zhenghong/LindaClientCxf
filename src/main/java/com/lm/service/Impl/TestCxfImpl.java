package com.lm.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lm.api.LoginDataI;
import com.lm.api.LoginDataO;
import com.lm.service.MessageService;
import com.lm.service.TestCxf;

@Service("testCxfI")
public class TestCxfImpl implements TestCxf {

	
	@Autowired
	private MessageService msi2;
	
	@Override
	public String test(String id) {
		
		String idR = id+"test";
		msi2.send2();
		System.out.println("fksdjflksjdflksjlk");
		
		int i = 1/0;
		
		return idR;
	}

	@Override
	public LoginDataO test2(LoginDataI in) {
		
		LoginDataO lo = new LoginDataO();
		lo.setEc(in.getUserId());
		lo.setEm(in.getPassword());
		return lo;
	}
	
}
