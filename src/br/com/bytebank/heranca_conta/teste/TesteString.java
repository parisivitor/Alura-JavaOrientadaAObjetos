package br.com.bytebank.heranca_conta.teste;

public class TesteString {

	public static void main(String[] args) {
		String nome = "Vitor";

		System.out.println(nome.replace("V", "B"));
		System.out.println(nome.toLowerCase());
		System.out.println(nome.toUpperCase());
		System.out.println(nome.isEmpty());
		System.out.println(nome.contains("ito"));
		System.out.println(nome.compareTo("Vitor"));
		System.out.println(nome.indexOf("t"));
		System.out.println(nome.substring(2));
		for (int i = 0; i < nome.length(); i++)
			System.out.println(nome.charAt(i));
		System.out.println(nome.concat(" Parisi"));

		String nome2 = "    Vitor     ";
		System.out.println(nome2.trim());
		
//		String nome3 = "Vitor:Parisi";
//		System.out.println(nome3.split(":"));
		
		System.out.println(String.join("-", "Vitor", "Risso", "Parisi"));
		
		
		StringBuilder builder = new StringBuilder("Socorram");
		builder.append("-");
		builder.append("me");
		builder.append(", ");
		builder.append("subi ");
		builder.append("no ");
		builder.append("ônibus ");
		builder.append("em ");
		builder.append("Marrocos");
		String texto = builder.toString();
		System.out.println(texto);
		
		CharSequence cs = new StringBuilder("também é uma sequencia de caracteres");
		String nome3 = "ALURA";
		//CharSequence cs = new StringBuilder("al");

		nome3 = nome3.replace("AL", cs);

		System.out.println(nome3);
	}

}
