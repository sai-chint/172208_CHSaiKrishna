<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Google Pixel 3</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <style>
    
    .navbar {
      margin-bottom: 50px;
      border-radius: 0;
    }
    
     
     .jumbotron {
      margin-bottom: 0;
    }
   
    
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }
    
    .dropbtn {
    background-color: black;
    color: white;
    padding: 16px;
    font-size: 16px;
    border: none;
}
 
.dropdown {
    position: relative;
    display: inline-block;
}
 
.dropdown-content {
    display: none;
    position: absolute;
    background-color: lightgrey;
    min-width: 200px;
    z-index: 1;
}
 
.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
}
 
.dropdown-content a:hover {background-color: white;}
.dropdown:hover .dropdown-content {display: block;}
.dropdown:hover .dropbtn {background-color: grey;}
 
    
  </style>
</head>
<body>

<div class="jumbotron">
	<div class="panel-body"><img src="C:\Users\saichint\Desktop\Flipkart_Project\flipkart-image.jpeg" class="img-responsive" style="width:50%" alt="Image" class ="container text-center"></div>
  	<div class="container text-center">
    <h1>FlipKart</h1>      
    <p>Products</p>
  </div>
</div>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        
        <div class="dropdown">
					<a href=""><button class="dropbtn">Home</button></a>
		<div class="dropdown-content">
</div>
</div>
        <div class="dropdown">
		<button class="dropbtn">Electronics</button>
		<div class="dropdown-content">
					<a href="Mobiles">Mobiles</a>
					<a href="Laptops">Laptops</a>
					<a href="Play Station">Play Station</a>
</div>
</div>    	
        <div class="dropdown">
		<button class="dropbtn">TV & Appliances</button>
		<div class="dropdown-content">
        			<a href="#">Official Android TVs</a>
					<a href="#">Smart & Ultra HD</a>
					<a href="#">TV by Brand</a>
</div>
</div>
        <div class="dropdown">
		<button class="dropbtn">Home & Furniture</button>
		<div class="dropdown-content">
				<a href="#">Kitchen & Dining</a>
				<a href="#">Furniture</a>
				<a href="#">Furnishing</a>
</div>
</div>
        <div class="dropdown">
				<a href="#"><button class="dropbtn">Contact us</button></a>
		<div class="dropdown-content">
</div>
</div>
        	       	
      </ul>     

      
      
      <ul class="nav navbar-nav navbar-right">
        
      		<% if(session.getAttribute("user")==null){
        	
        	%>
        	<li><a href="Login.jsp"><span class="glyphicon glyphicon-user"></span> Login/Sign Up </a></li>
        	<li><a href="Login.jsp"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
        	<% } else { %>
         		
         		<li style="color:white"><b>WELCOME</b>&nbsp<b>${welcome}</b></li>
       			<li><a href="Logout">LOGOUT</a></li>
      
       		<%} %>
      
      
        
      </ul>
    </div>
  </div>
</nav>

<div class="panel-heading"><h1>Google Pixel 3</h1></div>
<div class="container">
<div class="row">
    <div class="col-sm-12"><img src="C:\Users\saichint\Desktop\Flipkart_Project/google-pixel-3-na-original-imaf9sxrrrgzhf44.jpeg" class="img-responsive" style="width:15%" alt="Image">
        	<% if(session.getAttribute("user")==null){
				
			%>
			<a href="Login.html"><b>Login</b></a>&nbsp;<b>to buy</b>
			<% } else { %>
			
					<a href ="Payment.jsp"><button type="button" class="btn btn-danger" >Buy now</button></a>			
					<a href ="Shopping Cart.jsp"><button type="button" class="btn btn-danger" >Add to Cart</button></a>
			
				<%} %>
		
	</div>						
    </div>
    
    <div class="row">
    <div class="col-sm-12">
		<pre><h2>Google Pixel 3 (Clearly White, 128 GB)  (4 GB RAM)</h2></pre>
		<p><h4><b>Price : 69,999/-</b></h4></p>
		<h3>Product Description</h3>
			Staying too far from your loved ones? Video call them for hours on end. The weather is romantic? Listen to your favourite playlists all day long. Don't want to go out this weekend? Then binge watch your favourite series on the Internet or perhaps play your favourite mobile video game; do all that and much more. The Pixel 3 ensures that there's never a dull moment, all thanks to its powerful battery, impressive cameras and its expansive bezel-less display.
		<h3>Specifications</h3>
	General :<br><br>
	In The Box------------>Handset, Adapter, Case, Cable, Warranty Card, Quick Guide, Screen Protector (Applied)<br>
	Model Number---------->G013A<br>
	Model Name------------>Pixel 3<br>
	Color----------------->Blue Ocean<br>
	Browse Type----------->Smartphones<br>
	SIM Type-------------->Dual Sim<br>
	Hybrid Sim Slot------->No<br>
	Touchscreen----------->Yes<br>
	OTG Compatible-------->Yes<br>
	Sound Enhancements---->Real HD Sound, Noise-cancelling Music with Dual Mics<br>
	</div>
</div>
</div>
</body>
</html>