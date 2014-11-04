package gui.frames;

import entidades.Palavra;
import gui.dialogs.DialogTipoMultimidia;
import gui.panels.PanelPalavra;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSeparator;
import javax.swing.SpinnerNumberModel;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameConfigurarPalavra extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField textFieldPalavra;
	private JTextField textFieldDica;
	private JTextField textFieldMensagemAcerto;
	private JTextField textFieldMensagemErro;
	private JTextField textFieldDicaMultimidia;
	private PanelPalavra panelPalavra;
	private final Palavra palavra;
	private JButton buttonAddMultimidia;
	private JSpinner spinnerQtdMaxErro;
	

	/**
	 * Create the frame.
	 */
	public FrameConfigurarPalavra(PanelPalavra panelPalavra) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 718, 476);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.panelPalavra = panelPalavra;
		palavra = this.panelPalavra.getPalavra();
		
		JPanel panelCentral = new JPanel();
		panelCentral.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Configurar Palavra", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JButton buttonOk = new JButton("OK");
		buttonOk.addActionListener(new Confirmar());
		buttonOk.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton buttonCancelar = new JButton("Cancelar");
		buttonCancelar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(53, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(buttonCancelar)
							.addGap(18)
							.addComponent(buttonOk))
						.addComponent(panelCentral, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 629, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelCentral, GroupLayout.PREFERRED_SIZE, 353, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(buttonOk)
						.addComponent(buttonCancelar))
					.addContainerGap())
		);
		
		JLabel lblPalavra = new JLabel("Palavra:");
		lblPalavra.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textFieldPalavra = new JTextField();
		textFieldPalavra.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldPalavra.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Dica:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textFieldDica = new JTextField();
		textFieldDica.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldDica.setColumns(10);
		
		JLabel lblQuantidadeDeErros = new JLabel("Mensagem ao Errar Palavra:");
		lblQuantidadeDeErros.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		int valor = 5;
		int min = 0;
		int max = 26;
		int passo = 1;
		
		SpinnerNumberModel spinnerNumberModel = new SpinnerNumberModel(valor,min,max,passo);
		
		spinnerQtdMaxErro = new JSpinner(spinnerNumberModel);
		spinnerQtdMaxErro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblMensagemAoAcertar = new JLabel("Mensagem ao Acertar Palavra:");
		lblMensagemAoAcertar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textFieldMensagemAcerto = new JTextField();
		textFieldMensagemAcerto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldMensagemAcerto.setColumns(10);
		
		JSeparator separator = new JSeparator(JSeparator.VERTICAL);
		
		textFieldMensagemErro = new JTextField();
		textFieldMensagemErro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldMensagemErro.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Quantidade M\u00E1xima de Erros:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JSeparator separator_1 = new JSeparator(JSeparator.VERTICAL);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Dica Multim\u00EDdia", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout gl_panelCentral = new GroupLayout(panelCentral);
		gl_panelCentral.setHorizontalGroup(
			gl_panelCentral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCentral.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
								.addComponent(lblMensagemAoAcertar)
								.addComponent(lblPalavra)
								.addComponent(lblQuantidadeDeErros))
							.addGap(94)
							.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel)
						.addGroup(gl_panelCentral.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(textFieldMensagemErro, Alignment.LEADING)
							.addComponent(textFieldMensagemAcerto, Alignment.LEADING)
							.addComponent(textFieldDica, Alignment.LEADING)
							.addComponent(textFieldPalavra, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)))
					.addGap(7)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 3, GroupLayout.PREFERRED_SIZE)
					.addGap(40)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
								.addComponent(spinnerQtdMaxErro, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1))
							.addGap(64))
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addContainerGap())))
		);
		gl_panelCentral.setVerticalGroup(
			gl_panelCentral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCentral.createSequentialGroup()
					.addContainerGap()
					.addComponent(separator, GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panelCentral.createSequentialGroup()
					.addGap(33)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelCentral.createParallelGroup(Alignment.TRAILING)
							.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_panelCentral.createSequentialGroup()
								.addComponent(lblPalavra)
								.addGap(8)
								.addComponent(textFieldPalavra, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(spinnerQtdMaxErro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addGap(14)
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textFieldDica, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(21)
							.addComponent(lblMensagemAoAcertar)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textFieldMensagemAcerto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblQuantidadeDeErros)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textFieldMensagemErro, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addGap(37)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)))
					.addGap(42))
		);
		
		buttonAddMultimidia = new JButton("DM");
		buttonAddMultimidia.addActionListener(new Multimidia());
		buttonAddMultimidia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton buttonRemoverMultimidia = new JButton("RM");
		buttonRemoverMultimidia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				palavra.setURLMultimidia(null);
				textFieldDicaMultimidia.setText(null);
			}
		});
		buttonRemoverMultimidia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textFieldDicaMultimidia = new JTextField();
		textFieldDicaMultimidia.setEditable(false);
		textFieldDicaMultimidia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldDicaMultimidia.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Adicionar Multim\u00EDdia");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_3 = new JLabel("Remover Multim\u00EDdia");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(textFieldDicaMultimidia, GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_3))
							.addPreferredGap(ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(buttonAddMultimidia)
								.addComponent(buttonRemoverMultimidia))
							.addContainerGap())))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(19)
					.addComponent(textFieldDicaMultimidia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(21)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(buttonAddMultimidia))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(buttonRemoverMultimidia))
					.addContainerGap(17, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		panelCentral.setLayout(gl_panelCentral);
		contentPane.setLayout(gl_contentPane);
		
		setarFrameConfigurar();
		
	}
	
	private void setarFrameConfigurar(){
		textFieldPalavra.setText(palavra.getPalavra());
		textFieldDica.setText(palavra.getDica());
		textFieldMensagemAcerto.setText(palavra.getMensagemCerta());
		textFieldMensagemErro.setText(palavra.getMensagemErrada());
		textFieldDicaMultimidia.setText(palavra.getURLMultimidia());
	}
	
	private FrameConfigurarPalavra getThis(){
		return this;
	}
	
	/*CLASSES INTERNAS PARA TRATAMENTO DE EVENTOS*/
	
	private class Multimidia implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			DialogTipoMultimidia dialog = new DialogTipoMultimidia(getThis(),palavra);
						
			textFieldDicaMultimidia.setText(palavra.getURLMultimidia());			
		}
	}
	
	private class Confirmar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			palavra.setPalavra(textFieldPalavra.getText());
			palavra.setDica(textFieldDica.getText());
			palavra.setMensagemCerta(textFieldMensagemAcerto.getText());
			palavra.setMensagemErrada(textFieldMensagemErro.getText());
			palavra.setQuantidadeDeErrosTolerados((int) spinnerQtdMaxErro.getValue());			
			panelPalavra.atualizaPanel();
			getThis().dispose();
		}
		
	}
}
