package bytebank;

public class TestaConta {
	
	public static void main(String[] args) {
	
		Conta conta01 = new Conta();
		conta01.saldo = 200;
		conta01.saldo += 100;
		System.out.println("Saldo conta 01 " + conta01.saldo);
		
		Conta conta02 = new Conta();
		conta02.saldo = 100;
		System.out.println("Saldo conta 02 " + conta02.saldo);
		
		
		Conta conta03 = conta02;
		conta03.saldo += 50;
		System.out.println("Saldo conta 02 " +conta02.saldo);
		System.out.println("Saldo conta 03 " +conta03.saldo);
		
		conta01.deposita(100);
		System.out.println("Saldo conta 01 apos deposito " + conta01.saldo);
		
		conta01.saca(50);
		System.out.println("Saldo conta 01 apos saque" + conta01.saldo);
		
		if(conta01.transfere(150, conta02))
			System.out.println("Tranferencia realizada com sucesso!");
		System.out.println("Saldo conta 01 apos transferencia " + conta01.saldo);
		System.out.println("Saldo conta 02 apos transferencia " + conta02.saldo);
		System.out.println("Saldo conta 02 apos transferencia " + conta03.saldo);
		
		
		// Teste de apontamento entre classes
		
		Cliente cliente01 = new Cliente();
		cliente01.nome = "Vitor Parisi";
		cliente01.idade = 25;
		
		conta01.cliente = cliente01;
		System.out.println(conta01.cliente.nome);
		
		Endereco end01 = new Endereco();
		end01.cidade = "Alfenas";
		cliente01.endereco = end01;
		System.out.println(conta01.cliente.endereco.cidade);
		
		
	}
	
}
