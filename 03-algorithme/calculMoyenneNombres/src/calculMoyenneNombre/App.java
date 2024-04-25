package calculMoyenneNombre;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int nombre1;
		int nombre2;
		
		Scanner sc;
		
		sc= new Scanner(System.in) ;
		
		System.out.println("Veuillez saisir un premier nombre ");
		
		nombre1 = sc.nextInt();
		
		System.out.println("Veuillez saisir un deuxième nombre");
		
		nombre2 = sc.nextInt();
		
		sc.close();
		
		int moyenne = nombre1 + nombre2/2;
		
		System.out.println("La moyenne de " + nombre1 + " et " + nombre2 + " est " + moyenne + ".");
				
		
		
		

	}

}
