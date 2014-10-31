package entidades;

import java.util.ArrayList;

public class Fase {
	
	private ArrayList<Palavra> palavras;
	
	private String mensagem; //Mensagem exibida após conclusão da fase.	
	
	public ArrayList<Palavra> getPalavras() {
		return palavras;
	}

	public void setPalavras(ArrayList<Palavra> palavras) {
		this.palavras = palavras;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Fase(){
		palavras = new ArrayList<Palavra>();
	}

}
