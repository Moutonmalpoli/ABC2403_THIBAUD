package insertionTableau;
import java.util.Arrays;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		
		int[] tableau;
		int nombreUser;
		Scanner sc;
		
		sc= new Scanner (System.in);
		
		/* demander un nombre a insérer */
		System.out.println("Saisir un nombre ");
		nombreUser =sc.nextInt();
		
		/*insérer le nombre dans le tableau*/
		tableau = new int[10] ;
		tableau[0] = 1;
		tableau[1] = 4;
		tableau[2] = 5;
		tableau[3] = 10;
		tableau[4] = 20;
		tableau[5] = 22;
		tableau[6] = 25;
		tableau[7] = 30;
		tableau[8] = 32;
		tableau[9] = nombreUser;
		
	/*trier le nombre dans le tableau*/	
		Arrays.sort(tableau);
		
		
	/* afficher le tableau */	
	System.out.println(Arrays.toString(tableau));
	
	sc.close();
	}

}
