package br.com.bytebank.heranca_conta.teste;

import br.com.bytebank.heranca_conta.modelo.ContaCorrente;
import br.com.bytebank.heranca_conta.modelo.ContaPoupanca;
import br.com.bytebank.heranca_conta.modelo.SaldoInsuficienteException;

public class TesteSacaException {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(123, 321);
		ContaPoupanca cp = new ContaPoupanca(222, 333);
		
		cc.deposita(200);
		try {
			cc.saca(100);
		} catch (SaldoInsuficienteException e) {
			System.out.println("Exception: " + e.getMessage());
		}
		
		try {
		cc.transfere(150, cp);
		}catch (SaldoInsuficienteException e) {
			System.out.println("Exception: " + e.getMessage());
		}
		
		System.out.println("Saldo cc: " + cc.getSaldo());
		System.out.println("Saldo cp: " + cp.getSaldo());
		System.out.println("Fim teste saca");

	}

}
