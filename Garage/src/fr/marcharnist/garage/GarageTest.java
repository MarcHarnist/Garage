package fr.marcharnist.garage;
/**
 * 
 * @author Marc L. Harnist (Visitez mon site marcharnist.fr)
 * @since 2019-05-17
 * @see https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java
 *
 *	Bienvenue dans le fichier Test du projet.
 *  Ce fichier Test est utilisé pour lancer le programme du projet
 *  Le fichier Garage.txt est créé vide lors du premier lancement du programme Test.java.
 *  Les voitures du garage sont sauvegardées dans ce fichier au second lancement
 *  du programme Test.java
 *  Le fichier Garage.txt est supprimé en lançant le programme GarageDelete.java
 *  Bonne lecture,
 *  Marc
 *  
 *  
 *  
 *  LE PROJET
 *  
 *  Travail pratique (TP) LE GARAGE
 *  
 *  THEME
 *  Mettre en pratique la partie 1 et 2 du cours Java d'Openclassroom
 *   - création de classes;
 *   - héritage;
 *   - packages;
 *   - énumération;
 *   - générique;
 *   - fichiers.
 *   
 *   
 *  BESOINS DU DEMANDEUR
 *  Liste des tâches
 *  1. Créer le projet Java Garage et ses fichiers avec Eclipse
 *  2. Rendre le projet dans une archive Zip
 *  
 *
 *  TACHES DU PROGRAMME
 *  1. Créer un garage,
 *  2. Le sauvegarder dans un fichier,
 *  3. A chaque fois qu'un nouveau véhicule est ajouté dans le garage,
 *     celui-ci se sauvegarde automatiquement dans un fichier.
 *  4. Charger automatiquement le garage lors de son instanciation.
 *
 *	EFFETS VISUELS AU LANCEMENT DU PROGRAMME (CLASSE "TEST")
 *    Au premier lancement de la classe "Test", la console doit afficher:
 *  	Aucune voiture sauvegardée!
 *  	***************************
 *  	* Garage Openclassrooms   *
 *  	***************************
 *  
 *    Au second lancement de la classe "Test", la console doit afficher:
 *     + Voiture RENO: Lagouna Moteur ESSENCE 150 Chevaux (23123.0€) [les options] d'une valeur totale de 24011.75€
 *     ... les 5 autres voitures
 *
 *
 *	INVENTAIRE DES FICHIERS A ECRIRE
 *  Selon le diagramme des classes, il va falloir créer 18 fichiers
 *  1. classe Garage 
 *  2. enum Marque
 *  3. classe abstraite Moteur
 *  4. enum TypeMoteur
 *  5. classe Véhicule lié à l'énumération Marque et enfant de la classe Garage: les données vont dans les deux sens
 *  6. interface Option
 *  7. classe MoteurHybride qui hérite de la classe Moteur
 *  8. classe MoteurDiesel qui hérite de la classe Moteur
 *  9. classe MoteurElectrique qui hérite de la classe Moteur
 *  10.classe MoteurEssence qui hérite de la classe Moteur
 *  11.classe GPS qui implémente l'interface Option
 *  12.classe BarreDeToit qui implémente l'interface Option
 *  13.classe Climatisation qui implémente l'interface Option
 *  14.classe SiegeChauffant qui implémente l'interface Option
 *  15. classe VitreElectrique qui implémente l'interface Option
 *  16.classe Lagouna  qui hérite de la classe Vehicule
 *  17.classe D4 qui hérite de la classe Vehicule
 *  18.classe A300B qui hérite de la classe Vehicule
 *  
 */
public class GarageTest {

	public static void main(String[] args) {
		Garage garage = new Garage();   
	   	 
	   	 Vehicule lag1 = new Lagouna();// Les attributs de l'objet sont déclarés dans la classe

	   	 lag1.setMoteur(new MoteurEssence("150 Chevaux", 10256d));
	   	 lag1.addOption(new GPS());
	   	 lag1.addOption(new SiegeChauffant());
	   	 lag1.addOption(new VitreElectrique());
	   	 garage.add(lag1);
	   		 
	   	 Vehicule A300B_2 = new A300B();
	   	 A300B_2.setMoteur(new MoteurElectrique("1500 W", 1234d));
	   	 A300B_2.addOption(new Climatisation());
	   	 A300B_2.addOption(new BarreDeToit());
	   	 A300B_2.addOption(new SiegeChauffant());
	   	 garage.add(A300B_2);
	   	 
	   	 
	   	 
	   	 Vehicule d4_1 = new D4();
	   	 d4_1.setMoteur(new MoteurDiesel("200 Hdi", 25684.80d));
	   	 d4_1.addOption(new BarreDeToit());
	   	 d4_1.addOption(new Climatisation());
	   	 d4_1.addOption(new GPS());
	   	 garage.add(d4_1);   	 
	   	 
	   	 Vehicule lag2 = new Lagouna();
	   	 lag2.setMoteur(new MoteurDiesel("500 Hdi", 456987d));
	   	 garage.add(lag2);
	   	 
	   	 Vehicule A300B_1 = new A300B();
	   	 A300B_1.setMoteur(new MoteurHybride("ESSENCE/Electrique", 12345.95d));
	   	 A300B_1.addOption(new VitreElectrique());
	   	 A300B_1.addOption(new BarreDeToit());
	   	 garage.add(A300B_1);
	   	 
	   	 Vehicule d4_2 = new D4();
	   	 d4_2.setMoteur(new MoteurElectrique("100 KW", 1224d));
	   	 d4_2.addOption(new SiegeChauffant());
	   	 d4_2.addOption(new BarreDeToit());
	   	 d4_2.addOption(new Climatisation());
	   	 d4_2.addOption(new GPS());
	   	 d4_2.addOption(new VitreElectrique());
	   	 garage.add(d4_2);   
	   	 
	   	 /**
	   	  *  Enregistre le garage dans le fichier bin/Garage.txt
	   	  */
	   	 garage.enregister();

	   	 System.out.println();
	   	 System.out.println("*********************************************");
	   	 System.out.println("*           GARAGE OPENCLASSROOMS           *");
	   	 System.out.println("*********************************************");
	   	 
	   	 garage.lireGarageTxt();
	   	 
	   	 /**
	   	  * Premier lancement du programme Test.java
	   	  * Condition: si le fichier Garage.txt est vide (il n'a aucun caractère)
	   	  */
	   	 if(garage.contenuDuFichierGarageTxt == "") {
	 		System.out.println(
	 				  "\n\tPremière lecture du fichier " + garage.nomFichierDeSauvegardeDuGarage
	 				+ "\n\tAucune voiture sauvegardée"
	 				+ "\n\tRelancez le programme pour créer le garage.");
	   	 }
	   	 /**
	   	  * Affichage pour le second lancement du programme Test.java
	   	  * Else de la condition ci-dessous: le fichier Garage.txt contient au moins un caractère
	   	  */
	   	 else {
	   		 System.out.println(
	   				 "\n - " + garage.nombreDeVoiture + " voitures viennent d'être enregistrées dans le garage.\n\n" 
	   				 + garage.contenuDuFichierGarageTxt
	   				 + "\n - Le garage est sauvegardé dans le fichier " + garage.nomFichierDeSauvegardeDuGarage
	   				 + "\n - Il se trouve dans le répertoire \"Garage\" (ou \"Garage\\bin\" selon les PC)"
	   				 + "\n - Vous pouvez explorer et ouvrir ce fichier pour y trouver les voitures créées."
	   				 + "\n - Si vous utilisez la console cmd.exe de Windows, tapez Garage.txt et enter pour l'ouvrir"
	   				 + "\n - Pour tester à nouveau, il faut supprimer le fichier " + garage.nomFichierDeSauvegardeDuGarage 
	   				 + " et relancer le programme"
	   				 + "\n - Pour supprimer le fichier texte Garage.txt, vous pouvez lancer le programme GarageDelete.java"
	   				 + "\n\n Merci pour votre lecture."
	   				 + "\n Marc L. Harnist"
	   				 + "\n Visitez mon site: marcharnist.fr");
	   	 }
	}// Ferme 	public static void main(String[] args) {
}// Ferme public class Main {

