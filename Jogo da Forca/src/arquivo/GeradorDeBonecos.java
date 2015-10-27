package arquivo;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class GeradorDeBonecos {
	
	private InputStream bonecoEntrada1;
	private InputStream bonecoEntrada2;
	private InputStream bonecoEntrada3;
	private InputStream bonecoEntrada4;
	
	private File bonecoSaida1;
	private File bonecoSaida2;
	private File bonecoSaida3;
	private File bonecoSaida4;
	
	public GeradorDeBonecos(File destino){		
		
		bonecoEntrada1 = GeradorDeBonecos.class.getResourceAsStream("/imagens/b0.png");			
		bonecoEntrada2 = GeradorDeBonecos.class.getResourceAsStream("/imagens/b1.png");
		bonecoEntrada3 = GeradorDeBonecos.class.getResourceAsStream("/imagens/b2.png");
		bonecoEntrada4 = GeradorDeBonecos.class.getResourceAsStream("/imagens/b3.png");
		
		bonecoSaida1 = new File(destino.getAbsolutePath()+"/b0.png");		
		bonecoSaida1 = new File(bonecoSaida1.toURI());
		bonecoSaida2 = new File(destino.getAbsolutePath()+"/b1.png");
		bonecoSaida3 = new File(destino.getAbsolutePath()+"/b2.png");
		bonecoSaida4 = new File(destino.getAbsolutePath()+"/b3.png");
		
		Arquivo.copiaArquivo2(bonecoEntrada1, bonecoSaida1.toURI().getPath());
		Arquivo.copiaArquivo2(bonecoEntrada2, bonecoSaida2.toURI().getPath());
		Arquivo.copiaArquivo2(bonecoEntrada3, bonecoSaida3.toURI().getPath());
		Arquivo.copiaArquivo2(bonecoEntrada4, bonecoSaida4.toURI().getPath());
		
	}
}
