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
    

    SINON SI ageUser = 5 OU ageUser = 6 ALORS
    ECRIRE "Vous êtes débutant"
    

    SINON SI ageUser = 7 OU ageUser = 8 ALORS
    ECRIRE "Vous êtes poussin"
    

    SINON SI ageUser = 9 OU ageUser =10 ALORS
    ECRIRE "Vous êtes benjamin"
    

    SINON SI ageUser = 11 OU ageUser = 12 ALORS
    ECRIRE "Vous êtes pupille"
    
    
    SINON SI ageUser = 13 OU ageUser = 14 ALORS
    ECRIRE "Vous êtes minime"
    

    SINON SI ageUser = 15 OU ageUser = 16 ALORS
    ECRIRE "Vous êtes cadet"
    

    SINON SI ageUser = 17 OU ageUser = 18 ALORS
    ECRIRE "Vous êtes junior"
    

    SINON SI ageUser >= 19 ET ageUser =< 34 ALORS
    ECRIRE "Vous êtes sénior"
    

    SINON SI ageUser >= 35  ALORS
    ECRIRE "Vous êtes vétéran"
    FINSI
    
```

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

ECRIRE "Et combien de minutes ?"
LIRE minutes

SI hour est supérieur à 24 OU minutes est supérieur à 60
ALORS
ECRIRE "Les données saisies sont invalides"

future = minutes + 3

SI hour est supérieur à 24 OU future est supérieur à 60
ALORS 
ECRIRE "Horaire invalide"
SINON ECRIRE "Dans 3 minutes il sera", hour ,"h", future "."


```