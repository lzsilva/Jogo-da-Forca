package entidades;

public class Palavra {
	
	private String palavra;
	
	private String dica;
	
	private String tipoMultimidia;
	
	private String URLMultimidia;
	
	private String mensagemCerta; //Mensagem ao acertar palavra.
	
	private String mensagemErrada; //Mensagem ao errar palavra.
	
	private int quantidadeDeErrosTolerados;		
	
	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}

	public String getDica() {
		return dica;
	}

	public void setDica(String dica) {
		this.dica = dica;
	}

	public String getTipoMultimidia() {
		return tipoMultimidia;
	}

	public void setTipoMultimidia(String tipoMultimidia) {
		this.tipoMultimidia = tipoMultimidia;
	}

	public String getURLMultimidia() {
		return URLMultimidia;
	}

	public void setURLMultimidia(String uRLMultimidia) {
		URLMultimidia = uRLMultimidia;
	}

	public String getMensagemCerta() {
		return mensagemCerta;
	}

	public void setMensagemCerta(String mensagemCerta) {
		this.mensagemCerta = mensagemCerta;
	}

	public String getMensagemErrada() {
		return mensagemErrada;
	}

	public void setMensagemErrada(String mensagemErrada) {
		this.mensagemErrada = mensagemErrada;
	}

	public int getQuantidadeDeErrosTolerados() {
		return quantidadeDeErrosTolerados;
	}

	public void setQuantidadeDeErrosTolerados(int quantidadeDeErrosTolerados) {
		this.quantidadeDeErrosTolerados = quantidadeDeErrosTolerados;
	}

	

}
