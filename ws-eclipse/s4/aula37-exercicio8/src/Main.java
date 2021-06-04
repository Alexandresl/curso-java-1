import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Em um país imaginário denominado Lisarb, todos os habitantes ficam
		// felizes em pagar seus impostos, pois sabem que nele não existem 
		// políticos corruptos e os recursos arrecadados são utilizados em 
		// benefício da população, sem qualquer desvio. A moeda deste país
		// é o Rombus, cujo simbolo é o R$.
		// Leia um valor com duas casas decimais, equivalente ao salário de
		// uma pessoa de Lisarb. Em seguida, calcule e mostre o valor que esta
		// pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo:
		
		// - de R$ 0.00 a R$ 2000.00			-> ISENTO
		// - de R$ 2000.01 até R$ 3000.00 		-> 8%
		// - de R$ 3000.01 até R$ 4500.00		-> 18%
		// - acima de R$ 4500.00				-> 28%
		
		// Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8%
		// apenas sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00
		// até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido 
		// (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que
		// resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas
		// decimais
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double impostoRenda = 0.0, salario = 0.0;
		System.out.print("Digite o salário: ");
		salario = sc.nextDouble();
		
		if (salario > 2000.0 && salario <= 3000) {
			impostoRenda = (salario - 2000) * 0.08;
		} else if (salario > 3000.0 && salario <= 4500.0) {
			impostoRenda = (salario - 3000) * 0.18 + 1000 * 0.08;
		} else if (salario > 4500.0) {
			impostoRenda = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		
		if (impostoRenda > 0) {
			System.out.printf("O imposto é R$ %.2f\n", impostoRenda);
		} else {
			System.out.println("Isento de imposto");
		}
		
		
	}

}
