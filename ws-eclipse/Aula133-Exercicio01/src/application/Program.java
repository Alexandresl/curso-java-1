package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Retangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> shapes = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			Shape s;
			System.out.println("Shape #" + (i + 1) + " data:");
			
			System.out.print("Retangle or Circle (r/c): ");
			char shape = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			String color = sc.next();
			
			if (shape == 'r') {
				
				System.out.print("Width: ");
				double Width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				
				s = new Retangle(Color.valueOf(color), Width, height);
				
			} else {
				System.out.print("Radius: ");
				double radius = sc .nextDouble();
				
				s = new Circle(Color.valueOf(color), radius);
			}
			
			shapes.add(s);
			
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for (Shape s : shapes) {
			System.out.printf("%.2f\n", s.area());
		}
		
		sc.close();

	}

}
