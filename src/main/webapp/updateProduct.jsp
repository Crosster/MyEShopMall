<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!doctype html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author"
	content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Hugo 0.88.1">
<title>主頁</title>


<!-- CDN -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ"
	crossorigin="anonymous"></script>

<!-- Bootstrap core CSS -->
<link href="../assets/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}

.product-wall {
	margin: 20px;
	padding: 20px;
	display: flex;
	flex-direction: row;
	flex-wrap: wrap;
	justify-content: space-around;
}
</style>


<!-- Custom styles for this template -->
<link href="dashboard.css" rel="stylesheet">
</head>

<body>
	<!-- topNavbar -->
	<jsp:include page="component/topNavbar.jsp" />

	<div class="container-fluid">
		<div class="row">
			<!-- sidebar -->
			<jsp:include page="component/sidebar.jsp" />

			<div class="product-wall">
				<form action="UpdateMember.do" method="post">
				<c:forEach items="${pData}" var="p2">
					<div class="card" style="width: 26vw; margin: 20px">
						<img src="GetPhoto.do?pID=${p2.pID}"
							style="width: 120px; margin: auto; padding: 5px;">
						<div class="card-body">
								<input name="pID" type="hidden">${p2.pID}
								<input name="pName" type="text" placeholder="${p2.name}"> 
								<input name="pNumber" type="text" placeholder="${p2.number}">
								<input name="pPrice" type="text" placeholder="${p2.price}">
								<input name="pType" type="hidden">${p2.type}
								<p>f_mID:${p2.f_mID}</p>
								<button type="submit" class="btn btn-primary btn-lg">送出修改</button>
						</div>
						<c:if test="${sessionScope.mData.authority == 'shopper'}">
							<div class="card-body" style="text-align: center;">
								<a href="GetProductUpdatePage.do?pID=${p2.pID}"
									class="card-link">更改數量/價格</a>
							</div>
						</c:if>
					</div>
				</c:forEach>
				</form>
			</div>

		</div>
	</div>

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

</html>