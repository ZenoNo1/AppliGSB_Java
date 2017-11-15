import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Before;
import org.junit.Test;


public class ModeleTest {
	private String login ;
	private String mdp ;
	
	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void testConnexionVisiteur() {
		GSB_Modele.connexion() ;
		String login = "sperigaud" ;
		String mdp = "coucou" ;
		Assert.assertEquals("Echec" , true , GSB_Modele.connectionVisiteur(login, mdp));
	}
	@Test 
	public void testConnexionBDD() {
		Assert.assertEquals("Echec", 1, GSB_Modele.connexion());
	}
}
