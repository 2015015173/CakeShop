<!DOCTYPE html>
<html>
<head>
<title>Regist</title>
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
	<!--header-->
	<jsp:include page="header.jsp"></jsp:include>
	<!--//header-->
	<!-- 注册新用户 -->
	<!--account-->
	<div class="account">
		<div class="container">
			<div class="register">
				<form name="registerForm" action="register?method=register" method="post"> 
					<div class="register-top-grid">
						<h3>Personal information</h3>
						<div class="input">
							<span>First Name<label>*</label></span>
							<input type="text" name="firstname"> 
						</div>
						<div class="input">
							<span>Last Name<label>*</label></span>
							<input type="text" name="lastname"> 
						</div>
						<div class="input">
							<span>Email Address<label>*</label></span>
							<input type="text" name="emailaddress"> 
						</div>
						<a class="news-letter" href="#">
							<label class="checkbox">
							  <input type="checkbox" name="checkbox"/>
							  <i> </i>Sign Up for Newsletter
						    </label>
						</a>
						<div class="clearfix"> </div>
					</div>
				    <div class="register-bottom-grid">
						<h3>Login information</h3>
						<div class="input">
							<span>Password<label>*</label></span>
							<input type="password" name="password1">
						</div>
						<div class="input">
							<span>Confirm Password<label>*</label></span>
							<input type="password" name="password2"/>
						 </div>
					</div>
				</form>
				<div class="clearfix"> </div>
				<div class="register-but">
				   <form>
					   <input type="submit" value="submit" name="submit">
					   <a href="index.jsp">return</a>
					   <div class="clearfix"> </div>
				   </form>
				</div>
			</div>
	    </div>
	</div>
	<!--//account-->
	<!--footer-->
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>