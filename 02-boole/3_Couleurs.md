# Soient 3 couleurs:
* Cb = couleur de base
* Cad1 = 1ère couleur additionnelle
* Cad2 = 2ème couleur additionnelle
* Cr = couleur résultat

Pour chacune des affirmations suivantes, vous présenterez:
* La table de vérité à partir des propositions données
* L'expression booléenne simplifiée. Pour cet énoncé, vous disposez des fonctions logiques ET (.), OU (+) et NON (variable)

## A. Le résultat attendu est Cr = couleur très claire.
Cr est de type "très claire" si les 2 couleurs additionnelles sont blanches. Le blanc étant exclu de cette catégorie, la couleur de base ne doit pas être blanche.
Les propositions sont:
* P1 : Cr = très claire
* P2 : Cb = bleu
* P3 : Cad1 = blanc
* P4 : Cad2 = blanc

### Table de vérité
| Entrée | Entrée | Entrée| Sortie |
| --- | --- | --- | --- |
| P2 | P3 | P4 | P1 |
| 0 | 0 | 0 | 0 |
| 0 | 0 | 1 | 0 |
| 0 | 1 | 1 | 0 |
| 1 | 1 | 1 | 1 |
| 1 | 1 | 0 | 0 |
| 1 | 0 | 0 | 0 |
| 1 | 0 | 1 | 0 |
| 0 | 1 | 0 | 0 |

### Expression booléene
P1 = P3.P4

## B. Le résultat attendu est Cr = couleur claire.
Cr est clair si une seule des 2 couleurs additionnelles est blanche. Le blanc étant exclu de cette catégorie, la couleur  de base ne doit pas être blanche.
Les propositions sont:
* P1 : Cr = claire
* P2 : Cb = rouge
* P3 : Cad1 = blanc
* P4 : Cad2 = blanc

### Table de vérité
| Entrée | Entrée | Entrée| Sortie|
| --- | --- | --- | --- |
| P2 | P3 | P4 | P1 |
| 0 | 0 | 0 | 0 |
| 0 | 0 | 1 | 0 |
| 0 | 1 | 0 | 0 |
| 1 | 0 | 0 | 0 |
| 1 | 1 | 0 | 1 |
| 1 | 0 | 1 | 1 |
| 0 | 1 | 1 | 0 |
| 1 | 1 | 1 | 0 |

### Expression booléene
P1= P2.P3(+)P4
