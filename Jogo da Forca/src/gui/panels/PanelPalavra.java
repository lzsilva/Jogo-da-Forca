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

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelPalavra extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JButton buttonMultimidia;
	private JButton buttonConfigurar;
	private JButton buttonDeletar;
	private Palavra palavra;

	/**
	 * Create the panel.
	 */
	public PanelPalavra() {
		setBorder(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		setMaximumSize(new Dimension(700, 100));
		
		palavra = new Palavra();
		
		JLabel lblPalavra = new JLabel("Palavra:");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Pista:");
		
		buttonMultimidia = new JButton("Multim\u00EDdia");
		buttonMultimidia.addActionListener(new Multimidia());
		
		buttonConfigurar = new JButton("Configurar");
		
		JButton buttonDeletar = new JButton("Deletar");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPalavra)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(buttonMultimidia)
							.addGap(18)
							.addComponent(buttonConfigurar)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(buttonDeletar))
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
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(buttonMultimidia)
						.addComponent(buttonConfigurar)
						.addComponent(buttonDeletar))
					.addContainerGap(15, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
	
	/*CLASSES INTERNAR PARA TRATAMENTO DE EVETO*/
	
	private class Multimidia implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			DialogTipoMultimidia dialog = new DialogTipoMultimidia(palavra);
			dialog.setVisible(true);
		}
	}
}
