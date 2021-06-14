package br.com.bytebank.heranca_conta.teste;

import br.com.bytebank.heranca_conta.modelo.Conta;
import br.com.bytebank.heranca_conta.modelo.ContaCorrente;
import br.com.bytebank.heranca_conta.modelo.ContaPoupanca;

public class TesteArrayRef2 {

	public static void main(String[] args) {
		
		Conta[] contas = new Conta[4];
		
		ContaCorrente cc1 = new ContaCorrente(11, 123);
		
		ContaPoupanca cp1 = new ContaPoupanca(22, 223);
		
		contas[0]= cc1;
		contas[1]= cp1;
		
		System.out.println(contas[0].getNumero());
		System.out.println(contas[1].getNumero());
		
		ContaCorrente ref = (ContaCorrente)contas[0]; //type cast para mostras para o compilador que isso funciona, eu assumo o risco afirmando que funciona
		System.out.println(ref.getNumero());
		
		Conta ref2 = contas[1];  					//nao precisa de tipe cast, pois CC ou CP é uma conta
		System.out.println(ref2.getNumero());
		
//		ContaCorrente ref1 = (ContaCorrente)contas[1]; //vai dar erro, pois ccontas[1] tem um tipo CP e nao CC, err: ClassCastExecption
//		System.out.println(ref1.getNumero());
		
		
		

	}

}
