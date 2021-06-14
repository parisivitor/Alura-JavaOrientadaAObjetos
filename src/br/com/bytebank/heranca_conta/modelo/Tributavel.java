package br.com.bytebank.heranca_conta.modelo;

public interface Tributavel {
//	double getValorImposto();    daria certo tambem, pois o java entende como default que todo metodo de uma insterfece é public e abstract!! 
	public abstract double getValorImposto();
}
