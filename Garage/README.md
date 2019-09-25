# To do list #

## Objectif de la branche "Listes" ##
Cr�er deux listes comparables de v�hicules, pour supprimer les doublons, avant de cr�er les garages et d'enregistrer le fichier texte garage.txt

 ## EXERCICE 1 ##
 ### Objectif: Reproduire les classes: Garage, Vehicule, Option et deux impl�mentations d'option (GPS, Climatisation) du tutoriel OpenClassroom  ###
 
 EXERCICE 1 (Termin�)| Observations
 --- | ---
 Reproduire les classes: Garage, Vehicule, Option  | [Garage.java](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/garage/Garage.java "Acc�dez � Garage.java !")
 Reproduire les classes: Garage, Vehicule, Option  | [Vehicule.java](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/garage/Vehicule.java "Acc�dez � Vehicule.java") 
 Reproduire les classes: Garage, Vehicule, Option  | [Option.java](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/garage/Option.java "Acc�dez � Option.java")
 Ajouter une m�thode "calculerValeurStock" dans Garage qui devra cumuler le prix des voitures (avec leurs options) du garage. |[M�thode : ligne 144 � 150 de Garage.java](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/garage/Garage.java "Acc�dez � la classe Garage")
 Ajouter une m�thode "getVoituresMoinsCher(int quantite)" dans Garage qui devra retourner les n voitures les moins cher (avec leurs options). | [M�thode getVoituresMoinsCher() ligne 246 de  Garage.java](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/garage/Garage.java "Acc�dez � Garage.java !")
 Dans une classe GarageTest, faire une m�thode main: | [GarageTest avec sa m�thode main](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/garage/GarageTest.java "Acc�dez � la classe GarageTest")
 Cr�er 5 voitures avec leurs options dans main| [M�thode main de GarageTest](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/garage/GarageTest.java "Acc�dez � la classe GarageTest")
 Cr�er un garage et y ajouter les voitures dans main | [M�thode main de GarageTest](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/garage/GarageTest.java "Acc�dez � la classe GarageTest")
 Faire deux impl�mentations d'option (GPS, Climatisation) | [GPS: ligne 33 de GarageTest.java](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/garage/GarageTest.java "Acc�dez � la classe GarageTest")
 Faire deux impl�mentations d'option (GPS, Climatisation) |[Climatisation: ligne 41 de GarageTest.java](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/garage/GarageTest.java "Acc�dez � la classe GarageTest")
 Afficher la valeur du stock du garage | [Ligne 82 de la classe Garage](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/garage/Garage.java "Acc�dez � Garage.java !")
 Afficher les 3 voitures les moins cher | [Ligne 87 de la classe Garage](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/garage/Garage.java "Acc�dez � Garage.java !")
 
 ## EXERCICE 2 ##
 ### Objectif:  Supprimer les doublons entre deux listes d'objets. ### 
 
  EXERCICE 2 | Observations
 ---------- | ----------
 Dans une classe JUnit, instancier deux listes de Vehicule. | [Lignes 32 et 87 du fichier JUnit GarageTest.java](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/tests/GarageTest.java "Acc�der au code")
 Remplir ces deux listes en incorporant des doublons entre les deux listes, en utilisant l'attribut 'immatriculation' de Vehicule. | [Lignes 87 et suivantes dans GarageTest.java](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/tests/GarageTest.java "Acc�s au fichier")
 Faire une m�thode qui permet de supprimer les doublons de la premi�re liste. | [Ligne 221 et suivantes de Garage.java](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/garage/Garage.java "Acc�der au fichier")
 Afficher les �l�ments restants de cette premi�re liste. | [Ligne 136 de GarageTest.java](https://github.com/MarcHarnist/Garage/blob/dev/Garage/src/fr/marcharnist/tests/GarageTest.java "Acc�der au code")
 
 ## Aide ##
 https://github.com/junit-team/junit4/wiki/download-and-install
