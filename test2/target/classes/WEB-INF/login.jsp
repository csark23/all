<style>
form{
	background-color:white;
	width:250px;
	height:auto;
	border-style:solid;
	border-color:blue;
	padding:10px;
}
</style>
<div>
	<form action="/login" method="post">
		<div>UserName : <input type="text" name="userName" value=""/></div>
		<div><br></div>
		<div>Password : <input type="password" name="password" value=""/></div>
		<div><br></div>
		<div><input type="submit" value="login" style="background-color:skyblue;"/></div>
		<div><br></div>
		<div><input type="button" value="Register" style="background-color:skyblue;"/></div>
		<div><br></div>
	</form>
</div>
