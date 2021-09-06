import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * URI 1071
		 * 
		 * Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números
		 * ímpares entre eles.
		 * 
		 * Entradas:
		 * O arquivo de entrada contém dois valores inteiros
		 * 
		 * Saída:
		 * O programa deve imprimir um valor inteiro. Este valor é a soma dos valores ímpares
		 * que estão entre os valores fornecidos na entrada que deverá caber em um inteiro.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int maior = x;
		int menor = x;
		
		if (y > maior) maior = y;
		if (y < menor) menor = y;
		
		for (int i = menor + 1; i < maior; i++) {
			if (i % 2 != 0) soma += i;
		}
				
		System.out.println(soma);
		
		sc.close();

	}

}
