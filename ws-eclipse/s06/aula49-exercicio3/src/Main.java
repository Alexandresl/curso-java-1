import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Um posto de combustíveis deseja determinar qual de seus produtos tem a preferência
		// de seus clientes. Escreva um algoritmo para ler o tipo de combustíveis abastecido
		// codificando da segujinte forma: 1. Álcool 2. Gasolina 3. Diesel 4. Fim. Caso o usuário
		// informe um código inválido (fora da faixa 1 a 4) deve ser solicitado um novo código
		// (até que seja válido. O programa será encerrado quando o código informado for o número
		// 4. Deve ser escrito a mensagem: "Muito Obrigado" e a quantidade de clientes que abasteceram
		// cada tipo de combustível, conforme exemplo.
		
		Scanner sc = new Scanner(System.in);
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		menu();
		int menu = sc.nextInt();
		
		while (menu != 4) {
			if (menu == 1) {
				alcool++;
			} else if (menu == 2) {
				gasolina++;
			} else if (menu == 3) {
				diesel++;
			} else {
				System.out.println("Inválido. Digite novamente.");
			}
			
			menu();
			menu = sc.nextInt();
		}
		
		System.out.printf("Muito obrigado\nÁlcool: %d\nGasolina: %d\ndiesel: %d\n", alcool, gasolina, diesel);

		
		sc.close();
	}
	
	public static void menu() {
		System.out.print("Digite o tipo de combustível:\n" +
						"1. Álcool\n" +
						"2. Gasolina\n" +
						"3. Diesel\n" +
						"4. Fim\n");		
	}

}
