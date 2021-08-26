import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da
		 * semana (sendo 1=domingo, 2=segunda, e assim por diante. Escreva na tela o dia
		 * da semana correspondente.
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe um dia da semana: ");
		int numDia = sc.nextInt();
		String dia = "";

		switch (numDia) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "Valor inválido";
		}

		System.out.printf("Dia da semana: %s\n", dia);
		

		sc.close();

	}

}
