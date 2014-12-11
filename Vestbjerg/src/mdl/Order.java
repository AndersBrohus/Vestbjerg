package mdl;

import java.util.ArrayList;

public class Order {
	private int orderNumber;
	private double totalPrice;
	private Customer customer;
	private ArrayList<PartOrder> partOrderList;
	
	public Order(int orderNumber, double totalPrice, Customer customer,
			ArrayList<PartOrder> partOrderList) {
		this.orderNumber = orderNumber;
		this.totalPrice = totalPrice;
		this.customer = customer;
		this.partOrderList = partOrderList;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer Customer) {
		this.customer = Customer;
	}
}