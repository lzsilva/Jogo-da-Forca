package gui.frames;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import javax.swing.border.TitledBorder;

import entidades.Estilo;

public class FrameConfiguraAparencia extends JFrame {
	
	private static Estilo estilo;
	
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_6;
	private JPanel panel_7;
	private JPanel panel_8;
	private JPanel panel_9;
	private JPanel panel_10;

	private JButton botaoCorTitulo;

	private JButton botaoLabelFase;

	private JButton botaoAcertos;

	private JButton botaoErros;

	private JButton botaoCorLetrasPalavra;

	private JButton botaoCorFundoTeclado;

	private JButton botaoCorLetraTecla;

	private JButton botaoCorDica;

	private JButton botaoHover;

	private JButton botaoFundoPagina;
	
	public FrameConfiguraAparencia(Estilo estilo) {
		
		setSize(815,480);
		
		this.estilo = estilo;
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Cores", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(59)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(73, Short.MAX_VALUE))
		);
		
		JLabel lblCorDeFundo = new JLabel("Cor de fundo da p\u00E1gina:");
		lblCorDeFundo.setFont(new Font("Arial", Font.PLAIN, 12));
		
		botaoFundoPagina = new JButton("Escolher");
		botaoFundoPagina.setFont(new Font("Arial", Font.PLAIN, 12));
		botaoFundoPagina.addActionListener(new SetaCor());		
		
		
		
		botaoCorTitulo = new JButton("Escolher");
		botaoCorTitulo.addActionListener(new SetaCor());
		
		botaoLabelFase = new JButton("Escolher");
		botaoLabelFase.addActionListener(new SetaCor());
		
		botaoAcertos = new JButton("Escolher");
		botaoAcertos.addActionListener(new SetaCor());
		
		botaoErros = new JButton("Escolher");
		botaoErros.addActionListener(new SetaCor());
		
		botaoCorLetrasPalavra = new JButton("Escolher");
		botaoCorLetrasPalavra.addActionListener(new SetaCor());
		
		botaoCorFundoTeclado = new JButton("Escolher");
		botaoCorFundoTeclado.addActionListener(new SetaCor());
		
		botaoCorLetraTecla = new JButton("Escolher");
		botaoCorLetraTecla.addActionListener(new SetaCor());
		
		botaoCorDica = new JButton("Escolher");
		botaoCorDica.addActionListener(new SetaCor());
		
		botaoHover = new JButton("Escolher");
		botaoHover.addActionListener(new SetaCor());
		
		panel_1 = new JPanel();
		
		panel_2 = new JPanel();
		
		
		panel_3 = new JPanel();
		
		
		panel_4 = new JPanel();
		
		
		panel_5 = new JPanel();
		
		
		panel_6 = new JPanel();
		
		
		panel_7 = new JPanel();
		
		
		panel_8 = new JPanel();
		
		
		panel_9 = new JPanel();
		
		
		panel_10 = new JPanel();
		
		setaCorPanels();
		
		
		JLabel lblCorDoTtulo = new JLabel("Cor do t\u00EDtulo:");
		lblCorDoTtulo.setFont(new Font("Arial", Font.PLAIN, 12));
		
		JLabel lblCorLabelFase = new JLabel("Cor label fase:");
		lblCorLabelFase.setFont(new Font("Arial", Font.PLAIN, 12));
		
		JLabel lblCorDosAcertos = new JLabel("Cor dos acertos:");
		lblCorDosAcertos.setFont(new Font("Arial", Font.PLAIN, 12));
		
		JLabel lblCordDosErros = new JLabel("Cord dos erros:");
		lblCordDosErros.setFont(new Font("Arial", Font.PLAIN, 12));
		
		JLabel lblCorDasLetras = new JLabel("Cor das letras: ");
		lblCorDasLetras.setFont(new Font("Arial", Font.PLAIN, 12));
		
		JLabel lblCorFundoDo = new JLabel("Cor do fundo teclado:");
		lblCorFundoDo.setFont(new Font("Arial", Font.PLAIN, 12));
		
		JLabel lblCorDaLetra = new JLabel("Cor da letra do teclado:");
		lblCorDaLetra.setFont(new Font("Arial", Font.PLAIN, 12));
		
		JLabel lblCorDaDica = new JLabel("Cor da dica:");
		lblCorDaDica.setFont(new Font("Arial", Font.PLAIN, 12));
		
		JLabel lblCorDestaqueDa = new JLabel("Cor destaque da tecla:");
		lblCorDestaqueDa.setFont(new Font("Arial", Font.PLAIN, 12));
		
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(42)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblCorDeFundo)
						.addComponent(lblCorDoTtulo, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCorLabelFase, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCorDosAcertos, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCordDosErros, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(botaoCorTitulo, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
								.addComponent(botaoFundoPagina, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(botaoErros, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(botaoAcertos, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(botaoLabelFase, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblCorDasLetras, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCorFundoDo, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCorDaLetra, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCorDaDica, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCorDestaqueDa, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(botaoCorLetrasPalavra, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(botaoCorFundoTeclado, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(botaoCorLetraTecla, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(botaoCorDica, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(botaoHover, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(39, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(37)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
										.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
											.addComponent(lblCorDeFundo)
											.addComponent(botaoFundoPagina, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
									.addGap(18)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
											.addComponent(botaoCorTitulo)
											.addComponent(lblCorDoTtulo, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
										.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
											.addComponent(botaoLabelFase)
											.addComponent(lblCorLabelFase, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
										.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
											.addComponent(botaoAcertos)
											.addComponent(lblCorDosAcertos, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
										.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
											.addComponent(botaoErros)
											.addComponent(lblCordDosErros, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(botaoCorLetrasPalavra)
										.addComponent(lblCorDasLetras, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
											.addComponent(botaoCorFundoTeclado)
											.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
										.addComponent(lblCorFundoDo, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
											.addComponent(botaoCorLetraTecla)
											.addComponent(lblCorDaLetra, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
										.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
											.addComponent(botaoCorDica)
											.addComponent(lblCorDaDica, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
										.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
											.addComponent(botaoHover)
											.addComponent(lblCorDestaqueDa, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)))))
							.addGap(87))))
		);
		panel.setLayout(gl_panel);
		getContentPane().setLayout(groupLayout);
	
	}
	
	private void setaCorPanels(){
		panel_1.setBackground(Color.decode(estilo.getBackgroundColor()));
		panel_2.setBackground(Color.decode(estilo.getCorTitulo()));
		panel_3.setBackground(Color.decode(estilo.getCorLabelFase()));
		panel_4.setBackground(Color.decode(estilo.getCorAcertos()));
		panel_5.setBackground(Color.decode(estilo.getCorErros()));
		panel_6.setBackground(Color.decode(estilo.getCorLetrasPalavra()));
		panel_7.setBackground(Color.decode(estilo.getCorFundoTeclas()));
		panel_8.setBackground(Color.decode(estilo.getCorLetraTecla()));
		panel_9.setBackground(Color.decode(estilo.getCorDica()));
		panel_10.setBackground(Color.decode(estilo.getCorHover()));
	}
	
	private String rgbParaHex(Color color){
		String hexColor = Integer.toHexString(color.getRGB() & 0xffffff);
		if(hexColor.length()<6){
			hexColor= "000000".substring(0,6-hexColor.length())+hexColor;
		}
		return"#"+hexColor;
	}
	
	//Tratamento de Eventos
	
	private class SetaCor implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Color color = JColorChooser.showDialog(getThis(),"Escolha a cor do componente",Color.WHITE);
			if(color!=null){
				
				if(e.getSource() == botaoFundoPagina){					
					estilo.setBackgroundColor(rgbParaHex(color));							
				}
				
				if(e.getSource()==botaoCorTitulo){
					estilo.setCorTitulo(rgbParaHex(color));
				}
				
				if(e.getSource()==botaoLabelFase){
					estilo.setCorLabelFase(rgbParaHex(color));
				}
				
				if(e.getSource()==botaoAcertos){
					estilo.setCorAcertos(rgbParaHex(color));
				}
				
				if(e.getSource()==botaoErros){
					estilo.setCorErros(rgbParaHex(color));
				}
				
				if(e.getSource()==botaoCorLetrasPalavra){
					estilo.setCorLetrasPalavra(rgbParaHex(color));
				}
				
				if(e.getSource()==botaoCorFundoTeclado){
					estilo.setCorFundoTeclas(rgbParaHex(color));
				}
				
				if(e.getSource()==botaoCorLetraTecla){
					estilo.setCorLetraTecla(rgbParaHex(color));
				}
				
				if(e.getSource()==botaoHover){
					estilo.setCorHover(rgbParaHex(color));
				}
				
				if(e.getSource()==botaoCorDica){
					estilo.setCorDica(rgbParaHex(color));
				}
				
				
				setaCorPanels();		
			}
		}
		
	}//Fim da classe interna
	
	private JFrame getThis(){
		return this;
	}
}
