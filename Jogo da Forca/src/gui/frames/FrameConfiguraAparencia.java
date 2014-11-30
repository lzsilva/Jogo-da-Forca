package gui.frames;

import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Color;
import java.awt.Image;
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
	private JPanel panel_12;
	
	public FrameConfiguraAparencia(Estilo estilo) {
		setTitle("Configurar Apar\u00EAncia");
		
		setSize(815,525);
		
		this.estilo = estilo;
		
		ImageIcon mudarCor = new ImageIcon((FramePrincipal.class.getResource("/icones/estilo.png")));
		Image imagemBotaoConfigurarAparencia = mudarCor.getImage();
		mudarCor = new ImageIcon(imagemBotaoConfigurarAparencia.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH)); 	
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Cores", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 781, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 451, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(51, Short.MAX_VALUE))
		);
		
		
		
		JPanel panel_11 = new JPanel();
		
		panel_12 = new JPanel();
		
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_11, GroupLayout.PREFERRED_SIZE, 317, GroupLayout.PREFERRED_SIZE)
					.addGap(66)
					.addComponent(panel_12, GroupLayout.PREFERRED_SIZE, 359, GroupLayout.PREFERRED_SIZE)
					.addGap(55))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(23)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(panel_12, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addComponent(panel_11, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE))
					.addContainerGap(104, Short.MAX_VALUE))
		);
		
		JLabel lblCorDasLetras = new JLabel("Cor das letras: ");
		lblCorDasLetras.setFont(new Font("Arial", Font.PLAIN, 12));
		
		botaoCorLetrasPalavra = new JButton("");
		botaoCorLetrasPalavra.setIcon(mudarCor);
		botaoCorLetrasPalavra.addActionListener(new SetaCor());
		
		
		panel_6 = new JPanel();
		
		JLabel lblCorFundoDo = new JLabel("Cor do fundo teclado:");
		lblCorFundoDo.setFont(new Font("Arial", Font.PLAIN, 12));
		
		botaoCorFundoTeclado = new JButton("");
		botaoCorFundoTeclado.setIcon(mudarCor);
		botaoCorFundoTeclado.addActionListener(new SetaCor());
		
		
		panel_7 = new JPanel();
		
		
		panel_8 = new JPanel();
		
		botaoCorLetraTecla = new JButton("");
		botaoCorLetraTecla.setIcon(mudarCor);
		botaoCorLetraTecla.addActionListener(new SetaCor());
		
		JLabel lblCorDaLetra = new JLabel("Cor da letra do teclado:");
		lblCorDaLetra.setFont(new Font("Arial", Font.PLAIN, 12));
		
		JLabel lblCorDaDica = new JLabel("Cor da dica:");
		lblCorDaDica.setFont(new Font("Arial", Font.PLAIN, 12));
		
		botaoCorDica = new JButton("");
		botaoCorDica.setIcon(mudarCor);
		botaoCorDica.addActionListener(new SetaCor());
		
		
		panel_9 = new JPanel();
		
		JLabel lblCorDestaqueDa = new JLabel("<html>Cor ao passar o mouse:");
		lblCorDestaqueDa.setFont(new Font("Arial", Font.PLAIN, 12));
		
		botaoHover = new JButton("");
		botaoHover.setIcon(mudarCor);
		botaoHover.addActionListener(new SetaCor());
		
		
		panel_10 = new JPanel();
		GroupLayout gl_panel_12 = new GroupLayout(panel_12);
		gl_panel_12.setHorizontalGroup(
			gl_panel_12.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_12.createSequentialGroup()
					.addGroup(gl_panel_12.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_12.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblCorFundoDo, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(botaoCorFundoTeclado, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_panel_12.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblCorDasLetras, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(botaoCorLetrasPalavra))
						.addGroup(Alignment.TRAILING, gl_panel_12.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblCorDaLetra, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(botaoCorLetraTecla)))
					.addGap(10)
					.addGroup(gl_panel_12.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(78, Short.MAX_VALUE))
				.addGroup(gl_panel_12.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_12.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(Alignment.LEADING, gl_panel_12.createSequentialGroup()
							.addComponent(lblCorDestaqueDa, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(botaoHover, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, gl_panel_12.createSequentialGroup()
							.addComponent(lblCorDaDica, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(botaoCorDica)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_12.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(78, Short.MAX_VALUE))
		);
		gl_panel_12.setVerticalGroup(
			gl_panel_12.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_12.createSequentialGroup()
					.addGroup(gl_panel_12.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_12.createSequentialGroup()
							.addGap(25)
							.addGroup(gl_panel_12.createParallelGroup(Alignment.LEADING, false)
								.addComponent(panel_6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(botaoCorLetrasPalavra, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(gl_panel_12.createSequentialGroup()
							.addGap(38)
							.addComponent(lblCorDasLetras)))
					.addGroup(gl_panel_12.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_12.createSequentialGroup()
							.addGap(31)
							.addComponent(lblCorFundoDo)
							.addGap(43)
							.addComponent(lblCorDaLetra))
						.addGroup(gl_panel_12.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_panel_12.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
								.addComponent(botaoCorFundoTeclado))
							.addGap(18)
							.addGroup(gl_panel_12.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
								.addComponent(botaoCorLetraTecla))))
					.addGap(18)
					.addGroup(gl_panel_12.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_12.createSequentialGroup()
							.addGap(13)
							.addComponent(lblCorDaDica))
						.addGroup(gl_panel_12.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(panel_9, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(botaoCorDica, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addGap(23)
					.addGroup(gl_panel_12.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCorDestaqueDa)
						.addGroup(gl_panel_12.createSequentialGroup()
							.addGroup(gl_panel_12.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(panel_10, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(botaoHover, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(207))
		);
		panel_12.setLayout(gl_panel_12);
		
		JLabel lblCorDeFundo = new JLabel("Cor de fundo da p\u00E1gina:");
		lblCorDeFundo.setFont(new Font("Arial", Font.PLAIN, 12));
		
		botaoFundoPagina = new JButton("");
		botaoFundoPagina.setIcon(mudarCor);
		botaoFundoPagina.setFont(new Font("Arial", Font.PLAIN, 12));
		botaoFundoPagina.addActionListener(new SetaCor());
		
		panel_1 = new JPanel();
		
		
		JLabel lblCorDoTtulo = new JLabel("Cor do t\u00EDtulo:");
		lblCorDoTtulo.setFont(new Font("Arial", Font.PLAIN, 12));
		
		
		
		botaoCorTitulo = new JButton("");
		botaoCorTitulo.setIcon(mudarCor);
		botaoCorTitulo.addActionListener(new SetaCor());
		
		panel_2 = new JPanel();
		
		JLabel lblCorLabelFase = new JLabel("Cor label fase:");
		lblCorLabelFase.setFont(new Font("Arial", Font.PLAIN, 12));
		
		botaoLabelFase = new JButton("");
		botaoLabelFase.setIcon(mudarCor);
		botaoLabelFase.addActionListener(new SetaCor());
		
		
		panel_3 = new JPanel();
		
		JLabel lblCorDosAcertos = new JLabel("Cor dos acertos:");
		lblCorDosAcertos.setFont(new Font("Arial", Font.PLAIN, 12));
		
		botaoAcertos = new JButton("");
		botaoAcertos.setIcon(mudarCor);
		botaoAcertos.addActionListener(new SetaCor());
		
		
		panel_4 = new JPanel();
		
		
		panel_5 = new JPanel();
		
		botaoErros = new JButton("");
		botaoErros.setIcon(mudarCor);
		botaoErros.addActionListener(new SetaCor());
		
		JLabel lblCordDosErros = new JLabel("Cord dos erros:");
		lblCordDosErros.setFont(new Font("Arial", Font.PLAIN, 12));
		GroupLayout gl_panel_11 = new GroupLayout(panel_11);
		gl_panel_11.setHorizontalGroup(
			gl_panel_11.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_11.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_11.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_11.createSequentialGroup()
							.addComponent(lblCorDeFundo)
							.addGap(18)
							.addComponent(botaoFundoPagina)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_11.createSequentialGroup()
							.addGroup(gl_panel_11.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_11.createSequentialGroup()
									.addComponent(lblCorDosAcertos, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(botaoAcertos))
								.addGroup(Alignment.LEADING, gl_panel_11.createSequentialGroup()
									.addGap(4)
									.addGroup(gl_panel_11.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_panel_11.createSequentialGroup()
											.addComponent(lblCorLabelFase, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(botaoLabelFase))
										.addGroup(gl_panel_11.createSequentialGroup()
											.addComponent(lblCorDoTtulo, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(botaoCorTitulo))))
								.addGroup(gl_panel_11.createSequentialGroup()
									.addComponent(lblCordDosErros, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(botaoErros)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_11.createParallelGroup(Alignment.LEADING, false)
								.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
								.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
								.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
								.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED, 4, Short.MAX_VALUE)))
					.addGap(28))
		);
		gl_panel_11.setVerticalGroup(
			gl_panel_11.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_11.createSequentialGroup()
					.addGroup(gl_panel_11.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_11.createSequentialGroup()
							.addGap(23)
							.addGroup(gl_panel_11.createParallelGroup(Alignment.LEADING, false)
								.addComponent(botaoFundoPagina, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(gl_panel_11.createSequentialGroup()
							.addGap(34)
							.addComponent(lblCorDeFundo)))
					.addGroup(gl_panel_11.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_11.createSequentialGroup()
							.addGap(29)
							.addComponent(lblCorDoTtulo))
						.addGroup(gl_panel_11.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_panel_11.createParallelGroup(Alignment.LEADING, false)
								.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(botaoCorTitulo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
					.addGroup(gl_panel_11.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_11.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_panel_11.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(botaoLabelFase, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(gl_panel_11.createSequentialGroup()
							.addGap(31)
							.addComponent(lblCorLabelFase)))
					.addGroup(gl_panel_11.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_11.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_panel_11.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_11.createSequentialGroup()
									.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_panel_11.createSequentialGroup()
									.addComponent(botaoAcertos, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED))))
						.addGroup(Alignment.TRAILING, gl_panel_11.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblCorDosAcertos)
							.addGap(12)))
					.addGroup(gl_panel_11.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_11.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_panel_11.createParallelGroup(Alignment.LEADING)
								.addComponent(botaoErros)
								.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_11.createSequentialGroup()
							.addGap(31)
							.addComponent(lblCordDosErros)))
					.addGap(121))
		);
		panel_11.setLayout(gl_panel_11);
		panel.setLayout(gl_panel);
		getContentPane().setLayout(groupLayout);
		
		setaCorPanels();
	
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
