package arquivo;

import java.io.File;
import java.io.IOException;

import entidades.Jogo;

public class GeradorDeHTML {
	
	private File leitura;
	private File saida;
	

	public GeradorDeHTML(File destino){		
		leitura = new File("src/recursos/index.html");			
		
		saida = new File(destino.getAbsolutePath()+"/index.html");					
		try {
			Arquivo.copiaArquivo(leitura, saida);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
