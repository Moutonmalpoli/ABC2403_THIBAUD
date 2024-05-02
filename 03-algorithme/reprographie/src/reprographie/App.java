package reprographie;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {

		int nbrPhotocopies;
		double facture;
		double factureClient;
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		System.out.println("Veuillez indiquer le nombre de photocopies.");
		
		nbrPhotocopies = sc.nextInt();
		sc.close();
		
		if (nbrPhotocopies > 10 && nbrPhotocopies <= 19){
			facture = 0.09;
		}
		else if (nbrPhotocopies >20  ) {
			facture = 0.08;
		}
		else {
		facture = 0.10;
		}
		factureClient = facture * nbrPhotocopies;
		
		System.out.println("Pour " + nbrPhotocopies + " photocopies votre facture sera de " + factureClient + " euros" + ".");
	}

}
