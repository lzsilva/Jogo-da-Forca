package arquivo;

import java.io.File;
import java.io.IOException;

import entidades.Jogo;

public class GeradorDeHTML {
	
	
	private File destino;
	private File arquivoForcaLido;
	private File arquivoForcaGerado;
	

	public GeradorDeHTML(File destino){
		this.destino = arquivoForcaGerado;
		arquivoForcaLido = new File("src/recursos/index.html");		
		
		
		arquivoForcaGerado = new File(destino.getAbsolutePath()+"/index.html");					
		try {
			Arquivo.copiaArquivo(arquivoForcaLido, arquivoForcaGerado);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
