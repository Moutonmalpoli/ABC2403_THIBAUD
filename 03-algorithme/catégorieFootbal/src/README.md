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
  categorie est une CHAINE DE CARACTERE

TRAITEMENT
    ECRIRE "Veuillez saisir votre âge: "
    LIRE ageUser

    SI ageUser < 5 ALORS
    	categorie:= "trop jeune"
    

    SINON SI ageUser < 7
   	 	categorie:= "débutant"
    

    SINON SI ageUser < 9 ALORS
    categorie:= "poussin"
    

    SINON SI ageUser < 11 ALORS
    	categorie:= "benjamin"
    

    SINON SI ageUser < 13 ALORS
    	categorie:= "pupille"
    
    
    SINON SI ageUser < 15 ALORS
    	categorie:= "minime"
    

    SINON SI ageUser < 17 ALORS
    	categorie:= "cadet"
    

    SINON SI ageUser < 19 ALORS
    	categorie:= "junior"
    

    SINON SI ageUser < 34 ALORS
    	categorie:= "sénior"
    

    SINON  ALORS
    	categorie:= "vétéran"
    FINSI
    
 RESULTAT
 	ECRIRE "Votre catégorie est " , catégorie, "."
```
