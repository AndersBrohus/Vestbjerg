package ctr;

import mdl.*;

public class OrderCtrl {
	private OrderContainer oCon;
	
	public OrderCtrl()
	{
		oCon = OrderContainer.getInstance();
	}
	
	public void createOrder(Customer cus)
	{	
		Order ord = new Order(cus);
		oCon.createOrder(ord);
	}
	
	public Order getOrder(int orderNumber)
	{
		Order ord = oCon.getOrder(orderNumber);
		return ord;
	}
	
	public void findOrderList(int customerNumber)
	{
		oCon.findOrderList(customerNumber); 
	}
}