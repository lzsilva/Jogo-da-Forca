package gui.dialogs;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.Font;

import javax.swing.border.EtchedBorder;

import entidades.Palavra;
import arquivo.filechoose.EscolherArquivo;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class DialogTipoMultimidia extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	private JPanel panel;
	
	private JRadioButton radioAudio;
	
	private JRadioButton radioVideo;
	
	private JRadioButton radioImagem;
	
	private ButtonGroup buttonGroup;
	
	private String escolha;
	
	private Palavra palavra;

	/**
	 * Create the dialog.
	 */
	public DialogTipoMultimidia(final Palavra palavra) {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setVisible(true);
		setBounds(100, 100, 539, 303);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		this.palavra = palavra;
		
		panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		JLabel labelMidia = new JLabel("Qual o tipo de m\u00EDdia deseja adicionar \u00E0 dica?");
		labelMidia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JPanel panelArquivo = new JPanel();
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(128)
					.addComponent(labelMidia)
					.addContainerGap(118, Short.MAX_VALUE))
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(137)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(127, Short.MAX_VALUE))
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(89)
					.addComponent(panelArquivo, GroupLayout.PREFERRED_SIZE, 344, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(80, Short.MAX_VALUE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(labelMidia)
					.addGap(33)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panelArquivo, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
					.addGap(0, 0, Short.MAX_VALUE))
		);
		
		JLabel labelInformaAssociacao = new JLabel("J\u00E1 existe um arquivo multim\u00EDdia associado \u00E0 palavra.");
		labelInformaAssociacao.setForeground(Color.RED);
		labelInformaAssociacao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel labelArquivo = new JLabel(palavra.getURLMultimidia());
		labelArquivo.setHorizontalAlignment(SwingConstants.CENTER);
		palavra.getURLMultimidia();
		labelArquivo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel labelInformaTroca = new JLabel("Para substituir esse arquivo pressione \"OK\".");
		labelInformaTroca.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GroupLayout gl_panelArquivo = new GroupLayout(panelArquivo);
		gl_panelArquivo.setHorizontalGroup(
			gl_panelArquivo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelArquivo.createSequentialGroup()
					.addGroup(gl_panelArquivo.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelArquivo.createSequentialGroup()
							.addGap(14)
							.addComponent(labelInformaAssociacao))
						.addGroup(gl_panelArquivo.createSequentialGroup()
							.addGap(40)
							.addComponent(labelInformaTroca)))
					.addContainerGap())
				.addGroup(gl_panelArquivo.createSequentialGroup()
					.addGap(14)
					.addComponent(labelArquivo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(14))
		);
		gl_panelArquivo.setVerticalGroup(
			gl_panelArquivo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelArquivo.createSequentialGroup()
					.addContainerGap()
					.addComponent(labelInformaAssociacao)
					.addGap(11)
					.addComponent(labelArquivo)
					.addGap(11)
					.addComponent(labelInformaTroca)
					.addContainerGap(19, Short.MAX_VALUE))
		);
		panelArquivo.setLayout(gl_panelArquivo);
		
		if(palavra.getURLMultimidia()==null){
			panelArquivo.setVisible(false);
		}
		
		radioAudio = new JRadioButton("\u00C1udio");
		radioAudio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		radioImagem = new JRadioButton("Imagem");
		radioImagem.setFont(new Font("Tahoma", Font.PLAIN, 14));
		radioImagem.setSelected(true);
		
		radioVideo = new JRadioButton("V\u00EDdeo");
		radioVideo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		buttonGroup = new ButtonGroup();
		
		buttonGroup.add(radioAudio);
		buttonGroup.add(radioImagem);
		buttonGroup.add(radioVideo);
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(radioAudio)
					.addGap(18)
					.addComponent(radioImagem)
					.addGap(18)
					.addComponent(radioVideo)
					.addContainerGap(93, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(radioAudio)
						.addComponent(radioImagem)
						.addComponent(radioVideo))
					.addContainerGap(18, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						getThis().dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						if(radioAudio.isSelected()){
							escolha = "audio";							
						}
						
						if(radioVideo.isSelected()){
							escolha = "video";							
						}
						
						if(radioImagem.isSelected()){
							escolha = "imagem";							
						}
						
						EscolherArquivo escolherArquivo = new EscolherArquivo(escolha,palavra);
						getThis().dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
	private JDialog getThis(){
		return this;
	}
}
