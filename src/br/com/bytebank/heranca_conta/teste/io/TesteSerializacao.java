package br.com.bytebank.heranca_conta.teste.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.bytebank.heranca_conta.modelo.Cliente;
import br.com.bytebank.heranca_conta.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws Exception {
		Cliente cliente = new Cliente();
		cliente.setNome("Vitor");
		cliente.setIdade(25);
		cliente.setCpf("123123123");
		
		ContaCorrente cc  = new ContaCorrente(222, 333);
		cc.setCliente(cliente);
		cc.deposita(230.40);
		
//		Searilizacao, tranformar o objeto em binario
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("titular.bin"));
		oos.writeObject(cc);
		oos.close();
		
//		Desearilizacao, transformar o binario em objeto
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("titular.bin"));
		ContaCorrente objeto = (ContaCorrente) ois.readObject();
		System.out.println(objeto.getSaldo());
		System.out.println(objeto.getCliente().getNome());

	}

}
