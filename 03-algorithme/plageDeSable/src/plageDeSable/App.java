package plageDeSable;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		double nombreUser;
		double nombreReponse;
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		nombreReponse = 1.7 ;

		System.out.println("Saisir un nombre compris entre 1 et 3");
		nombreUser = sc.nextDouble();
		
		
		while (nombreUser != nombreReponse ) {
			
			System.out.println("Perdu, réessayez");
			nombreUser = sc.nextDouble();
		}		
		if (nombreUser == nombreReponse ) {
			System.out.println(nombreUser + " Bravo, vous avez réussi");	
			}
			else {
				System.out.println("Perdu, réessayez");
				}
		sc.close();

		}
	}

