# Exercice 2.4 : Je prédis l’avenir

Cet algorithme est destiné à prévenir l’avenir et il doit être infaillible !

Le programme demande à l’utilisateur de saisir 2 nombres entiers correspondant respectivement à des heures et des minutes. Le programme affichera ensuite l’heure qu’il sera 3 minutes plus tard.

Par exemple, si l’utilisateur saisit 23 puis 12 (correspondant à 23h12), le programme doit afficher Dans 3 minutes, il sera 23h15.

Si les nombres saisis par l’utilisateur sont “hors limite”, le programme affichera “Les données saisies sont invalides”

```
VARIABLE
hour est un NOMBRE ENTIER
minutes est un NOMBRE ENTIER
future est un NOMBRE ENTIER

TRAITEMENT
ECRIRE "Veuillez indiquer l'heure"
LIRE hour

ECRIRE "Combien de minutes ?"
LIRE minutes

SI hour est supérieur à 24 OU minutes est supérieur à 60
ALORS
	ECRIRE "Les données saisies sont invalides"
FINSI

future = minutes + 3

RESULTAT

SI hour est supérieur à 24 OU future est supérieur à 60
ALORS 
	ECRIRE "Horaire invalide"
SINON 
	ECRIRE "Dans 3 minutes il sera", hour ,"h", future "."
FINSI
```