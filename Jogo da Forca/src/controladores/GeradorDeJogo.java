package controladores;

import java.io.File;
import java.util.HashMap;

import arquivo.GeradorDeCSS;
import arquivo.GeradorDeHTML;
import arquivo.GeradorDeScript;
import arquivo.diretorios.GeradorDeDiretorios;
import entidades.Estilo;
import entidades.Jogo;

public class GeradorDeJogo {
	
	private Jogo jogo;
	
	public GeradorDeJogo(Jogo jogo, Estilo estilo){
		this.jogo = jogo;
		GeradorDeDiretorios geradorDeDiretorios = new GeradorDeDiretorios();
		HashMap<String,File> hash =  geradorDeDiretorios.getDiretorios();
		if (hash!=null){
			GeradorDeScript script = new GeradorDeScript(jogo,hash.get("script"));
			GeradorDeHTML htlm = new GeradorDeHTML(hash.get("raiz"));
			GeradorDeCSS css = new GeradorDeCSS(estilo, hash.get("css"));
		}
	}
		
}
