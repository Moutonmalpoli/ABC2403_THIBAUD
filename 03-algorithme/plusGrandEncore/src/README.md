# Exercice 3.7 : Et le plus grand est… encore.

Réécrire l’algorithme précédent, mais cette fois-ci on ne connaît pas d’avance combien l’utilisateur souhaite saisir de nombres. La saisie des nombres s’arrête lorsque l’utilisateur entre un zéro.

```
VARIABLES
nombreUser est un ENTIER
i est un ENTIER
plusGrand est un ENTIER
position est un ENTIER

TRAITEMENT

i = 1;
plusGrand = 0;
position = 0;

ECRIRE "Pour intérrompre la saisie, entrer un '0' "

TANT QUE nombreUser ! = 0
	i++
	ECRIRE "Entrez le nombre numéro ", i
	LIRE nombreUser
	
	SI nombreUser > plusGrand ALORS
		plusGrand <- nombreUser
		position = i	
	FINSI
FIN TANT QUE		


RESULTAT

ECRIRE "Le plus grand des nombres saisis est: ", plusGrand
ECRIRE " plusGrand " était en position numéro ", position		
	
