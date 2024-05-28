package demoFonctions;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Démo sur les fonctions");
		
		App.afficherHelloWorld();
		App.afficherHelloPrenom("Pierre");
		App.afficherHelloPrenom("Paul");
		App.afficherHelloPrenom("Jacque");

		int somme = App.calculerSomme(15, 20);
		
		System.out.println(somme);
	}
	// déclaration d'une fonction (La signature)
	// On ne peux pas déclarer deux fonctions avec la même signature
	/**
	 * Affiche "Hello World ! " dans la console
	 * Utilisation : App.helloWorld();
	 */
	public static void afficherHelloWorld() {
		
		System.out.println("Hello World !");
	}
	/**
	 * Affiche le prénom fourni en argument dans la console
	 * @param prenom le prénom à afficher
	 */
	public static void afficherHelloPrenom(String prenom) 
	{
		System.out.println("Hello " + prenom );
		
	}
	/**
	 * Calcule la somme de 2 nombres entiers
	 * @param a le 1er nombre
	 * @param b le 2ème nombre
	 * @return resultat du calcul
	 */
	public static int calculerSomme(int a, int b) {

		int resultat = a + b;
		
		return resultat;
	}
}
