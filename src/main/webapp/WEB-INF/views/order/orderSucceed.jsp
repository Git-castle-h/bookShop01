<%@ page language="Java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"
	 isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<head>
<script>
	alert("결제에 성공하셨습니다.");
</script>
<style>
	.succeed_wrap{
		min-height :13em;
		width: 100%;
		display:flex;
	    justify-content: center;
	    align-items: center;
	    flex-direction:column;
	}
	
	.succeed_btn{
		padding: 0.3em 0.5em;
		background-color:white;
		color:black;
		border: 1px solid gray;	
	}
	.succeed_btn:hover{
		background-color:gray;
		color:black;
		border: 1px solid white;		
	}
</style>
</head>
<body>
	<div class="succeed_wrap">
		<div>승인 번호 : ${authNumber} </div>
		<div>결제 금액 : ${amount} </div>
		<a class="succeed_btn btn btn1" href="${contextPath}/mypage/myPageMain.do">주문확인</a>
	</div>
</body>