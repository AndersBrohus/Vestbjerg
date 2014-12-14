package mdl;

import java.util.ArrayList;

public class OrderContainer {
	private static OrderContainer instance;
	private ArrayList<Order> orderList;
	
	private OrderContainer() {
		orderList = new ArrayList<Order>();
	}
	
	public static OrderContainer getInstance()
	{
		if(instance == null){
			instance = new OrderContainer();
		}
		return instance;
	}
	
	public void createOrder(Order ord)
	{
		orderList.add(ord);
	}
	
	public Order findOrder(String phone)
	{
		int i=0;
        boolean found = false;
        Customer cus = null;
        while(i<customerList.size() && !found){
        	Customer cust = customerList.get(i);
            String number = cust.getPhone();
            if (number.equals(phone)){
                found = true;
                cus = customerList.get(i);
                
            }
            else{
                i++;
            }
        }
        return cus;
	}
	
	public Customer getCustomer(int customerNumber)
	{
		int i=0;
        boolean found = false;
        Customer cus = null;
        while(i<customerList.size() && !found){
        	Customer cust = customerList.get(i);
            int number = cust.getCustomerNumber();
            if (number == customerNumber){
                found = true;
                cus = customerList.get(i);
                
            }
            else{
                i++;
            }
        }
        return cus;
	}
}
