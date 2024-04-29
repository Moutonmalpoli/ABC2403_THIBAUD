package categorieFootball;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		int ageUser;
		Scanner sc;
		
		sc = new Scanner (System.in);
		
		System.out.println("Veuillez saisir votre âge: ");
		
		ageUser = sc.nextInt();
		sc.close();

		if (ageUser < 5) {
			System.out.println( "Vous êtes trop jeune");
		
			}
			else if (ageUser == 5 || ageUser == 6) {
				System.out.println( "Vous êtes débutant");
			}
			else if (ageUser == 7 || ageUser == 8) {
				System.out.println( "Vous êtes poussin");
			}
		 	else if (ageUser == 9 || ageUser == 10) {
		 			System.out.println("Vous êtes benjamin");
		 	}
		 	else if (ageUser == 11 || ageUser == 12) {
		 		System.out.println( "Vous êtes pupille");
		 	}
		 	else if (ageUser == 13 || ageUser == 14) {
		 		System.out.println( "Vous êtes minime");
		 	
		 	}	
		 	else if (ageUser == 15 || ageUser == 16) {	
		 		System.out.println("Vous êtes cadet");
		 	}
		 	else if (ageUser == 17 || ageUser == 18) {	
		 		System.out.println("Vous êtes junior");
		 	}
		 	else if (ageUser >= 19 && ageUser <= 34) {	
		 		System.out.println("Vous êtes sénior");
		 	}
		 else {
			System.out.println("Vous êtes vétéran");
		 }
			 
	
	}

 
	}

	



