package com.springstudy.bbs.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface CodeMapper {
	// 대분류 값 가져오기
	List<HashMap<String,String>> CommdSelect();
	// 코드 값 가져오기
	List<HashMap<String,String>> CodeSelect(int codenum);
}
