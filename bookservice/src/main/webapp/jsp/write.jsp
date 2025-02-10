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
		<h2>도서 생성</h2>
		<div>도서 이름 :</div>
		 <input type="text" name ="mid" class="form-control" id="floatingInput" placeholder="도서이름"><br/>
		<div>저자 :</div>
		<input type="text" name ="mid" class="form-control" id="floatingInput" placeholder="저자"><br/>
		<div>출판사 :</div>
		<input type="text" name ="mid" class="form-control" id="floatingInput" placeholder="출판사"><br/>

		<button class="btn btn-primary"
			onclick="location.href='/jsp/index.jsp'">submit</button>
	</div>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

	<script src="/bookservice/js/index.js" type="text/javascript"></script>
</body>
</html>