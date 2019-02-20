package com.Orders;

public class OrderImplementation {

		public static void main(String[] args) {
			MyInterfaceOrders s = (amount) -> 
			{
				if(amount>10000)
					System.out.println("Accepted");
				else
					System.out.println("Not Acceptable");
			};
			s.Order(8000);
}
}
