package controladores;

import java.io.File;
import java.util.HashMap;

import arquivo.GeradorDeBonecos;
import arquivo.GeradorDeCSS;
import arquivo.GeradorDeHTML;
import arquivo.GeradorDeMultimidia;
import arquivo.GeradorDeScorm;
import arquivo.GeradorDeScript;
import arquivo.diretorios.GeradorDeDiretorios;
import entidades.Estilo;
import entidades.Jogo;

public class GeradorDeJogo {
	
	private Jogo jogo;
	private Estilo estilo;
	private HashMap<String, File> hash;;
	public GeradorDeJogo(Jogo jogo, Estilo estilo){
		this.jogo = jogo;
		this.estilo = estilo;
		
		GeradorDeDiretorios geradorDeDiretorios = new GeradorDeDiretorios();
		hash =  geradorDeDiretorios.getDiretorios();
		
		if (hash!=null){
			new GeradorDeScorm(jogo,hash.get("raiz"));
			new GeradorDeMultimidia(jogo, hash.get("multimidia"));
			new GeradorDeScript(jogo,hash.get("script"));
			new GeradorDeHTML(hash.get("raiz"));
			new GeradorDeCSS(estilo, hash.get("css"));
			new GeradorDeBonecos(hash.get("bonecos"));						
		}
	}
	
	public void criaJogo(){
		if (hash!=null){			
			new GeradorDeMultimidia(jogo, hash.get("multimidia"));
			new GeradorDeScript(jogo,hash.get("script"));
			new GeradorDeHTML(hash.get("raiz"));
			new GeradorDeCSS(estilo, hash.get("css"));
			new GeradorDeBonecos(hash.get("bonecos"));						
		}		
	}
	
	public void criaPacoteScorm(){
		if (hash!=null){
			new GeradorDeScorm(jogo,hash.get("raiz"));
			new GeradorDeMultimidia(jogo, hash.get("multimidia"));
			new GeradorDeScript(jogo,hash.get("script"));
			new GeradorDeHTML(hash.get("raiz"));
			new GeradorDeCSS(estilo, hash.get("css"));
			new GeradorDeBonecos(hash.get("bonecos"));						
		}		
	}
		
}
