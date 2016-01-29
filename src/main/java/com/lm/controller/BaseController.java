package com.lm.controller;

import java.security.NoSuchAlgorithmException;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lm.api.ErrorData;

public class BaseController {
	
	/** ����@ExceptionHandler�쳣���� */
	@ExceptionHandler
	public  @ResponseBody ErrorData exp(Exception ex) {

		ErrorData error = new ErrorData();

		// ���ݲ�ͬ�������model
		if (ex instanceof NoSuchAlgorithmException) {
			error.setEc("1");
			error.setEm("��ȡSIDʧ�ܣ�");
			return error;
		} else {
			error.setEc("9");
			error.setEm(ex.getLocalizedMessage());
			return error;
		}
	}

}
