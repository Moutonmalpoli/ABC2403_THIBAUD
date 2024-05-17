Exercice 3.2 : La bonne plage de galets

Écrire un algorithme qui demande un nombre compris entre 10 et 20, jusqu’à ce que la réponse convienne.

En cas de réponse supérieure à 20, on fera apparaître un message : « Plus petit ! », et inversement, « Plus grand ! » si le nombre est inférieur à 10.

Lorsque la réponse convient, afficher le nombre saisi suivi de “Yes, you did it !”.

```
VARIABLES
nombreUser est un ENTIER
nombreReponse est un ENTIER

TRAITEMENT
ECRIRE "Saisir un nombre compris entre 10 et 20"
LIRE nombreUser


TANT QUE nombreUser > 20
	ECRIRE "Plus petit"
	LIRE nombreUser

TANT QUE nombreUser < 10
	ECRIRE "Plus grand"
	LIRE nombreUser

SI nombreUser == nombreReponse ALORS
	ECRIRE "Yes, you did it"
SINON
	ECRIRE "Perdu, réessayez"	


```