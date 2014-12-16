package mdl;

import java.util.ArrayList;

public class ProductContainer {
	private static ProductContainer instance;
	private ArrayList<Product> productList;
	
	private ProductContainer()
	{
		productList = new ArrayList<Product>();
	}
	
	public static ProductContainer getInstance()
	{
		if(instance == null){
			instance = new ProductContainer();
		}
		return instance;
	}
	
	public void createProduct(Product pro)
	{
		productList.add(pro);
	}
	
	/*public ArrayList<Product> findProduct(String name)
	{
		ArrayList<Product> pList = new ArrayList<Product>();
		 for (Product p : productList) 
		 {
			if(p.getName().contains(name))
			{
				pList.add(p);
			}
		 }

		 System.out.println("Product Number - Product Name - Type - Price \n");
		 for(Product p : pList)
		 {
			 System.out.println(p.getProductNumber() + " - " + p.getName() + " - " + p.getType() + " - " + p.getPrice() + "kr");
		 }
		 return pList;
	}*/
	
	public void findProduct(String name)
	{
		ArrayList<Product> pList = new ArrayList<Product>();
		 for (Product p : productList) 
		 {
			if(p.getName().contains(name))
			{
				pList.add(p);
			}
		 }

		 System.out.println("Product Number - Product Name - Type - Price \n");
		 for(Product p : pList)
		 {
			 System.out.println(p.getProductNumber() + " - " + p.getName() + " - " + p.getType() + " - " + p.getPrice() + "kr");
		 }
	}
	
	public Product getProduct(int productNumber)
	{
		int i=0;
        boolean found = false;
        Product pro = null;
        while(i<productList.size() && !found){
        	Product prod = productList.get(i);
            int prodNumber = prod.getProductNumber();
            if (prodNumber == productNumber){
                found = true;
                pro = productList.get(i);
                
            }
            else{
                i++;
            }
        }
        return pro;
	}
	
	public void deleteProduct(int productNumber){
        int i=0;
        boolean found = false;
        while(i<productList.size() && !found){
            Product prod = productList.get(i);
            int prodNumber = prod.getProductNumber();
            if (prodNumber == productNumber){
                found = true;
            }
            else{
                i++;
            }
        }
        if (found){
        	productList.remove(i);
        }
    }
	
	public void printProductList()
	{
		for(Product p : productList)
		{
			System.out.println(p.getProductNumber() + " --- " + p.getName());
		}
			
	}
}
