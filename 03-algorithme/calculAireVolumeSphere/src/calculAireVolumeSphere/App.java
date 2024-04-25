package calculAireVolumeSphere;

import java.util.Scanner;
import java.lang.Math;
public class App {

	public static void main(String[] args) {
		
		int rayonR;
		double aire;
		double volume;
		Scanner sc;

		sc = new Scanner (System.in);
		
		System.out.println("Saisir le rayon de la sphère: ");
		
		rayonR = sc.nextInt();
		
		
		aire = (4 * Math.PI * Math.pow(rayonR, 2));
		volume = (4 * Math.PI * Math.pow (rayonR, 3)) / 3;
		
		System.out.println("");		
		System.out.println("L'aire d'une sphère de rayon " + rayonR + " est :" +  aire +  ".");
		
		System.out.println("");
		System.out.println("Le volume d'une sphère de rayon " + rayonR + " est :" +  volume +  ".");
		
		sc.close();

	}

}
