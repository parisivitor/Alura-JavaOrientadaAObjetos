package br.com.bytebank.heranca_conta.modelo;

import java.io.Serializable;

public class Cliente implements Serializable {

	/**
	 * Boa pratica escrever o serialVersion para o controle da serializacao e versionar a classe
	 * que sera guardado no fluxo binario
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
	private int idade;
	private String cpf;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


}
