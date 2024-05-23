package suiteFibonacci;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		
		int position;
		int N;
		String resultat;
		int nbPrecedent;
		int nbCourant;
		int nbSuivant;
		Scanner sc;
		sc = new Scanner(System.in);
		
		System.out.println("Suite de Fibonacci. Combien de nombre de la suite souhaitez-vous afficher?");
		N = sc.nextInt();
		
		position = 2;
		resultat = "0 1";
		nbPrecedent = 0 ;
		nbCourant = 1;
		
		if (N > 2) {
			while(position< N){
				nbSuivant = nbPrecedent + nbCourant;
				resultat = resultat + " " + nbSuivant;
				nbPrecedent = nbCourant;
				nbCourant = nbSuivant;
				position = position + 1;
			}
		}
		
		else {
			N = 2;
		}
		sc.close();
		System.out.println("Les " + N +" premiers nombres de la suite de Fibonacci sont \n " + resultat);
	}

}
