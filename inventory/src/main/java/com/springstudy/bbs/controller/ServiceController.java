package com.springstudy.bbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ServiceController {
	
	@RequestMapping("/codeinsert")
	public String getUsers(Model model) {		
		return "codeinsert/insertcode";
	}
}
