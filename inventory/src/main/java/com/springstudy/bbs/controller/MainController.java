package com.springstudy.bbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springstudy.bbs.service.CodeService;

@Controller
public class MainController {

	@Autowired
	private CodeService codeservice;

	@RequestMapping("/testboot")
	public String testboot() {

		return "testboot";
	}

	// 공통 코드 등록
	@RequestMapping("/insertcode")
	public String insertcode(Model model) {
		System.out.println("분류 코드 리스트" + codeservice.CommdSelect());
		model.addAttribute("CommdList", codeservice.CommdSelect());
		return "codeinsert/insertcode";
	}

	// 공통 코드 등록
	@RequestMapping(value = "/insertcodeok", method = RequestMethod.GET)
	public String insertcodeok(int codenume, String codename) {	
		System.out.println("코드넘버 : " + codenume);		
		System.out.println("코드이름 : " + codename);				
		return "redirect:/insertcode";
	}
}
