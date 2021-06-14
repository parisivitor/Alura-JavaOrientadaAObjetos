package bytebank;

public class Conta {
	double agencia;
	int saldo;
	int numero;
	Cliente cliente;
	
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
