<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<!--  내가 만든 css -->
<link href="/bookservice/css/index.css" rel="stylesheet">
<link href="/bookservice/css/view.css" rel="stylesheet">



</head>
<body>
	<div class="box">
		<h2>도서 상세 정보</h2>
		<hr>
		<span>도서 번호 :</span>
		<span class="bnobox"></span><br/><br/>
		<span>도서 이름 :</span>
		<span class="bnamebox"></span><br/><br/>
		<span>저자 :</span>
		<span class="bwriterbox"></span><br/><br/>
		<span>출판사 :</span>
		<span class="bpublisherbox"></span><br/><br/>
		<span>생성일 :</span>
		<span class="bdatebox"></span><br/><br/>
		<span>수정일 :</span>
		<span class="bupdatebox"></span><br/><br/>
<div>
<button type= "button" class="btn btn-primary" onclick="location.href='index.jsp'">뒤로가기</button>
<button type= "button" class="btn btn-primary" onclick="updatepage()">수정하기</button>
<button type= "button" class="btn btn-primary" onclick="bookdelete()">삭제하기</button>
</div>
		
	</div>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

	<script src="/bookservice/js/view.js" type="text/javascript"></script>
</body>
</html>