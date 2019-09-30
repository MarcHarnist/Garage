package fr.marcharnist.tests;

import static org.junit.jupiter.api.Assertions.*;

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
import fr.marcharnist.outils.Header;
import fr.marcharnist.outils.SeparerMilliers;

class GarageTestNombreOptions {

	@Test
	void Test() {
		// JUnit: creation de listes de vehicules pour les tests JUnit
		List<Vehicule> listeVehicules1 = new ArrayList<>();
	
		Vehicule lag1 = new Lagouna();// Les attributs de l'objet sont déclarés dans la classe
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
		
		/** Un véhicule avec trop d'options
		 *  Passera-t-il le test JUnit?
		 */
		Vehicule dx = new D4();
		dx.setMoteur(new MoteurDiesel("100 KW", 9000.0));
		dx.addOption(new BarreDeToit());
		dx.addOption(new BarreDeToit());
		dx.addOption(new Climatisation());
		dx.addOption(new Climatisation());
		dx.addOption(new GPS());
		dx.addOption(new GPS());
		dx.addOption(new SiegeChauffant());
		dx.setPrixTotalVehicule(100000.0);
		System.out.println("Vehicule.NOMBRE_OPTION : ");
		System.out.println(Vehicule.NOMBRE_OPTION);
		System.out.println("Nombre d'option de ce véhicule: ");
		System.out.println(dx.getNombreOptionDeCeVehicule());
		
		/**
		 * Test unitaire
		 */ 
		if (dx.getNombreOptionDeCeVehicule()>Vehicule.NOMBRE_OPTION) {
			fail("Erreur dans ce véhicule. Il n'y a pas autant d'options disponibles."
					+ " Il n'y a que " + Vehicule.NOMBRE_OPTION + " options disponibles pour ce véhicule.");
	    }
		
		// Enregistre la longueur de la liste 1
		Integer longueurListeVehicule1 = listeVehicules1.size();
	
		// Creation de la liste 2
		List<Vehicule> listeVehicules2 = new ArrayList<>();
		
		/** creation d'un doublon d'immatriculation pour tests JUnit *************/
		Vehicule d4_21 = new D4();
		d4_21.setMoteur(new MoteurElectrique("100 KW", 1224d));
		d4_21.addImmatriculation("GG-005-PP"); // doublon témoin pour les tests: il devra être supprimé
		listeVehicules2.add(d4_21);
	
		Vehicule lag21 = new Lagouna();
		lag21.setMoteur(new MoteurDiesel("500 Hdi", 456987d));
		lag21.addOption(new BarreDeToit());
		lag21.addOption(new Climatisation());
		lag21.addImmatriculation("GG-004-PP");
		listeVehicules2.add(lag21);
	
		Vehicule A300B_11 = new A300B();
		A300B_11.setMoteur(new MoteurHybride("ESSENCE/Electrique", 12345.95d));
		A300B_11.addImmatriculation("GG-006-PP");
		listeVehicules2.add(A300B_11);
	
		// AFFICHAGE PROVISOIRE DE LA PREMIERE LISTE //
		System.out.println();
		Header.titre("PREMIERE LISTE DE VEHICULES (GarageTest.java ligne 102)");
		int i = 1;
		for (Vehicule v : listeVehicules1) {
			System.out.println(" " + i + " " + v.toString());
			i++;
		}
		// FIN AFFICHAGE PROVISOIRE DE LA PREMIERE LISTE //
		
		// AFFICHAGE PROVISOIRE DE LA SECONDE LISTE //
		System.out.println();
		Header.titre("SECONDE LISTE DE VEHICULES (GarageTest.java ligne 111)");
		System.out.println(
				" (On peut observer la présence de deux doublons avec la liste 1: l'immatriculation GG-005-PP)");
		i = 1;
		for (Vehicule v : listeVehicules2) {
			System.out.println(" " + i + " " + v.toString());
			i++;
		}
		// FIN AFFICHAGE PROVISOIRE DE LA SECONDE LISTE //
	
		/**
		 *  Suppression des doublons
		 */
		System.out.println();
		Header.titre("SUPPRESSION DES DOUBLONS");
		System.out.println(" Appel de la méthode supprimerDoublonsDansDesListes (GarageTest.java ligne 125)");
		
		//déclaration des variables
		int numberOfVehiculeChecked = 0;
		Vehicule vehiculeDoublon;
	
		//parcourt toute la liste 2 en appelant la fonction "supprimer doublons dans des listes"
		for(i = 0; i<listeVehicules2.size(); i++){
			numberOfVehiculeChecked++;
			vehiculeDoublon = Garage.supprimerDoublonsDansDesListes(listeVehicules1, listeVehicules2);
			
			//Test unitaire
			//assertEquals(vehiculeDoublon.getImmatriculation(), Garage.supprimerDoublonsDansDesListes(listeVehicules1, listeVehicules2).getImmatriculation());
			
			System.out.println();
			System.out.println(" Contrôle numéro " + numberOfVehiculeChecked);
			if(vehiculeDoublon == null)
				System.out.println(" Pas de véhicule trouvé. Il n'y a pas de doublon.");
			else {
				System.out.println(" Un doublon a été détecté avec l'immatriculation: " + vehiculeDoublon.getImmatriculation());
				if(vehiculeDoublon.getDoublon() == true)
					System.out.println(" Le doublon immatriculé " + vehiculeDoublon.getImmatriculation() + " a été trouvé mais sa suppression a échouée.");
				else
					System.out.println(" Suppression du doublon " + vehiculeDoublon.getImmatriculation() + " réussie.");
			}
		}
		// Calcule combien de doublons ont été supprimés
		Integer longueurListeVehicule1Nettoyee = listeVehicules1.size();	
		
		// AFFICHAGE PROVISOIRE DE LA PREMIERE LISTE APRES SUPPRESSION DU DOUBLON //
		System.out.println();
		Header.titre("PREMIERE LISTE DE VEHICULES APRES SUPPRESSION DES DOUBLONS (GarageTest.java ligne 128)");
		System.out.print(" * " + (longueurListeVehicule1-longueurListeVehicule1Nettoyee) + " véhicules en doublons ont été supprimés.");
		System.out.println(" Il reste " + longueurListeVehicule1Nettoyee + " véhicules à enregistrer dans le garage.");
		i = 1;
		for (Vehicule v : listeVehicules1) {
			System.out.println(" " + i + " " + v.toString());
			i++;
		}
		// FIN AFFICHAGE PROVISOIRE DE LA PREMIERE LISTE APRES SUPPRESSION DU DOUBLON //
	
		// AFFICHAGE PROVISOIRE DE LA SECONDE LISTE APRES SUPPRESSION DU DOUBLON //
		System.out.println();
		Header.titre("SECONDE LISTE DE VEHICULES APRES SUPPRESSION DES DOUBLONS (GarageTest.java ligne 128)");
		i = 1;
		for (Vehicule v : listeVehicules2) {
			System.out.println(" " + i + " " + v.toString());
			i++;
		}
		// FIN AFFICHAGE PROVISOIRE DE LA PREMIERE LISTE APRES SUPPRESSION DU DOUBLON //
	
		// creation du garage
		Garage garage = new Garage();
	
		// ajout des véhicules au garage depuis la liste 1
		for (Vehicule v : listeVehicules1) {
			garage.add(v);
		}
		// ajout de la liste 2 au garage
		for (Vehicule v : listeVehicules2) {
			garage.add(v);
		}
		System.out.println();// un petit saut de ligne pour l'esthétique
		
		/** Valeur du stock du garage
		 * 
		 */
		Header.titre("Valeur du garage");
		System.out.println(" - Valeur du stock du garage: " + SeparerMilliers.separerMilliers(garage.calculerValeurStock()) + " €");
		System.out.println();
		
		
		/** LES VOITURES LES MOINS CHERES DU GARAGE
		 *  Thème: ne pas récupérer des chaînes de caractères mes des POJO, 
		 *  des objets qui possèdent un attribut "toStringAvecPrixTotal"
		 */
		// Paramétrage du nombre de voitures les moins chères à afficher
		garage.setNombreVehiculesMoinsChers(3);
		// declaration des variables
		String message = null;
		// S'il y a moins de véhicules en stock que le nombre de voitures demandées on affiche un message
		if(garage.getNombreVehiculesMoinsChers()>garage.nombreDeVoiture) {
			message = "(Note: vous avez demandé les " + garage.getNombreVehiculesMoinsChers() + " voitures les moins"
					+ " chères du garage, mais il y a seulement " + garage.nombreDeVoiture + " voitures.)";
		}
		String titreEncartVehiculesMoinsChers;
		// s'il n'y a qu'une voiture: tout est mis au singulier
		if(garage.getNombreVehiculesMoinsChers() <2) {
			titreEncartVehiculesMoinsChers = "LA VOITURE LA MOINS CHERE DU GARAGE";
			Header.titre(titreEncartVehiculesMoinsChers);
		}
		// autrement, tout est mis au pluriel
		else {
			titreEncartVehiculesMoinsChers = "LES " + garage.getNombreVehiculesMoinsChers() + " VOITURES LES MOINS CHERES DU GARAGE";
			Header.titre(titreEncartVehiculesMoinsChers);
		}
		// trie les voitures de la moins chères à la plus chères
		garage.trierVehiculesMoinsChers();
		//affiche le message
		if(message != null)
			System.out.println(message);
		i = 0;
		// affiche les voitures les moins chères par ordre croissant
		for(Vehicule vehicule:garage.listeVehicules) {
			if(i < garage.getNombreVehiculesMoinsChers()) {
				System.out.println(" " + (i + 1) + " " + vehicule.toString());
				i++;
			}
		}
		
		
		/**
		 * Enregistre le garage dans le fichier bin/Garage.txt
		 */
		garage.enregister();
	
		System.out.println();
		System.out.println(" *********************************************");
		System.out.println(" *           GARAGE OPENCLASSROOMS           *");
		System.out.println(" *********************************************");
	
		garage.lireGarageTxt();
	
		/**
		 * Premier lancement du programme Test.java Condition: si le fichier Garage.txt
		 * est vide (il n'a aucun caractère)
		 */
		if (garage.contenuDuFichierGarageTxt == "") {
			System.out.println("\n\tPremière lecture du fichier " + garage.nomFichierDeSauvegardeDuGarage
					+ "\n\tAucune voiture sauvegardée" + "\n\tRelancez le programme pour créer le garage.");
		}
		/**
		 * Affichage pour le second lancement du programme Test.java Else de la
		 * condition ci-dessous: le fichier Garage.txt contient au moins un caractère
		 */
		else {
			System.out.println("\n - " + garage.nombreDeVoiture
					+ " voitures viennent d'être enregistrées dans le garage.\n\n" + garage.contenuDuFichierGarageTxt
					+ "\n - Le garage est sauvegardé dans le fichier " + garage.nomFichierDeSauvegardeDuGarage
					+ "\n - Il se trouve dans le répertoire \"Garage\" (ou \"Garage\\bin\" selon les PC)"
					+ "\n - Vous pouvez explorer et ouvrir ce fichier pour y trouver les voitures créées."
					+ "\n - Si vous utilisez la console cmd.exe de Windows, tapez Garage.txt et enter pour l'ouvrir"
					+ "\n - Pour tester à nouveau, il faut supprimer le fichier "
					+ garage.nomFichierDeSauvegardeDuGarage + " et relancer le programme"
					+ "\n - Pour supprimer le fichier texte Garage.txt, vous pouvez lancer le programme GarageDelete.java"
					+ "\n\n Merci pour votre lecture." + "\n Marc L. Harnist" + "\n Visitez mon site: marcharnist.fr");
		}
	}
}
