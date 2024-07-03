package palindrome;

public class App {

	public static void main(String[] args) {
	
		String[]tab = new String[] {"L","A","V","A","L"};
		boolean resultat=palindromeOuPasPalindrome(tab);
		System.out.println(resultat);
		
	}
	public static boolean palindromeOuPasPalindrome(String[]tab){
		
		boolean estUnPalindrome = true;
		int i;
		int j;
		
		i=0;
		j=tab.length-1-i;
		
		while (i<tab.length/2 && tab[i]==tab[j]) {
			i++;
			j=tab.length-1-i;
			
		}
		if (i!= tab.length/2) {
			estUnPalindrome = false;
		}
		else {
			estUnPalindrome= true;
		}
		return estUnPalindrome;
	}
	
}
