package entities;

public class ImportedProduct extends Product {
	
	private Double customsFree;
	
	public ImportedProduct() {
		super();
	}
	public ImportedProduct(String name, Double price, Double customsFree) {
		super(name, price);
		this.customsFree = customsFree;
	}
	
	public Double getCustomsFree() {
		return customsFree;
	}
	public void setCustomsFree(Double customsFree) {
		this.customsFree = customsFree;
	}
	
	public Double totalPrice() {
		return price + customsFree;
	}
	
	@Override
	public String priceTag() {
		return name + " $ " + String.format("%.2f", totalPrice()) + " (Customs fee: $ " + String.format("%.2f", customsFree) + ")";
	}
	
}
