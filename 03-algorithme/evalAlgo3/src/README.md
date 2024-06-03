#Evaluation Algorithme 3 

Soit le tableau suivant:
int[] numbers = [2, 4, 1, 8, 6, 14, 23, 25, 7 ,42];

Créer un programme qui calcule et affiche:
- La moyenne des valeurs du tableau
- La valeur la plus grande dans le tableau élevée au carré.

Résultat attendu:
Bienvenue dans le programme de calcul du tableau d'entier

Moyenne des valeurs du tableau: 13.2

Valeur la plus grande (42) élevée au carré:1764

```
VARIABLES
tableau numbers[]  en ENTIER
moyenne est un ENTIER
pgv est un ENTIER
pgvCarré est un ENTIER
i est un ENTIER
TRAITEMENT


tableau numbers [2, 4, 1, 8, 6, 14, 23, 25, 7 ,42]

POUR (i = 0; i < longueur de numbers[]; incrémenter i)
	moyenne = moyenne + numbers[i]
FIN POUR

SI numbers[] > longueur de numbers ALORS
	pgvCarré = pgv * pgv
	
ECRIRE "Moyenne des valeurs du tableau: ", moyenne
ECRIRE "Valeur la plus grande " , pgv , "élevé au carré: " pgvCarré
	
```