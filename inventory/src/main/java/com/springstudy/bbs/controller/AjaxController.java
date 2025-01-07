package com.springstudy.bbs.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springstudy.bbs.service.CodeService;

@RestController
public class AjaxController {
	
	@Autowired
	private CodeService codeservice;
	//produces = "text/plain; charset=UTF-8"
	@RequestMapping(value="/CodeList",method = RequestMethod.GET)
	public List<HashMap<String,String>> CodeList(@RequestParam("codenum") int codenum) {
		System.out.println(codenum);
		System.out.println(codeservice.CodeSelect(codenum));
		return codeservice.CodeSelect(codenum);
	}
}
