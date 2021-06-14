package bytebank_encapsulado;

public class Conta {
	private int agencia;
	private double saldo;
	private int numero;
	private Cliente cliente;
	private static int total = 0;
	
	public Conta(int agencia, int numero, int saldo) {
		Conta.total ++;
		System.out.println("Criando uma nova conta , conta 0"+ Conta.total + " !");
		
		if(agencia>0)
			this.agencia = agencia;
		else {
			System.out.println("Agencia com valor negativo ou 0 é invalido, por default sera 123");
			this.agencia = 123;
		}
		
		if(numero>=0)
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
		this( agencia, numero, 0);
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
	
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(valor >= this.saldo) {
			System.out.println("Valor insuficiente para saque!");
			return false;
		}else {
			this.saldo -= valor;
			return true;
		}
	}
	
	public boolean transfere(double valor, Conta contaEnv) {
		if(valor>=this.saldo) {
			System.out.println("Sado insuficiente para transferencia");
			return false;
		}else {
			this.saca(valor);
			contaEnv.deposita(valor);
			return true;
		}
		
	}
}
