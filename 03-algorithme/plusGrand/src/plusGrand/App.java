package plusGrand;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		
		int nombreUser;
		int i ;
		int plusGrand;
		int position;
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		plusGrand = 0;
		position = 0;
		
		for (i=1 ; i <= 20 ; i++) {
			System.out.println("Entrez le nombre numéro " + i);
			nombreUser = sc.nextInt();

			if (nombreUser > plusGrand) {
				plusGrand = nombreUser;
				position = i;
			}

		}

		System.out.println("Le plus grand des nombres saisis est: " + plusGrand);
		System.out.println(plusGrand + " était en position numéro " + position);

sc.close();	


	}

}
