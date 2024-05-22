# Exercice 3.6 : Et le plus grand est…

Écrire un algorithme qui demande successivement 20 nombres à l’utilisateur, et qui lui indique ensuite quel est le plus grand parmi ces 20 nombres.


Exemple de fonctionnement du programme :

Entrez le nombre numéro 1 : 12
Entrez le nombre numéro 2 : 14
etc...
Entrez le nombre numéro 20: 6

Résultat : 
Le plus grand des nombres saisis est : 14.
14 était le nombre numéro 2.

```
VARIABLES
nombreUser est un ENTIER
i est un ENTIER
plusGrand est un ENTIER
position est un ENTIER

TRAITEMENT

plusGrand = 0

POUR i=1 i < 20 i++
	ECRIRE "Entrez le nombre numéro", i
	LIRE nombreUser
	SI nombreUser > plusGrand ALORS
		plusGrand <- nombreUser
		position = i	
	FINSI
FIN POUR		

RESULTAT

ECRIRE "Le plus grand des nombres saisis est: ", plusGrand
ECRIRE " plusGrand " était en position numéro ", position		
	

```