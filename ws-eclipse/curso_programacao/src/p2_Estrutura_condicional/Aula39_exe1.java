package p2_Estrutura_condicional;

public class Aula39_exe1 {

	public static void main(String[] args) {
		
		// se não iniciarmos a variável não poderá ser usada
		double price = 400.00;
		double discount;
		
		
		if (price < 200.00) {
			discount = price * 0.1;
		} else {
			discount = 0.0;
		}
		
		System.out.println(discount);

	}

}
