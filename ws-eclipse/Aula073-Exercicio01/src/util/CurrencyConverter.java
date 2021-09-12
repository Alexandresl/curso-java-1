package util;;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double dollarToReal(double dollarPrice, double dollarAmount) {
		return dollarPrice * dollarAmount * (1.0 + IOF);
	}

}
