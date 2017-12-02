<!DOCTYPE html>
<html>
<head>
<title>Contact</title>
<!-- Custom Theme files -->
</head>
<body>
	<!--header-->
	<jsp:include page="header.jsp"></jsp:include>
	<!--//header-->
	<!--contact-->
	<div class="contact">
		<div class="container">
			<h2>Contact Us</h2>
			<div class="map">	
				<iframe src="https://www.http://map.baidu.com/"></iframe>
			</div>
			<div class="contact-infom">
				<h4>Miscellaneous information :</h4>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,sheets containing Lorem Ipsum passages, 
					sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.It was popularised in the 1960s with the release of Letraset
					and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>
			</div>
			<div class="address">
				<div class="col-md-4 address-grids">
					<h4>Address :</h4>
					<ul>
						<span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>
						<p>	Eiusmod Tempor inc<br>
							St Dolore Place,<br>
							Kingsport 56777
						</p>
					</ul>
				</div>
				<div class="col-md-4 address-grids">
					<h4>Contact no :</h4>
					<p><span class="glyphicon glyphicon-earphone" aria-hidden="true"></span>+2 800 544 6035</p>
					<p><span class="glyphicon glyphicon-print" aria-hidden="true"></span>+2 100 889 9466</p>
				</div>
				<div class="col-md-4 address-grids">
					<h4>Email :</h4>
					<p><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span><a href="mailto:example@mail.com">mail@example.com</a></p>
				</div>
				<div class="clearfix"> </div>
			</div>		
			<div class="contact-form">
				<h4>Contact form</h4>
				<form>
					<input type="text" value="Name" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Name';}" required="">
					<input type="text" value="Email" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Email';}" required="">
					<input type="text" value="Telephone" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Telephone';}" required="">
					<textarea type="text"  onfocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Message...';}" required="">Message...</textarea>
					<button class="btn1">Submit</button>
				</form>
			</div>	
		</div>
	</div>
	<!--//contact-->
	<!--footer-->
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>