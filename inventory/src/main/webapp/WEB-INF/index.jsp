<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<style type="text/css">
</style>
<script src="resources/js/jquery-3.2.1.min.js"></script>
<!-- <script src="resources/js/formcheck.js"></script> -->
<link href="resources/bootstrap/bootstrap.min.css" rel="stylesheet" >
</head>
<body>
	<%@ include file="template/header.jsp"%>
	<div class="container text-center">
		<jsp:include page="${param.body}" />
	</div>
	<%@ include file="template/footer.jsp"%>
	<script src="resources/bootstrap/bootstrap.bundle.min.js"></script>
</body>
</html>