<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<!DOCTYPE html>
	<html>

	<head>
		<meta charset="UTF-8">
		<title>會員註冊</title>


		<!-- CDN -->
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet"
			integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ"
			crossorigin="anonymous"></script>

	</head>

	<body>

		<form action="RegistMember.do" method="post">

			<section class="vh-100" style="background-color: #2779e2;">
				<div class="container h-100">
					<div class="row d-flex justify-content-center align-items-center h-100">
						<div class="col-xl-9">

							<h1 class="text-white mb-4">立即註冊</h1>

							<div class="card" style="border-radius: 15px;">
								<div class="card-body">
<!-- 信箱 mEmail -->
									<div class="row align-items-center py-3">
										<div class="col-md-3 ps-5">

											<h6 class="mb-0">email信箱</h6>

										</div>
										<div class="col-md-9 pe-5">

											<input name="mEmail" type="email" class="form-control form-control-lg"
												placeholder="example@example.com">

										</div>
									</div>

									<hr class="mx-n3">
<!-- 密碼 mPwd-->
									<div class="row align-items-center pt-4 pb-3">
										<div class="col-md-3 ps-5">

											<h6 class="mb-0">密碼</h6>

										</div>
										<div class="col-md-9 pe-5">

											<input name="mPwd" type="password" class="form-control form-control-lg">

										</div>
									</div>

									<hr class="mx-n3">
<!-- 姓名 mName -->
									<div class="row align-items-center pt-4 pb-3">
										<div class="col-md-3 ps-5">

											<h6 class="mb-0">姓名</h6>

										</div>
										<div class="col-md-9 pe-5">

											<input name="mName" type="text" class="form-control form-control-lg">

										</div>
									</div>

									<hr class="mx-n3">
<!-- 生日 mAge -->
									<div class="row align-items-center pt-4 pb-3">
										<div class="col-md-3 ps-5">

											<h6 class="mb-0">生日</h6>

										</div>
										<div class="col-md-9 pe-5">

											<input name="mAge" type="number" class="form-control form-control-lg">

										</div>
									</div>

									<hr class="mx-n3">
<!-- 地址 mAddress -->
									<div class="row align-items-center pt-4 pb-3">
										<div class="col-md-3 ps-5">

											<h6 class="mb-0">地址</h6>

										</div>
										<div class="col-md-9 pe-5">

											<input name="mAddress" type="text" class="form-control form-control-lg">

										</div>
									</div>

									<hr class="mx-n3">
<!-- 大頭貼 mPic -->
									<div class="row align-items-center py-3">
										<div class="col-md-3 ps-5">

											<h6 class="mb-0">大頭貼</h6>

										</div>
										<div class="col-md-9 pe-5">

											<input name="mPic" class="form-control form-control-lg" id="formFileLg" type="file">
											<div class="small text-muted mt-2">Upload png file. Max filesize 2 MB</div>

										</div>
									</div>

									<hr class="mx-n3">
<!-- 送出註冊 -->
									<div class="px-5 py-4">
										<button type="submit" class="btn btn-primary btn-lg">註冊</button>
									</div>

								</div>
							</div>

						</div>
					</div>
				</div>
			</section>
		</form>
	</body>

	</html>