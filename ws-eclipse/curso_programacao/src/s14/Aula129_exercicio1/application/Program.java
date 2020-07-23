package s14.Aula129_exercicio1.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import s14.Aula129_exercicio1.entities.ImportedProduct;
import s14.Aula129_exercicio1.entities.Product;
import s14.Aula129_exercicio1.entities.UsedProduct;

/**
 * Fazer um programa para ler os dados de N
 * produtos (N fornecido pelo usuário). Ao
 * final, mostrar a etiqueta de preço de
 * cada produto na mesma ordem em que 
 * foram digitados
 * 
 * Todo produto possui nome e preço. Produtos
 * importados possuem uma taxa de alfândega, e
 * produtos usados possuem data de fabricação.
 * Estes dados específicos devem ser acrescentados
 * na etiqueta de preço conforme exemplo (próxima
 * página). Para produtos importados, a taxa e 
 * alfândega deve ser acrescentada ao preço final
 * do produto.
 * 
 * Favor implementar o programa conforme
 * projeto ao lado.
 */

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> prods = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			if (type == 'c') {
				
				prods.add(new Product(name, price));
				
			} else if (type == 'u') {
				
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				
				prods.add(new UsedProduct(name, price, manufactureDate));
				
			} else {
			
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				
				prods.add(new ImportedProduct(name, price, customsFee));
				
			}
			
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product p : prods ) {
			System.out.println(p.priceTag());
		}
		
		sc.close();

	}

}