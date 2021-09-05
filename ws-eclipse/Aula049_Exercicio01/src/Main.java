import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Escreva um programa que repita a leitura de uma senha até que ela
		 * seja válida. Para cada leitura de senha incorreta informada,
		 * escrever a mensagem "Senha inválida". Quando a senha for informada
		 * corretamente deve ser impressa a mensagem "Acesso Permitido" e o 
		 * algoritmo encerrado. Considere que a senha correta é o valor 2002.
		 * 
		 * Exemplo:
		 * Entrada	|	Saída
		 * 2200		|	Senha inválida
		 * 1020		| 	Senha inválida
		 * 2022		|'	Senha inválida
		 * 2002		|	Acesso Permitido
		 */
		
		Scanner sc = new Scanner(System.in);
		int senhaCorreta = 2002;
		
		int senha = sc.nextInt();
		
		while (senha != senhaCorreta) {
			System.out.println("Senha inválida");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
	}

}
