package gui.frames;

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
import java.awt.Font;
import javax.swing.JButton;

public class FrameConfigurarPalavra extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textFieldDicaMultimidia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
		            // Set System L&F
			        UIManager.setLookAndFeel(
			            UIManager.getSystemLookAndFeelClassName());
			    } 
			    catch (UnsupportedLookAndFeelException e) {
			       // handle exception
			    }
			    catch (ClassNotFoundException e) {
			       // handle exception
			    }
			    catch (InstantiationException e) {
			       // handle exception
			    }
			    catch (IllegalAccessException e) {
			       // handle exception
			    }
				
			
				try {
					FrameConfigurarPalavra frame = new FrameConfigurarPalavra();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameConfigurarPalavra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 648, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panelCentral = new JPanel();
		panelCentral.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Configurar Palavra", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JButton btnNewButton_2 = new JButton("New button");
		
		JButton btnNewButton_3 = new JButton("New button");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(18, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(btnNewButton_3)
							.addGap(18)
							.addComponent(btnNewButton_2)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(panelCentral, GroupLayout.PREFERRED_SIZE, 596, GroupLayout.PREFERRED_SIZE)
							.addGap(8))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelCentral, GroupLayout.PREFERRED_SIZE, 353, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_2)
						.addComponent(btnNewButton_3))
					.addContainerGap())
		);
		
		JLabel lblPalavra = new JLabel("Palavra:");
		lblPalavra.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Dica:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setColumns(10);
		
		JLabel lblQuantidadeDeErros = new JLabel("Mensagem ao Errar Palavra:");
		lblQuantidadeDeErros.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblMensagemAoAcertar = new JLabel("Mensagem ao Acertar Palavra:");
		lblMensagemAoAcertar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_2.setColumns(10);
		
		JSeparator separator = new JSeparator(JSeparator.VERTICAL);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Quantidade M\u00E1xima de Erros:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_2 = new JLabel("Dica Multim\u00EDdia:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textFieldDicaMultimidia = new JTextField();
		textFieldDicaMultimidia.setEditable(false);
		textFieldDicaMultimidia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldDicaMultimidia.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JSeparator separator_1 = new JSeparator(JSeparator.VERTICAL);
		GroupLayout gl_panelCentral = new GroupLayout(panelCentral);
		gl_panelCentral.setHorizontalGroup(
			gl_panelCentral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCentral.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel)
						.addComponent(lblMensagemAoAcertar)
						.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING, false)
							.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
							.addComponent(textField_2)
							.addComponent(textField))
						.addComponent(lblPalavra)
						.addComponent(lblQuantidadeDeErros))
					.addGap(86)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 3, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelCentral.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_panelCentral.createSequentialGroup()
								.addGap(154)
								.addComponent(btnNewButton)
								.addContainerGap(56, Short.MAX_VALUE))
							.addGroup(gl_panelCentral.createSequentialGroup()
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnNewButton_1)
								.addGap(51)))
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addGap(40)
							.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
								.addComponent(spinner, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel_2)
								.addComponent(textFieldDicaMultimidia, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
							.addGap(51))))
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
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addGap(21)
							.addComponent(lblNewLabel)
							.addGap(7)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblMensagemAoAcertar))
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addGap(18)
							.addComponent(lblNewLabel_2)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textFieldDicaMultimidia, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
					.addGap(6)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelCentral.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_panelCentral.createSequentialGroup()
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(lblQuantidadeDeErros)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(47, Short.MAX_VALUE))
							.addGroup(gl_panelCentral.createSequentialGroup()
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnNewButton)
								.addGap(49)))
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addGap(30)
							.addComponent(btnNewButton_1)
							.addContainerGap(121, Short.MAX_VALUE))))
		);
		panelCentral.setLayout(gl_panelCentral);
		contentPane.setLayout(gl_contentPane);
	}
}
