package elections;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		double scoreCandidat1;
		double scoreCandidat2;
		double scoreCandidat3;
		double scoreCandidat4;
		double scoreDesAutres;
		double scoreTotal;
		Scanner sc;
		
		sc= new Scanner (System.in);
		
		System.out.println("Saisir le score du candidat n°1");
		scoreCandidat1 = sc.nextDouble() ;
		
		System.out.println("Saisir le score du candidat n°2");
		scoreCandidat2 = sc.nextDouble() ;
		
		System.out.println("Saisir le score du candidat n°3");
		scoreCandidat3 = sc.nextDouble() ;
		
		System.out.println("Saisir le score du candidat n°4");
		scoreCandidat4 = sc.nextDouble() ;
		sc.close();
		
		scoreDesAutres = scoreCandidat2 + scoreCandidat3 + scoreCandidat4 ;
		
		scoreTotal = scoreCandidat1 + scoreDesAutres;
		
		if (scoreTotal != 100) {
			System.out.println("Le score doit être égal à 100, réessayez");
			
		}
		else {
			System.out.println("Le score du candidat 1 est de " + scoreCandidat1 + "%");
		}	
		

		if (scoreCandidat1 > 50 && scoreDesAutres <= 50) {
			System.out.println("Le candidat 1 est élu.");
		}
		else if (scoreCandidat1 < 50 && scoreCandidat1 >= 12.5) {
			System.out.println("Le candidat 1 passe au second tour.");
		}
		else {
			System.out.println("Le candidat 1 est éliminé.");
		}
		
		 if(scoreCandidat1 > scoreDesAutres) {
			System.out.println("Le candidat 1 est en ballotage favorable.");
			}
		else if (scoreCandidat1 < scoreDesAutres) {
			System.out.println("Le candidat 1 est en ballotage défavorable.");
		}
		else {
			System.out.println("Score invalide");
		}
		
		}
	}
