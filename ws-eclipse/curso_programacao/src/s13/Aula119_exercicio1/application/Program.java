package s13.Aula119_exercicio1.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import s13.Aula119_exercicio1.entities.Client;
import s13.Aula119_exercicio1.entities.Order;
import s13.Aula119_exercicio1.entities.OrderItem;
import s13.Aula119_exercicio1.entities.Product;
import s13.Aula119_exercicio1.entities.enums.OrderStatus;

/**
 * Ler os dados de um pedido com N itens (N fornecido pelo usuário).
 * Depois, mostrar um sumário de pedido conforme exemplo (próxima
 * página). Nota: O instante do pedido deve ser o instante do 
 * sistema: new Date().
 */

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String clienteName = sc.nextLine();
		System.out.print("Email: ");
		String clientEmail = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date clientBirth = sdf.parse(sc.next());
		
		Client client = new Client(clienteName, clientEmail, clientBirth);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String orderStatus = sc.next();
		
		Order order = new Order(new Date(), OrderStatus.valueOf(orderStatus), client);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String productName = sc.next();
			System.out.print("Product Price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int productQuantity = sc.nextInt();
			
			order.addItem(new OrderItem(productQuantity, productPrice, new Product(productName, productPrice)));
			
		}
		
		System.out.println();
		System.out.println(order);
		
		sc.close();
		
	}

}
