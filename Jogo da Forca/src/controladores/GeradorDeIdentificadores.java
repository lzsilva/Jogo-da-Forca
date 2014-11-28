package controladores;

import java.util.Random;

public class GeradorDeIdentificadores {

	static char [] caracteres= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s',
			't','u','v','w','x','x','z','z','0','1','2','3','4','5','6','7','8','9'};
	
	public static String getIdentificador(String inicio){
		String identificador = inicio+"-";
		Random random = new Random();
		for (int i = 0; i < 50; i++ ){
			if ((i != 0) && ( (i % 10) == 0)){
				identificador = identificador + "-";
			}
			else identificador = identificador + caracteres[random.nextInt(35)];
		  
		}		
		return identificador.toUpperCase();
	}
	
}
