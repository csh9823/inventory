<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<form name="addcodeForm" id="addcode" action="insertcodeok" method="get">
	<div class="row ">
		<div class="col">

			<div class="row justify-content-center">
				<div class="col-4 my-1">
					<select name="codenume" id="codevalue"
						class="form-select form-select-sm"
						aria-label="Small select example">
						<option selected value="0">선택하세요.</option>
						<c:forEach var="commd" items="${CommdList}">
							<option value="${commd.COMMNUM}">${commd.COMMNAME}</option>
						</c:forEach>
					</select>
				</div>
			</div>
			<div class="row justify-content-center">
				<div class="col-auto">
					<div class="input-group" style="width: 200px;">
						<input name="codename" type="text" class="form-control"
							aria-label="Sizing example input"
							aria-describedby="inputGroup-sizing-default">
					</div>
				</div>
			</div>
			<div class="row justify-content-center">
				<div class="col-auto">
					<button type="submit" class="btn btn-primary">저장</button>
					<button type="reset" class="btn btn-danger" onclick="clearInfoRow()">취소</button>
				</div>
			</div>
		</div>

		<div class="col">
			<div class="row" id="infoRow"
				style="display: none; max-height: 300px; overflow-y: auto;">
				<div class="col-2 my-1 text-start">이름 :</div>
				<div class="col-9 my-1 text-start">가전제품</div>
			</div>
		</div>
	</div>
</form>
<script type="text/javascript">
$(document).ready(function () {
    $('#codevalue').on('change', function () {
        const selectedValue = $(this).val(); // 선택된 값 가져오기
        if (selectedValue !== "0") { // 기본값이 아닌 경우
            $('#infoRow').show(); // 행 보이기
            console.log(selectedValue);
			// Ajax 요청 전송
			$.ajax({
				url : '/springstudy-bbs01/CodeList', // Spring에서 매핑한 URL
				type : 'GET', // 요청 방식
				data : {
					codenum : selectedValue
				}, // 파라미터로 전송
				success : function(response) {
					console.log('서버 응답:', response); // 서버 응답 확인
			        // infoRow의 기존 내용 삭제
			        $("#infoRow").empty();
			        // 응답 데이터로 반복문을 통해 <div> 생성
			        response.forEach(function(item) {			            
			            console.log('CODENAME:', item.CODENAME); // 추출된 codename 확인
			            	let newRow = 
			            	    '<div class="col-2 my-1 text-start">이름 :</div>' +
			            	    '<div class="col-9 my-1 text-start">' + item.CODENAME + '</div>';
			            $("#infoRow").append(newRow);
			        });
				},
				error : function(error) {
					// 실패 시 에러 출력
					console.error('Error:', error);
				}
			});
        } else {
            $('#infoRow').hide(); // 기본값인 경우 숨기기
        }
    });
});

function clearInfoRow() {
    $("#infoRow").empty(); // infoRow 내부 내용 제거
    console.log("infoRow 비워짐");
}
</script>