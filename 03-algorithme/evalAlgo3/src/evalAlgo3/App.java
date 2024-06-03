package evalAlgo3;

public class App {

	public static void main(String[] args) {

		int[] numbers;
		float moyenne;
		float somme;
		int pgv;
		int pgvCarré;
		int i;

		numbers = new int[] { 2, 4, 1, 8, 6, 14, 23, 25, 7, 42 };
		moyenne = 0;
		somme = 0;
		pgv = 0;
		for (i = 0; i < numbers.length; i++) {

			somme += numbers[i];
			moyenne = somme / numbers.length;
			pgv = numbers[i];
		}

		pgvCarré = pgv * pgv;
		System.out.println("Bienvenue dans le programme de calcul du tableau d'entier");
		System.out.println("Moyenne des valeurs du tableau: " + moyenne);
		System.out.println("Valeur la plus grande " + "(" + pgv + ")" + " élevé au carré :" + pgvCarré);

	}
}
