<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
	form{
		background-color:skyblue;
		width:260px;
		height:auto;
		border-style:solid;
		border-color:blue;
		padding:10px;
		margin:10px;
	}
</style>

<div>
	<form action="/login" method="post">
		<c:if test="${not empty error}">
			<div style="color:red;"><h5>${error}</h5></div>
		</c:if>
		<c:if test="${not empty registerSuccess}">
			<div style="color:green;"><h5>${error}</h5></div>
		</c:if>
		<c:if test="${not empty registrationError}">
			<div style="color:red;"><h5>${error}</h5></div>
		</c:if>
		<div>User Name: <input type="text" name="userName" value=""/></div>
		<div><br/></div>
		<div>Password: &nbsp;&nbsp;&nbsp;<input type="password" name="password" value=""/></div>
		<div><br/></div>
		<div><input type="submit" value="login" style="background-color:blue;color:white;"/></div>
		<div><br/></div>
		<div><input type="button" value="Register" onclick="goToRegister()" style="background-color:blue;color:white;"/></div>
	</form>
</div>

<script type="text/javascript">
	function goToRegister(){
		alert("going to register");
		window.location.href="/register";
		
	}
</script>