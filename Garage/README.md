# To do list #

## Dernières modifications ##
Suppression de l'envoie de chaînes de caractères depuis la classe Garage vers la classe GarageTest et suppression des "system.out.println" des classes POJO

## Objectif de la branche "dev" ##
Créer deux listes comparables de véhicules, pour supprimer les doublons, avant de créer les garages et d'enregistrer le fichier texte garage.txt

 ## EXERCICE 1 ##
 ### Objectif: Reproduire les classes: Garage, Vehicule, Option et deux implémentations d'option (GPS, Climatisation) du tutoriel OpenClassroom  ###
 
 EXERCICE 1 (Terminé)| Observations 
 --- | ---
 Reproduire les classes: Garage, Vehicule, Option  | [Garage.java](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/garage/Garage.java "Accédez à Garage.java !")
 Reproduire les classes: Garage, Vehicule, Option  | [Vehicule.java](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/garage/Vehicule.java "Accédez à Vehicule.java") 
 Reproduire les classes: Garage, Vehicule, Option  | [Option.java](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/garage/Option.java "Accédez à Option.java")
 Ajouter une méthode "calculerValeurStock" dans Garage qui devra cumuler le prix des voitures (avec leurs options) du garage. |[Méthode : ligne 144 à 150 de Garage.java](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/garage/Garage.java "Accédez à la classe Garage")
 Ajouter une méthode "getVoituresMoinsCher(int quantite)" dans Garage qui devra retourner les n voitures les moins cher (avec leurs options). | [Méthode getVoituresMoinsCher() ligne 246 de  Garage.java](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/garage/Garage.java "Accédez à Garage.java !")
 Dans une classe GarageTest, faire une méthode main: | [GarageTest avec sa méthode main](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/garage/GarageTest.java "Accédez à la classe GarageTest")
 Créer 5 voitures avec leurs options dans main| [Méthode main de GarageTest](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/garage/GarageTest.java "Accédez à la classe GarageTest")
 Créer un garage et y ajouter les voitures dans main | [Méthode main de GarageTest](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/garage/GarageTest.java "Accédez à la classe GarageTest")
 Faire deux implémentations d'option (GPS, Climatisation) | [GPS: ligne 88 de GarageTest.java](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/garage/GarageTest.java "Accédez à la classe GarageTest")
 Faire deux implémentations d'option (GPS, Climatisation) |[Climatisation: ligne 95 de GarageTest.java](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/garage/GarageTest.java "Accédez à la classe GarageTest")
 Afficher la valeur du stock du garage | [Ligne 82 de la classe Garage](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/garage/Garage.java "Accédez à Garage.java !")
 Afficher les 3 voitures les moins chères | [Ligne 87 de la classe Garage](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/garage/Garage.java "Accédez à Garage.java !")
 
 ## EXERCICE 2 ##
 ### Objectif:  Supprimer les doublons entre deux listes d'objets. ### 
 
  EXERCICE 2 | Observations
 ---------- | ----------
 Dans une classe JUnit, instancier deux listes de Vehicule. | [Lignes 29 et 79 du fichier JUnit GarageTest.java](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/tests/GarageTest.java "Accéder au code")
 Remplir ces deux listes en incorporant des doublons entre les deux listes, en utilisant l'attribut 'immatriculation' de Vehicule. | [Lignes 80 et suivantes dans GarageTest.java](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/tests/GarageTest.java "Accès au fichier")
 Faire une méthode qui permet de supprimer les doublons de la première liste. | [Ligne 166 et suivantes de Garage.java](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/garage/Garage.java "Accéder au fichier")
 Afficher les éléments restants de cette première liste. | [Ligne 127 de GarageTest.java](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/tests/GarageTest.java "Accéder au code")
 
 ## Correction ##
 ### La méthode getVoituresMoinsCher ###

 Corriger | Observations
 ---------- | ----------
 Il faudrait ajouter un argument int pour pouvoir spécifier combien de voitures on veut en retour. | en cours de développement le 27 sept 2019
 Faire en sorte qu'elle renvoie des pojos (les objets) et non pas une String, histoire de bien rester "objet". |

 ### Dans les tests ###
 
 Corriger | Observations
 ---------- | ----------
 Il est primordial d'utiliser les assertions (assertTrue, assertEquals...) pour bien contrôler les valeurs retournées. |
 Utiliser le fail pour faire planter un test si on sait que le code ne devrait pas passer à cet endroit. | 
 ## Aide ##
 https://github.com/junit-team/junit4/wiki/download-and-install
 
 
 
 
 
 
