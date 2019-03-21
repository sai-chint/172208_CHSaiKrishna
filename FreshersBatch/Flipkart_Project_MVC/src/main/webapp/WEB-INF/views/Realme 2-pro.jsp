<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Realme 2-pro</title>
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
        	<li><a href="Login"><span class="glyphicon glyphicon-user"></span> Login/Sign Up </a></li>
        	<li><a href="Login"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
        	
        	<% } else { %>
         		
         		<li style="color:white"><b>WELCOME</b>&nbsp<b>${welcome}</b></li>
       			<li><a href="Logout">LOGOUT</a></li>
                
       		 <%} %>
        
      </ul>
    </div>
  </div>
</nav>

<div class="panel-heading"><h1>Realme 2-pro</h1></div>
<div class="container">
<div class="row">
    <div class="col-sm-12"><img src="C:\Users\saichint\Desktop\Flipkart_Project/realme-2-pro-rmx1801-original-imaf9e3vt9p32yhm.jpeg" class="img-responsive" style="width:15%" alt="Image">
        	<% if(session.getAttribute("user")==null){
				
			%>
			<a href="Login"><b>Login</b></a>&nbsp;<b>to buy</b>
			<% } else { %>
			
					<a href ="Payment"><button type="button" class="btn btn-danger" >Buy now</button></a>
					<a href ="Shopping Cart"><button type="button" class="btn btn-danger">Add to Cart</button></a>
					
				<%} %>
	
	</div>
	</div>
				
	<div class="row">			
    <div class="col-sm-12">
		<pre><h2>Realme 2 Pro (Blue Ocean, 64 GB)  (4 GB RAM)</h2></pre>
		<p><h4><b>Price : 13,999/-</b></h4></p>
		<h3>Product Description</h3>
		The Realme 2 Pro is a treat for all you entertainment and gaming addicts. With a large 16 cm (6.3) FHD screen and a high screen-to-body ratio, this phone has a futuristic design and ensures that nothing comes between you and the screen. Powered by the Qualcomm Snapdragon 660 AIE (Artificial Intelligence Engine) processor and 4 GB of RAM, this Realme smartphone ensures enhanced efficiency and intelligent performance.
	<h3>Specifications</h3>
	General :<br><br>
	In The Box------------>Handset, Adapter, Case, Cable, Warranty Card, Quick Guide, Screen Protector (Applied)<br>
	Model Number---------->RMX1801<br>
	Model Name------------>2 Pro<br>
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