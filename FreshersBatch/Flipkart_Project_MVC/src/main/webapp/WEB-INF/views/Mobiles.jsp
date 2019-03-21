<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mobiles</title>
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
        	
        	<% } else { %>
         		
         		<li style="color:white"><b>WELCOME</b>&nbsp<b>${welcome}</b></li>
       			<li><a href="Logout">LOGOUT</a></li>
      
       		<%} %>
      
      
        <li><a href="Shopping Cart"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
      </ul>
    </div>
  </div>
</nav>


<div class="container">    
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading">Realme 2-pro</div>
        <div class="panel-body"><a href="Realme 2-pro"><img src="C:\Users\saichint\Desktop\Flipkart_Project/realme-2-pro-rmx1801-original-imaf9e3vt9p32yhm.jpeg" class="img-responsive" style="width:100%" alt="Image"></a></div>
        <div class="dropdown">
			<% if(session.getAttribute("user")==null){
				
			%>
			<a href="Login"><b>Login</b></a>&nbsp;<b>to buy</b>
			<% } else { %>
         		<a href ="Shopping Cart"><button class="dropbtn" "panel-footer" style="background-color: Tomato">Buy now</button></a>
         	<%} %>
         			
		<div class="dropdown-content">
		</div>
		</div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-primary">
        <div class="panel-heading">Google Pixel-3</div>
        <div class="panel-body"><a href="Google Pixel 3"><img src="C:\Users\saichint\Desktop\Flipkart_Project/google-pixel-3-na-original-imaf9sxrrrgzhf44.jpeg" class="img-responsive" style="width:100%" alt="Image"></a></div>
        <div class="dropdown">
			<% if(session.getAttribute("user")==null){
				
			%>
			<a href="Login"><b>Login</b></a>&nbsp;<b>to buy</b>
			<% } else { %>
         		<a href ="Shopping Cart"><button class="dropbtn" "panel-footer" style="background-color: Tomato">Buy now</button></a>
         	<%} %>
		<div class="dropdown-content">
		</div>
		</div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-primary">
        <div class="panel-heading">Samsung Galaxy-note 9</div>
        <div class="panel-body"><a href="Samsung Galaxy note"><img src="C:\Users\saichint\Desktop\Flipkart_Project/samsung-galaxy-note-9-sm-n960fzwdins-original-imafbcczggh72gng.jpeg" class="img-responsive" style="width:100%" alt="Image"></a></div>
       <div class="dropdown">
			<% if(session.getAttribute("user")==null){
				
			%>
			<a href="Login"><b>Login</b></a>&nbsp;<b>to buy</b>
			<% } else { %>
         		<a href ="Shopping Cart"><button class="dropbtn" "panel-footer" style="background-color: Tomato">Buy now</button></a>
         	<%} %>
		<div class="dropdown-content">
		</div>
		</div>
      </div>
    </div>
  </div>
</div><br>

<div class="container">    
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading">Apple iphone-8 plus</div>
        <div class="panel-body"><a href="Apple iphone 8plus"><img src="C:\Users\saichint\Desktop\Flipkart_Project/apple-iphone-8-plus-mq8h2hn-a-original-imaexsfhxjxbupzx.jpeg" class="img-responsive" style="width:100%" alt="Image"></a></div>
        <div class="dropdown">
			<% if(session.getAttribute("user")==null){
				
			%>
			<a href="Login"><b>Login</b></a>&nbsp;<b>to buy</b>
			<% } else { %>
         		<a href ="Shopping Cart"><button class="dropbtn" "panel-footer" style="background-color: Tomato">Buy now</button></a>
         	<%} %>
		<div class="dropdown-content">
		</div>
		</div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-primary">
        <div class="panel-heading">Vivo V15-pro</div>
        <div class="panel-body"><a href="Vivo V15"><img src="C:\Users\saichint\Desktop\Flipkart_Project/vivo-v15-pro-1818-pd1832f-ex-original-imafdj59tvmuffyg.jpeg" class="img-responsive" style="width:100%" alt="Image"></a></div>
        <div class="dropdown">
			<% if(session.getAttribute("user")==null){
				
			%>
			<a href="Login"><b>Login</b></a>&nbsp;<b>to buy</b>
			<% } else { %>
         		<a href ="Shopping Cart"><button class="dropbtn" "panel-footer" style="background-color: Tomato">Buy now</button></a>
         	<%} %>
		<div class="dropdown-content">
		</div>
		</div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-primary">
        <div class="panel-heading">Redmi Y2</div>
        <div class="panel-body"><a href="Redmi Y2"><img src="C:\Users\saichint\Desktop\Flipkart_Project/mi-redmi-y2-y2-original-imafaabg2b2kyrct.jpeg" class="img-responsive" style="width:100%" alt="Image"></a></div>
        <div class="dropdown">
			<% if(session.getAttribute("user")==null){
				
			%>
			<a href="Login"><b>Login</b></a>&nbsp;<b>to buy</b>
			<% } else { %>
         		<a href ="Shopping Cart"><button class="dropbtn" "panel-footer" style="background-color: Tomato">Buy now</button></a>
         	<%} %>
		<div class="dropdown-content">
		</div>
		</div>
      </div>
    </div>
  </div>
</div><br><br>

<footer class="container-fluid text-center">
  <p>Online Store Copyright</p>  
  <form class="form-inline">Get deals:
    <input type="email" class="form-control" size="30" placeholder="Email">
    <% if(session.getAttribute("user")==null){
				
			%>
			<a href="Login"><b>Login</b></a>&nbsp;<b>to buy</b>
			<% } else { %>
         		<a href ="Shopping Cart"><button type="button" class="btn btn-danger" "panel-footer">Click here to get deals</button></a>
         	<%} %>
    
  </form>
</footer>

</body>
</html>