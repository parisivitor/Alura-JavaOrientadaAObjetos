package bytebank_heranca;

public class Administrador extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Administrador() {
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

	@Override
	public double getBonificacao() {
		return 300;
	}

}
