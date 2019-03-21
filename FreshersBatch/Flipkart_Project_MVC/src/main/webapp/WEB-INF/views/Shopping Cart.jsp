<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.springmvc.flipkart.connection.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.io.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cart</title>
</head>
<body>
<table border="">
<tr>
<td>Product Name</td>
<td>Price</td>
</tr>
<%

		ResultSet resultSet=null;
		
		try{
	%>	

	<% 
	Connection con = DBConnection.getConnection(); 
	String query="insert into Cart values(?,?)";
	String productName=(String)request.getSession().getAttribute("productName") ;
	String price = request.getParameter("price");
	PreparedStatement ps=con.prepareStatement(query);
	ps.setString(1,productName);
	ps.setString(2,price);
	ps.executeUpdate();
	
		
		while(resultSet.next()){

	%>

<tr>

	<td><%=resultSet.getString(1) %></td>
	<td><%=resultSet.getString(2) %></td>
	</tr>
	
	<%
		}
		
	}catch (Exception e) {
		
		e.printStackTrace();
		}
	%>
	
</table>

</body>
</html>