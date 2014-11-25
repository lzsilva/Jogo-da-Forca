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
	private File file;
	
	public EscolherArquivo(){
		fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		//fileChooser.setSelectedFile(arg0);
		fileChooser.showSaveDialog(new JFrame());
	}
	
	
	public EscolherArquivo(Palavra palavra){
		
		fileChooser = new JFileChooser();
		fileChooser.setCurrentDirectory(new File("."));
		
		if(palavra.getTipoMultimidia().equalsIgnoreCase("audio")){
			filtro = new FiltroAudio();
		}
		
		else if(palavra.getTipoMultimidia().equalsIgnoreCase("imagem")){
			filtro = new FiltroImagem();
		}
		
		else if(palavra.getTipoMultimidia().equalsIgnoreCase("video")){
			filtro = new FiltroVideo();
		}		
		
		fileChooser.setFileFilter(filtro);
		int r = fileChooser.showOpenDialog(new JFrame());
	    if (r == JFileChooser.APPROVE_OPTION) {	    	
	    	palavra.setURLMultimidia(fileChooser.getSelectedFile().getAbsolutePath());
	    	
	    }
	}
}
