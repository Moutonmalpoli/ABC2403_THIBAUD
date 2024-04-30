# Exercice 2.6 : Élections

Les élections législatives, en Guignolerie Septentrionale, obéissent à la règle suivante :

    Lorsque l’un des candidats obtient plus de 50% des suffrages, il est élu dès le premier tour.
    En cas de deuxième tour, peuvent participer uniquement les candidats ayant obtenu au moins 12.5% des voix au premier tour.

Vous devez écrire un algorithme qui permet la saisie des scores de quatre candidats au premier tour.

Cet algorithme traitera ensuite le candidat numéro 1 (et uniquement lui) : il dira s’il est élu, battu, s’il se trouve en ballottage favorable (il participe au second tour en étant arrivé en tête à l’issue du premier tour) ou défavorable (il participe au second tour sans avoir été en tête au premier tour).
```
VARIABLES
    scoreCandidat1 est un NOMBRE REEL
    scoreDesAutres est un NOMBRE REEL
    scoreTotal est un NOMBRE REEL

TRAITEMENT

    ECRIRE "Saisir le score du candidat n°1"
    LIRE scoreCandidat1

    ECRIRE "Saisir le score total des autres candidats"
    LIRE scoreDesAutres

    scoreTotal = scoreCandidat1 + scoreDesAutres

    SI scoreTotal != 100
        ALORS  
        ECRIRE "Le score total doit être égal à 100%."
    SINON
        ECRIRE "Le score du candidat 1 est de " scoreCandidat1   "%"

    SI scoreCandidat1 > 50 ET scoreDesAutres <= 50
        ALORS
        ECRIRE "Le candidat 1 est élu."

    SINON SI scoreCandidat1 < 50 ET scoreCandidat1 => 12.5
        ALORS
        ECRIRE "Le candidat 1 passe au second tour." 

    SINON SI scoreCandidat < 12.5
	 ECRIRE "Le candidat 1 est éliminé."

    SINON SI scoreCandidat1 > scoreDesAutres 
        ALORS
        ECRIRE "Le candidat 1 est en ballotage favorable."
    
    SINON SI scoreCandidat < scoreDesAutres
        ALORS
        ECRIRE "Le candidat 1 est en ballotage défavorable."
     
    SINON 
    ECRIRE "Score invalide"  
