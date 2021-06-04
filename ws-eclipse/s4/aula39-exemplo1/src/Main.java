import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Fazer um programa para ler um valor inteiro de 1 a 7 representadno um dia
		// da semana (sendo 1 = domingo, 2 = segunda, e assim por diante). Escrever
		// na tela o dia da semana correspondente, conforme exemplos.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número de 1 a 7: ");
		int dia = sc.nextInt();
		
		switch (dia) {
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda-Feira");
				break;
			case 3:
				System.out.println("Terça-Feira");
				break;
			case 4:
				System.out.println("Quarta-Feira");
				break;
			case 5:
				System.out.println("Quinta-Feira");
				break;
			case 6:
				System.out.println("Sexta-Feira");
				break;
			case 7:
				System.out.println("Sábado");
				break;
			default:
				System.out.println("Valor inválido.");
		}
		
		sc.close();

	}

}
