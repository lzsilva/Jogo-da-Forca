package controladores;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import arquivo.Compactador;
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
	
	}
	
	public void criaJogo(){
		if (hash!=null){			
			new GeradorDeMultimidia(jogo, hash.get("multimidia"));
			new GeradorDeScript(jogo,hash.get("script"));
			new GeradorDeHTML(hash.get("raiz"),jogo.getTitulo());
			new GeradorDeCSS(estilo, hash.get("css"));
			new GeradorDeBonecos(hash.get("bonecos"));						
		}		
	}
	
	public void criaPacoteScorm(){
		if (hash!=null){
			new GeradorDeScorm(jogo,hash.get("raiz"));
			new GeradorDeMultimidia(jogo, hash.get("multimidia"));
			new GeradorDeScript(jogo,hash.get("script"));
			new GeradorDeHTML(hash.get("raiz"),jogo.getTitulo());
			new GeradorDeCSS(estilo, hash.get("css"));
			new GeradorDeBonecos(hash.get("bonecos"));
			Compactador compactador = new Compactador();
			try {
				compactador.zip(hash.get("raiz"),new File("C:/Users/Luiz/Desktop/"+hash.get("raiz").getName()+".zip"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
		
}
