package plageDeSable;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		double nombreUser;
		Scanner sc = new Scanner(System.in);

		System.out.println("Saisir un nombre compris entre 1 et 3");
		nombreUser = sc.nextDouble();
		
		while (nombreUser != 1.7) {
			
			if (nombreUser == 1.7) {
				System.out.println("Bravo, vous avez réussi");	
				}
				else {
					System.out.println("Perdu, réessayez");
					nombreUser = sc.nextDouble();
				}
		}
		
		}
	}

