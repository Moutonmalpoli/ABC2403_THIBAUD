# Exercice 1.1 : Hello World

Ecrire un programme qui affiche “Hello World !”.

```
ECRIRE "Hello World"
```

# Exercice 1.2 : Hello you

L’utilisateur est invité à saisir son prénom dans la console.

Le programme affiche “Bonjour “ suivi du prénom saisi.

```
VARIABLES
    prenom est un CHAINE DE CARACTERES

TRAITEMENT
    ECRIRE "Saisissez votre prénom"
    LIRE prenom
    ECRIRE "bonjour", prenom, "." (concaténation)

```
Alternative avec contrôle sur la longueur du prénom
```
VARIABLES
    prenom est un CHAINE DE CARACTERES

TRAITEMENT
    ECRIRE "Saisissez votre prénom"
    
    LIRE prenom
    SI  prenom.LONGUEUR > 2 ALORS
        ECRIRE "bonjour", prenom, "." (concaténation)
    SINON
        ECRIRE "Prénom invalive
    FIN SI    
```

# Exercice 1.3 : Calcul de la moyenne de 2 nombres

L’utilisateur est invité à saisir 2 nombres entier.

Le programme calcule la moyenne des 2 nombres et affiche le résultat sous forme de nombre décimal.       

```
VARIABLES
nombre1 est un NOMBRE ENTIER
nombre2 est un NOMBRE ENTIER
moyenne est un NOMBRE REEL (nombre1 + nombre2 / 2)

TRAITEMENT
    ECRIRE "Veuillez saisir un premier nombre: "
    LIRE nombre1

    ECRIRE "Veuillez saisir un deuxième nombre: "
    LIRE nombre2

    moyenne <-- (nombre1 + nombre2) /2

RESULTAT
    ECRIRE "La moyenne de ", nombre1, "et ", nombre2, "est : ", moyenne, "."
```

# Exercice 1.4 : Calcul de l’aire et du volume d’une sphère

Lire le rayon R d’une sphère puis calculer et afficher :

    Son aire = 4 π R²
    Son volume = (4 π R³)/3

```
VARIABLES
    rayonR est un NOMBRE ENTIER
    aire est un NOMBRE REEL
    volume est un NOMBRE REEL

TRAITEMENT

    ECRIRE "Saisir le rayon de la sphère:"
    LIRE rayonR
    
    
    aire <-- 4 π rayonR²
    volume <-- (4 π rayonR³) /3

RESULTAT
    ECRIRE "L'aire de ", rayonR, "est: " aire "."
    ECRIRE "Le volume de ", rayonR "est: " volume "."    
```


# Exercice 1.5 : Calcul de la surface d’un secteur circulaire
Lire le rayon R d’un cercle et un angle A (en degré(s)).

Calculer et afficher :

    L’ aire du secteur circulaire = (π R² A) / 360

```
VARIABLES
    rayonR est un NOMBRE ENTIER
    angleA est un NOMBRE ENTIER
    aireCirculaire est un NOMBRE REEL

TRAITEMENT
    ECRIRE "Saisir le rayon du cercle: "
    LIRE rayonR

    ECRIRE "Saisir l'angle A: "
    LIRE angleA

    aireCirculaire <--  (π rayonR² angleA) / 360

RESULTAT
    ECRIRE "L'aire circulaire du rayon ", rayonR, "et de l'angle ", angleA, "est: " aireCirculaire "."

```

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