package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		
		String path = "out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
