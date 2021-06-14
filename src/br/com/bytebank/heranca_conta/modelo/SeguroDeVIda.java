package br.com.bytebank.heranca_conta.modelo;

public class SeguroDeVIda implements Tributavel {

	@Override
	public double getValorImposto() {
		return 40.0;
	}

}
