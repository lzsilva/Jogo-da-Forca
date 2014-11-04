package entidades;

import java.util.ArrayList;

public class Jogo {
	
	public Jogo(){
		fases = new ArrayList<Fase>();
	}

	
	private ArrayList<Fase> fases;
	
	private String titulo;
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	
	public ArrayList<Fase> getFases() {
		return fases;
	}

	public void setFases(ArrayList<Fase> fases) {
		this.fases = fases;
	}
	
	public void addFase(Fase fase){
		fases.add(fase);
	}

}
