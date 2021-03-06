<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //Custom Theme files -->
<link href="../static/css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
<link href="../static/css/style.css" type="text/css" rel="stylesheet" media="all">
<!-- js -->
<script src="../static/js/jquery.min.js"></script>
<script type="text/javascript" src="../static/js/bootstrap-3.1.1.min.js"></script>
<!-- //js -->	
<!-- cart -->
<script src="../static/js/simpleCart.min.js"> </script>
<!-- cart -->
</head>
<body>
	<div class="header">
		<div class="container">
			<nav class="navbar navbar-default" role="navigation">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<h1 class="navbar-brand"><a href="index.jsp">TopCake</a></h1>
				</div>
				<!--navbar-header-->
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li><a href="index.jsp" class="active">Home</a></li>
						<li class="dropdown">
							<a href="index.jsp" class="dropdown-toggle" data-toggle="dropdown">Birthday<b class="caret"></b></a>
							<ul class="dropdown-menu multi-column columns-4">
								<div class="row">
									<div class="col-sm-3">
										<h4>By Relation</h4>
										<ul class="multi-column-dropdown">
											<li><a class="list" href="products.jsp">Friend</a></li>
											<li><a class="list" href="products.jsp">Lover</a></li>
											<li><a class="list" href="products.jsp">Sister</a></li>
											<li><a class="list" href="products.jsp">Brother</a></li>
											<li><a class="list" href="products.jsp">Kids</a></li>
											<li><a class="list" href="products.jsp">Parents</a></li>
										</ul>
									</div>																		
									<div class="col-sm-3">
										<h4>By Flavour</h4>
										<ul class="multi-column-dropdown">
											<li><a class="list" href="products.jsp">Chocolate</a></li>
											<li><a class="list" href="products.jsp">Mixed Fruit</a></li>
											<li><a class="list" href="products.jsp">Butterscotch</a></li>
											<li><a class="list" href="products.jsp">Strawberry</a></li>
											<li><a class="list" href="products.jsp">Vanilla</a></li>
											<li><a class="list" href="products.jsp">Eggless Cakes</a></li>
										</ul>
									</div>
									<div class="col-sm-3">
										<h4>By Theme</h4>
										<ul class="multi-column-dropdown">
											<li><a class="list" href="products.jsp">Heart shaped</a></li>
											<li><a class="list" href="products.jsp">Cartoon Cakes</a></li>
											<li><a class="list" href="products.jsp">2-3 Tier Cakes</a></li>
											<li><a class="list" href="products.jsp">Square shape</a></li>
											<li><a class="list" href="products.jsp">Round shape</a></li>
											<li><a class="list" href="products.jsp">Photo cakes</a></li>
										</ul>
									</div>
									<div class="col-sm-3">
										<h4>Weight</h4>
										<ul class="multi-column-dropdown">
											<li><a class="list" href="products.jsp">1 kG</a></li>
											<li><a class="list" href="products.jsp">1.5 kG</a></li>
											<li><a class="list" href="products.jsp">2 kG</a></li>
											<li><a class="list" href="products.jsp">3 kG</a></li>
											<li><a class="list" href="products.jsp">4 kG</a></li>
											<li><a class="list" href="products.jsp">Large</a></li>
										</ul>
									</div>
								</div>
							</ul>
						</li>
					   <li class="dropdown grid">
							<a href="#" class="dropdown-toggle list1" data-toggle="dropdown">Wedding<b class="caret"></b></a>
							<ul class="dropdown-menu multi-column columns-4">
								<div class="row">
									<div class="col-sm-3">
										<h4>By Relation</h4>
										<ul class="multi-column-dropdown">
											<li><a class="list" href="products.jsp">Friend</a></li>
											<li><a class="list" href="products.jsp">Lover</a></li>
											<li><a class="list" href="products.jsp">Sister</a></li>
											<li><a class="list" href="products.jsp">Brother</a></li>
											<li><a class="list" href="products.jsp">Kids</a></li>
											<li><a class="list" href="products.jsp">Parents</a></li>
										</ul>
									</div>																		
									<div class="col-sm-3">
										<h4>By Flavour</h4>
										<ul class="multi-column-dropdown">
											<li><a class="list" href="products.jsp">Chocolate</a></li>
											<li><a class="list" href="products.jsp">Mixed Fruit</a></li>
											<li><a class="list" href="products.jsp">Butterscotch</a></li>
											<li><a class="list" href="products.jsp">Strawberry</a></li>
											<li><a class="list" href="products.jsp">Vanilla</a></li>
											<li><a class="list" href="products.jsp">Eggless Cakes</a></li>
										</ul>
									</div>
									<div class="col-sm-3">
										<h4>By Theme</h4>
										<ul class="multi-column-dropdown">
											<li><a class="list" href="products.jsp">Heart shaped</a></li>
											<li><a class="list" href="products.jsp">Cartoon Cakes</a></li>
											<li><a class="list" href="products.jsp">2-3 Tier Cakes</a></li>
											<li><a class="list" href="products.jsp">Square shape</a></li>
											<li><a class="list" href="products.jsp">Round shape</a></li>
											<li><a class="list" href="products.jsp">Photo cakes</a></li>
										</ul>
									</div>
									<div class="col-sm-3">
										<h4>Weight</h4>
										<ul class="multi-column-dropdown">
											<li><a class="list" href="products.jsp">1 kG</a></li>
											<li><a class="list" href="products.jsp">1.5 kG</a></li>
											<li><a class="list" href="products.jsp">2 kG</a></li>
											<li><a class="list" href="products.jsp">3 kG</a></li>
											<li><a class="list" href="products.jsp">4 kG</a></li>
											<li><a class="list" href="products.jsp">Large</a></li>
										</ul>
									</div>
								</div>
							</ul>
						</li>				
						<li class="dropdown grid">
							<a href="#" class="dropdown-toggle list1" data-toggle="dropdown">Special Offers <b class="caret"></b></a>
							<ul class="dropdown-menu multi-column columns-4">
								<div class="row">
									<div class="col-sm-3">
										<h4>By Relation</h4>
										<ul class="multi-column-dropdown">
											<li><a class="list" href="products.jsp">Friend</a></li>
											<li><a class="list" href="products.jsp">Lover</a></li>
											<li><a class="list" href="products.jsp">Sister</a></li>
											<li><a class="list" href="products.jsp">Brother</a></li>
											<li><a class="list" href="products.jsp">Kids</a></li>
											<li><a class="list" href="products.jsp">Parents</a></li>
										</ul>
									</div>																		
									<div class="col-sm-3">
										<h4>By Flavour</h4>
										<ul class="multi-column-dropdown">
											<li><a class="list" href="products.jsp">Chocolate</a></li>
											<li><a class="list" href="products.jsp">Mixed Fruit</a></li>
											<li><a class="list" href="products.jsp">Butterscotch</a></li>
											<li><a class="list" href="products.jsp">Strawberry</a></li>
											<li><a class="list" href="products.jsp">Vanilla</a></li>
											<li><a class="list" href="products.jsp">Eggless Cakes</a></li>
										</ul>
									</div>
									<div class="col-sm-3">
										<h4>By Theme</h4>
										<ul class="multi-column-dropdown">
											<li><a class="list" href="products.jsp">Heart shaped</a></li>
											<li><a class="list" href="products.jsp">Cartoon Cakes</a></li>
											<li><a class="list" href="products.jsp">2-3 Tier Cakes</a></li>
											<li><a class="list" href="products.jsp">Square shape</a></li>
											<li><a class="list" href="products.jsp">Round shape</a></li>
											<li><a class="list" href="products.jsp">Photo cakes</a></li>
										</ul>
									</div>
									<div class="col-sm-3">
										<h4>Weight</h4>
										<ul class="multi-column-dropdown">
											<li><a class="list" href="products.jsp">1 kG</a></li>
											<li><a class="list" href="products.jsp">1.5 kG</a></li>
											<li><a class="list" href="products.jsp">2 kG</a></li>
											<li><a class="list" href="products.jsp">3 kG</a></li>
											<li><a class="list" href="products.jsp">4 kG</a></li>
											<li><a class="list" href="products.jsp">Large</a></li>
										</ul>
									</div>
								</div>
							</ul>
						</li>
						<li class="dropdown grid">
							<a href="#" class="dropdown-toggle list1" data-toggle="dropdown">Store<b class="caret"></b></a>
							<ul class="dropdown-menu multi-column columns-3">
								<div class="row">
									<div class="col-sm-4">
										<h4>By Relation</h4>
										<ul class="multi-column-dropdown">
											<li><a class="list" href="products.jsp">Friend</a></li>
											<li><a class="list" href="products.jsp">Lover</a></li>
											<li><a class="list" href="products.jsp">Sister</a></li>
											<li><a class="list" href="products.jsp">Brother</a></li>
											<li><a class="list" href="products.jsp">Kids</a></li>
											<li><a class="list" href="products.jsp">Parents</a></li>
										</ul>
									</div>																		
									<div class="col-sm-4">
										<h4>By Flavour</h4>
										<ul class="multi-column-dropdown">
											<li><a class="list" href="products.jsp">Chocolate</a></li>
											<li><a class="list" href="products.jsp">Mixed Fruit</a></li>
											<li><a class="list" href="products.jsp">Butterscotch</a></li>
											<li><a class="list" href="products.jsp">Strawberry</a></li>
											<li><a class="list" href="products.jsp">Vanilla</a></li>
											<li><a class="list" href="products.jsp">Eggless Cakes</a></li>
										</ul>
									</div>								
									<div class="col-sm-4">
										<h4>Specials</h4>
										<ul class="multi-column-dropdown">
											<li><a class="list" href="products.jsp">Ice cream cake</a></li>
											<li><a class="list" href="products.jsp">Swiss roll</a></li>
											<li><a class="list" href="products.jsp">Ruske kape</a></li>
											<li><a class="list" href="products.jsp">Cupcakes</a></li>
											<li><a class="list" href="products.jsp">Muffin</a></li>
											<li><a class="list" href="products.jsp">Merveilleux</a></li>										
										</ul>
									</div>
								</div>
							</ul>
						</li>								
					</ul> 
					<!--/.navbar-collapse-->
				</div>
				<!--//navbar-header-->
			</nav>
			<div class="header-info">
				<div class="header-right search-box">
					<a href="#"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></a>				
					<div class="search">
						<form class="navbar-form">
							<input type="text" class="form-control">
							<button type="submit" class="btn btn-default" aria-label="Left Align">
								Search
							</button>
						</form>
					</div>	
				</div>
				<div class="header-right login">
					<a href="#"><span class="glyphicon glyphicon-user" aria-hidden="true"></span></a>
					<div id="loginBox">                
						<form id="loginForm">
							<fieldset id="body">
								<fieldset>
									<label for="email">Email Address</label>
									<input type="text" name="email" id="email">
								</fieldset>
								<fieldset>
									<label for="password">Password</label>
									<input type="password" name="password" id="password">
								</fieldset>
								<input type="submit" id="login" value="Sign in">
								<label for="checkbox"><input type="checkbox" id="checkbox"> <i>Remember me</i></label>
							</fieldset>
							<p>New User ? 
							    <a class="sign" href="register.do?method=init">Sign Up</a> <span>
							    <a href="#">Forgot your password?</a></span>
							</p>
						</form>
					</div>
				</div>
				<div class="header-right cart">
					<a href="#"><span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span></a>
					<div class="cart-box">
						<h4><a href="checkout.html">
							<span class="simpleCart_total"> $0.00 </span> (<span id="simpleCart_quantity" class="simpleCart_quantity"> 0 </span>) 
						</a></h4>
						<p><a href="javascript:;" class="simpleCart_empty">Empty cart</a></p>
						<div class="clearfix"> </div>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
	
</body>
</html>