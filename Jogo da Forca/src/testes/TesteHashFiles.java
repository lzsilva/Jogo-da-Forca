package testes;

import java.io.File;
import java.util.HashMap;

import arquivo.diretorios.GeradorDeDiretorios;

public class TesteHashFiles {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeradorDeDiretorios gerador = new GeradorDeDiretorios();
		HashMap<String,File> hash = gerador.getDiretorios();
		System.out.println(hash.get("recursos").getAbsolutePath());
	}
	

}
