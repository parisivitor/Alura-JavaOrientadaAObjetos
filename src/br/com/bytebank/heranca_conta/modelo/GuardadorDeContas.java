package br.com.bytebank.heranca_conta.modelo;

public class GuardadorDeContas {

	private Object[] referencias;
	private int posicaoLivre = 0;

	public GuardadorDeContas(int tam) {
		this.referencias = new Conta[tam];
	}

	public GuardadorDeContas() {
		this.referencias = new Object[10];
	}

	public void adiciona(Object ref) {
		referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}
	
	public int getPosicaoLivre() {
		return this.posicaoLivre;
	}
	
	public Object getReferencias(int pos) {
		return referencias[pos];
	}

}
