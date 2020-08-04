import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		int y = 32;
		double x = 10.35784;

		System.out.print("Ol� mundo! ");
		System.out.println("Bom dia!");

		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f\n", x);
		System.out.printf("%.4f\n", x);

		Locale.setDefault(Locale.US);

		System.out.printf("%.2f\n", x);
		System.out.printf("%.4f\n", x);
		
		System.out.println("Resultado: " + x + " Metros");

		System.out.printf("Resultado = %.2f metros\n", x);
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais", nome, idade, renda);
	}

}
