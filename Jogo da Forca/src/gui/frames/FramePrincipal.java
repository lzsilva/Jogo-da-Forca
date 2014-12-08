package gui.frames;

import entidades.Estilo;
import entidades.Fase;
import entidades.Jogo;
import entidades.Palavra;
import gui.panels.PainelFase;
import gui.panels.PanelPalavra;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import controladores.ControladorDeJogo;
import controladores.GeradorDeJogo;

import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;

public class FramePrincipal extends JFrame {

	private JPanel panelCentral;
	private JToolBar toolBar;
	private JButton botaoAddFase;
	private JButton botaoAddPalavra;
	private JScrollPane scrollPane;
	private JTabbedPane tabbedPane;
	private Estilo estilo;
	private JTextField textFieldTitulo;
	/**
	 * Create the frame.
	 */
	public FramePrincipal() {
		setTitle("Editor de Jogo da Forca");
		setBounds(0, 0, 820, 600);
		setVisible(true);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		toolBar = new JToolBar();
		
		estilo = new Estilo();
		
		panelCentral = new JPanel();
		
		JLabel lblNewLabel = new JLabel("T\u00EDtulo:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textFieldTitulo = new JTextField();
		textFieldTitulo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldTitulo.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panelCentral, GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
						.addComponent(toolBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(14)
							.addComponent(lblNewLabel)
							.addGap(18)
							.addComponent(textFieldTitulo, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(toolBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textFieldTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(19)
					.addComponent(panelCentral, GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
					.addContainerGap())
		);

		scrollPane = new JScrollPane();
		scrollPane.setBackground(null);
		scrollPane.setOpaque(false);
		scrollPane.setBorder(null);
		GroupLayout gl_panelCentral = new GroupLayout(panelCentral);
		gl_panelCentral.setHorizontalGroup(gl_panelCentral.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panelCentral
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE,
								664, Short.MAX_VALUE).addContainerGap()));
		gl_panelCentral.setVerticalGroup(gl_panelCentral.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panelCentral
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE,
								293, Short.MAX_VALUE).addContainerGap()));
		UIManager.put("TabbedPane.contentOpaque", false);
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		scrollPane.setViewportView(tabbedPane);
		panelCentral.setLayout(gl_panelCentral);

		botaoAddFase = new JButton("Adicionar Fase");
		botaoAddFase.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		ImageIcon iconBotaoAddFase = new ImageIcon((FramePrincipal.class.getResource("/icones/novaFase.png")));
		Image imagemBotaoAddFase = iconBotaoAddFase.getImage();
		iconBotaoAddFase = new ImageIcon(imagemBotaoAddFase.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)); 
		botaoAddFase.setIcon(iconBotaoAddFase);
		ajustaBotao(botaoAddFase);
		botaoAddFase.addActionListener(new NovaFase());
		toolBar.add(botaoAddFase);		
		
	
		
		botaoAddPalavra = new JButton("Adicionar Palavra");
		botaoAddPalavra.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ImageIcon iconBotaoAddPalavra = new ImageIcon((FramePrincipal.class.getResource("/icones/novaPalavra.png")));
		Image imagemBotaoAddPalavra = iconBotaoAddPalavra.getImage();
		iconBotaoAddPalavra = new ImageIcon(imagemBotaoAddPalavra.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)); 		
		ajustaBotao(botaoAddPalavra);
		botaoAddPalavra.setIcon(iconBotaoAddPalavra);
		toolBar.add(botaoAddPalavra);

		JButton botaoCriaJogo = new JButton("Criar Jogo");
		botaoCriaJogo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ImageIcon iconBotaoCriaJogo = new ImageIcon((FramePrincipal.class.getResource("/icones/play.png")));
		Image imagemBotaoCriaJogo = iconBotaoCriaJogo.getImage();
		iconBotaoCriaJogo = new ImageIcon(imagemBotaoCriaJogo.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)); 		
		ajustaBotao(botaoCriaJogo);
		botaoCriaJogo.setIcon(iconBotaoCriaJogo);
		botaoCriaJogo.setIcon(new ImageIcon(FramePrincipal.class.getResource("/icones/play.png")));
		botaoCriaJogo.addActionListener(new CriarJogo());
		
		JButton botaoConfigurarAparência = new JButton("Configurar Apar\u00EAncia");
		botaoConfigurarAparência.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ImageIcon iconBotaoConfigurarAparencia = new ImageIcon((FramePrincipal.class.getResource("/icones/estilo.png")));
		Image imagemBotaoConfigurarAparencia = iconBotaoConfigurarAparencia.getImage();
		iconBotaoConfigurarAparencia = new ImageIcon(imagemBotaoConfigurarAparencia.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)); 		
		ajustaBotao(botaoConfigurarAparência);
		botaoConfigurarAparência.setIcon(iconBotaoConfigurarAparencia);
		botaoConfigurarAparência.addActionListener(new ConfiguraAparencia());
		toolBar.add(botaoConfigurarAparência);
		toolBar.add(botaoCriaJogo);
		botaoAddPalavra.addActionListener(new NovaPalavra());
		getContentPane().setLayout(groupLayout);
		
		toolBar.setFloatable(false);
		
		JButton botaoCriaPacoteScorm = new JButton("Criar Pacote Scorm");
		botaoCriaPacoteScorm.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ImageIcon iconPacoteScorm = new ImageIcon((FramePrincipal.class.getResource("/icones/scorm.png")));
		Image imagemPacoteScorm = iconPacoteScorm.getImage();
		iconPacoteScorm = new ImageIcon(imagemPacoteScorm.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)); 		
		ajustaBotao(botaoCriaPacoteScorm);
		botaoCriaPacoteScorm.setIcon(iconPacoteScorm);
		botaoCriaPacoteScorm.addActionListener(new CriarPacoteScorm());
		
		toolBar.add(botaoCriaPacoteScorm);

		addFase();

	}

	/* MÉTODOS PRIVATES */

	private static JPanel getTitlePanel(final JTabbedPane tabbedPane,
			final JPanel panel, String title) {
		JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));

		titlePanel.setOpaque(false);
		JLabel titleLbl = new JLabel(title + " "
				+ (tabbedPane.indexOfComponent(panel) + 1));
		titleLbl.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
		titlePanel.add(titleLbl);
		JButton closeButton = new JButton("x");
		closeButton.setSize(17, 17);
		closeButton.setOpaque(false);
		closeButton.setContentAreaFilled(false);
		closeButton.setBorderPainted(false);
		closeButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.remove(panel);
				List<Component> componentes = (List<Component>) Arrays
						.asList(tabbedPane.getComponents());
				for (Component painel : componentes) {
					if (tabbedPane.indexOfComponent(painel) >= 0) {
						tabbedPane.setTabComponentAt(
								tabbedPane.indexOfComponent(painel),
								getTitlePanel(tabbedPane, (JPanel) painel,
										"Fase"));
					}

				}
			}
		});
		titlePanel.add(closeButton);
		return titlePanel;
	}

	private void addFase() {
		PainelFase painel = new PainelFase();
		painel.setOpaque(false);
		tabbedPane.add(painel);
		tabbedPane.setTabComponentAt(tabbedPane.indexOfComponent(painel),
				getTitlePanel(tabbedPane, painel, "Fase "));
	}
	
	//Método ajusta botao
	
	private void ajustaBotao(JButton botao){
		botao.setVerticalTextPosition(SwingConstants.BOTTOM);
		botao.setHorizontalTextPosition(SwingConstants.CENTER);
	}

	/* CLASSES INTERNAS PARA TRATAMENTO DE EVENTOS */

	private class NovaFase implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			addFase();

		}

	}

	private class NovaPalavra implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			PainelFase painelFase = (PainelFase) tabbedPane
					.getSelectedComponent();
			painelFase.addPalavra();
			tabbedPane.revalidate();
			tabbedPane.repaint();
		}
	}

	private class CriarJogo implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			ControladorDeJogo controlador = new ControladorDeJogo(tabbedPane);			
			Jogo jogo = controlador.getJogo();
			jogo.setTitulo(textFieldTitulo.getText());
			GeradorDeJogo geradorDeJogo = new GeradorDeJogo(jogo,estilo);
			geradorDeJogo.criaJogo();
		}

	}
	
	private class CriarPacoteScorm implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			ControladorDeJogo controlador = new ControladorDeJogo(tabbedPane);			
			Jogo jogo = controlador.getJogo();
			jogo.setTitulo(textFieldTitulo.getText());
			GeradorDeJogo geradorDeJogo = new GeradorDeJogo(jogo,estilo);
			geradorDeJogo.criaPacoteScorm();
		}

	}
	
	private class ConfiguraAparencia implements ActionListener{	
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			FrameConfiguraAparencia frameConfiguraAparencia = new FrameConfiguraAparencia(estilo);
			frameConfiguraAparencia.setVisible(true);
		}
	}
}
