package Encapsulamento;

public class ContaBancaria {
	// Atributos pruvado
	private double saldo;

	//construtor para iniciar o saldo
	public ContaBancaria(double saldoInicial) {
		if(saldoInicial >= 0) {
			this.saldo = saldoInicial;
		}
		else {
			this.saldo = 0;
		}
	}

	//getter para o saldo
	public double getSaldo() {
		return saldo;
	}
	public void depositar(double valor) {
		if(valor > 0) {
			saldo += valor;
		}
		else {
			System.out.println("Valor de depósito inválido! ");
		}
	}
	public void sacar (double valor) {
		if(valor > 0 && valor<= saldo) {
			saldo -= valor;
		}
		else {
			System.out.println("Saque inválido! Verifique o valor");
		}
	}


}
