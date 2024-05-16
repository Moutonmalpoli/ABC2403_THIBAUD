package maBicyclette;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		
		boolean beauTemps;
		boolean veloOk;
		boolean reparationImmediate;
		boolean livrePossede;
		boolean livreDispoBibliotheque;
		Scanner sc ;
		
		 sc = new Scanner(System.in);
		
		System.out.println("Est ce qu'il fait beau?");
		beauTemps = sc.nextBoolean();
		
		if (beauTemps) {

			System.out.println("Je vérifie l'état de mon vélo");
			System.out.println("Le vélo est en bon état?");
			veloOk = sc.nextBoolean();
			if (veloOk) {
				System.out.println("Je vais faire une balade en vélo");
			}
			else {
				System.out.println("Je vais chez le garagiste");
				
				System.out.println("Le vélo peut-être réparé immédiatement?");
				reparationImmediate = sc.nextBoolean();
				
				if(reparationImmediate) {
					System.out.println("Je vais jusqu'a l'étang en vélo");
				}
				else {
					System.out.println("Je vais a pied jusqu'a l'étang");
				}
			}

		}
		else {
			System.out.println("Je reste chez moi et je lis");
		
			System.out.println("Est ce que je possède le 1er tome de Game Of Throne ?");
			livrePossede = sc.nextBoolean();
			
			if (livrePossede) {
				System.out.println("Je m'installe dans mon fauteuil et je lis");
			}
			else {
				System.out.println("Je vais l'emprunter à la bibliothèque");
			
				System.out.println("Est ce que le livre est disponible ? ");
				livreDispoBibliotheque = sc.nextBoolean();
				sc.close();
				if(livreDispoBibliotheque ) {
					System.out.println("Je l'emprunte");
				}
				else  {
						System.out.println("J'emprunte un roman policier");	
					}
				System.out.println("Je rentre chez moi");	

			}
		}
	}
}
	
	
	
		
		
	


