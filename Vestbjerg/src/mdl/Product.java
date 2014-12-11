package mdl;

public class Product {
	//Counter for making unique product numbers.
		private static int counter = 1;
		
	private int productNumber;
	private String name;
	private String type;
	private double price;
	
	public Product(String name, String type, double price) {
		this.productNumber = counter++;
		this.name = name;
		this.type = type;
		this.price = price;
	}

	public int getProductNumber() {
		return productNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
