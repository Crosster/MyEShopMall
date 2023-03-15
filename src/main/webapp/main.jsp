<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- CDN -->
<jsp:include page="component/cdnStr.jsp" />

<style>
#carousel-box {
	margin: auto;
	margin-bottom: 10px; 
	width : 80vw;
	height: 200px;
	width: 80vw;
	width: 80vw
}

.d-block {
	height: 200px;
	overflow: hidden;
}

</style>

</head>
<body style="background-color: #f7faff;">
	<!-- navbar -->
	<jsp:include page="component/topNavbar.jsp" />
	<!-- 登入失敗訊息 -->

	<h1 style="color: red;">${logfailmsg}</h1>
	
	<!-- 輪播牆 -->
	<div id="carousel-box">
		<div id="carouselExampleIndicators" class="carousel slide"
			data-bs-ride="carousel">
			<div class="carousel-inner">
				<div class="carousel-item active">
					<img id="carousel-box" src="Img/carousel/carousel1.jpg"
						class="d-block w-100">
				</div>
				<div class="carousel-item">
					<img id="carousel-box" src="Img/carousel/carousel2.jpg"
						class="d-block w-100">
				</div>
				<div class="carousel-item">
					<img id="carousel-box" src="Img/carousel/carousel3.jpg"
						class="d-block w-100">
				</div>
			</div>
			<!-- 輪播左右按鈕 -->
			<button class="carousel-control-prev" type="button"
				data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
				<span class="carousel-control-prev-icon" aria-hidden="true"></span>
				<span class="visually-hidden">Previous</span>
			</button>
			<button class="carousel-control-next" type="button"
				data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
				<span class="carousel-control-next-icon" aria-hidden="true"></span>
				<span class="visually-hidden">Next</span>
			</button>
		</div>
	</div>

	<jsp:include page="component/showProductList.jsp" />


	<footer>
		<jsp:include page="component/footers/footer.jsp" />
	</footer>



	<script src="../assets/dist/js/bootstrap.bundle.min.js"></script>

	<script
		src="https://cdn.jsdelivr.net/npm/feather-icons@4.28.0/dist/feather.min.js"
		integrity="sha384-uO3SXW5IuS1ZpFPKugNNWqTZRRglnUJK6UAZ/gxOX80nxEkN9NcGZTftn6RzhGWE"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/chart.js@2.9.4/dist/Chart.min.js"
		integrity="sha384-zNy6FEbO50N+Cg5wap8IKA4M/ZnLJgzc6w2NqACZaK0u0FXfOWRRJOnQtpZun8ha"
		crossorigin="anonymous"></script>
	<script src="dashboard.js"></script>


</body>

</body>
</html>