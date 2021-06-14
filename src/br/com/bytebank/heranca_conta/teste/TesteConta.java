package br.com.bytebank.heranca_conta.teste;

import br.com.bytebank.heranca_conta.modelo.ContaCorrente;
import br.com.bytebank.heranca_conta.modelo.ContaPoupanca;
import br.com.bytebank.heranca_conta.modelo.SaldoInsuficienteException;

public class TesteConta {

	public static void main(String[] args) throws SaldoInsuficienteException{
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(300.0);
		cc.saca(50);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(100.0);

		cc.transfere(50, cp);
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
	
	}
}
