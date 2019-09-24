package fr.marcharnist.tests;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import fr.marcharnist.garage.A300B;
import fr.marcharnist.garage.BarreDeToit;
import fr.marcharnist.garage.Climatisation;
import fr.marcharnist.garage.D4;
import fr.marcharnist.garage.GPS;
import fr.marcharnist.garage.Garage;
import fr.marcharnist.garage.Lagouna;
import fr.marcharnist.garage.MoteurDiesel;
import fr.marcharnist.garage.MoteurElectrique;
import fr.marcharnist.garage.MoteurEssence;
import fr.marcharnist.garage.MoteurHybride;
import fr.marcharnist.garage.SiegeChauffant;
import fr.marcharnist.garage.Vehicule;
import fr.marcharnist.garage.VitreElectrique;

class GarageTest {

	@Test
	void test() {
		
		// creation du garage
		Garage garage = new Garage(); 
		 
		// JUnit: creation liste vehicules pour les tests JUnit
		List<Vehicule> listeVehicules1 = new ArrayList<>();
	   	 
	   	Vehicule lag1 = new Lagouna();// Les attributs de l'objet sont déclarés dans la classe
	   	lag1.setMoteur(new MoteurEssence("150 Chevaux", 10256d));
	   	lag1.addOption(new GPS());
	   	lag1.addOption(new SiegeChauffant());
	   	lag1.addOption(new VitreElectrique());
	   	lag1.addImmatriculation("GG-000-PP");
	   	garage.add(lag1);
	   	listeVehicules1.add(lag1);
	   	 	   		 
	   	 Vehicule A300B_2 = new A300B();
	   	 A300B_2.setMoteur(new MoteurElectrique("1500 W", 1234d));
	   	 A300B_2.addOption(new Climatisation());
	   	 A300B_2.addOption(new BarreDeToit());
	   	 A300B_2.addOption(new SiegeChauffant());
	   	 A300B_2.addImmatriculation("GG-001-PP");
	   	 garage.add(A300B_2);
	   	 listeVehicules1.add(A300B_2);
	   	 
	   	 Vehicule d4_1 = new D4();
	   	 d4_1.setMoteur(new MoteurDiesel("200 Hdi", 25684.80d));
	   	 d4_1.addOption(new BarreDeToit());
	   	 d4_1.addOption(new Climatisation());
	   	 d4_1.addOption(new GPS());
	   	 d4_1.addImmatriculation("GG-002-PP");
	   	 garage.add(d4_1);   	 
	   	 listeVehicules1.add(d4_1);
	   	 
	   	 Vehicule lag2 = new Lagouna();
	   	 lag2.setMoteur(new MoteurDiesel("500 Hdi", 456987d));
	   	 lag2.addImmatriculation("GG-003-PP");
	   	 garage.add(lag2);
	   	 listeVehicules1.add(lag2);
	   	 
	   	 Vehicule A300B_1 = new A300B();
	   	 A300B_1.setMoteur(new MoteurHybride("ESSENCE/Electrique", 12345.95d));
	   	 A300B_1.addOption(new VitreElectrique());
	   	 A300B_1.addOption(new BarreDeToit());
	   	 A300B_1.addImmatriculation("GG-004-PP");
	   	 garage.add(A300B_1);
	   	 listeVehicules1.add(A300B_1);
	   	 
	   	 Vehicule d4_2 = new D4();
	   	 d4_2.setMoteur(new MoteurElectrique("100 KW", 1224d));
	   	 d4_2.addOption(new SiegeChauffant());
	   	 d4_2.addOption(new BarreDeToit());
	   	 d4_2.addOption(new Climatisation());
	   	 d4_2.addOption(new GPS());
	   	 d4_2.addOption(new VitreElectrique());
	   	 d4_2.addImmatriculation("GG-005-PP");
	   	 garage.add(d4_2);
	   	 listeVehicules1.add(d4_2);
	   	 
	   	 // Creation de la liste 2
		 List<Vehicule> listeVehicules2 = new ArrayList<>();	   	 
		 
		 Vehicule lag21 = new Lagouna();
	   	 lag21.setMoteur(new MoteurDiesel("500 Hdi", 456987d));
	   	 lag21.addImmatriculation("GG-006-PP");
	   	 garage.add(lag21);
	   	 listeVehicules2.add(lag21);
	   	 
	   	 Vehicule A300B_11 = new A300B();
	   	 A300B_11.setMoteur(new MoteurHybride("ESSENCE/Electrique", 12345.95d));
	   	 A300B_11.addImmatriculation("GG-007-PP");
	   	 garage.add(A300B_11);
	   	 listeVehicules2.add(A300B_11);
	   	 
	   	 Vehicule d4_21 = new D4();
	   	 d4_21.setMoteur(new MoteurElectrique("100 KW", 1224d));
	  
	   	 /**
	   	  * creation d'un doublon d'immatriculation pour tests JUnit
	   	  */
	   	 d4_21.addImmatriculation("GG-005-PP");
	   	 garage.add(d4_21);
	   	 listeVehicules2.add(d4_21);
	   	 
		 // AFFICHAGE PROVISOIRE DE LA PREMIERE LISTE //
		 System.out.println();
		 System.out.println("/** Affichage provisoire de \"listeVehicules1\" - GarageTest.java ligne 85 -");
		 for(Vehicule v : listeVehicules1) {
			 System.out.println(" * " + v.toString());
		 }
		 System.out.println(" **/");
		 // FIN AFFICHAGE PROVISOIRE DE LA PREMIERER LISTE //
		 
		 // AFFICHAGE PROVISOIRE DE LA SECONDE LISTE //
		 System.out.println();
		 System.out.println("/** Affichage provisoire de la seconde liste de véhicules: \"listeVehicules2\" - GarageTest.java ligne 123 -");
		 for(Vehicule v : listeVehicules2) {
			 System.out.println(" * " + v.toString());
		 }
		 System.out.println(" **/");
		 // FIN AFFICHAGE PROVISOIRE DE LA SECONDE LISTE //
		 
		 /**
		  * Methode de Suppression des doublons
		  */
		 System.out.println("****** appel méthode supprimerDoublonsDansDesListes *******");
		 Garage.supprimerDoublonsDansDesListes(listeVehicules1, listeVehicules2);
		 System.out.println("***********************************************************");
		 
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
	}
}
