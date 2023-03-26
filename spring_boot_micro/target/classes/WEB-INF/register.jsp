<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
	form{
		background-color:yellow;
		width:300px;
		height:auto;
		border-style:solid;
		border-color:blue;
		padding:10px;
		margin:10px;
	}
</style>

<div>
	<form action="/set-user" method="post">
		<div><h2>Registration Page</h2></div>
		<div>User Name: <input type="text" name="userName" value=""/></div>
		<div><br/></div>
		<div>Password: &nbsp;&nbsp;&nbsp;<input type="password1" name="password1" value=""/></div>
		<div><br/></div>
		<div>Retype Password: <input type="password2" name="password2" value=""/></div>
		<div><br/></div>
		<div><input type="submit" value="Register" style="background-color:blue;color:white;"/></div>
	</form>
</div>

<script type="text/javascript">
	function goToRegister(){
		alert("going to register");
		window.location.href="/register";
	}
</script>