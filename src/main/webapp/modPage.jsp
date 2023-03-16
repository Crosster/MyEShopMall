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
<title>ModPage</title>


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


				<h2>控制台</h2>
				<div class="table-responsive">
					<table class="table table-striped table-sm">
						<thead>
							<tr>
								<th scope="col">mID</th>
								<th scope="col">email</th>
								<th scope="col">name</th>
								<th scope="col">age</th>
								<th scope="col">address</th>
								<th scope="col">photo</th>
								<th scope="col">authority</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${mList}" var="m">
								<tr>
									<td>${m.mID}</td>
									<td>${m.email}</td>
									<td>${m.name}</td>
									<td>${m.age}</td>
									<td>${m.address}</td>
									<td><img src="GetPhoto.do?mID=${m.mID}"
										style="width: 100px;"></td>
									<td>${m.authority}</td>
									<td><a href="DeleteMemberByID.do?mID=${m.mID}"><button>刪除</button></a>
									</td>
									<td><a href="GetMemberUpdatePage.do?mID=${m.mID}"><button>更新</button></a>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</main>


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