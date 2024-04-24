package introduction;

public class App {

	public static void main(String[] args) {
		
		// Affiche "Hello world" dans la console
		System.out.println("Hello world !");
		
		// VARIABLES
		//IL faut d'abord déclarer les variables avant de leur affecter une valeur
		String prenom; // déclaration chaine de caractère
		
		int age; // déclaration d'un nombre entier 32 bits (valeur scalaire)
		// (plage de valeurs d'un INT -2 147 000 000 à +2 147 000 000)
		
		long soldeBancaire; // declaration d'un nombre entier 64 bits (valeur scalaire)
		
		float tailleEnMetres; // déclaration d'un nombre réel 32 bits (valeur scalaire)
		double tailleEnMetresPourLesGeants; // déclaration d'un nombre réel 64 bits (valeur scalaire)
		
		boolean estMajeur; // déclaration d'un boolean
		
		prenom = "Mike"; // affection d'une valeur
		
		prenom = "Toto"; // modification de la valeur 
		
		
		System.out.println("Bonjour " + prenom); // Concaténation +
		
	}

}
