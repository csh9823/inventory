package com.springstudy.bbs.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface TestUserMapper {
	List<HashMap<String, Object>> findAllUsers();  // 사용자 데이터를 조회하는 메서드
}
