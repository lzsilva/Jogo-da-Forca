package testes;

import java.io.File;
import java.io.IOException;

import arquivo.Compactador;
import arquivo.CompactadorZip;

public class TesteZip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compactador compactador = new Compactador();
		File entrada = new File("C:/Users/Luiz/Desktop/neo");
		File saida = new File("C:/Users/Luiz/Desktop/neo3.zip");
		try {
			compactador.zip(entrada, saida);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
