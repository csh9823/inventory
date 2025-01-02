package com.springstudy.bbs.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springstudy.bbs.service.TestService;

@Controller
public class MainController {
	
	@Autowired
	private TestService testservice;
	
	@RequestMapping("/main")
	public String getUsers(Model model) {
		List<HashMap<String, Object>> test = testservice.getAllUsers();
		System.out.println(test);
		model.addAttribute("testdata", test);
		return "test";
	}
	
	@RequestMapping("/testboot")
	public String testboot() {
		return "testboot";
	}
	
	
//	@RequestMapping("/testsub")
//	public String testsub() {
//		return "forward:/WEB-INF/testsub.jsp";
//	}
	
}
