Exercice 2a.5 : Ma bicyclette

Réalisez l’algorithme et le programme correspondant au texte ci-dessous :

S’il fait beau demain, j’irai faire une balade à bicyclette.

Je n’ai pas utilisé ma bicyclette depuis plusieurs mois, peut-être n’est-elle plus en parfait état de fonctionnement.

Si c’est le cas, je passerai chez le garagiste avant la balade. J’espère que les réparations seront immédiates sinon je devrai renoncer à la balade en bicyclette. Comme je veux de toute façon profiter du beau temps, si mon vélo n’est pas utilisable, j’irai à pied jusqu’à l’étang pour cueillir les joncs.

S’il ne fait pas beau, je consacrerai ma journée à la lecture. J’aimerais relire le 1er tome de Game of Thrones. Je pense posséder ce livre, il doit être dans la bibliothèque du salon.

Si je ne le retrouve pas, j’irai l’emprunter à la bibliothèque municipale. Si le livre n’est pas disponible, j’emprunterai un roman policier.

Je rentrerai ensuite directement à la maison.

Dès que j’aurai le livre qui me convient, je m’installerai confortablement dans un fauteuil et je me plongerai dans la lecture.

```
VARIABLES
beauTemps est un BOOLEAN
veloOk est un BOOLEAN
reparationImmediate est un BOOLEAN
livrePossede est un BOOLEAN
livreDispoBibliotheque est un BOOLEAN


TRAITEMENT
SI beauTemps ALORS
	ECRIRE "Je vérifie l'état de mon vélo"
		
		SI veloOK ALORS
			ECRIRE "Je vais faire une balade en vélo"
		SINON
			ECRIRE "Je vais chez le garagiste"
			
			SI reparationImmediate ALORS
				ECRIRE " Je vais jusqu'a l'étang en vélo"
			SINON
				ECRIRE "Je vais a pied jusqu'a l'étang"
			FIN SI
		FIN SI
SINON
	ECRIRE "Je reste chez moi et je lis"
	
	SI livrePossede ALORS
		ECRIRE "Je m'installe dans mon fauteuil et je lis"
	
	SINON
		ECRIRE "Je vais l'emprunter à la bibliothèque"
		
		SI livreDispoBibliotheque ALORS
			ECRIRE "Je l'emprunte "
		SINON
			ECRIRE "J'emprunte un roman policier"	
		FIN SI
			ECRIRE "Je rentre chez moi"
		
	FIN SI
FIN SI
```