# Exercice 3.8 : Paiement et rendu monnaie


On estime que le client paie uniquement avec des billets de 5€.

Afficher ensuite :

    Le nombre de billets de 5€ qu’il doit donner pour payer la somme dûe.
    La somme à rendre par le magasin
    La répartition optimale des billets / pièces à rendre au client (pièces disponibles : 0.10€ 0.20€, 0.50€, 1€, 2€).

Exemple :

Saisir un prix : 12.5
Saisir un prix : 9.3
Saisir un prix : 15.9
Saisir un prix : 0

Le client doit payer : 37.70 Euros.
Le client doit donner 8 billets de 5 Euros soit 40 Euros.
Rendu monnaie : 2.30 Euros
Répartition de la monnaie à restituer au client : 
- 1 pièce de 2 Euros
- 2 pièces de 0.20 Euros
- 1 pièce de 0.10 Euros


```
VARIABLES


nbrPiece010 est un ENTIER
nbrPiece020 est un ENTIER
nbrPiece050 est un ENTIER
nbrPiece1 est un ENTIER
nbrPiece2 est un ENTIER

prixArticle est un REEL
sommeTotale est un REEL
rendueMonnaie est un REEL
nombreBillets est un ENTIER
totalBillets est un ENTIER


TRAITEMENT




nombreBillets = 


TANT QUE prixArticle != 0
	ECRIRE "Saisir un prix: "
	LIRE prixArticle
	sommeTotale <- sommeTotale + prixArticle
	
FIN TANT QUE

TANT QUE sommeTotale => 5
	nombreBillets ++
	sommeTotale = sommeTotale - 5
	
FIN TANT QUE	

totalBillets = nombreBillets * 5
rendueMonnaie = sommeTotale

ECRIRE "Le client doit payer: ",sommeTotale	" Euros."
ECRIRE "Le client doit donner ", nombreBillets " de 5 euros soit ",totalBillets 	

ECRIRE "Rendue monnaie: ", rendueMonnaie " euros"



TANT QUE rendueMonnaie => 2
	rendueMonnaie = rendueMonnaie - 2
	nbrPiece2++
FIN TANT QUE

TANT QUE rendueMonnaie => 1
	rendueMonnaie = rendueMonnaie - 1
	nbrPiece1++
FIN TANT QUE

TANT QUE rendueMonnaie => 0.50	
	rendueMonnaie = rendueMonnaie - 0.50
	nbrPiece050++
FIN TANT QUE

TANT QUE rendueMonnaie => 0.20
	rendueMonnaie = rendueMonnaie - 0.20
	nbrPiece020++	
FIN TANT QUE

TANT QUE rendueMonnaie => 0.10	
	rendueMonnaie = rendueMonnaie - 0.10	
	nbrPiece010 ++	
FIN TANT QUE	
	
ECRIRE "Répartition de la monnaie à restituer au client : "
ECRIRE nbrPiece2 "pièce de 2 euros"
ECRIRE nbrPiece1 "pièce de 1 euros"
ECRIRE nbrPiece050 "pièce de 0.50 euros"
ECRIRE nbrPiece020 "pièce de 0.20 euros"
ECRIRE nbrPiece010 "pièce de 0.10 euros"

	
	
	
	





```