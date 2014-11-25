package arquivo.diretorios;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class GeradorDeDiretorios {
	
	private HashMap<String,File> hashDiretorios;
	private JFileChooser chooser;
	
	public GeradorDeDiretorios(){
		hashDiretorios = new HashMap<String, File>();
		chooser = new JFileChooser();
		chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		chooser.setSelectedFile(new File("forca"));
		chooser.setFileFilter(new FileNameExtensionFilter("Diretórios", "***"));
	}

	public HashMap<String,File> getDiretorios(){
		int res = chooser.showOpenDialog(null);
		if (res == JFileChooser.APPROVE_OPTION) {
			
			File diretorio = chooser.getSelectedFile();			
			
			String stringPastaRaiz = diretorio.getAbsolutePath();			
			String stringPastaRecursos = stringPastaRaiz+"/recursos";
			String stringPastaCSS = stringPastaRecursos+"/css";
			String stringPastaScript = stringPastaRecursos+"/script";
			String stringPastaMultimidia = stringPastaRecursos+"/multimidia";
			String stringPastaAudios = stringPastaMultimidia+"/audios";
			String stringPastaImagens = stringPastaMultimidia+"/imagens";
			String stringPastaVideos = stringPastaMultimidia+"/videos";			
			String stringPastaBoneco = stringPastaRecursos+"/boneco";
			
			File raiz = new File(stringPastaRaiz);
			File recursos = new File(stringPastaRecursos);
			File css = new File(stringPastaCSS);
			File script = new File(stringPastaScript);
			File boneco = new File(stringPastaBoneco);
			File multimidia = new File(stringPastaMultimidia);
			File audios = new File(stringPastaAudios);
			File imagens =  new File(stringPastaImagens);
			File videos = new File(stringPastaVideos);
			
			raiz.mkdir();
			recursos.mkdir();
			css.mkdir();
			script.mkdir();
			boneco.mkdir();
			multimidia.mkdir();
			audios.mkdir();
			imagens.mkdir();
			videos.mkdir();			
			
			hashDiretorios.put("raiz",raiz);
			hashDiretorios.put("recursos", recursos);
			hashDiretorios.put("css",css);		
			hashDiretorios.put("script",script );
			hashDiretorios.put("boneco", boneco);
			hashDiretorios.put("multimidia",multimidia);
			hashDiretorios.put("audios", audios);
			hashDiretorios.put("imagens",imagens);
			hashDiretorios.put("videos",videos);					
			
			return hashDiretorios;
		}
		return null;
	}

}
