package paiementRenduMonnaie;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		double prixArticle;
		double sommeTotale;
		double rendueMonnaie;
		int nombreBillets;
		 int totalBillets;
		 
		 int nbrPiece010;
		 int nbrPiece020;
		 int nbrPiece050;
		 int nbrPiece1;
		 int nbrPiece2;
		
		 prixArticle = 1;
		 sommeTotale = 0;
		 totalBillets = 0;
		 nombreBillets = 0;
		 rendueMonnaie = sommeTotale - totalBillets;
		 nombreBillets =   ;
		 totalBillets = nombreBillets * 5;
		 
		 Scanner sc;
		 
		 sc = new Scanner(System.in);
		 
		 while(prixArticle != 0) {
			 System.out.println("Saisir un prix: ");
			 System.out.println("Saisir un '0' pour intérrompre");
			 prixArticle = sc.nextDouble();
			 sommeTotale = sommeTotale + prixArticle;
			 
		 }
		 System.out.println("Le client doit payer " + sommeTotale + " Euros.");
		 System.out.println("Le client doit donner " + nombreBillets + "  de 5 euros soit " + totalBillets );
		 System.out.println("");
		 System.out.println("Rendue Monnaie: " + rendueMonnaie + " euros");
		 
		 
	}

}
