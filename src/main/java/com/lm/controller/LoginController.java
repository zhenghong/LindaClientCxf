//package com.lm.controller;
//
//import java.security.NoSuchAlgorithmException;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.lm.api.LoginDataI;
//import com.lm.api.LoginDataO;
//import com.lm.model.MesInfo;
//import com.lm.service.MessageService;
//
//@RestController
//public class LoginController extends BaseController {
//
//	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
//
//	@Autowired
//	private MessageService msi;
//
//	@RequestMapping("/testTXMQ")
//	public LoginDataO testTx(LoginDataI input, LoginDataO result) throws NoSuchAlgorithmException {
//
//		msi.send(new MesInfo("usi31", "testTX", new Object[] { "997" }));
//		msi.send(new MesInfo("usi32", "testTX", new Object[] { "997" }));
//
//		return result;
//	}
//
//	@RequestMapping("/testMule")
//	public LoginDataO testMule(LoginDataI input, LoginDataO result) throws NoSuchAlgorithmException {
//		
//		msi.send2();
//		return result;
//	}
//}