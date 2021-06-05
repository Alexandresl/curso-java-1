
public class Main {

	public static void main(String[] args) {
		
		double price = 400.0; // Variável precisa ser iniciada
		
		double discount = 0;
		
		if (price < 200.0) {
			discount = price * 0.1;
			
		}
		
		System.out.println(price);
		System.out.println(discount); // só existe neste escopo {}
		
	}

}
