package arquivo;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import entidades.Estilo;

public class GeradorDeCSS {

	private File destino;
	private InputStream arquivoCSSLido;
	private File arquivoCSSGerado;
	private Estilo estilo;
	private String stringCSS;
	public GeradorDeCSS(Estilo estilo,File destino) {
		this.estilo = estilo;
		
		this.destino = arquivoCSSGerado;
		arquivoCSSLido = GeradorDeCSS.class.getResourceAsStream("/recursos/estilo.css");
		arquivoCSSGerado = new File(destino.getAbsolutePath() + "/estilo.css");		
		stringCSS = Arquivo.lerArquivo(arquivoCSSLido);	
		stringCSS = stringCSS.replace("?bgColor", estilo.getBackgroundColor());
		stringCSS = stringCSS.replace("?corTitulo", estilo.getCorTitulo());
		stringCSS = stringCSS.replace("?corLabelFase", estilo.getCorLabelFase());
		stringCSS = stringCSS.replace("?corAcertos", estilo.getCorAcertos());
		stringCSS = stringCSS.replace("?corErros", estilo.getCorErros());
		stringCSS = stringCSS.replace("?corLetrasPalavra",estilo.getCorLetrasPalavra());
		stringCSS = stringCSS.replace("?corFundoTecla",estilo.getCorFundoTeclas());
		stringCSS = stringCSS.replace("?corLetraTecla",estilo.getCorLetraTecla());
		stringCSS = stringCSS.replace("?corHover",estilo.getCorHover());
		stringCSS = stringCSS.replace("?corDica",estilo.getCorDica());
		Arquivo.salvarArquivo(stringCSS, arquivoCSSGerado);
		
	}

}
