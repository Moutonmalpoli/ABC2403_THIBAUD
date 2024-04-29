# Exercice 2.5 : Réprographie

Un magasin proposant un service de Réprographie facture 0.10€ les 10 premières photocopies, 0.09€ les vingt suivants et 0.08 au delà.

Écrire l’algorithme qui demande à l’utilisateur de saisir le nombre de photocopies effectuées et affiche le montant de la facture correspondante.

```
VARIABLE
nbrPhotocopies est un NOMBRE ENTIER
facture est un NOMBRE REEL
factureClient est NOMBRE REEL

TRAITEMENT
facture = 0.10
ECRIRE "Veuillez indiquer le nombre de photocopies."
LIRE nbrPhotocopies

SI nbrPhotocopies > 10 ET < 20
	ALORS facture = 0.09

SINON SI nbrphotocopies > 20 
 	facture = 0.08

SINON 
	facture = 0.10 

factureClient = nbrPhotocopies * facture

RESULTAT

ECRIRE "Pour ", nbrphotocopies," photocopies votre facture sera de ", factureClient, " euros", "."

```