package gui.panels;

import java.awt.Component;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;

import entidades.Palavra;

public class PainelFase extends JPanel {

	private JScrollPane scrollPane;
	private JPanel panel;
	
	/**
	 * Create the panel.
	 */
	public PainelFase() {		
		
		scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(13)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		panel = new JPanel();
		panel.setBorder(null);
		scrollPane.setViewportView(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		setLayout(groupLayout);
		addPalavra();

	}
	
	@Override
	public void remove(Component component){
		panel.remove(component);
		panel.repaint();
		panel.revalidate();
	}
	
	@Override
	public Component[] getComponents(){
		return panel.getComponents();
	}
	
	public void addPalavra(){
		PanelPalavra panelPalavra = new PanelPalavra(this);
		panelPalavra.setBorder(null);
		panel.add(panelPalavra);
	}	
}
