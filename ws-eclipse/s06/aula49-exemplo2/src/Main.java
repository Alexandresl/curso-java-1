import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Faça um programa para ler um número indeterminado de dados,
		// contendo cada um, a idade de um indivíduo. O último dado,
		// que não entrará nos cálculos, contém um valor de idade negativa.
		// Calcular e imprimir a idade média deste grupo de indivíduos. Se
		// for entrado um valor negativo na primeira vez, mostrar a mensagem
		// "Impossível calcular"
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a lista das idades:");
		int idade = sc.nextInt();
		int contador = 0, soma = 0;

		while (idade >= 0) {
			contador++;
			soma += idade;
			idade = sc.nextInt();
		}
		
		if (contador == 0) {
			System.out.println("Impossível calcular");
		} else {
			double media = (double) soma / contador;
			System.out.printf("A média é %.2f", media);
		}
		sc.close();

	}

}
