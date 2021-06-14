package br.com.bytebank.heranca_conta.teste;

import br.com.bytebank.heranca_conta.modelo.CalculadorDeImposto;
import br.com.bytebank.heranca_conta.modelo.ContaCorrente;
import br.com.bytebank.heranca_conta.modelo.SeguroDeVIda;

public class TesteTributavel {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(333, 4444);
		cc.deposita(100);
		
		
		SeguroDeVIda seguro = new SeguroDeVIda();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println("Saldo: " + cc.getSaldo());
		System.out.println("Imposto Total: " + calc.totalImposto);
	}

}
