package controladores;

import java.awt.Component;
import entidades.Fase;
import gui.panels.PainelFase;
import gui.panels.PanelPalavra;

public class ControladorDeFase {
	
	protected Fase getFase(PainelFase painelFase){
		Fase fase = new Fase();	
		for(Component componente: painelFase.getComponents()){			
			if(componente instanceof PanelPalavra){				
				PanelPalavra painelPalavra = (PanelPalavra) componente;
				fase.addPalavra(painelPalavra.getPalavra());
			}			
		}		
		return fase;
	}
}
