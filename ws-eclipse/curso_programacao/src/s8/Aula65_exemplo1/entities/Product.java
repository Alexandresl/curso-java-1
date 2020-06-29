package s8.Aula65_exemplo1.entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return quantity * price;
	}
	
	public int addProducts(int quantity) {
		return this.quantity += quantity;
	}
	
	public int removeProducts(int quantity) {
		return this.quantity -= quantity;
	}
	
	public String toString() {
		return name + 
				", $ " + 
				String.format("%.2f", price) + 
				", " + 
				quantity + 
				" units, Total: $ " + 
				String.format("%.2f", totalValueInStock());			
	}
	
}
