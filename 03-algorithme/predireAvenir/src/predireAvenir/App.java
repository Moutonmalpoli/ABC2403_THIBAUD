package predireAvenir;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		int hour;
		int minutes;
		int future;
		Scanner sc;
		
		sc= new Scanner(System.in);
		
		System.out.println("Veuillez indiquer l'heure");
		hour = sc.nextInt();
		
		System.out.println("Combien de minutes?");
		minutes = sc.nextInt();
		sc.close();
		
		if (hour>24 || minutes > 60) {
		System.out.println("Les données saisies sont invalides");	
		}
		else {
			
		}
			
		future = minutes + 3;
	
		if (hour > 24 || future >= 60) {
			System.out.println("Horaire invalide");
			}
			else {
				System.out.println("Dans 3 minutes il sera " + hour + "h" + future + ".");
			}	
		}
	}
