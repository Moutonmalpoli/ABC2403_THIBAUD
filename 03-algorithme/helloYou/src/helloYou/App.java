package helloYou;

import java.util.Scanner; // importer des composants

public class App {

	public static void main(String[] args) {
	 
		String prenom;
		
		Scanner sc; // Déclaration d'une variable de ty pe Scanner (penser à la ligne import (ligne 3))
		
		sc = new Scanner(System.in); // initialisation d'un nouveau Scanner
		// A la création du Scanner, on lui injecte System.in indiquant qu'on souhaite récupérer les données à partir de ce flux
		System.out.println("Bonjour, veuillez saisir votre prénom"); //Affichage
		
		prenom = sc.nextLine(); // Demande a l'utilisateur une saisie. 
		//Lorsque l'utilisateur validera avec la touche entrée, la saisie est récupérée dans la variable à gauche du signe "="
		
		System.out.println("Bonjour " + prenom);
		
		sc.close(); // Fermeture du Scanner (obligatoire)

	}

}
