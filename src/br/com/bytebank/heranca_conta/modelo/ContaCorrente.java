package br.com.bytebank.heranca_conta.modelo;

public class ContaCorrente extends Conta implements Tributavel{
	
	public ContaCorrente(int agencia, int numero, int saldo) {
		super(agencia, numero, saldo);
	}
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException{
		double valorSacar = valor + 0.10;
		super.saca(valorSacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;

	}

	@Override
	public double getValorImposto() {
		return super.saldo  * 0.01 ;
	}
	
	@Override
	public String toString() {
		return "Conta Corrente -> " +  super.toString();
	}
}
