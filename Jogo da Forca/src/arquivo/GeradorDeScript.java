package arquivo;

import java.io.File;
import java.util.ArrayList;

import entidades.Fase;
import entidades.Jogo;
import entidades.Palavra;

public class GeradorDeScript {
	private Jogo jogo;
	private File destino;
	private File arquivoForcaLido;
	private File arquivoForcaGerado;
	private String stringJS;
	
	public GeradorDeScript(Jogo jogo, File destino){
		this.jogo = jogo;
		this.destino = arquivoForcaGerado;
		arquivoForcaLido = new File("src/recursos/forcajs.js");		
		arquivoForcaGerado = new File(destino.getAbsolutePath()+"/forcajs.js");
		stringJS = Arquivo.lerArquivo(arquivoForcaLido);
		stringJS = stringJS.replace("?fases", getStringFases());		
		Arquivo.salvarArquivo(stringJS, arquivoForcaGerado);
	}
	
	private String getStringFases(){
		String stJogo = "";
		ArrayList<Fase> fases = jogo.getFases();
		int contadorFases = 1;
		int contadorPalavras = 1;
		for (Fase f : fases) {
			stJogo = stJogo + "var " + "fase" + contadorFases + " = new Fase();\n\t\t";
			stJogo = stJogo + "jogo.arrayFase.push(fase" + contadorFases + ");\n\t\t";
			ArrayList<Palavra> palavras = f.getPalavras();
			
			for (Palavra p : palavras) {
				
				String multimidia = "";
				if(p.getURLMultimidia()!=null){
					File file = new File(p.getURLMultimidia());
					multimidia = file.getName();
					multimidia = multimidia.replace(" ","");
				}
				
				stJogo = stJogo + "var palavra" + contadorPalavras
						+ " = new Palavra('" + p.getPalavra() +"','"
						+ p.getDica() +"',"+p.getQuantidadeDeErrosTolerados()+",'"+p.getTipoMultimidia()+"','"
						+multimidia+"','"+p.getMensagemCerta()+"','"+p.getMensagemErrada()+"');\n\t\t";
				stJogo = stJogo+"fase"+contadorFases+".arrayPalavra.push("+"palavra"+contadorPalavras+");\n\t\t";
				contadorPalavras++;
			}
			stJogo = stJogo+"\n";
			contadorFases++;
		}
		return(stJogo);
	}
	
}
