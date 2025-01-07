package com.springstudy.bbs.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springstudy.bbs.mapper.CodeMapper;

@Service
public class CodeService {
	
	@Autowired
	private CodeMapper codemapper;
	
	// 분류 카데고리 가져오기
	public List<HashMap<String,String>> CommdSelect(){
		return codemapper.CommdSelect();
	}
	
	// 분류 상세 리스트 가져오기
	public List<HashMap<String,String>> CodeSelect(int codenum){
		return codemapper.CodeSelect(codenum);
	}
}
