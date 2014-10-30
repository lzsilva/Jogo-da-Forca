package gui.frames.internals;

import gui.panels.PainelFase;
import gui.panels.PanelPalavra;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
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
import javax.swing.UIManager;

public class InternalFrameFase extends JInternalFrame {
	
	private JPanel panelCentral;
	private JToolBar toolBar;
	private JButton buttonAddFase;
	private JButton buttonAddPalavra;
	private JScrollPane scrollPane;
	private JTabbedPane tabbedPane;
	
	/**
	 * Create the frame.
	 */
	public InternalFrameFase() {
		setBounds(0, 0, 900, 600);
		setVisible(true);
		setClosable(true);
		toolBar = new JToolBar();
		
		panelCentral = new JPanel();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panelCentral, GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
						.addComponent(toolBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(toolBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panelCentral, GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		scrollPane = new JScrollPane();
		scrollPane.setBackground(null);
		scrollPane.setOpaque(false);
		scrollPane.setBorder(null);
		GroupLayout gl_panelCentral = new GroupLayout(panelCentral);
		gl_panelCentral.setHorizontalGroup(
			gl_panelCentral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCentral.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panelCentral.setVerticalGroup(
			gl_panelCentral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCentral.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
					.addContainerGap())
		);
		UIManager.put("TabbedPane.contentOpaque", false);
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		scrollPane.setViewportView(tabbedPane);
		panelCentral.setLayout(gl_panelCentral);
		
		buttonAddFase = new JButton("Adicionar Fase");
		buttonAddFase.addActionListener(new NovaFase());
		toolBar.add(buttonAddFase);
		
		buttonAddPalavra = new JButton("Adicionar Palavra");
		toolBar.add(buttonAddPalavra);
		buttonAddPalavra.addActionListener(new NovaPalavra());
		getContentPane().setLayout(groupLayout);
		
		

	}
	
	private static JPanel getTitlePanel(final JTabbedPane tabbedPane, final JPanel panel, String title){	 
		  JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
		  
		  titlePanel.setOpaque(false);
		  JLabel titleLbl = new JLabel(title +" "+tabbedPane.indexOfComponent(panel));
		  titleLbl.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
		  titlePanel.add(titleLbl);		  
		  JButton closeButton = new JButton("x");
		  closeButton.setSize(17, 17);
		  closeButton.setOpaque(false);
		  closeButton.setContentAreaFilled(false);
		  closeButton.setBorderPainted(false);
		  closeButton.addMouseListener(new MouseAdapter(){		  
		   @Override
		   public void mouseClicked(MouseEvent e){		   
			tabbedPane.remove(panel);			
		   }
		  });
		  titlePanel.add(closeButton);
		  return titlePanel;
	 }
	
	/*CLASSES INTERNAS PARA TRATAMENTO DE EVENTOS*/
	
	private class NovaFase implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			addFase();
			
		}
		
		private void addFase(){
			JPanel painel = new PainelFase();
			painel.setOpaque(false);
			tabbedPane.add(painel);
			tabbedPane.setTabComponentAt(tabbedPane.indexOfComponent(painel), getTitlePanel(tabbedPane,painel,"Fase "));
		}		
		
	}
	
	private class NovaPalavra implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			PainelFase painelFase = (PainelFase) tabbedPane.getSelectedComponent();
			painelFase.addPalavra();
			tabbedPane.revalidate();
			tabbedPane.repaint();
		}
		
	}
}
