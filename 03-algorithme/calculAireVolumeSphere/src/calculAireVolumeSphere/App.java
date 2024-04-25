package calculAireVolumeSphere;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		
		int rayonR;
		
		Scanner sc;

		sc = new Scanner (System.in);
		
		System.out.println("Saisir le rayon de la sphère: ");
		
		rayonR = sc.nextInt();
		
		sc.close();
		
		double aire = (4 * 3.14 * rayonR * rayonR);
		double volume = (4 * 3.14 * rayonR * rayonR * rayonR) / 3;
		
		System.out.println(" L'aire d'une sphère de rayon " + rayonR + " est :" +  aire +  ".");
		System.out.println(" Le volume d'une sphère de rayon " + rayonR + " est :" +  volume +  ".");
		
	}

}
