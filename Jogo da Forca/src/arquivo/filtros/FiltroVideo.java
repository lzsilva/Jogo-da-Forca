package arquivo.filtros;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class FiltroVideo extends FileFilter {

	@Override
	public boolean accept(File file) {
		// TODO Auto-generated method stub
		return file.isDirectory() || file.getName().toLowerCase().endsWith(".mp4") ||  file.getName().toLowerCase().endsWith(".ogg")
				|| file.getName().toLowerCase().endsWith(".3gp");
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Arquivos de vídeos (.mp4 .ogg .3gp)";
	}

}
