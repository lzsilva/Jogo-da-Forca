package arquivo;
import java.io.BufferedInputStream;  
import java.io.BufferedOutputStream;  
import java.io.File;  
import java.io.FileInputStream;  
import java.io.FileNotFoundException;  
import java.io.FileOutputStream;  
import java.io.IOException;  
import java.util.zip.ZipEntry;  
import java.util.zip.ZipOutputStream;  
  
public class Compactador {  
    private ZipOutputStream zos = null;  
  
    public void zip(File origem, File destinoZIP) throws IOException {  
  
        zos = new ZipOutputStream(new FileOutputStream(destinoZIP));  
        addFile(origem, zos, origem);  
        zos.flush();  
        zos.close();
        deleteDir(origem);
    }  
  
    public void addFile(File arquivo, ZipOutputStream zos, File pastaPrincipal)  
            throws IOException {  
  
        if (arquivo.isDirectory()) {  
  
            for (File a : arquivo.listFiles()) {  
                addFile(a, zos, pastaPrincipal);  
            }  
  
        } else {  
  
            final int TAMANHO_BUFFER = 4096; // 4kb  
            int cont;  
            byte[] dados = new byte[TAMANHO_BUFFER];  
  
            BufferedInputStream origem = null;  
            try {  
                origem = new BufferedInputStream(new FileInputStream(arquivo),  
                        TAMANHO_BUFFER);  
  
                String nomeEntrada = arquivo.getAbsolutePath();  
  
                System.out.println(nomeEntrada);  
  
                if (pastaPrincipal.isDirectory()) {  
                    nomeEntrada = nomeEntrada.substring(pastaPrincipal  
                            .getAbsolutePath().length() + 1);  
                } else {  
                    nomeEntrada = arquivo.getName();  
                }  
  
                zos.putNextEntry(new ZipEntry(nomeEntrada));  
  
                while ((cont = origem.read(dados, 0, TAMANHO_BUFFER)) != -1) {  
  
                    zos.write(dados, 0, cont);  
                }  
  
            } finally {  
                if (origem != null) {  
                	origem.close();                	
                }  
            }  
        }  
    }
    public static boolean deleteDir(File dir) {
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i=0; i<children.length; i++) { 
               boolean success = deleteDir(new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
        }       
        return dir.delete();
    }


}