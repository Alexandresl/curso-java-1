package S9.Aula80_exemplo1.entities;

public class Conta {

	private int numeroConta;
	private String nomeTitular;
	private double saldo;
	
	public Conta(int numeroConta, String nomeTitular, double saldo) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
	}

	public Conta(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = 0.00;
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
		this.saldo -= (valor + 5.00);
	}
	
	public String toString() {
		return "Account " + numeroConta + ", Holder: " + nomeTitular + ", Balance: $ " + String.format("%.2f", saldo);
	}
	
}
