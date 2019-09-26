package fr.marcharnist.mockito;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

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

	
	
	
	
	// d�veloppement en cours
	
	
	
	
	
	//@RunWith(MockitoJunitRunner.class)
	//@test
	void test() {
		
		// JUnit: creation de listes de vehicules pour les tests JUnit
		List<Vehicule> listeVehicules1 = new ArrayList<>();
	   	 
	   	Vehicule lag1 = new Lagouna();// Les attributs de l'objet sont d�clar�s dans la classe
	   	lag1.setMoteur(new MoteurEssence("150 Chevaux", 10256d));
	   	lag1.addOption(new GPS());
	   	lag1.addOption(new SiegeChauffant());
	   	lag1.addOption(new VitreElectrique());
	   	lag1.addImmatriculation("GG-000-PP");
	   	listeVehicules1.add(lag1);
	   	 	   		 
	   	 Vehicule A300B_2 = new A300B();
	   	 A300B_2.setMoteur(new MoteurElectrique("1500 W", 1234d));
	   	 A300B_2.addOption(new Climatisation());
	   	 A300B_2.addOption(new BarreDeToit());
	   	 A300B_2.addOption(new SiegeChauffant());
	   	 A300B_2.addImmatriculation("GG-001-PP");
	   	 listeVehicules1.add(A300B_2);
	   	 
	   	 Vehicule d4_1 = new D4();
	   	 d4_1.setMoteur(new MoteurDiesel("200 Hdi", 25684.80d));
	   	 d4_1.addOption(new BarreDeToit());
	   	 d4_1.addOption(new Climatisation());
	   	 d4_1.addOption(new GPS());
	   	 d4_1.addImmatriculation("GG-002-PP");
	   	 listeVehicules1.add(d4_1);
	   	 
	   	 Vehicule lag2 = new Lagouna();
	   	 lag2.setMoteur(new MoteurDiesel("500 Hdi", 456987d));
	   	 lag2.addImmatriculation("GG-003-PP");
	   	 listeVehicules1.add(lag2);
	   	 
	   	 Vehicule A300B_1 = new A300B();
	   	 A300B_1.setMoteur(new MoteurHybride("ESSENCE/Electrique", 12345.95d));
	   	 A300B_1.addOption(new VitreElectrique());
	   	 A300B_1.addOption(new BarreDeToit());
	   	 A300B_1.addImmatriculation("GG-004-PP");
	   	 listeVehicules1.add(A300B_1);
	   	 
	   	 Vehicule d4_2 = new D4();
	   	 d4_2.setMoteur(new MoteurElectrique("100 KW", 1224d));
	   	 d4_2.addOption(new SiegeChauffant());
	   	 d4_2.addOption(new BarreDeToit());
	   	 d4_2.addOption(new Climatisation());
	   	 d4_2.addOption(new GPS());
	   	 d4_2.addOption(new VitreElectrique());
	   	 d4_2.addImmatriculation("GG-005-PP");
	   	 listeVehicules1.add(d4_2);

	   	 
	   	 // Creation de la liste 2
		 List<Vehicule> listeVehicules2 = new ArrayList<>();	   	 
		 /**
	   	  * creation d'un doublon d'immatriculation pour tests JUnit
	   	  */
	   	 Vehicule d4_21 = new D4();
	   	 d4_21.setMoteur(new MoteurElectrique("100 KW", 1224d));
	   	 d4_21.addImmatriculation("GG-005-PP"); // doublon t�moin pour les tests: il devra �tre supprim�
	   	 listeVehicules2.add(d4_21);

	   	 Vehicule lag21 = new Lagouna();
	   	 lag21.setMoteur(new MoteurDiesel("500 Hdi", 456987d));
	   	 lag21.addOption(new BarreDeToit());
	   	 lag21.addOption(new Climatisation());
	   	 lag21.addImmatriculation("GG-006-PP");
	   	 listeVehicules2.add(lag21);
	   	 
	   	 Vehicule A300B_11 = new A300B();
	   	 A300B_11.setMoteur(new MoteurHybride("ESSENCE/Electrique", 12345.95d));
	   	 A300B_11.addImmatriculation("GG-007-PP");
	   	 listeVehicules2.add(A300B_11);

		 // AFFICHAGE PROVISOIRE DE LA PREMIERE LISTE //
		 System.out.println();
		 System.out.println("/** PREMIERE LISTE DE VEHICULES (GarageTest.java ligne 102)");
		 for(Vehicule v : listeVehicules1) {
			 System.out.println(" *  " + v.toString());
		 }
		 System.out.println(" **/");
		 // FIN AFFICHAGE PROVISOIRE DE LA PREMIERE LISTE //
		 
		 // AFFICHAGE PROVISOIRE DE LA SECONDE LISTE //
		 System.out.println();
		 System.out.println("/** SECONDE LISTE DE VEHICULES (GarageTest.java ligne 111)");
		 System.out.println(" *  (On peut observer la pr�sence d'un doublon avec la liste 1: l'immatriculation GG-005-PP)");
		 for(Vehicule v : listeVehicules2) {
			 System.out.println(" *  " + v.toString());
		 }
		 System.out.println(" **/");
		 // FIN AFFICHAGE PROVISOIRE DE LA SECONDE LISTE //
		 
		 /**
		  * Methode de Suppression des doublons
		  */
		 System.out.println();
		 System.out.println("/** SUPPRESSION DES DOUBLONS");
		 System.out.println(" *  Appel de la m�thode supprimerDoublonsDansDesListes (GarageTest.java ligne 125)");
		 Garage.supprimerDoublonsDansDesListes(listeVehicules1, listeVehicules2);
		 
		 // AFFICHAGE PROVISOIRE DE LA PREMIERE LISTE APRES SUPPRESSION DU DOUBLON //
		 System.out.println();
		 System.out.println("/** PREMIERE LISTE DE VEHICULES APRES SUPPRESSION DES DOUBLONS (GarageTest.java ligne 128)");
		 for(Vehicule v : listeVehicules1) {
			 System.out.println(" *  " + v.toString());
		 }
		 System.out.println(" **/");
		 // FIN AFFICHAGE PROVISOIRE DE LA PREMIERE LISTE APRES SUPPRESSION DU DOUBLON //
		 
		 // AFFICHAGE PROVISOIRE DE LA SECONDE LISTE APRES SUPPRESSION DU DOUBLON //
		 System.out.println();
		 System.out.println("/** SECONDE LISTE DE VEHICULES APRES SUPPRESSION DES DOUBLONS (GarageTest.java ligne 128)");
		 for(Vehicule v : listeVehicules2) {
			 System.out.println(" *  " + v.toString());
		 }
		 System.out.println(" **/");
		 // FIN AFFICHAGE PROVISOIRE DE LA PREMIERE LISTE APRES SUPPRESSION DU DOUBLON //
		 
		// creation du garage
		Garage garage = new Garage(); 
			
	   	 // ajout des v�hicules au garage depuis la liste 1
	   	 for(Vehicule v:listeVehicules1) {
	   		 garage.add(v);
	   	 }
	   	 // ajout de la liste 2 au garage
	   	 for(Vehicule v:listeVehicules2) {
	   		 garage.add(v);
	   	 }
	   	 	   	 
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
	   	  * Condition: si le fichier Garage.txt est vide (il n'a aucun caract�re)
	   	  */
	   	 if(garage.contenuDuFichierGarageTxt == "") {
	 		System.out.println(
	 				  "\n\tPremi�re lecture du fichier " + garage.nomFichierDeSauvegardeDuGarage
	 				+ "\n\tAucune voiture sauvegard�e"
	 				+ "\n\tRelancez le programme pour cr�er le garage.");
	   	 }
	   	 /**
	   	  * Affichage pour le second lancement du programme Test.java
	   	  * Else de la condition ci-dessous: le fichier Garage.txt contient au moins un caract�re
	   	  */
	   	 else {
	   		 System.out.println(
			 "\n - " + garage.nombreDeVoiture + " voitures viennent d'�tre enregistr�es dans le garage.\n\n" 
			 + garage.contenuDuFichierGarageTxt
			 + "\n - Le garage est sauvegard� dans le fichier " + garage.nomFichierDeSauvegardeDuGarage
			 + "\n - Il se trouve dans le r�pertoire \"Garage\" (ou \"Garage\\bin\" selon les PC)"
			 + "\n - Vous pouvez explorer et ouvrir ce fichier pour y trouver les voitures cr��es."
			 + "\n - Si vous utilisez la console cmd.exe de Windows, tapez Garage.txt et enter pour l'ouvrir"
			 + "\n - Pour tester � nouveau, il faut supprimer le fichier " + garage.nomFichierDeSauvegardeDuGarage 
			 + " et relancer le programme"
			 + "\n - Pour supprimer le fichier texte Garage.txt, vous pouvez lancer le programme GarageDelete.java"
			 + "\n\n Merci pour votre lecture."
			 + "\n Marc L. Harnist"
			 + "\n Visitez mon site: marcharnist.fr");
	   	 }
	}
}
