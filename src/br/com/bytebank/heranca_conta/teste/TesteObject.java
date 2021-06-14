package br.com.bytebank.heranca_conta.teste;

import br.com.bytebank.heranca_conta.modelo.ContaCorrente;
import br.com.bytebank.heranca_conta.modelo.ContaPoupanca;

public class TesteObject {
	
	public static void main(String[] args) {
		
		Object cc = new ContaCorrente(11, 1111);
		Object cp = new ContaPoupanca(12, 2222);
		
//		Object é a classe mae, portante por heranca é igual instancia por Object ou pelo nome da classe em si
//		ContaCorrente cc = new ContaCorrente(11, 1111);
//		ContaPoupanca cp = new ContaPoupanca(12, 2222);
		
//		escrever cc.toString() ou escrever apenas cc, da na mesma, por boa pratica escrevemos apenas cc
		System.out.println(cc);
		System.out.println(cp.toString());
	}
}
