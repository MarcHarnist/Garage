package fr.marcharnist.garage;
/**
 * TODO
 * Dans une classe JUnit, instancier deux listes de Vehicule.
 * 
 * @author Marc L. Harnist (Visitez mon site marcharnist.fr)
 * @since 2019-05-17
 * @see https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java
 */
public class GarageTest {

	public static void main(String[] args) {
		
		 Garage garage = new Garage();   
	   	 
	   	 Vehicule lag1 = new Lagouna();// Les attributs de l'objet sont déclarés dans la classe

	   	 lag1.setMoteur(new MoteurEssence("150 Chevaux", 10256d));
	   	 lag1.addOption(new GPS());
	   	 lag1.addOption(new SiegeChauffant());
	   	 lag1.addOption(new VitreElectrique());
	   	 lag1.addImmatriculation("GG-000-PP");
	   	 garage.add(lag1);
	   		 
	   	 Vehicule A300B_2 = new A300B();
	   	 A300B_2.setMoteur(new MoteurElectrique("1500 W", 1234d));
	   	 A300B_2.addOption(new Climatisation());
	   	 A300B_2.addOption(new BarreDeToit());
	   	 A300B_2.addOption(new SiegeChauffant());
	   	 lag1.addImmatriculation("GG-001-PP");
	   	 garage.add(A300B_2);
	   	 
	   	 Vehicule d4_1 = new D4();
	   	 d4_1.setMoteur(new MoteurDiesel("200 Hdi", 25684.80d));
	   	 d4_1.addOption(new BarreDeToit());
	   	 d4_1.addOption(new Climatisation());
	   	 d4_1.addOption(new GPS());
	   	 lag1.addImmatriculation("GG-002-PP");
	   	 garage.add(d4_1);   	 
	   	 
	   	 Vehicule lag2 = new Lagouna();
	   	 lag2.setMoteur(new MoteurDiesel("500 Hdi", 456987d));
	   	 lag1.addImmatriculation("GG-999-PP");
	   	 garage.add(lag2);
	   	 
	   	 Vehicule A300B_1 = new A300B();
	   	 A300B_1.setMoteur(new MoteurHybride("ESSENCE/Electrique", 12345.95d));
	   	 A300B_1.addOption(new VitreElectrique());
	   	 A300B_1.addOption(new BarreDeToit());
	   	 lag1.addImmatriculation("GG-003-PP");
	   	 garage.add(A300B_1);
	   	 
	   	 Vehicule d4_2 = new D4();
	   	 d4_2.setMoteur(new MoteurElectrique("100 KW", 1224d));
	   	 d4_2.addOption(new SiegeChauffant());
	   	 d4_2.addOption(new BarreDeToit());
	   	 d4_2.addOption(new Climatisation());
	   	 d4_2.addOption(new GPS());
	   	 d4_2.addOption(new VitreElectrique());
	   	 lag1.addImmatriculation("GG-004-PP");
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
