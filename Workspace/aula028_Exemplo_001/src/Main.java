public class Main {

	public static void main(String[] args) {
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + A); // Raiz quadrada de 3.0 = 1.7320508075688772
		System.out.println("Raiz quadrada de " + y + " = " + B); // Raiz quadrada de 4.0 = 2.0
		System.out.println("Raiz quadrada de 25 = " + C); // Raiz quadrada de 25 = 5.0
		
		A = Math.pow(x, y);
		B = Math.pow(x,  2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A); // 3.0 elevado a 4.0 = 81.0
		System.out.println(x + " elevado ao quadrado = " + B); // 3.0 elevado ao quadrado = 9.0
		System.out.println("5 elevado ao quadrado = " + C); // 5 elevado ao quadrado = 25.0

		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("O valor absoluto de " + y + " = " + A); // O valor absoluto de 4.0 = 4.0
		System.out.println("O valor absoludo de " + z + " = " + B); // O valor absoludo de -5.0 = 5.0
		
	}

}
