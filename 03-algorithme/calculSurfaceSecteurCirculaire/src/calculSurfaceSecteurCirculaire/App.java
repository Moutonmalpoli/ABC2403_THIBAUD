package calculSurfaceSecteurCirculaire;
import java.util.Scanner;
import java.lang.Math;

public class App {

	public static void main(String[] args) {
	
		int rayonR;
		int angleA;
		double aireCirculaire;
		Scanner sc;
		
		sc = new Scanner (System.in);
		
		System.out.println("Saisir le rayon du cercle: ");
		
		rayonR = sc.nextInt();
		
		System.out.println("Saisir l'angle A: ");
		
		angleA = sc.nextInt();
		
		aireCirculaire = (Math.PI * Math.pow(rayonR, 2) * angleA ) /360;
				
		System.out.println("L'aire circulaire du rayon " + rayonR + "et de l'angle " + angleA + "Est:" + aireCirculaire + ".");
		
		sc.close();
	}

}
