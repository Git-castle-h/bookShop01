<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"
	 isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<head>
<script>
	alert("결제에 실패하셨습니다.");
</script>
<style>
	.fail_wrap{
		min-height :13em;
		width: 100%;
		display:flex;
	    justify-content: center;
	    align-items: center;
	    flex-direction:column;
	}
	
	.fail_btn{
		padding: 0.3em 0.5em;
		background-color:white;
		color:black;
		border: 1px solid gray;	
	}
	.fail_btn:hover{
		background-color:gray;
		color:black;
		border: 1px solid white;		
	}
</style>
</head>
<body>
	<div class="fail_wrap">
		<div>실패 사유 : ${responseMsg} </div>
		<a class="fail_btn btn btn1" href="javascript:history.back()">돌아가기</a>
	</div>
</body>