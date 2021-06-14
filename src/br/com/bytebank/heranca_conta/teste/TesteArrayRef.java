package br.com.bytebank.heranca_conta.teste;

import br.com.bytebank.heranca_conta.modelo.ContaCorrente;
import br.com.bytebank.heranca_conta.modelo.ContaPoupanca;

public class TesteArrayRef {

	public static void main(String[] args) {
		
		int vetor[] =new int[5];
		for(int i = 0 ; i < vetor.length ; i++) {
			vetor[i] = i*i;
			System.out.println(vetor[i]);
		}
		
		ContaCorrente[] contas = new ContaCorrente[5];
		
		ContaCorrente cc1 = new ContaCorrente(13, 111);
		ContaCorrente cc2 = new ContaCorrente(11, 222);
		ContaCorrente cc3 = new ContaCorrente(11, 333);
		
		contas[0] = cc1;
		contas[2] = cc2;
		contas[4] = cc3;
		
		System.out.println(contas[0].getAgencia());
		
		contas[2].deposita(200);
		System.out.println(cc2.getSaldo());
		System.out.println(contas[2].getSaldo());
		
		cc3.deposita(100);
		System.out.println(cc3.getSaldo());
		System.out.println(contas[4].getSaldo());
		
		try {
			System.out.println(contas[1].getNumero());
		}catch(NullPointerException ex) {
			System.out.println(ex.getMessage());
		}
		
		ContaPoupanca cp1 = new ContaPoupanca(222, 123);
		ContaPoupanca cp2 = new ContaPoupanca(222, 124);
		ContaPoupanca[] cps = {cp1,cp2};
		
		System.out.println(cps[0].getNumero());
		System.out.println(cps[1].getNumero());
		
		System.out.println(cps[2].getAgencia()); // erro que o array nao tem esse indice
		
		System.out.println("Fim teste Array ");
		
				

	}

}
