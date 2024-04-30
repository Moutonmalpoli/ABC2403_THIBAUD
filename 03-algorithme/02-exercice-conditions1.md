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
    SINON 
        ECRIRE "Dans 3 minutes il sera", hour ,"h", future "."


```

# Exercice 2.5 : Réprographie

Un magasin proposant un service de Réprographie facture 0.10€ les 10 premières photocopies, 0.09€ les vingt suivants et 0.08 au delà.

Écrire l’algorithme qui demande à l’utilisateur de saisir le nombre de photocopies effectuées et affiche le montant de la facture correspondante.

```
VARIABLE
    nbrPhotocopies est un NOMBRE ENTIER
    facture est un NOMBRE REEL
    factureClient est NOMBRE REEL

TRAITEMENT
    facture = 0.10
    ECRIRE "Veuillez indiquer le nombre de photocopies."
    LIRE nbrPhotocopies

    SI nbrPhotocopies > 10
        ALORS facture = 0.09

    SINON SI nbrphotocopies > 20
    facture = 0.08

    SINON 
    facture = 0.10 

    factureClient = nbrPhotocopies * facture
RESULTAT
    ECRIRE "Pour", nbrphotocopie,"photocopies votre facture sera de ", factureClient, "euros", "."

```

# Exercice 2.6 : Élections

Les élections législatives, en Guignolerie Septentrionale, obéissent à la règle suivante :

    Lorsque l’un des candidats obtient plus de 50% des suffrages, il est élu dès le premier tour.
    En cas de deuxième tour, peuvent participer uniquement les candidats ayant obtenu au moins 12.5% des voix au premier tour.

Vous devez écrire un algorithme qui permet la saisie des scores de quatre candidats au premier tour.

Cet algorithme traitera ensuite le candidat numéro 1 (et uniquement lui) : il dira s’il est élu, battu, s’il se trouve en ballottage favorable (il participe au second tour en étant arrivé en tête à l’issue du premier tour) ou défavorable (il participe au second tour sans avoir été en tête au premier tour).
```
VARIABLES
    scoreCandidat1 est un NOMBRE REEL
    scoreCandidat2 est un NOMBRE REEL
    scoreCandidat3 est un NOMBRE REEL
    scoreCandidat4 est un NOMBRE REEL
    scoreDesAutres est un NOMBRE REEL
    scoreTotal est un NOMBRE REEL

TRAITEMENT

    ECRIRE "Saisir le score du candidat n°1"
    LIRE scoreCandidat1

    ECRIRE "Saisir le score du candidat n°2"
    LIRE scoreCandidat2

    ECRIRE "Saisir le score du candidat n°3"
    LIRE scoreCandidat3

    ECRIRE "Saisir le score du candidat n°4"
    LIRE scoreCandidat4

    scoredesAutres = scoreCandidat2 + scoreCandidat3 + scoreCandidat4 

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
```
