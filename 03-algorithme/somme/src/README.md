# Exercice 3.4 : La somme

Écrire un algorithme qui demande un nombre de départ, et qui calcule et affiche la somme des entiers jusqu’à ce nombre.

Par exemple, si l’utilisateur saisit le nombre 5, le programme doit afficher :

La somme des nombres jusque 5 est: 15

NB : on souhaite afficher uniquement le résultat, pas la décomposition du calcul.

```
VARIABLES
nombreUser est un ENTIER
i est un ENTIER
somme est un ENTIER

ECRIRE "Saisir un nombre"
LIRE nombreUser

(somme = 0)
(i = 1)

TANT QUE i <= nombreUser
	somme = somme + i;
	i = i + 1;
	
RESULTAT	
ECRIRE "La somme des nombres jusque ", nombreUser, " est: ", somme);
```