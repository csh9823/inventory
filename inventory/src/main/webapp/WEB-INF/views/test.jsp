<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<p>메인 페이지 테스트 입니다.</p>
<c:forEach var="item" items="${testdata}">
		<p>
			${item.ENAME}<br>
			${item.EMPNO}
		</p>
</c:forEach>
