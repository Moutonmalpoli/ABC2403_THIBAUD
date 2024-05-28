package tableauSommeValeurs;

public class App {

	public static void main(String[] args) {
		//Ecrire un algorithme calculant la somme des valeurs d'un tableau
		//(on suppose que le tableau a été préalablement saisi avec 10 nombres réels (float))
		
		int i;
		float somme;
		float [] tableau;
		
		/* 
		tableau = new float[10];
		tableau[0] = 13.37f;
		tableau[1] = 14.5f;
		tableau[2] = 9.4f;
		tableau[3] = 987.456f;
		tableau[4] = 1.01f;
		tableau[5] = 3.45f;
		tableau[6] = 0.02f;
		tableau[7] = 7.45f;
		tableau[8] = 42f;
		tableau[9] = 99.99f; 
		*/
				
		  
		tableau = new float[]
				{
					13.37f,
					14.5f,
					9.4f,
					987.456f,
					1.01f,
					3.45f,
					0.02f,
					7.45f,
					42f,
					99.99f,
				};
		
		somme = 0;
		
		for(i = 0; i < tableau.length; i++) {
			// somme = somme + tableau[i];
			somme += tableau[i];
		}
		System.out.println("La somme des valeurs du tableau est : " + somme);
	}

}
