# To do list #

## Objectif de la branche "Listes" ##
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
 Faire deux implémentations d'option (GPS, Climatisation) | [GPS: ligne 33 de GarageTest.java](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/garage/GarageTest.java "Accédez à la classe GarageTest")
 Faire deux implémentations d'option (GPS, Climatisation) |[Climatisation: ligne 41 de GarageTest.java](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/garage/GarageTest.java "Accédez à la classe GarageTest")
 Afficher la valeur du stock du garage | [Ligne 82 de la classe Garage](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/garage/Garage.java "Accédez à Garage.java !")
 Afficher les 3 voitures les moins cher | [Ligne 87 de la classe Garage](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/garage/Garage.java "Accédez à Garage.java !")
 
 ## EXERCICE 2 ##
 ### Objectif:  Supprimer les doublons entre deux listes d'objets. ### 
 
  EXERCICE 2 | Observations
 ---------- | ----------
 Dans une classe JUnit, instancier deux listes de Vehicule. | [Lignes 32 et 87 du fichier JUnit GarageTest.java](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/tests/GarageTest.java "Accéder au code")
 Remplir ces deux listes en incorporant des doublons entre les deux listes, en utilisant l'attribut 'immatriculation' de Vehicule. | [Lignes 87 et suivantes dans GarageTest.java](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/tests/GarageTest.java "Accès au fichier")
 Faire une méthode qui permet de supprimer les doublons de la première liste. | [Ligne 221 et suivantes de Garage.java](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/garage/Garage.java "Accéder au fichier")
 Afficher les éléments restants de cette première liste. | [Ligne 136 de GarageTest.java](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/tests/GarageTest.java "Accéder au code")
 
 ## Aide ##
 https://github.com/junit-team/junit4/wiki/download-and-install
