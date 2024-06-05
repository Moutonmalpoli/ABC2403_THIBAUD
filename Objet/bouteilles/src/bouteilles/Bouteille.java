package bouteilles;

public class Bouteille {

	String matiereContenue;
	float contenanceEnL;
	float contenanceEncl;
	float contenuEnL;
	float contenuEncl;
	boolean ouvert;
	
	
	public float donneContenanceEncl() {
		
		contenanceEncl = contenanceEnL - 100;
		return contenanceEncl;
	}
	public float donneContenuEncl() {
		contenuEncl = contenuEnL - 100;
		return contenuEncl;
	}
	
	public boolean estPleine() {
		
	}
	
	public boolean fermer() {
		
		
	}
	public boolean ouvrir() {
		
	}
	
	public boolean remplir() {
		
	}
	
	public float remplir1() {
		
	}
	
	public boolean vider() {
		
	}
	public float vider1() {
		
	}
	}

