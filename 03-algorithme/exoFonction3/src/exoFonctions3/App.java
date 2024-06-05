package exoFonctions3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class App {

	public static void main(String[] args) {
		
		App.Additionner(15, 10);
		App.concatenerPrenomNom("Mickael", "Delvodère");
		App.afficherHeureMoment();
	}
	
	public static double Additionner(double valeur1, double valeur2) {
		double somme;
		
		somme = valeur1 + valeur2;
		System.out.println(somme);
		return somme;
	}
	
	public static String concatenerPrenomNom(String prenom, String nom) {
		
		String retour;
		retour = "";
		System.out.println(prenom + "." + nom);
		return retour;
		
	}
	
	public static void afficherHeureMoment () {
		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	    Date date = new Date();
	    System.out.println(s.format(date));
	
	}
		}

