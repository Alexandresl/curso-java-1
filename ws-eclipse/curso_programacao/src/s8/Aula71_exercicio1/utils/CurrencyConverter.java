package s8.Aula71_exercicio1.utils;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double converter(double dollarPrice, double quantityDollar) {
		
		return quantityDollar * dollarPrice * (1.0 * IOF);
		
	}
	
}
