package s4;

public class Aula26_exe1 {

	public static void main(String[] args) {
		
		// Declaração de variáveis
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x); // A recebe a raiz quadrada de x
		B = Math.sqrt(y); // B recebe a raiz quadrada de y
		C = Math.sqrt(25.0); // C recebe a raiz qudrada de 25
		// É impresso o valor das variáveis
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		
		A = Math.pow(x, y); // A recebe x elevado a y
		B = Math.pow(x, 2.0); // B recebe x elevado ao quadrado
		C = Math.pow(5.0, 2.0); // C recebe 5 elevado ao quadrado
		// É impresso o valor das variáveis
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		
		A = Math.abs(y); // A recebe o valor absoluto de y
		B = Math.abs(z); // B recebe o valor absoluto de z
		// É impresso o valor das variáveis
		System.out.println("O valor absoluto de " + y + " = " + A);
		System.out.println("O valor absoluto de " + z + " = " + B);
		
		// Resultado:
		// Raiz quadrada de 3.0 = 1.7320508075688772
		// Raiz quadrada de 4.0 = 2.0
		// Raiz quadrada de 25 = 5.0
		// 3.0 elevado a 4.0 = 81.0
		// 3.0 elevado ao quadrado = 9.0
		// 5 elevado ao quadrado = 25.0
		// O valor absoluto de 4.0 = 4.0
		// O valor absoluto de -5.0 = 5.0

	}

}
