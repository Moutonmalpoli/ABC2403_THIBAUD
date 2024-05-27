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
		 
		 nbrPiece010 = 0;
		 nbrPiece020 = 0;
		 nbrPiece050 = 0;
		 nbrPiece1 = 0;
		 nbrPiece2 = 0;
		
		 prixArticle = 1;
		 sommeTotale = 0;
		 totalBillets = 0;
		 nombreBillets = 0;
		 rendueMonnaie = 0;


		 
		 Scanner sc;
		 
		 sc = new Scanner(System.in);
		 
		 while(prixArticle != 0) {
			 System.out.println("Saisir un prix: ");
			 System.out.println("Saisir un '0' pour intérrompre");
			 prixArticle = sc.nextDouble();
			 sommeTotale = sommeTotale + prixArticle;
			 
		 }
		 System.out.printf("Le client doit payer %.2f euros"  , sommeTotale);
		 System.out.println();
		 
		 while(sommeTotale >= 5) {
			
			 nombreBillets++;
			 sommeTotale = sommeTotale -5;
		 }
		 
		 totalBillets = nombreBillets * 5;
		 rendueMonnaie = sommeTotale;
		 
		 
		 System.out.println("Le client doit donner " + nombreBillets + " billets de 5 euros soit " + totalBillets );
		 System.out.println("");
		 System.out.printf("Rendue Monnaie: %.2f euros " , rendueMonnaie);
		 
		 while (rendueMonnaie >= 2) {
			 rendueMonnaie = rendueMonnaie - 2;
			 nbrPiece2++;
		 }
		 while (rendueMonnaie >= 1) {
			 rendueMonnaie = rendueMonnaie - 1;
			 nbrPiece1++;
		 }
		 while (rendueMonnaie >= 0.50) {
			 rendueMonnaie = rendueMonnaie - 0.50;
			 nbrPiece050++;
		 }
		 while (rendueMonnaie >= 0.20) {
			 rendueMonnaie = rendueMonnaie - 0.20;
			 nbrPiece020++;
		 }
		 while (rendueMonnaie >= 0.10) {
			 rendueMonnaie = rendueMonnaie - 0.10;
			 nbrPiece010++;
		 }
		 System.out.println("");
		 System.out.println("Répartition de la monnaie à restituer au client : ");
		 System.out.println(nbrPiece2 + " pièce de 2 euros");
		 System.out.println(nbrPiece1 + " pièce de 1 euros");
		 System.out.println(nbrPiece050 + " pièce de 0,50 euros");
		 System.out.println(nbrPiece020 + " pièce de 0,20 euros");
		 System.out.println(nbrPiece010 + " pièce de 0,10 euros");
		 
	sc.close();	 
	}

}
