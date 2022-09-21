package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public Product() {
		
	}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProduts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProdeucts(int quantity) {
		this.quantity -= quantity;
	}
	
	@Override
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}

}
