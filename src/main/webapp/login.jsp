<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>

<!-- CDN -->
<jsp:include page="component/cdnStr.jsp" />

<style>
#logbox {
	height:50vw;
	display: flex;
	justify-content: center;
	align-items: center;
	border: 2px solid black;
	
}
</style>

</head>
<body>

	<div id="logbox" class="container">
		<div>
			<section>
				<div class="container-fluid h-custom">
					<div
						class="row d-flex justify-content-center align-items-center h-100">
						<div class="col-md-9 col-lg-6 col-xl-5">
							<img
								src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.webp"
								class="img-fluid" alt="Sample image">
						</div>
						<div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">



							<form action="UserLogin.do" method="post">



								<!-- Email input -->
								<div class="form-outline mb-4">
									<input name="email" type="email"
										class="form-control form-control-lg"
										placeholder="Enter email address" /> <label
										class="form-label">Email address</label>


								</div>
								<!-- Password input -->
								<div class="form-outline mb-3">
									<input name="password" type="password"
										class="form-control form-control-lg"
										placeholder="Enter password" /> <label class="form-label">Password</label>


								</div>
								<div class="d-flex justify-content-between align-items-center">
									<!-- Checkbox -->
									<div class="form-check mb-0">


										<input class="form-check-input me-2" type="checkbox" value=""
											id="form2Example3" /> <label class="form-check-label">
											Remember me </label>
									</div>
									<a href="#!" class="text-body">Forgot password?</a>
								</div>

								<div class="text-center text-lg-start mt-4 pt-2">
									<button type="submit" class="btn btn-primary btn-lg"
										style="padding-left: 2.5rem; padding-right: 2.5rem;">Login</button>
									<p class="small fw-bold mt-2 pt-1 mb-0">
										Don't have an account? <a href="/MyEShopMall/registPage.jsp"
											class="link-danger">Register</a>
									</p>
								</div>

							</form>
						</div>
					</div>
				</div>

			</section>
		</div>

	</div>

</body>
</html>