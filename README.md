API TRAINER
===========

Cette API permet de requêter les dresseurs pokemons.
Ici Ash et Misty.

2 routes sont possibles :

/trainers
----------

Qui représente l'ensemble des dresseurs au format JSON

/trainers/NameTrainer

Qui représente seulement un dresseur au format JSON.
On peut donc tester en remplaçant NameTrainer par Ash par exemple.

Les informations du dresseur sont :
- Son nom
- La liste de ses pokémons

Cette API a été développé en local car le réseau de développement était trop filtré et ne permettait pas un bon usage de l'API
L'API est déployé sur Heroku a cette adresse : https://trainer-api-tvanmarcke.herokuapp.com/
