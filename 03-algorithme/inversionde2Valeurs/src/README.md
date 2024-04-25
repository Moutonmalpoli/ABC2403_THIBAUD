# Exercice 1.6 : Inversion de 2 valeurs

    Lire 2 nombres entier A et B.
    Afficher la valeur de A puis la valeur de B.
    Mettre le contenu de A dans B et celui de B dans A.
    Afficher à nouveau la valeur de A puis la valeur de B.

```
VARIABLES
    nombreA est un NOMBRE ENTIER
    nombreB est un NOMBRE ENTIER
    boxNombre est un NOMBRE ENTIER

TRAITEMENT
    ECRIRE "Veuillez saisir un nombre A: "
    LIRE nombreA

    ECRIRE "Veuillez saisir un nombre B:"
    LIRE nombreB

    boxNombre <-- nombreA
    nombreA <-- nombreB
    nombreB <-- boxNombre

RESULTAT
    ECRIRE "La valeur de A est ", nombreA, "et la valeur de B est ", nombreB, "."


```