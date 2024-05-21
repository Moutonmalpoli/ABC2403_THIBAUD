Exercice 3.3 : Les nombres suivants

Écrire un algorithme qui demande un nombre de départ, et qui ensuite affiche les dix nombres suivants.

Par exemple, si l’utilisateur entre le nombre 17, le programme affichera :

Les 10 nombres après 17 sont: 18, 19 ,20 ,21 ,22 ,23 ,24 ,25 ,26 ,27

Écrire cet algorithme dans un premier temps avec une boucle tant que, puis écrivez une 2nde version avec une boucle pour.

```
VARIABLES
nombreUser est un ENTIER
i est un ENTIER

TRAITEMENT
ECRIRE "Saisir un nombre"
LIRE nombreUser

(i = 0)

ECRIRE "Les dix nombre suivants de ", nombreUser " sont:"

TANT QUE i < 10
	i++
	nombreUser++
	ECRIRE nombreUser
FIN TANT QUE

POUR i de 0 à 10, 
	ECRIRE nombreUser
FIN POUR
```