package br.com.bytebank.heranca_conta.especial;

import br.com.bytebank.heranca_conta.modelo.ContaCorrente;

public class TesteEspecial {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(123, 321);
		cc.deposita(150);
		System.out.println(cc.getSaldo());
		
	}
}
