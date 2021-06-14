package bytebank_heranca;

public class SistemaInterno {
	
	private int senha = 22232;
	
	public void autentica(Autenticavel a ) {
		if(a.autenticacao(this.senha))
			System.out.println("Acesso Liberado!");
		else
			System.out.println("Acesso Negado!");
	}

}
