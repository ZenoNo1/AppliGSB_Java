import javax.swing.* ; //Importe pour les Fenetres en Java 

import java.awt.* ; //IMporte pour creer l'interface
import java.awt.event.*;
import java.util.ArrayList;

public class GSB_FenetrePrincipale extends JFrame  {

	//Attributs Prives 
	private JLabel lblMessageAccueil ;
	private Panel_ConnectionVisiteur panelConnection ;
	//Attibuts Prives JMenuBar
	private JMenuBar menu ;
	private JMenuItem quitterItem ;
	private JMenu consulterMenu ;
	private JMenu gestionMenu ;
	private JMenuItem gererFicheItem ;
	private JMenuItem pdfItem ;
	private JMenuItem lesVisiteursItem ;
	
		
	public GSB_FenetrePrincipale ()  {
		
		this.setTitle("PPE 2: GSB IHM ") ;
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 300) ;
		this.setResizable (false) ;
		/*
		//JMENUBAR
		this.menu = new JMenuBar();
		this.consulterMenu = new JMenu("Consulter");
		this.gestionMenu = new JMenu("Gestion") ;
		this.quitterItem = new JMenuItem("Quitter");
		this.gererFicheItem = new JMenuItem("Gérer les Fiches");
		this.pdfItem = new JMenuItem("Fichier PDF") ;
		this.lesVisiteursItem = new JMenuItem("Les Visiteurs");
		

		
		//ACTION LISTENER
		this.quitterItem.addActionListener(new ActionQuitter());
		this.gererFicheItem.addActionListener(new ActionGererFiche());
		this.lesVisiteursItem.addActionListener(new ActionVisiteurs());
		
		*/
		
		//JPANEL
		this.panelConnection = new Panel_ConnectionVisiteur () ;
		
		//JLABEL
		//this.lblMessageAccueil = new JLabel ("Bienvenu sur GSB Comptable") ;
		
		/*
		//Ajoute les item dans le menuConsultation
		this.gestionMenu.add(gererFicheItem);
		this.gestionMenu.add(pdfItem);
		this.consulterMenu.add(lesVisiteursItem);
		this.menu.add(consulterMenu);
		this.menu.add(gestionMenu);
		this.menu.add(quitterItem);
		
		//this.setJMenuBar(this.menu);
	*/
		//this.setContentPane(new AfficheImage("C:\\Collines.jpg"));
		//panelConnection.add(menu);
		this.getContentPane().add(this.panelConnection);
		this.setVisible(true) ;
	}
	class ActionQuitter implements ActionListener {
		public void actionPerformed(ActionEvent evenement ) {
			System.exit(0) ;
		}
	}
	class ActionGererFiche implements ActionListener {
		public void actionPerformed(ActionEvent evenement ) {
			Panel_FicheG panelGererFiche = new Panel_FicheG() ;
			setContentPane(panelGererFiche) ;
			getContentPane().revalidate();
		}
	}
	class ActionVisiteurs implements ActionListener {
		public void actionPerformed(ActionEvent evenement ) {
			Panel_VisiteurC panelVisiteur = new Panel_VisiteurC() ;
			setContentPane(panelVisiteur) ;
			getContentPane().revalidate();
		}
	}

}

