import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Fazer um programa para ler um valor inteiro de 1 a 7 representadno um dia
// da semana (sendo 1 = domingo, 2 = segunda, e assim por diante). Escrever
// na tela o dia da semana correspondente, conforme exemplos.

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número de 1 a 7: ");
		int dia = sc.nextInt();
		String diaSemana;

		switch (dia) {
		case 1:
			diaSemana = "Domingo";
			break;
		case 2:
			diaSemana = "Segunda-feira";
			break;
		case 3:
			diaSemana = "Terça-feira";
			break;
		case 4:
			diaSemana = "Quarta-feira";
			break;
		case 5:
			diaSemana = "Quinta-feira";
			break;
		case 6:
			diaSemana = "Sexta-feira";
			break;
		case 7:
			diaSemana = "Sábado";
			break;
		default:
			diaSemana = "Valor inválido";
		}
		
		System.out.printf("Dia da semana: %s", diaSemana);

		sc.close();

	}

}
