package categorieFootball;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		int ageUser;
		String categorie;
		Scanner sc;
		
		sc = new Scanner (System.in);
		
		System.out.println("Veuillez saisir votre âge: ");
		
		ageUser = sc.nextInt();
		sc.close();

		if (ageUser < 5) {
			categorie ="trop jeune";
		
			}
			else if (ageUser < 7) {
				categorie =  "débutant";
			}
			else if (ageUser < 9 ) {
				categorie = "poussin";
			}
		 	else if (ageUser < 11) {
		 		categorie ="benjamin";
		 	}
		 	else if (ageUser < 13) {
		 		categorie = "pupille";
		 	}
		 	else if (ageUser < 15) {
		 		categorie ="minime";
		 	
		 	}	
		 	else if (ageUser < 17) {	
		 		categorie ="cadet";
		 	}
		 	else if (ageUser < 19) {	
		 		categorie ="junior";
		 	}
		 	else if (ageUser >= 19 && ageUser <= 34) {	
		 		categorie = "sénior";
		 	}
		 else {
			 categorie ="vétéran";
		 }
		
		
		System.out.println("Votre catégorie est " + categorie + ".");
	
	}

 
	}

	



