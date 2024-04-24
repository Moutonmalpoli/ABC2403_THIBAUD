# Exercice 2.1 : Positif ou négatif ?

Écrire un algorithme qui demande à l’utilisateur de saisir 1 nombre entier et l’informe ensuite si le nombre est positif ou négatif.

Pour information, le nombre 0 est considéré positif.
```
VARIABLES
    nombreUser est NOMBRE ENTIER


TRAITEMENT
    ECRIRE "Veuillez saisir un nombre: "
    LIRE nombreUser

RESULTAT
    SI nombreUser >= 0 ALORS
        ECRIRE "Ce nombre est positif
    SINON
        ECRIRE "Ce nombre est negatif    
    FINSI

```

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
     ECRIRE "Ce nombre est positif
    SINON
        ECRIRE "Ce nombre est negatif    
    FINSI
```

# Exercice 2.3 : Ma catégorie au Football

Écrire un algorithme qui demande à l’utilisateur de saisir un âge et l’informe ensuite à quelle catégorie il appartient :


* Trop jeune : Moins de 5 ans
* Débutant : De 5 à 6 ans
* Poussin : De 7 à 8 ans
* Benjamin : De 9 à 10 ans
* Pupille : De 11 à 12 ans
* Minime : De 13 à 14 ans
* Cadet : De 15 à 16 ans
* Junior : De 17 à 18 ans
* Sénior : De 19 à 34 ans
* Vétéran : 35 ans et +


```
VARIABLE
  ageUser est un NOMBRE ENTIER

TRAITEMENT
    ECRIRE "Veuillez saisir votre âge: "
    LIRE ageUser

RESULTAT
    SI ageUser < 5 ALORS
    ECRIRE "Vous êtes trop jeune"
    FINSI

    SI ageUser = 5 OU ageUser = 6 ALORS
    ECRIRE "Vous êtes débutant"
    FINSI

    SI ageUser = 7 OU ageUser = 8 ALORS
    ECRIRE "Vous êtes poussin"
    FINSI

    SI ageUser = 9 OU ageUser =10 ALORS
    ECRIRE "Vous êtes benjamin"
    FINSI

    SI ageUser = 11 OU ageUser = 12 ALORS
    ECRIRE "Vous êtes pupille"
    FINSI
    
    SI ageUser = 13 OU ageUser = 14 ALORS
    ECRIRE "Vous êtes minime"
    FINSI

    SI ageUser = 15 OU ageUser = 16 ALORS
    ECRIRE "Vous êtes cadet"
    FINSI

    SI ageUser = 17 OU ageUser = 18 ALORS
    ECRIRE "Vous êtes junior"
    FINSI

    SI ageUser >= 19 ET ageUser =< 34 ALORS
    ECRIRE "Vous êtes sénior"
    FINSI

    SI ageUser >= 35  ALORS
    ECRIRE "Vous êtes vétéran"
    FINSI
```