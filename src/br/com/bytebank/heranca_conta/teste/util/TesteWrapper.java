package br.com.bytebank.heranca_conta.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapper {

	public static void main(String[] args) {

		Integer idadeRef = 29; // autoboxinng, é criado um objeto do tipo Integer
		int primitivo = new Integer(21); // que locura!! unboxing

		List<Integer> lista = new ArrayList<>();
		lista.add(idadeRef); // ok
		lista.add(primitivo); // autoboxing

		int i1 = lista.get(0); // unboxing
		Integer i2 = lista.get(1); // ok

		System.out.println(i1); // 29
		System.out.println(i2); // 21
		
		Number int0 = Integer.valueOf(20);
//		Integer int0 = Integer.valueOf(20);
		Integer int1 = Integer.valueOf("21");
		Integer int2 = Integer.parseInt("30");
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		Number dRef = Double.valueOf(30.2);
//		Double dRef = Double.valueOf(30.2);
		Double dRef1 = Double.parseDouble("30");
		
		System.out.println(dRef);
		System.out.println(dRef1);
		
		

	}

}
