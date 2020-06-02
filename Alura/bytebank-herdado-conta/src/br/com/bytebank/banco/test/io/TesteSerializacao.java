package br.com.bytebank.banco.test.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws Exception {

		Cliente cliente = new Cliente();
		cliente.setCpf("111.111.111-11");
		cliente.setNome("Luiz Ferraz");
		cliente.setProfissao("engenheiro");

		ContaCorrente cc = new ContaCorrente(222, 111);
		cc.setTitular(cliente);
		cc.deposita(222.3);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();
		
	}

}
