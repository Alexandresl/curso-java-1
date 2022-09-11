
public class Main {

	public static void main(String[] args) {
		
		double preco = 34.5;
		double desconto;
		
		desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println("O desconto é de: " + desconto);

	}

}
