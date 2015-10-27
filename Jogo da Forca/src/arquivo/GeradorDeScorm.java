package arquivo;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import controladores.GeradorDeIdentificadores;
import entidades.Fase;
import entidades.Jogo;
import entidades.Palavra;

public class GeradorDeScorm {
	
	private InputStream leitura;
	private File escrita;
	private String arquivoLido;
	private Jogo jogo;
	
	public GeradorDeScorm(Jogo jogo, File destino){
		this.jogo = jogo;
		
		leitura = GeradorDeScorm.class.getResourceAsStream("/scorm/imsmanifest.xml");		
		escrita = new File(destino.getAbsolutePath()+"/imsmanifest.xml");
		
		EntidadeScorm entidadeScorm = new EntidadeScorm();
		arquivoLido = Arquivo.lerArquivo(leitura);
		arquivoLido = arquivoLido.replace("?titulo",jogo.getTitulo());
		arquivoLido = arquivoLido.replace("?userFiles",getUserFiles());
		arquivoLido = arquivoLido.replace("?manifestIdentifier",entidadeScorm.getManifestIdentifier());		
		arquivoLido = arquivoLido.replace("?orgIdentifier",entidadeScorm.getOrgIdentifier());
		arquivoLido = arquivoLido.replace("?itemIdentifier",entidadeScorm.getItemIdentifier());
		arquivoLido = arquivoLido.replace("?scoIdentifier",entidadeScorm.getScoIdentifier());
		arquivoLido = arquivoLido.replace("?b0Identifier",entidadeScorm.getB0Identifier());
		arquivoLido = arquivoLido.replace("?b1Identifier",entidadeScorm.getB1Identifier());
		arquivoLido = arquivoLido.replace("?b2Identifier",entidadeScorm.getB2Identifier());
		arquivoLido = arquivoLido.replace("?b3Identifier",entidadeScorm.getB3Identifier());
		arquivoLido = arquivoLido.replace("?estiloIdentifier",entidadeScorm.getEstiloIdentifier());
		arquivoLido = arquivoLido.replace("?scriptIdentifier",entidadeScorm.getScriptIdentifier());
		arquivoLido = arquivoLido.replace("?userResources",getUserResources());	
		arquivoLido = arquivoLido.replace("?scoName",destino.getName()+".html");
		Arquivo.salvarArquivo(arquivoLido, escrita);
		
		File adlcpOrigem = new File("src/scorm/adlcp_rootv1p2.xsd");
		File ims_xmlOrigem = new File("src/scorm/ims_xml.xsd");
		File imscpOrigem = new File("src/scorm/imscp_rootv1p1p2.xsd");
		File imsmdOrigem = new File("src/scorm/imsmd_rootv1p2p1.xsd");
		
		File adlcp = new File(destino.getAbsolutePath()+"/adlcp_rootv1p2.xsd");
		File ims_xml = new File(destino.getAbsolutePath()+"/ims_xml.xsd");
		File imscp = new File(destino.getAbsolutePath()+"/imscp_rootv1p1p2.xsd");
		File imsmd = new File(destino.getAbsolutePath()+"/imsmd_rootv1p2p1.xsd");
		
		try {
			Arquivo.copiaArquivo(adlcpOrigem, adlcp);
			Arquivo.copiaArquivo(ims_xmlOrigem, ims_xml);
			Arquivo.copiaArquivo( imscpOrigem, imscp);
			Arquivo.copiaArquivo(imsmdOrigem, imsmd);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getUserFiles(){		
		ArrayList<Fase> fases = jogo.getFases();
	
		String userFiles =""; 
		
		for (Fase f : fases) {
			ArrayList<Palavra> palavras = f.getPalavras();
			for (Palavra p : palavras) {
				if(p.getURLMultimidia()!=null){
					String nomeArquivo = new File(p.getURLMultimidia()).getName().replace(" ","");
					
					if(p.getTipoMultimidia().equalsIgnoreCase("imagem")){
						userFiles= userFiles + "<file href=\"recursos/multimidia/imagens/"+nomeArquivo+"\" />\n";
					}
					else if(p.getTipoMultimidia().equalsIgnoreCase("video")){
						userFiles= userFiles + "<file href=\"recursos/multimidia/videos/"+nomeArquivo+"\" />\n";
					}
					else if(p.getTipoMultimidia().equalsIgnoreCase("audio")){
						userFiles= userFiles + "<file href=\"recursos/multimidia/audios/"+nomeArquivo+"\" />\n";
					}
				}
			}
		}
		return userFiles;
	}
	
	public String getUserResources(){
		ArrayList<Fase> fases = jogo.getFases();
		
		String userResources =""; 
		
		for (Fase f : fases) {
			ArrayList<Palavra> palavras = f.getPalavras();
			for (Palavra p : palavras) {
				if(p.getURLMultimidia()!=null){
					
					String nomeArquivo = new File(p.getURLMultimidia()).getName().replace(" ","");
					String identifier = GeradorDeIdentificadores.getIdentificador("RES");
					
					if(p.getTipoMultimidia().equalsIgnoreCase("imagem")){						
						userResources = userResources + "<resource identifier=\""+identifier+"\" type=\"webcontent\" adlcp:scormtype=\"asset\""
								+ " href=\"recursos/multimidia/imagens/"+nomeArquivo+"\" >\n \t <file href=\"recursos/multimidia/imagens/"+nomeArquivo+"\"/>\n"
										+ "</resource>"; 
					}
					else if(p.getTipoMultimidia().equalsIgnoreCase("video")){
						userResources = userResources + "<resource identifier=\""+identifier+"\" type=\"webcontent\" adlcp:scormtype=\"asset\""
								+ " href=\"recursos/multimidia/videos/"+nomeArquivo+"\" >\n \t <file href=\"recursos/multimidia/imagens/"+nomeArquivo+"\"/>\n"
										+ "</resource>"; 
					}
					else if(p.getTipoMultimidia().equalsIgnoreCase("audio")){
						userResources = userResources + "<resource identifier=\""+identifier+"\" type=\"webcontent\" adlcp:scormtype=\"asset\""
								+ " href=\"recursos/multimidia/audios/"+nomeArquivo+"\" >\n \t <file href=\"recursos/multimidia/imagens/"+nomeArquivo+"\"/>\n"
										+ "</resource>"; 
					}
				}
			}
		}
		return userResources;
		
	}
	
	private class EntidadeScorm{
		
		private String manifestIdentifier;
		private String titulo;
		private String orgIdentifier;
		private String itemIdentifier;
		private String scoIdentifier;
		private String scoName;
		private String b0Identifier;
		private String b1Identifier;
		private String b2Identifier;
		private String b3Identifier;
		private String estiloIdentifier;
		private String scriptIdentifier;
		
		public EntidadeScorm(){
			manifestIdentifier = GeradorDeIdentificadores.getIdentificador("MAN");
			orgIdentifier = GeradorDeIdentificadores.getIdentificador("ORG");
			itemIdentifier = GeradorDeIdentificadores.getIdentificador("ITEM");
			scoIdentifier = GeradorDeIdentificadores.getIdentificador("SCO");
			b0Identifier = GeradorDeIdentificadores.getIdentificador("B0");
			b1Identifier = GeradorDeIdentificadores.getIdentificador("B1");
			b2Identifier = GeradorDeIdentificadores.getIdentificador("B2");
			b3Identifier = GeradorDeIdentificadores.getIdentificador("B3");
			estiloIdentifier = GeradorDeIdentificadores.getIdentificador("EST");
			scriptIdentifier = GeradorDeIdentificadores.getIdentificador("SCR");
		}
		
		public String getManifestIdentifier(){
			return manifestIdentifier;
		}

		public String getTitulo() {
			return titulo;
		}

		public String getOrgIdentifier() {
			return orgIdentifier;
		}

		public String getItemIdentifier() {
			return itemIdentifier;
		}

		public String getScoIdentifier() {
			return scoIdentifier;
		}

		public String getScoName() {
			return scoName;
		}

		public String getB0Identifier() {
			return b0Identifier;
		}

		public String getB1Identifier() {
			return b1Identifier;
		}

		public String getB2Identifier() {
			return b2Identifier;
		}

		public String getB3Identifier() {
			return b3Identifier;
		}

		public String getEstiloIdentifier() {
			return estiloIdentifier;
		}

		public String getScriptIdentifier() {
			return scriptIdentifier;
		}
		
	}

}
