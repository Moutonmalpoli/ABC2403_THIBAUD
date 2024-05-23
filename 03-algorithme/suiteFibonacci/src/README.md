# La suite de Fibonacci

On souhaite écrire un programme Console de calcul des N premiers nombres de la suite de Fibonacci.

C'est l'utilisateur qui choisit combien de nombres seront affichés  par le programme. Le programme affichera minimum les deux premiers nombres de la suite, peu importe le nombre saisi par l'utilisateur.

```
VARIABLES
position est un ENTIER
N est un ENTIER
resultat est une CHAINE DE CARACTERE
nbPrecedent est un ENTIER (64bits)
nbCourant est un ENTIER (64bits)
nbSuivant est un ENTIER (64bits)


TRAITEMENT

ECRIRE "Suite de Fibonacci. Combien de nombre de la suite souhaitez-vous afficher?"

LIRE N

position = 2
resultat = "0 1"

nbPrecedent = 0
nbCourant = 1

SI N > 2 ALORS
	TANT QUE position < N FAIRE
		nbSuivant = nbPrecedent + nbCourant
		resultat = resultat,"",nbSuivant
		nbPrecedent = nbCourant
		nbCourant = nbSuivant
		position = position + 1
	FIN TANT QUE
SINON
	N = 2
FIN SI

RESULTAT

ECRIRE " Les ", N, " premiers nombres de la suite de Fibonacci sont \n",resultat	
		

		
```