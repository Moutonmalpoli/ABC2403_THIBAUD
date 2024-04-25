package inversionde2Valeurs;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		
		int nombreA;
		int nombreB;
		int boxNombre;
		Scanner sc;
		
		sc = new Scanner (System.in);
		
		System.out.println("Veuillez saisir un nombre A");
		
		nombreA = sc.nextInt();
		
		System.out.println("Veuillez saisir un nombre B");
		
		nombreB = sc.nextInt();
		
		boxNombre = nombreA;
		nombreA	= nombreB;
		nombreB = boxNombre;
		
		System.out.println("La valeur de A est " + nombreA + " et la valeur de B est " + nombreB +".");
		
		sc.close();
	}

}
