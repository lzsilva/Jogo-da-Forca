package testes;

import java.io.File;

public class TesteExtensaoArquivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 File arquivo = new File("c:\\java\\Teste.java");
		    String nome = arquivo.getName();
		    String ext = nome.substring(nome.lastIndexOf('.') + 1);
		    
		    System.out.println("A extensao do arquivo e: " + ext);
		    System.out.println(arquivo.getName());

	}

}
