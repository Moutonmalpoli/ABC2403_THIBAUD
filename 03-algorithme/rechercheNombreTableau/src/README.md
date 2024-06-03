#Exercice 5.1 : Rechercher un nombre dans un tableau

Soit un tableau de nombres entier triés par ordre croissant.

Exemple: [8, 16, 32, 64, 128, 256, 512]

Chercher si un nombre donné N figure parmi les éléments.

Si oui, afficher la valeur de l’indice correspondant. Sinon, afficher « Nombre non trouvé ».

```
VARIABLES
tableau nombres[] en ENTIER
N est un ENTIER
i est un ENTIER

TRAITEMENT

N = 32
nombres [8, 16, 32, 64, 128, 256, 512]

POUR i = 0, i est inférieur à nombres ,i++
	nombres[i]
FIN POUR

SI N = nombres[i] ALORS
	ECRIRE "Le nombre ", N " est présent dans le tableau"
SINON
	ECRIRE "Nombre non trouvé"
	
	

```