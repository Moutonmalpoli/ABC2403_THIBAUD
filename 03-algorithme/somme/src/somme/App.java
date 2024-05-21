package somme;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
        int nombreUser;
		int i;
        int somme;
        Scanner sc;
        
		sc = new Scanner(System.in);
		
		System.out.println("Saisir un nombre ");
		nombreUser = sc.nextInt();
		
        somme = 0;
        i = 0;
        while (i <= nombreUser) { 
	    somme = somme + i;
	    i = i + 1;
	    
	    }
        System.out.print("La somme des nombres jusque " + nombreUser + " est: " + somme);
		sc.close();

}
	}
