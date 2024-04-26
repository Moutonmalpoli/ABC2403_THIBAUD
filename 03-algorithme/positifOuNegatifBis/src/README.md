# Exercice 2.2 : Positif ou négatif (bis) ?

Écrire un algorithme qui demande à l’utilisateur de saisir 2 nombres entiers et l’informe ensuite si leur produit est positif ou négatif.

```
VARIABLES
    nombre1 est un NOMBRE ENTIER
    nombre2 est un NOMBRE ENTIER
    produit est un NOMBRE ENTIER

TRAITEMENT
    ECRIRE "Veuillez saisir un premier nombre: "
    LIRE nombre1

    ECRIRE "Veuillez saisir un deuxième nombre: "
    LIRE nombre2

    produit < nombre1 X nombre2

RESULTAT 
    SI produit >= 0 ALORS
     ECRIRE "Le produit de",nombre 1, "et", nombre2, "est positif"
    SINON
        ECRIRE "Le produit de",nombre1, "et", nombre2, "est négatif"    
    FINSI
```
