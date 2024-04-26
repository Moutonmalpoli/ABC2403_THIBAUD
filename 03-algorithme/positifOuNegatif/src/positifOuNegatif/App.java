package positifOuNegatif;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		int nombreUser;
		Scanner sc;
		
		sc = new Scanner (System.in);
		
		System.out.println("Veuillez saisir un nombre: ");
		
		nombreUser = sc.nextInt();
		
		if (nombreUser >= 0) {
			System.out.println("Ce nombre est positif");
				
				
		}
		else {
			System.out.println("Ce nombre est négatif");
		}
	}

}
