import java.sql.*;
import java.util.ArrayList;
import java.time.* ;

public class GSB_Modele {

	//Attriburs Prives 
	private static Connection connexion;
	private static Statement statementP;
	private static ResultSet rs;
	
	
	//Methode pour la connection
	
	public static int connexion(){
		int rep = 0 ;
		try{
			Class.forName("com.mysql.jdbc.Driver") ;
			connexion = DriverManager.getConnection("jdbc:mysql://localhost/ppe", "root", "");
			statementP = connexion.createStatement(); 
			System.out.println("Connexion Réussi");
			rep = 1
			;
		}
		catch  (ClassNotFoundException e) {
			System.out.println("driveur non chargé");
		}
		catch (SQLException e){
		}
		
		return rep ;
	}//FIN CONNECTION
	
	public static boolean connectionVisiteur (String unLogin, String unMdp) {
		boolean rep = false ;
		int numREp = 0  ;
		String sql ="SELECT * FROM visiteur WHERE login = '"+unLogin+"'AND mdp = '"+unMdp+"'";
		System.out.println(sql);
		int compt;
		String id , nom, prenom ;
		try {	
			rs = statementP.executeQuery(sql);
			
			while (rs.next()) {
				id = rs.getString(1);
				nom = rs.getString(2) ;
				prenom = rs.getString(3) ;
				compt = rs.getInt(10) ;
				if (compt == 1) {
					rep = true ;
				}
				else{
					rep = false ;
				}
			}
			
			rs.close() ;
			
				
		}
		catch (SQLException e){
			System.out.println(e);
		}
		
		
		return rep ;
	}
}