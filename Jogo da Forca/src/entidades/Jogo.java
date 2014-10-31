package entidades;

import java.util.ArrayList;

public class Jogo {
	
	private ArrayList<Fase> fases;
	
	private String titulo;
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Jogo(){
		fases = new ArrayList<Fase>();
	}

	public ArrayList<Fase> getFases() {
		return fases;
	}

	public void setFases(ArrayList<Fase> fases) {
		this.fases = fases;
	}

}
