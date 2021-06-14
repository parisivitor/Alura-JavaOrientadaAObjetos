package bytebank_encapsulado;

public class TesteGetSet {

	public static void main(String[] args) {
		Conta conta01 = new Conta(123,55001);
		//conta01.setAgencia(123);
		//System.out.println("Agencia: " + conta01.getAgencia());
		
		Cliente cliente01 = new Cliente();
		conta01.setCliente(cliente01);
		cliente01.setNome("Vitor Parisi");
		System.out.println("Nome: " + conta01.getCliente().getNome());
		
		Endereco end01 = new Endereco();
		end01.setCidade("Alfenas");
		conta01.getCliente().setEndereco(end01);
		conta01.getCliente().getEndereco().setCep("123123-123");
		System.out.println("Cidade: " + conta01.getCliente().getEndereco().getCidade() );
		System.out.println("Cep: " + conta01.getCliente().getEndereco().getCep());
		
		conta01.deposita(500);
		conta01.saca(100);
		
		System.out.println("Saldo: " + conta01.getSaldo());
		System.out.println(conta01.saca(1000));
		
	}
}
