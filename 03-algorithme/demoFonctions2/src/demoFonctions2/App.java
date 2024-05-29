package demoFonctions2;

public class App {

	public static void main(String[] args) {
		
		toto Toto = new toto();
		Toto.a = 20 ;
		App.changerValeur(Toto);
		System.out.println(Toto.a);
	}
	
	public static void changerValeur(int a) {
		
		a = 30;
		
}
	
}
