package br.com.bytebank.heranca_conta.teste;

import br.com.bytebank.heranca_conta.modelo.ContaCorrente;
import br.com.bytebank.heranca_conta.modelo.GuardadorDeContas;
import bytebank.Conta;

public class TesteGuardadosDeContas {
	
	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas(5);
		
		ContaCorrente cc1 = new ContaCorrente(11,11);
		ContaCorrente cc2 = new ContaCorrente(11,22);
		
		guardador.adiciona(cc1);
		guardador.adiciona(cc2);
		
		System.out.println(guardador.getPosicaoLivre());
		
		ContaCorrente ref =(ContaCorrente) guardador.getReferencias(0);
		
		System.out.println(ref.getAgencia());
		System.out.println(ref.getNumero());
		
		
	}

}
