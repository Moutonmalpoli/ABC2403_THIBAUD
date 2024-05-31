package insertionTableau2;
import java.util.Arrays;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		String saisieUtilisateur;
		Scanner sc;
		sc = new Scanner (System.in);
		String[] legumesPrix= new String[1];

		String[] legumesPrix2;
		
		do {
			System.out.println("Saisir un fruit ou un legume ");
			saisieUtilisateur= sc.nextLine();
			
			if(!saisieUtilisateur.equals("go")) {
			
			legumesPrix[legumesPrix.length - 1] = saisieUtilisateur;
			
			legumesPrix2 = new String[legumesPrix.length + 1];
			
			System.arraycopy(legumesPrix, 0, legumesPrix2, 0, legumesPrix.length);
			
			legumesPrix = legumesPrix2;
			}
			
		}
		while (!saisieUtilisateur.equals("go"));
		
		for(int i = 0; i < legumesPrix.length; i++) {
			System.out.println(legumesPrix[i]);
		}
		
		/*for(int i = legumesPrix.length - 1; i >= 0; i--) {
			
		}*/
		
		sc.close();
	}

}
