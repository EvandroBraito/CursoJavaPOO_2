package entities;

public class ContaUsuario {

	private int numero;
	private String titular;
	private double saldo;

	public ContaUsuario(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}

	public ContaUsuario(int numero, String titular, double primeiroDeposito) {
		this.numero = numero;
		this.titular = titular;

		// chama a operação de depósito passando o valor como argumento
		deposito(primeiroDeposito);
	}

	public int getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double quantidade) {
		saldo += quantidade;
	}

	public void saque(double quantidade) {
		saldo -= quantidade + 5.0;
	}

	public String toString() {
		return "[numero=" 
						+ numero 
						+ ", titular=" 
						+ titular 
						+ ", saldo=" 
						+ String.format("%.2f", (saldo)) + "]";
}
}
