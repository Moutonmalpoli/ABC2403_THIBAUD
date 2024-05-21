package nombresSuivants;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		int nombreUser;
		int i;
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		i = 0;
		
		System.out.println("Saisir un nombre ");
		nombreUser = sc.nextInt();
		/*
		while (i < 10) {
			i++;
			nombreUser++;
			System.out.println(nombreUser);
		}
		*/
	sc.close();

		for (i=0 ; i<10 ; i++  ) {
			
			nombreUser++;
			System.out.print(", "+ nombreUser);
			
		
		}
		
	}

}
