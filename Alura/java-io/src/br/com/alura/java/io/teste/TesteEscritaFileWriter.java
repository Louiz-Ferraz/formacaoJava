package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {

//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
		String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod";
		
		bw.write(str);
		bw.newLine();
		bw.write("dsadasda sdaasdassadaa");
		
		bw.close();

	}

}
