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

<h2 style="text-align: center;">-商品列表-</h2>
	<div class="product-wall">
		<c:forEach items="${pList}" var="p">
			<div class="card" style="width: 26vw; margin: 20px">
				<img src="GetPhoto.do?pID=${p.pID}"
					style="width: 120px; margin: auto; padding: 5px;">
				<div class="card-body">
					<h5 class="card-title" style="text-align: center;">${p.name}</h5>
					<p class="card-text" style="text-align: center;">
						數量:${p.number}<br />價格:${p.price}<br />f_mID:${p.f_mID}
					</p>
				</div>
				<c:if test="${sessionScope.mData.authority == 'shopper'}">
				<div class="card-body" style="text-align: center;">
					<a href="#" class="card-link">更改數量/價格</a>
				</div>
				</c:if>
			</div>
		</c:forEach>
	</div>