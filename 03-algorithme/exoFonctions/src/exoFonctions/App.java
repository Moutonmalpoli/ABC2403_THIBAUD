package exoFonctions;

public class App {

	public static void main(String[] args) {
		
		// Ecrire une procédure qui calcul et affiche le périmètre d'un triangle
		
		int a = 20;
		int b = 30;
		int c = 40;
		
		// Le programme doit afficher: 90
		
		// Ecrire une procedure qui calcule la moyenne des valeurs du tableau
		
		int[] valeurs = new int[] {1,3,5,7,3,4,2,4,22};

		App.calculerPerimetreTriangle(a, b, c);
		App.calculerMoyenne(valeurs);
	}
	/**
	 * Calcule et affiche le périmètre d'un triangle
	 * @param a1 longueur 1er coté
	 * @param b1 longueur 2ème coté
	 * @param c1 longueur 3ème cote
	 */
	public static void calculerPerimetreTriangle(int a1, int b1, int c1) {
		
		int perimetreTriangle = a1 + b1 + c1;
		System.out.println(perimetreTriangle);
	}
	
	public static void calculerMoyenne(int[] tableau) {
		
		int somme = 0;
		float moyenne;
		for (int i = 0; i < tableau.length; i++) {
			//somme = somme + tableau[i];
			somme += tableau[i]	;
		}  
		moyenne = ((float)somme/(float)tableau.length);
		System.out.println(moyenne);
	}
}

