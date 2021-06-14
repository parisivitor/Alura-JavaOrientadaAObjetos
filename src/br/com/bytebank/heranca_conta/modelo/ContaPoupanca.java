package br.com.bytebank.heranca_conta.modelo;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero, int saldo) {
		super(agencia, numero, saldo);
	}

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;

	}
	
	@Override
	public String toString() {
		return "Conta Poupanca -> " +  super.toString();
	}
}
