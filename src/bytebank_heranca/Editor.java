package bytebank_heranca;

public class Editor extends Funcionario {

	@Override
	public double getBonificacao() {
		System.out.println("Metodo bonificacao do Editor");
		return 150;
	}
}
