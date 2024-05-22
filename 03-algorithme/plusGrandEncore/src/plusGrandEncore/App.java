package plusGrandEncore;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int nombreUser;
		int i ;
		int plusGrand;
		int position;
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		i = 1;
		plusGrand = 0;
		position = 0;
		nombreUser = 1;
		System.out.println("Pour intérrompre la saisie, entrer un '0' ");
		
		while (nombreUser !=0 ) {
			System.out.println("Entrez le nombre numéro " + i);
			i++;
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
