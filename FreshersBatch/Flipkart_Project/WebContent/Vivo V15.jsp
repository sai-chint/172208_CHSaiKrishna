<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vivo V15</title>
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
					<a href="Mobiles.jsp">Mobiles</a>
					<a href="Laptops.html">Laptops</a>
					<a href="Play Station.html">Play Station</a>
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
        	<li><a href="Login.html"><span class="glyphicon glyphicon-user"></span> Login/Sign Up </a></li>
        	<li><a href="Login.html"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
        	
        	<% } else { %>
         		
         		<li style="color:white"><b>WELCOME</b>&nbsp<b>${welcome}</b></li>
       			<li><a href="LogoutServlet">LOGOUT</a></li>
                
       		 <%} %>
        
      </ul>
    </div>
  </div>
</nav>

<body>

<div class="panel-heading"><h1>VIVO V15 Pro</h1></div>
<div class="container">
<div class="row">
    <div class="col-sm-12"><img src="C:\Users\saichint\Desktop\Flipkart_Project/vivo-v15-pro-1818-pd1832f-ex-original-imafdj59tvmuffyg.jpeg" class="img-responsive" style="width:15%" alt="Image">
        	
        	<% if(session.getAttribute("user")==null){
				
			%>
					<a href="Login.html"><b>Login</b></a>&nbsp;<b>to buy</b>
			
			<% } else { %>
			
					<a href ="Payment.jsp"><button class="dropbtn">Buy now</button></a>
					<a href ="Shopping Cart.jsp"><button class="dropbtn">Add to Cart</button></a>
					
				<%} %>	
							
    </div>
    </div>
    
	<div class="row">
    <div class="col-sm-12">
		<pre><h2>VIVO V15 Pro (Topaz Blue, 128 GB)  (6 GB RAM)</h2></pre>
		<p><h4><b>Price : 28,990/-</b></h4></p>
		<h3>Product Description</h3>
			Unleash the photography enthusiast in you with the Vivo V15 Pro smartphone. It comes loaded with a 32 MP pop-up selfie camera and a powerful triple rear camera system to help you click flaunt-worthy shots, day or night. Its 3700 mAh battery, supported by the Dual-engine Fast Charging feature, won’t call it a day even after you do.
		<h3>Specifications</h3>
	General :<br><br>
	In The Box------------>Handset, Adapter, Case, Cable, Warranty Card, Quick Guide, Screen Protector (Applied)<br>
	Model Number---------->1818/PD1832F_EX<br>
	Model Name------------>V15 pro<br>
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