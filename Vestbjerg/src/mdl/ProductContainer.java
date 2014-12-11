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
	
	public Product findProduct(String name)
	{
		int i=0;
        boolean found = false;
        Product pro = null;
        while(i<productList.size() && !found){
        	Product prod = productList.get(i);
            String prodName = prod.getName();
            if (prodName.equals(name)){
                found = true;
                pro = productList.get(i);
                
            }
            else{
                i++;
            }
        }
        return pro;
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
