package bytebank_heranca;

public class Designer extends Funcionario {

	@Override
	public double getBonificacao() {
		System.out.println("Metodo bonificacao do Designer");
		return 200;
	}
}
