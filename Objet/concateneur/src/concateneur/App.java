package concateneur;

public class App {

	public static void main(String[] args) {
	String[] bandeAPicsou = new String[] {"Riri ","Fifi ","Loulou ","et ", "Picsou "};
	String resultat = concatCanard(bandeAPicsou);
	System.out.println(resultat);

	}
	private static String concatCanard(String[]tab) {
		String retour = "";
		
		for(int i=0; i<tab.length;i++) {
			retour = retour + tab[i];
		}
		return retour;
	}

}
