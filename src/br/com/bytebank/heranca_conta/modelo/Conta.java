package br.com.bytebank.heranca_conta.modelo;

import java.io.Serializable;

public abstract class Conta extends Object implements Comparable<Conta>, Serializable {
	/**
	 * Boa pratica escrever o serialVersion para o controle da serializacao e versionar a classe
	 * que sera guardado no fluxo binario
	 */
	private static final long serialVersionUID = 1L;
	private int agencia;
//	protected faz com que a variave seja visivel para os filhos 
	protected double saldo;
	private int numero;
//	private transient Cliente cliente; //transiente serve para a classe cliente nao pricisar do implements Serializable, porem ele não é salvado na serializacao e fica como valor NULL;
	private Cliente cliente; 
	private static int total = 0;

	public Conta(int agencia, int numero, int saldo) {
		Conta.total++;
		System.out.println("Criando uma nova conta , conta 0" + Conta.total + " !");

		if (agencia > 0)
			this.agencia = agencia;
		else {
			System.out.println("Agencia com valor negativo ou 0 é invalido, por default sera 123");
			this.agencia = 123;
		}

		if (numero >= 0)
			this.numero = numero;
		else {
			System.out.println("Numero com valor negativo é invalido, por default sera 0");
			this.numero = 0;
		}

		this.saldo = saldo;

		System.out.println("Agencia: " + this.agencia);
		System.out.println("Numero: " + this.numero);
		System.out.println("Saldo: " + this.saldo);

	}

	public Conta(int agencia, int numero) {
		this(agencia, numero, 0);
	}

	public static int getTotal() {
//		return total //é a mesma coisa que Conta.total
		return Conta.total;
	}

//	por ter o construtor, nesse exemplo nao sera mais necessario o setAgencia e o setNumero
//	public void setAgencia(int agencia) {
//		this.agencia = agencia;
//	}

	public int getAgencia() {
		return this.agencia;
	}

	public double getSaldo() {
		return this.saldo;
	}

//	public void setNumero(int numero) {
//		this.numero = numero;
//	}

	public int getNumero() {
		return numero;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public abstract void deposita(double valor);

	public void saca(double valor) throws SaldoInsuficienteException {
		if (valor >= this.saldo) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + " Valor a ser sacado: " + valor);
		}
		this.saldo -= valor;

	}

	public void transfere(double valor, Conta contaEnv) throws SaldoInsuficienteException {
		if (valor >= this.saldo) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + " Valor a ser sacado: " + valor);
		}
		this.saca(valor);
		contaEnv.deposita(valor);

	}
	
	@Override
	public boolean equals(Object obj) {
		Conta ref = (Conta) obj;
		if(this.agencia == ref.agencia && this.numero == ref.numero)
			return true;
		return false;
	}
	
	//definimos um comparador padrao ( natural) para o metodo Collections.sort(); 
	@Override
	public int compareTo(Conta c) {
		return Double.compare(this.saldo, c.saldo);
	}
	
	@Override
	public String toString() {
		return "Agencia: " + this.agencia + " Numero Conta: " + this.numero + " Saldo: " + this.saldo ;
	}
}
