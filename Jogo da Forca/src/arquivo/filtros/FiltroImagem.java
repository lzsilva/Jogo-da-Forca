package arquivo.filtros;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class FiltroImagem extends FileFilter {

	@Override
	public boolean accept(File file) {
		// TODO Auto-generated method stub
		return file.isDirectory() || file.getName().toLowerCase().endsWith(".png") ||  file.getName().toLowerCase().endsWith(".jpeg")
				|| file.getName().toLowerCase().endsWith(".gif");
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Arquivos de Imagem (.png .jpg .gif)";
	}

}
