# Exercice 3.1 : La bonne plage de sable

Écrire un algorithme qui demande à l’utilisateur de saisir un nombre compris entre 1 et 3 jusqu’à ce que la réponse convienne.

Lorsque la réponse convient, afficher le nombre saisi suivi de “Bravo, vous avez réussi !”.

```
VARIABLES
nombreUser est un REEL


TRAITEMENT
ECRIRE "Saisir un nombre compris entre 1 et 3"
LIRE nombreUser

TANT QUE nombreUser != 1.7
LIRE nombreUser

SI nombreUser == 1.7 ALORS
ECRIRE "Bravo, vous avez réussi"

SINON
ECRIRE "Perdu, réessayez"
```