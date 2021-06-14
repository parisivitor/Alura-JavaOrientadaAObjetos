package bytebank_heranca;

// 			 Gerente é um Funcionario
public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public boolean autenticacao(int senha) {
		return this.autenticador.autenticacao(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	public double getBonificacao() {
		System.out.println("Metodo bonificacao do Gerente");
		return super.getSalario();
	}

}
