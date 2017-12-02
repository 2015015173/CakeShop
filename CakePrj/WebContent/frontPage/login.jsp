<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录</title>
<script>$(document).ready(function(c) {
	$('.alert-close').on('click', function(c){
		$('.message').fadeOut('slow', function(c){
	  		$('.message').remove();
		});
	});	  
});
</script>
<script>$(document).ready(function(c) {
	$('.alert-close1').on('click', function(c){
		$('.message1').fadeOut('slow', function(c){
	  		$('.message1').remove();
		});
	});	  
});
</script>
<script>$(document).ready(function(c) {
	$('.alert-close2').on('click', function(c){
		$('.message2').fadeOut('slow', function(c){
	  		$('.message2').remove();
		});
	});	  
});
</script>
</head>
<body>
<form id="loginForm" action="/CakePrj/user/login" method="post">
	<fieldset id="body">
		<fieldset>
	    	<label for="email">Email Address</label>
			<input type="text" name="email" id="email">
		</fieldset>
		<fieldset>
		    <label for="password">Password</label>
		    <input type="password" name="password" id="password">
		</fieldset>
		    <input type="submit" id="login" value="Sign in"/>
		    <label for="checkbox">
		      <input type="checkbox" id="checkbox"/>
		      <i>Remember me</i>
		    </label>
		</fieldset>
		<p>New User ? 
		    <a class="sign" href="account.jsp">Sign Up</a> <span>
		    <a href="#">Forgot your password?</a></span></p>
	</form>
</body>
</html>