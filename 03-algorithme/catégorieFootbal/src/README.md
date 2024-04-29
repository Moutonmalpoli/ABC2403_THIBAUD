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
