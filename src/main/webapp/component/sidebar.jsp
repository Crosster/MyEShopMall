<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<style>
.product-wall {
	margin: 20px;
	padding: 20px;
	display: flex;
	flex-direction: row;
	flex-wrap: wrap;
	justify-content: space-around;
}
</style>

<nav id="sidebarMenu" style="min-height: 60vw;"
	class="col-md-3 col-lg-2 d-md-block bg-light sidebar collapse">
	<div class="position-sticky pt-3">
		<ul class="nav flex-column">
			<c:if test = "${sessionScope.mData.authority == 'admin'}">
			<li class="nav-item"><a class="nav-link active"
				aria-current="page" href="/MyEShopMall/ShowAllMember.do">
				<span></span>
					會員列表
			</a></li>
			</c:if>
			
			<li class="nav-item"><a class="nav-link" href="/MyEShopMall/userPage.jsp"> 
			<span></span> 個人資料
			</a></li>
			
			<c:if test="${sessionScope.mData.authority == 'shopper'}">
			<li class="nav-item"><a class="nav-link" href="ShowShopperProduct.do"> 
			<span></span> 自家產品列表
			</a></li>
			</c:if>
			<c:if test="${0==1}">
			<li class="nav-item"><a class="nav-link" href="#"> 
			<span></span> 交易紀錄
			</a></li>
			</c:if>
		</ul>
	</div>
</nav>
