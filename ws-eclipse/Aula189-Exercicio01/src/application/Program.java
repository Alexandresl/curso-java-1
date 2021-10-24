package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.Product;

public class Program {

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the file name: ");
		String fileName = "c:\\temp\\" + sc.nextLine();
		List<Product> prods = new ArrayList<Product>();

		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line = br.readLine();

			while (line != null) {
				String[] arrayProduct = line.split(",");
				Product prod = new Product(arrayProduct[0], Double.valueOf(arrayProduct[1]),
						Integer.valueOf(arrayProduct[2]));
				prods.add(prod);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		String outFile = "c:\\temp\\out\\Summary.csv";

		boolean sucess = new File("c:\\temp\\out\\").mkdir();

		if (sucess) {
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(outFile))) {
				for (Product prod : prods) {
					bw.write(prod.getName() + "," + String.format("%.2f", prod.totalValue()));
					bw.newLine();
				}
			} catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
		} else {
			System.out.println("Erro ao criar arquivo!");
		}

		sc.close();

	}

}
