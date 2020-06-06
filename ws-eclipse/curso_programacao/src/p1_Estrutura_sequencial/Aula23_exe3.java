package p1_Estrutura_sequencial;

public class Aula23_exe3 {

	public static void main(String[] args) {

		// Calcular a área de um trapésio de bases 6 e 8 e altura 5
		// Formula da área:
		// area = (b + B) / 2 * 5
		
		double b, B, h, area;
		
		b = 6.0; 
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.println("A área é " + area);

	}

}
