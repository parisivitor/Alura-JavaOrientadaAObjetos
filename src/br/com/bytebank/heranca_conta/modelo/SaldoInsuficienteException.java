package br.com.bytebank.heranca_conta.modelo;

public class SaldoInsuficienteException extends Exception { //checked  || RunTimException unchecked
	
	public SaldoInsuficienteException(String s) {
		super(s);
	}
	
}
