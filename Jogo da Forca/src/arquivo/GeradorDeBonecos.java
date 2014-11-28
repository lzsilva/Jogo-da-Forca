package arquivo;

import java.io.File;
import java.io.IOException;

public class GeradorDeBonecos {
	
	private File bonecoEntrada1;
	private File bonecoEntrada2;
	private File bonecoEntrada3;
	private File bonecoEntrada4;
	
	private File bonecoSaida1;
	private File bonecoSaida2;
	private File bonecoSaida3;
	private File bonecoSaida4;
	
	public GeradorDeBonecos(File destino){
		
		bonecoEntrada1 = new File("src/imagens/b0.png");
		bonecoEntrada2 = new File("src/imagens/b1.png");
		bonecoEntrada3 = new File("src/imagens/b2.png");
		bonecoEntrada4 = new File("src/imagens/b3.png");
		
		bonecoSaida1 = new File(destino.getAbsolutePath()+"/b0.png");
		bonecoSaida2 = new File(destino.getAbsolutePath()+"/b1.png");
		bonecoSaida3 = new File(destino.getAbsolutePath()+"/b2.png");
		bonecoSaida4 = new File(destino.getAbsolutePath()+"/b3.png");
		
		try {
			Arquivo.copiaArquivo(bonecoEntrada1, bonecoSaida1);
			Arquivo.copiaArquivo(bonecoEntrada2, bonecoSaida2);
			Arquivo.copiaArquivo(bonecoEntrada3, bonecoSaida3);
			Arquivo.copiaArquivo(bonecoEntrada4, bonecoSaida4);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
