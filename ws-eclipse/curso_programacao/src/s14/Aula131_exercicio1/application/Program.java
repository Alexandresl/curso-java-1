package s14.Aula131_exercicio1.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import s14.Aula131_exercicio1.entities.Circle;
import s14.Aula131_exercicio1.entities.Rectangle;
import s14.Aula131_exercicio1.entities.Shape;
import s14.Aula131_exercicio1.entities.enums.Color;

/**
 * Fazer um programa para ler os dados de N figuras (N fornecido
 * pelo usuário), e depois mostrar as áreas destas figuras na
 * mesma ordem em que foram digitadas
 */

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number os shapes: ");
		int n = sc.nextInt();
		List<Shape> list = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char s = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			
			if (s == 'r') {
				System.out.print("Width: ");
				Double width = sc.nextDouble();
				System.out.print("Height: ");
				Double height = sc.nextDouble();
				
				list.add(new Rectangle(color, width, height));
				
			} else {
				
				System.out.print("Radius: ");
				Double radius = sc.nextDouble();
				
				list.add(new Circle(color, radius));
				
			}
			
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		
		for (Shape s : list) {
			System.out.println(s);
		}
		
		sc.close();

	}

}
