import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.security.* ;
import javax.swing.*;





public class Panel_ConnectionVisiteur extends JPanel    {

	//Attributs Prives 
	
		
		private JLabel lblMessageAccueil ;
		private AfficheImage monImg ;
		private JPanel imgPanel ;
		
		private JLabel lblLogin ;
		private JLabel lblMdp ;
		
		private JTextField jtfLogin ;
		private JTextField jtfMdp ;
		
		private JButton btnValider ;
		
	public Panel_ConnectionVisiteur () {
	//JBUTTON
		this.btnValider = new JButton ("Valider ") ;
	//JLABEL
		this.lblMessageAccueil = new JLabel ("Bienvenue sur GSB Comptable :           ") ;
		Font titre = new Font("Arial", Font.PLAIN, 30);
		Font H3 = new Font("Arial", Font.PLAIN, 10);
		this.lblMessageAccueil.setFont(titre);
		this.lblMessageAccueil.setForeground(Color.white);
		
		
		this.lblLogin = new JLabel ("Votre Login:        ") ;
		this.lblLogin.setFont(H3);
		this.lblLogin.setForeground(Color.white);
		

		this.lblMdp = new JLabel ("Votre MDP: ") ;
		this.lblMdp.setFont(H3);
		this.lblMdp.setForeground(Color.white);

	//JTEXTFIELD
		this.jtfLogin = new JTextField ("") ;
		this.jtfLogin.setPreferredSize(new Dimension (150,30));
		this.jtfMdp = new JTextField ("") ;
		this.jtfMdp.setPreferredSize(new Dimension (150,30));
		
	//ACTION LISTENER	
		this.btnValider.addActionListener(new ActionConnectionVisiteur ());
		
	this.setBackground(new Color(9,68,89));
	
	this.add(this.lblMessageAccueil) ;
	
	
	this.add(this.lblLogin) ;
	this.add(this.jtfLogin) ;
	
	this.add(this.lblMdp);
	this.add(this.jtfMdp);
	this.add(btnValider) ;
	}
	
	class ActionConnectionVisiteur implements ActionListener {
		public void actionPerformed(ActionEvent evenement ) {
			if (evenement.getSource() == btnValider) {
				
				GSB_Modele unModele = new GSB_Modele () ;
				GSB_Md5 md5 = new GSB_Md5 () ;
				
				boolean rep = false ;
				String unLogin = jtfLogin.getText() ;
				String unMdp = jtfMdp.getText() ;
				
				String unMdpMd5 = md5.code(unMdp) ;
				System.out.println(unMdpMd5);
				
				
				 rep = unModele.connectionVisiteur(unLogin,unMdpMd5) ;
				 jtfLogin.setText("");
				 jtfMdp.setText("");
				 if (rep == false){
					System.out.println("pas connecter ");
				 }
				 else{
					 System.out.println("connecter");
					
				 }
				 
				 
			}
		}
	}
	
}
