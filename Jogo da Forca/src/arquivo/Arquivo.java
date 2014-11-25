package arquivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

public class Arquivo {
	
	public static void copiaArquivo(File origem, File destino) throws IOException{
		InputStream in = new FileInputStream(origem);
        OutputStream out = new FileOutputStream(destino);
        byte[] buf = new byte[1024];
        int len;
        while ((len = in.read(buf)) > 0) {
            out.write(buf, 0, len);
        }        
        in.close();
        out.close();
	}
	
	public static String lerArquivo(File file) {
			String linhaAuxiliar = "";
		try {
			Reader reader;
			reader = new InputStreamReader(new FileInputStream(file), "UTF-8");
			BufferedReader bf = new BufferedReader(reader);
			String linha = null;			
			while((linha = bf.readLine()) != null ) {  
				linhaAuxiliar = linhaAuxiliar + linha +"\n";
			}
			reader.close();
			bf.close();
		} catch (UnsupportedEncodingException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return linhaAuxiliar;
	}
	
	public static void salvarArquivo(String arquivo, File destino){
		PrintWriter pw;
		try {
			pw = new PrintWriter (new OutputStreamWriter (new FileOutputStream (destino), "UTF-8"));
			pw.append(arquivo);
			pw.flush();	
			pw.close();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
}
