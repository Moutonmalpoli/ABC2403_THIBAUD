package positifOuNegatisBis;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		int nombre1;
		int nombre2;
		int produit;
		Scanner sc;
		
		sc = new Scanner (System.in);
		
		
		System.out.println("Veuillez saisir un  premier nombre: ");
		nombre1 = sc.nextInt();
		
	

		System.out.println("Veuillez saisir un  deuxième  nombre: ");
		nombre2 = sc.nextInt();


		produit = nombre1 * nombre2;
		
		if (produit >= 0) {
			System.out.println("Le produit de " + nombre1 + " et " + nombre2 + " est positif");
				
				
		}
		else {
			System.out.println("Le produit de " + nombre1 + " et " + nombre2 + " est négatif ");
		}
		
		sc.close();
	}

}