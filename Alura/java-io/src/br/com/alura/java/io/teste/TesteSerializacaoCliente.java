package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws Exception {
		
		Cliente cliente = new Cliente();
		cliente.setCpf("111.111.111-11");
		cliente.setNome("Luiz Ferraz");
		cliente.setProfissao("engenheiro");
		
		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		oos.writeObject(cliente);
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente clienteLeitura = (Cliente) ois.readObject();
		ois.close();
		System.out.println(clienteLeitura.getNome());
		
	}

}
