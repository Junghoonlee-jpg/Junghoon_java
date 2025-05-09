<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOVE</title>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">

<link rel="icon" href="http://localhost:8080/jsp2/static/images/3dcat.ico">
<link rel="stylesheet" href="http://localhost:8080/jsp2/static/css/default.css">
<link rel="stylesheet" href="http://localhost:8080/jsp2/static/css/main.css">


</head>
<body>
	<%@ include file="./header.jsp" %>
	
	<div id="main">
		<div id="slide-wrap">
			<div class="slide-img">
				<img src="https://picsum.photos/1000/400?random=1">
			</div>
			<p class="arrow">
				<span class="arrow-left">
					<i class="bi bi-arrow-left-square-fill">
					</i>
				</span>
				<span class="arrow-right">
					<i class="bi bi-arrow-right-square-fill">
					</i>
				</span>			
			</p>
		</div>
		
		<div id="content-wrap">
		 	<img src="https://picsum.photos/300/300?random=2">
		 	<img src="https://picsum.photos/300/300?random=3">
		 	<img src="https://picsum.photos/300/300?random=4">
		 	<img src="https://picsum.photos/300/300?random=5">
		 	<img src="https://picsum.photos/300/300?random=6">
		 	<img src="https://picsum.photos/300/300?random=7">
		 	<img src="https://picsum.photos/300/300?random=8">
		 	<img src="https://picsum.photos/300/300?random=9">
		 	<img src="https://picsum.photos/300/300?random=10">
		</div>
		
	</div>
	
	<%@ include file="./footer.jsp" %>

</body>
</html>