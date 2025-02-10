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


</head>
<body>
	<div class="container">
		
		<table class="table booklist">
			<thead>
				<tr >
					<th>책 번호</th>
					<th>도서명</th>
					<th>저자</th>
					<th>출판사</th>
					<th>비고</th>
				</tr>
			</thead>
			<tbody>

			</tbody>

		</table>
		<button class="btn btn-primary" onclick="location.href='/bookservice/jsp/write.jsp'">
			도서 생성하기</button>
	</div>
	

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

	<script src="/bookservice/js/index.js" type="text/javascript"></script>
</body>
</html>