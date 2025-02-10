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
<link href="/bookservice/css/write.css" rel="stylesheet">



</head>
<body>
	<div class="box">
		<h2>도서 수정</h2>
		<hr>
		<div>도서 이름 :</div>
		<input type="text" name="bname" class="form-control bnamebox"
			id="floatingInput" placeholder="도서이름"><br />
		<div>저자 :</div>
		<input type="text" name="bwriter" class="form-control bwriterbox"
			id="floatingInput" placeholder="저자"><br />
		<div>출판사 :</div>
		<input type="text" name="bpublisher"
			class="form-control bpublisherbox" id="floatingInput"
			placeholder="출판사"><br />
		<div>
			<button type="button" class="btn btn-primary" onclick="bookupdate()">수정</button>
			<button type="button" class="btn btn-primary" onclick="viewpage()">취소</button>
		</div>

	</div>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

	<script src="/bookservice/js/update.js" type="text/javascript"></script>
</body>
</html>