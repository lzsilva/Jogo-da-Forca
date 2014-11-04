package gui.panels;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

import entidades.Palavra;
import gui.dialogs.DialogTipoMultimidia;
import gui.frames.FrameConfigurarPalavra;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelPalavra extends JPanel {
	private JTextField textFieldPalavra;
	private JTextField textFieldDica;
	private JButton buttonConfigurar;
	private JButton buttonDeletar;
	private Palavra palavra;
	private PainelFase painelFase;
	/**
	 * Create the panel.
	 */
	public PanelPalavra(final PainelFase painelFase) {
		setBorder(null);		
		textFieldPalavra = new JTextField();
		textFieldPalavra.setColumns(10);
		setMaximumSize(new Dimension(700, 100));
		
		palavra = new Palavra();
		
		JLabel lblPalavra = new JLabel("Palavra:");
		
		textFieldDica = new JTextField();
		textFieldDica.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Pista:");
		
		buttonConfigurar = new JButton("Configurar");
		buttonConfigurar.addActionListener(new Configurar());
		
		JButton buttonDeletar = new JButton("Deletar");
		buttonDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				painelFase.remove(getThis());
				
			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPalavra)
						.addComponent(textFieldPalavra, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textFieldDica, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(buttonConfigurar)
							.addGap(18)
							.addComponent(buttonDeletar)
							.addGap(89))
						.addComponent(lblNewLabel))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(20)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblPalavra)
						.addComponent(lblNewLabel))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldPalavra, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldDica, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(buttonConfigurar)
						.addComponent(buttonDeletar))
					.addContainerGap(64, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
	
	public Palavra getPalavra(){
		return palavra;
	}
	
	public void atualizaPanel(){
		textFieldPalavra.setText(palavra.getPalavra());
		textFieldDica.setText(palavra.getDica());
	}
	
	private PanelPalavra getThis(){
		return this;
	}
	
	/*CLASSES INTERNAR PARA TRATAMENTO DE EVETO*/	
	
	private class Configurar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			palavra.setPalavra(textFieldPalavra.getText());
			palavra.setDica(textFieldDica.getText());
			FrameConfigurarPalavra frameConfigurarPalavra = new FrameConfigurarPalavra(getThis()); 
		}
	
	}
	
}
