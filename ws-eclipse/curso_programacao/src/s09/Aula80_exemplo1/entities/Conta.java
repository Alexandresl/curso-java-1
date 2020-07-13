package s09.Aula80_exemplo1.entities;

public class Conta {

	private int numeroConta;
	private String nomeTitular;
	private double saldo;
	
	public Conta(int numeroConta, String nomeTitular, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		deposito(depositoInicial);
	}

	public Conta(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	public void deposito(double valor) {
		this.saldo += valor;
	}
	
	public void saque(double valor) {
		this.saldo -= valor + 5.00;
	}
	
	public String toString() {
		return "Account " 
					+ numeroConta 
					+ ", Holder: " 
					+ nomeTitular 
					+ ", Balance: $ " 
					+ String.format("%.2f", saldo);
	}
	
}
