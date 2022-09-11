import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoProduto, qtdProduto;
		double preco = 0, total;
		
		System.out.print("Digite o código do produto: ");
		codigoProduto = sc.nextInt();
		System.out.print("Digite a quantidade do produto: ");
		qtdProduto = sc.nextInt();
		
		if (codigoProduto == 1) {
			preco = 4.0;
		} else if (codigoProduto == 2) {
			preco = 4.5;
		} else if (codigoProduto == 3) {
			preco = 5.0;
		} else if (codigoProduto == 4) {
			preco = 2.0;
		} else if (codigoProduto == 5) {
			preco = 1.5;
		} else {
			System.out.println("Produto inválido");
		}
		
		total = preco * qtdProduto;
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();

	}

}
