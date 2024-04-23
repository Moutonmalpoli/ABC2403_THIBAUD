# La lumière d'un véhicule s'éclaire si une des deux portes avant est ouverte (capteurs pd et pg à coupure de circuit) ou si l'interrupteur du plafonnier est appuyé.
 Présentez:
 * Les propositions
 * La table de vérité
 * L'expression booléenne simplifiée

## Propositions:
* P1:La lumière s'éclaire
* P2:Porte avant droite (pd) ouverte
* P3: Porte avant gauche (pg) ouverte
* P4: Interrupteur plafonnier appuyé

## Table de vérité:
| Entrée | Entrée | Entrée| Sortie|
| --- | --- | --- | --- |
| P2 | P3 | P4 | P1 | 
| 0 | 0 | 0 | 0 |
| 0 | 0 | 1 | 1 |
| 0 | 1 | 0 | 1 |
| 1 | 0 | 0 | 1 |
| 1 | 0 | 1 | 1 |
| 1 | 1 | 0 | 1 |
| 0 | 1 | 1 | 1 |
| 1 | 1 | 1 | 1 |

## Expression booléenne:
P1 = P2 + P3 + P4
