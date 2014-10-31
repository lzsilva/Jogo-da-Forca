package arquivo.filtros;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class FiltroAudio extends FileFilter {

	@Override
	public boolean accept(File file) {
		// TODO Auto-generated method stub
		return file.isDirectory() || file.getName().toLowerCase().endsWith(".mid") ||  file.getName().toLowerCase().endsWith(".midi")
				|| file.getName().toLowerCase().endsWith(".mp3");
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Arquivos de Áudio (.mid . midi .mp3)";
	}

}
