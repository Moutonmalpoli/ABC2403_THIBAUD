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
		
		System.out.println("Depuis combien d'années êtes-vous assuré chez nous ?");
		assurance = sc.nextInt();
		
		System.out.println("De combien d'accidents avez-vous été responsable ?");
		accidents = sc.nextInt();
		
		System.out.println("Vous avez " + ageConducteur + " ans.");
		System.out.println("Vous êtes titulaire du permis depuis " + permis + " ans");
		System.out.println("Vous êtes assuré chez nous depuis" + assurance + " ans");
		System.out.println("Vous avez été responsable de " + accidents + " accidents");
		
		sc.close();
	}

}
