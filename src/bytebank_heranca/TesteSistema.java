package bytebank_heranca;

public class TesteSistema {

	public static void main(String[] args) {
		Autenticavel g1 = new Gerente();
		g1.setSenha(2222);
		
		Administrador a1 = new Administrador();
		a1.setSenha(2222);
		
		Autenticavel c1 = new Cliente();
		c1.setSenha(22232);
				
		SistemaInterno si = new SistemaInterno();
		si.autentica(g1);
		si.autentica(a1);
		si.autentica(c1);

	}

}
