package br.com.bytebank.heranca_conta.teste.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.heranca_conta.modelo.Conta;
import br.com.bytebank.heranca_conta.modelo.ContaCorrente;
import bytebank_heranca.Cliente;

public class TesteUtilArray {
	
	public static void main(String[] args) {
		
		//Gererics
		
//		Collection<Conta> lista1 = new Vector<Conta>();
//		lista.get(0) //nao compila, pos Collection não trabalha com indice.
		
		
		List<Conta> lista = new ArrayList<Conta>();		//usa array por de baixo dos panos
//		List<Conta> lista = new LinkedList<Conta>();	//lista duplamente encadeada 
//		List<Conta> lista = new Vector<Conta>();		//pode ser lista, pode ser array, trabalha com thredsafe (prog paralela) 
		
//		Pelo array ser do tipo COntaCorrente, ele so vai aceitar objetos do mesmo tipos, evitando erros de typecast e deixando o codigo mais seguro e especifico;
//		Cliente cli = new Cliente();
//		lista.add(cli);
		
		Conta cc1 = new ContaCorrente(11, 111);
		Conta cc2 = new ContaCorrente(11, 114);
		Conta cc3 = new ContaCorrente(11, 113);
		Conta cc4 = new ContaCorrente(11, 114);
		
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		lista.remove(cc3);
		
		System.out.println(lista.size());
		
		for(int i=0; i< lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		System.out.println("________________");
		
		for(Object oRef : lista) {
			System.out.println(oRef);
		}
		
		System.out.println("________________");
		
		
		System.out.println(lista.contains(cc3));
		
		System.out.println(cc2.equals(cc4));
		
	}

}
