<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<header
	class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0 shadow">
	<a class="navbar-brand col-lg-2 me-0 px-3" href="ShowAllProduct.do">回主頁</a>
	<c:if test="${sessionScope.mData.name != null}">
	<a class="navbar-brand col-lg-2 me-0 px-3" href="/MyEShopMall/userPage.jsp">回個人頁面</a>	
	</c:if>
	
	<form action="ShowProductByName.do" style="display: flex; flex: auto;">
	<input name="search" class="form-control form-control-dark w-100" type="text"
		placeholder="搜尋您的商品" aria-label="Search">
	<button class="btn btn-outline-success" style="color: rgb(243, 247, 235);" type="submit">Search</button>
	</form>
  
	<c:if test="${sessionScope.mData.name != null}">
		<span style="color: aliceblue;width: 100px;text-align: center;">
		HI, ${sessionScope.mData.name}
		</span>
	</c:if>
	<c:if test="${sessionScope.mData.name == null}">
	<div class="navbar-nav">
		<div class="nav-item text-nowrap">
			<a class="nav-link px-3" href="/MyEShopMall/registPage.jsp">註冊</a>
		</div>
	</div>
	<div class="navbar-nav">
		<div class="nav-item text-nowrap">
			<a class="nav-link px-3" href="/MyEShopMall/login.jsp">登入</a>
		</div>
	</div>
	</c:if>
	<c:if test="${sessionScope.mData.name != null}">
	<div class="navbar-nav">
		<div class="nav-item text-nowrap">
			<a class="nav-link px-3" href="/MyEShopMall/login.jsp">登出</a>
		</div>
	</div>
	</c:if>
</header>
