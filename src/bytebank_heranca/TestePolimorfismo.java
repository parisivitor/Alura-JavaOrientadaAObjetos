package bytebank_heranca;

public class TestePolimorfismo {

	public static void main(String[] args) {
		
		Funcionario g1 = new Gerente();
		g1.setSalario(5000);
		
		Editor e1 = new Editor();
		e1.setSalario(3000);
		
		Funcionario d1 = new Designer();
		d1.setSalario(4000);
		
		ControleBonificacao crtlBoni = new ControleBonificacao();
		crtlBoni.registra(g1);
		crtlBoni.registra(e1);
		crtlBoni.registra(d1);
		System.out.println(crtlBoni.getSoma());

	}

}
