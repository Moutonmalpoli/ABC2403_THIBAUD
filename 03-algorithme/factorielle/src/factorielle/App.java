package factorielle;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		
	    int nombreUser;
		int i;
	    int facto;
	    Scanner sc;
	        
		sc = new Scanner(System.in);
			
		System.out.println("Saisir un nombre ");
		nombreUser = sc.nextInt();
	    
		sc.close();

		facto = 1;
		i = 1;
		
		for(i=1; i<=nombreUser; i++) {
			
			facto = facto * i;
		}
		 System.out.println("La factorielle de " + nombreUser + " est: " + facto);
		    }
	     
	       
	    	
	  

	}

	


