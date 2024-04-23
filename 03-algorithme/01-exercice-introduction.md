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
