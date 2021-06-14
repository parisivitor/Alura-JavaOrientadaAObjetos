package br.com.bytebank.heranca_conta.teste.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.heranca_conta.modelo.Cliente;
import br.com.bytebank.heranca_conta.modelo.Conta;
import br.com.bytebank.heranca_conta.modelo.ContaCorrente;
import br.com.bytebank.heranca_conta.modelo.ContaPoupanca;

public class TesteSort {

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

//		NumeroDaContaComparator comparator = new NumeroDaContaComparator();
//		lista.sort(comparator);
//		lista.sort(new NumeroDaContaComparator());
//		lista.sort(new ClienteComparator());
//		Collections.sort(lista, new NumeroDaContaComparator());
		
		Collections.sort(lista);

		System.out.println("---------");

		for (Conta conta : lista) {
		    System.out.println(conta+ " Cliente: " + conta.getCliente().getNome());
		}
		

	}
}
		
class ClienteComparator implements Comparator<Conta>{
	@Override
	public int compare(Conta c1, Conta c2) {
		String n1 = c1.getCliente().getNome();
		String n2 = c2.getCliente().getNome();
		return n1.compareTo(n2);
	}
}

class AgenciaComparator implements Comparator<Conta>{
	 @Override
	public int compare(Conta o1, Conta o2) {
		return 0;
	}
}

class NumeroDaContaComparator implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {
        return Integer.compare(c1.getNumero(), c2.getNumero());
    }
}
