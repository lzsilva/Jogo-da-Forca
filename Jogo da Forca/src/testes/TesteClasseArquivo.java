package testes;

import java.io.File;

import arquivo.Arquivo;

public class TesteClasseArquivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:/Users/Luiz/Desktop/Forca Original/index.html");
		System.out.println(Arquivo.lerArquivo(file));

	}

}
