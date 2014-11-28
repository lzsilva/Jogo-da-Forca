package controladores;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTabbedPane;

import entidades.Fase;
import entidades.Jogo;
import gui.panels.PainelFase;

public class ControladorDeJogo {
	
	private Jogo jogo;
	private List<Fase> fases;
	private JTabbedPane tabbed;
	private ControladorDeFase controladorDeFase;
	
	public ControladorDeJogo(JTabbedPane tabbed){
		this.tabbed = tabbed;
		jogo = new Jogo();
		controladorDeFase = new ControladorDeFase();
	}	
	
	
	public Jogo getJogo(){		
		for(Component component: tabbed.getComponents()){
			if (component instanceof PainelFase){				
				jogo.addFase(controladorDeFase.getFase((PainelFase) component));			
			}			
		}		
	
		return jogo;
	}

}
