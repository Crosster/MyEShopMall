<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>userPage</title>


<!-- CDN -->
<jsp:include page="component/cdnStr.jsp" />

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
</style>


<!-- Custom styles for this template -->
<link href="dashboard.css" rel="stylesheet">
</head>

<body>
	<!-- navbar -->
	<jsp:include page="component/topNavbar.jsp" />

	<div class="container-fluid">
		<div class="row">
			<!-- sidebar -->
			<jsp:include page="component/sidebar.jsp" />

			<main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">

				<h2>會員資料</h2>
				<hr>
				<div class="table-responsive">
					<table class="table table-striped table-sm">
						<colgroup>
							<col width="19%">
							<col width="31%">
							<col width="19%">
							<col width="31%">
						</colgroup>

						<thead></thead>
						<tbody>
							<tr>
								<th>大頭貼<br>Photo
								</th>
								<td><img src="GetPhoto.do?mID=${mData.mID}"
									style="width: 200px;"></td>
								<th>年齡<br>Age
								</th>
								<td>${mData.age}</td>
							</tr>
							<tr>
								<th>姓名</th>
								<td>${mData.name}</td>
							</tr>
							<tr>
								<th>電子郵件<br>E-Mail
								</th>
								<td colspan="3">${mData.email}</td>
							</tr>
							<th>聯絡地址<br>Location
							</th>
							<td colspan="3">${mData.address}</td>
							</tr>
						</tbody>
					</table>
				</div>
			
		<c:if test="${pList != null}">			
		<jsp:include page="component/showProductList.jsp" />
		</c:if>		 
				<!-- <a href="GetUpdatePage.do?mID=${m.mID}"><button>修改會員資料</button></a> -->
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