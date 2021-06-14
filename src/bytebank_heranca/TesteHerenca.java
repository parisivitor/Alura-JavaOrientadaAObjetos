package bytebank_heranca;

public class TesteHerenca {

	public static void main(String[] args) {

//		Com a classe Funcionario sendo abstrata nao podemos mais instanciar ela!
//		Funcionario f1 = new Funcionario();
//		f1.setNome("Vitor Parisi");
//		f1.setCpf("123123123-3");
//		f1.setSalario(3000);
//
//		System.out.println("Nome: " + f1.getNome());
//		System.out.println("Cpf: " + f1.getCpf());
//		System.out.println("Salario: " + f1.getSalario());
//		System.out.println("Bonificacao: " + f1.getBonificacao());

		Gerente g1 = new Gerente();
		g1.setNome("Carolina Parisi");
		g1.setCpf("456456456-6");
		g1.setSalario(4000);
		g1.setSenha(123123);

		System.out.println("Nome: " + g1.getNome());
		System.out.println("Cpf: " + g1.getCpf());
		System.out.println("Salario: " + g1.getSalario());
		System.out.println("Bonificacao: " + g1.getBonificacao());
		if (g1.autenticacao(123123))
			System.out.println("Acesso liberado!");
		else
			System.out.println("Acesso Negado!");

	}

}
