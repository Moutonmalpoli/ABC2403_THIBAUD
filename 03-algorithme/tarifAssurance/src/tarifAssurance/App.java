package tarifAssurance;
import java.util.Scanner;
public class App {


	public static void main(String[] args) {
	
		int ageConducteur;
		int permis ;
		int assurance;
		int accidents;
		
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		System.out.println("Saisir votre age: ");
		ageConducteur = sc.nextInt();
		
		System.out.println("Depuis combien d'années êtes-vous titulaire du permis ?");
		permis = sc.nextInt();
		
		System.out.println("De combien d'accidents avez-vous été responsable ?");
		accidents = sc.nextInt();
		
		System.out.println("Depuis combien d'années êtes-vous assuré chez nous ?");
		assurance = sc.nextInt();
		
		
		System.out.println("Vous avez " + ageConducteur + " ans.");
		System.out.println("Vous êtes titulaire du permis depuis " + permis + " ans");
		System.out.println("Vous avez été reconnu responsable de " + accidents + " accidents");
		System.out.println("Vous êtes assuré chez nous depuis " + assurance + " ans");
		
		if (ageConducteur < 25 && permis < 2 && accidents == 0 && assurance < 5 ) {
			System.out.println("Vous benéficiez du tarif rouge");
		}
		
		else if (ageConducteur < 25 && permis < 2 && accidents == 1 && assurance >= 5 ) {
			System.out.println("Vous benéficiez du tarif rouge");
		}
		
		else if (ageConducteur >= 25 && permis < 2 && accidents == 1 && assurance < 5 ) {
			System.out.println("Vous benéficiez du tarif rouge");
		}
		
		else if (ageConducteur >= 25 && permis < 2 && accidents == 1 && assurance >= 5 ) {
			System.out.println("Vous benéficiez du tarif rouge");
		}
		
		else if (ageConducteur >= 25 && permis >= 2 && accidents == 2 && assurance < 5 ) {
			System.out.println("Vous benéficiez du tarif rouge");
		}
		
		else if (ageConducteur >= 25 && permis >= 2 && accidents == 3 && assurance >= 5 ) {
			System.out.println("Vous benéficiez du tarif rouge");
		}
		
		else if (ageConducteur < 25 && permis < 2 && accidents == 0 && assurance >= 5 ) {
			System.out.println("Vous benéficiez du tarif orange");
		}
		
		else if (ageConducteur < 25 && permis >= 2 && accidents == 0 && assurance < 5 ) {
			System.out.println("Vous benéficiez du tarif orange");
		} 
		
		else if (ageConducteur >= 25 && permis < 2 && accidents == 0 && assurance < 5 ) {
			System.out.println("Vous benéficiez du tarif orange");
		} 
		
		else if (ageConducteur >= 25 && permis >= 2 && accidents == 1 && assurance < 5 ) {
			System.out.println("Vous benéficiez du tarif orange");
		}	
		else if (ageConducteur >= 25 && permis >= 2 && accidents == 2 && assurance >= 5 ) {
			System.out.println("Vous benéficiez du tarif orange");
			} 
		else if (ageConducteur >= 25 && permis < 2 && accidents == 0 && assurance >= 5 ) {
			System.out.println("Vous benéficiez du tarif vert");
		} 
		else if (ageConducteur >= 25 && permis >= 2 && accidents == 0 && assurance < 5 ) {
			System.out.println("Vous benéficiez du tarif vert");
		} 
		else if (ageConducteur >= 25 && permis >= 2 && accidents == 1 && assurance >= 5 ) {
			System.out.println("Vous benéficiez du tarif vert");
		} 
		else if (ageConducteur >= 25 && permis >= 2 && accidents == 0 && assurance >= 5 ) {
			System.out.println("Vous benéficiez du tarif bleu");
		}
		else if (ageConducteur < 25 && permis < 2 && accidents == 1 && assurance < 5 ) {
			System.out.println("Votre demande d'assurance est refusée");
		}
		else if (ageConducteur < 25 && permis < 2 && accidents >= 1 && assurance >= 5 ) {
			System.out.println("Votre demande d'assurance est refusée");
		}
		else if (ageConducteur >= 25 && permis < 2 && accidents >= 1 && assurance < 5 ) {
			System.out.println("Votre demande d'assurance est refusée");
		}
		else if (ageConducteur >= 25 && permis >= 2 && accidents >= 3 && assurance < 5 ) {
			System.out.println("Votre demande d'assurance est refusée");
		}
		else if (ageConducteur >= 25 && permis >= 2 && accidents >= 4 && assurance >= 5 ) {
			System.out.println("Votre demande d'assurance est refusée");
		}
		
		else {
			System.out.println("invalide");
		}
		sc.close();
	}

}
