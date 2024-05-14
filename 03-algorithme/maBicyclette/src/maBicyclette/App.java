package maBicyclette;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		
		boolean beauTemps;
		boolean veloOk;
		boolean reparationImmediate;
		boolean livrePossede;
		boolean livreDispoBibliotheque;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Est ce qu'il fait beau?");
		beauTemps = sc.nextBoolean();
		
		if (beauTemps = true) {
			System.out.println("Je vérifie l'état de mon vélo");
			System.out.println("Le vélo est en bon état?");
			veloOk = sc.nextBoolean();
			if(veloOk = true) {
				System.out.println("Je vais faire une balade en vélo");
			}
			else {
				System.out.println("Je vais chez le garagiste");
			}
			System.out.println("Le vélo peut-être réparé immédiatement?");
			reparationImmediate = sc.nextBoolean();
			
			if(reparationImmediate = true) {
				System.out.println("Je vais jusqu'a l'étang en vélo");
			}
			else {
				System.out.println("Je vais a pied jusqu'a l'étang");
			}
		}
		else {
			System.out.println("Je reste chez moi et je lis");
			
		
		}	
		}
	}


