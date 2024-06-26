package chiffreExiste;

public class App {

	public static void main(String[] args) {
		int[]tab = new int[] {12,16,18,22,24,25,29,30};
		int c;
		c = 18;
		
		RechercherSiChiffreExiste(tab, c);
	}

	public static boolean RechercherSiChiffreExiste(int[]tab, int c) {
		boolean trouve;
		int i;
		i = 0;
		
		while(i<tab.length && tab[i]!=c) {
			
			i++;
			
			
		}
		
		if(tab[i]==c) {
			trouve = true;
		}
		
		else {
			trouve=false;
		}

		
		System.out.println(tab[i]);
		System.out.println(trouve);
		return trouve;
		
		
	}

}
