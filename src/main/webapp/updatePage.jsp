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
<title>Dashboard Template · Bootstrap v5.1</title>


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
</style>


<!-- Custom styles for this template -->
<link href="dashboard.css" rel="stylesheet">
</head>

<body>
	<!-- navbar -->
	<jsp:include page="component/topNavbar.jsp"/>

	<div class="container-fluid">
		<div class="row">
			<!-- sidebar -->
			<jsp:include page="component/sidebar.jsp" />


			<main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">


				<h2>Section title</h2>
				<div class="table-responsive">
					<form action="UpdateMember.do" method="post">
						<table class="table table-striped table-sm">
							<thead>
								<tr>
									<th scope="col">mID</th>
									<th scope="col">email</th>
									<th scope="col">password</th>
									<th scope="col">name</th>
									<th scope="col">age</th>
									<th scope="col">address</th>
									<th scope="col">photo</th>
									<th scope="col">authority</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td><input name="mID" type="hidden" value="${mData.mID}">${mData.mID}</td>
									<td><input name="mEmail" type="text" value="${mData.email}"></td>
									<td><input name="mPwd" type="text" value="${mData.password}"></td>
									<td><input name="mName" type="text" value="${mData.name}"></td>
									<td>${mData.age}</td>
									<td><input name="mAddress" type="text" value="${mData.address}"></td>
									<td></td>
									<td></td>
								</tr>
							</tbody>

						</table>
					<button type="submit" class="btn btn-primary btn-lg">送出修改</button>
					</form>
				</div>
			</main>


		</div>
	</div>

	<footer> </footer>



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