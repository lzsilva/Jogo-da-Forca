package arquivo.filechoose;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileFilter;

import entidades.Palavra;
import arquivo.filtros.FiltroAudio;
import arquivo.filtros.FiltroImagem;
import arquivo.filtros.FiltroVideo;

public class EscolherArquivo {
	
	private JFileChooser fileChooser;
	private FileFilter filtro;
	
	
	public EscolherArquivo(String tipo, Palavra palavra){
		palavra.setPalavra("tensis");
		fileChooser = new JFileChooser();
		fileChooser.setCurrentDirectory(new File("."));
		
		if(tipo.equalsIgnoreCase("audio")){
			filtro = new FiltroAudio();
		}
		
		else if(tipo.equalsIgnoreCase("imagem")){
			filtro = new FiltroImagem();
		}
		
		else if(tipo.equalsIgnoreCase("video")){
			filtro = new FiltroVideo();
		}		
		
		fileChooser.setFileFilter(filtro);
		int r = fileChooser.showOpenDialog(new JFrame());
	    if (r == JFileChooser.APPROVE_OPTION) {
	      palavra.setURLMultimidia(fileChooser.getSelectedFile().getAbsolutePath());	           
	    }
	}

}
