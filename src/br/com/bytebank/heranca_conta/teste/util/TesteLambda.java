package br.com.bytebank.heranca_conta.teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.heranca_conta.modelo.Cliente;
import br.com.bytebank.heranca_conta.modelo.Conta;
import br.com.bytebank.heranca_conta.modelo.ContaCorrente;
import br.com.bytebank.heranca_conta.modelo.ContaPoupanca;

public class TesteLambda {
	
	public static void main(String[] args) {
		Conta cc1 = new ContaCorrente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Nico");
		cc1.setCliente(clienteCC1);
		cc1.deposita(333.0);

		Conta cc2 = new ContaPoupanca(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Guilherme");
		cc2.setCliente(clienteCC2);
		cc2.deposita(444.0);

		Conta cc3 = new ContaCorrente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Paulo");
		cc3.setCliente(clienteCC3);
		cc3.deposita(111.0);

		Conta cc4 = new ContaPoupanca(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Ana");
		cc4.setCliente(clienteCC4);
		cc4.deposita(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		for (Conta conta : lista) {
		    System.out.println(conta);
		}
		
		System.out.println("---------");

//		NumeroDaContaComparator comparator = new NumeroDaContaComparator();
//		lista.sort(comparator);
//		lista.sort(new ClienteComparator());
//		Collections.sort(lista, new NumeroDaContaComparator());
//		Collections.sort(lista);
		lista.sort(new NumeroDaContaComparator1());
		
//		Tem a mesma funcionalidade que o class NumedoDaContaComparator, sem precisar criar a class, criando uma classe anonima
		lista.sort(new Comparator<Conta>() {

			    @Override
			    public int compare(Conta c1, Conta c2) {
			        return Integer.compare(c1.getNumero(), c2.getNumero());
			    }
			}
		);
		
		//transforma a classe anonima em Lambda é o metodo de cima resuimodo em forma de escrita de codigo, simples e de facil intendimento, e é exatamente o mesmo codigo que o de cima
		lista.sort( (c1,c2) -> Integer.compare(c1.getNumero(), c2.getNumero())  );
		
		lista.forEach( conta ->  System.out.println(conta+ " Cliente: " + conta.getCliente().getNome())  );
				
		System.out.println("---------");
		
//		Tem a mesma funcionalidade que o class ClienteComparator, sem precisar criar a class, criando uma classe anonima
		Comparator<Conta>  ClienteComparador = new Comparator<Conta>() {
			@Override
			public int compare(Conta c1, Conta c2) {
				String n1 = c1.getCliente().getNome();
				String n2 = c2.getCliente().getNome();
				return n1.compareTo(n2);
			}
		};
		
		Comparator<Conta> ClienteComparador2 = (c1,c2) -> {
			String n1 = c1.getCliente().getNome();
			String n2 = c2.getCliente().getNome();
			return n1.compareTo(n2);
		};
		
		lista.sort(ClienteComparador2);
		
		
//		for (Conta conta : lista) {
//		    System.out.println(conta+ " Cliente: " + conta.getCliente().getNome());
//		}
//		mesmo for utilizando lambda
		lista.forEach( conta ->  System.out.println(conta+ " Cliente: " + conta.getCliente().getNome())  );
		

	}
}
		
class ClienteComparator1 implements Comparator<Conta>{
	@Override
	public int compare(Conta c1, Conta c2) {
		String n1 = c1.getCliente().getNome();
		String n2 = c2.getCliente().getNome();
		return n1.compareTo(n2);
	}
}


class NumeroDaContaComparator1 implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {
        return Integer.compare(c1.getNumero(), c2.getNumero());
    }
}


