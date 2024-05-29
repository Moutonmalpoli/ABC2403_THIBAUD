package sommeValeurs2Tableaux;

public class App {

	public static void main(String[] args) {
		
		int[] tableau1;
		int[] tableau2;
		int resultatTableau;
		
		resultatTableau = 0 ;
		tableau1 = new int[] {4, 8, 7, 12};
		tableau2 = new int [] {3, 6};
		/**
		 * POUR i de 0 à tableau1.length, incrémenter i
		 * 		POUR j de 0 à tableau2.length , incrémenter j
		 * 			resultatTableau = resultatTableau + tableau1[i] *tableau2[j]
		 * 		FIN POUR
		 * FIN POUR
		 */
		
		for(int i = 0; i < tableau1.length; i++) {
			
			for(int j = 0; j <tableau2.length; j++) {
				resultatTableau += tableau1[i] * tableau2[j];
			}
		}
		System.out.println(resultatTableau);
	}

}
