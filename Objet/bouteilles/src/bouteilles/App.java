package bouteilles;

public class App {

	public static void main(String[] args) {
		//Type	nom_Variable = mot_clé	nom_classe (valeur,des, champs)
		Bouteille bouteille1 = new Bouteille(); 
		
		Bouteille bouteille2 = new Bouteille(1.2f, 0.8f, true, "H20", false, false, false, 0);
		
		
		
		float contenancEnClDeBouteille2 = bouteille2.donneContenanceEncL();
		
		
		
	}

}
