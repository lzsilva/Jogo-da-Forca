package arquivo;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import entidades.Fase;
import entidades.Jogo;
import entidades.Palavra;

public class GeradorDeMultimidia {
	
	private File origem;
	private InputStream origemInputStream;
	private File destino;
	
	public GeradorDeMultimidia(Jogo jogo, File file){
		
		ArrayList<Fase> fases = jogo.getFases();
		
		for (Fase f : fases) {
			ArrayList<Palavra> palavras = f.getPalavras();
			
			for (Palavra p : palavras) {
				if(p.getURLMultimidia()!=null){
					origem = new File(p.getURLMultimidia());
					origemInputStream = GeradorDeMultimidia.class.getResourceAsStream(p.getURLMultimidia());
					if(p.getTipoMultimidia().equalsIgnoreCase("imagem")){
						destino = new File(file.getAbsolutePath()+"/imagens/"+origem.getName().replace(" ",""));
						
					}
						else if(p.getTipoMultimidia().equalsIgnoreCase("video")){
							destino = new File(file.getAbsolutePath()+"/videos/"+origem.getName().replace(" ",""));
						}
							else if(p.getTipoMultimidia().equalsIgnoreCase("audio")){
								destino = new File(file.getAbsolutePath()+"/audios/"+origem.getName().replace(" ",""));
							}
										
					Arquivo.copiaArquivo2(origemInputStream, destino.toURI().getPath());
				}
			}
		}
		
	}
	
	private String getExtensao(File file){
		String nome = file.getName();
	    String ext = nome.substring(nome.lastIndexOf('.') + 1);
	    return ext;
	}

}
