package bytebank_encapsulado;

public class TesteConstrutor {

		public static void main(String[] args) {
			Conta conta01 = new Conta(0, 55060,20);
			Conta conta02 = new Conta(123, -55061);
			
			conta01.deposita(100);
			conta02.deposita(2);
			
			System.out.println("Teste buscando total dentro do main! ");
			System.out.println("Total de contas: " + Conta.getTotal());
		}
}
