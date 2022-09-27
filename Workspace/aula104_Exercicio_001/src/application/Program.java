package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int[][] mat = new int[x][y];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int num = sc.nextInt();
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == num) {
					System.out.println("Position " + i + "," + j + ":");
					if (j - 1 >= 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (j + 1 < mat[i].length) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i - 1 >= 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (i + 1 < mat[i].length) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		
		sc.close();

	}

}
