package plageDeGalets;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		int nombreUser;
		int nombreReponse;
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		nombreReponse = 17;
		
		System.out.println("Saisir un nombre compris entre 10 et 20");
		nombreUser = sc.nextInt();
		
		while (nombreUser > 20) {
			System.out.println("Plus petit");
			nombreUser = sc.nextInt();
		}
		while (nombreUser < 10) {
			System.out.println("Plus grand");
			nombreUser = sc.nextInt();
		}
		
		if (nombreUser == nombreReponse) {
			System.out.println("Yes, you did it");
			
		}
		else {
			System.out.println("Perdu, réessayez");
		}
		sc.close();

		}
	}



