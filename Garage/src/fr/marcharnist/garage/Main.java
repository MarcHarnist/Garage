package fr.marcharnist.garage;

import fr.marcharnist.outils.Chapeau;
import fr.marcharnist.outils.ListeDesFichiers;

/**
 * 
 * @author Marc L. Harnist (Visitez mon site marcharnist.fr)
 * @since 2019-05-17
 * @see https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java
 *
 *
 *	Bienvenue dans le fichier Main du projet.
 *  Ce fichier Main est utilisé comme sommaire qui liste et affiche la liste
 *  des programmes du projet.
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
public class Main {

	public static void main(String[] args) {
		
		/**
		 * Recherche du chemin (path) du répertoire bin
		 */
		String projet[] = Main.class.getName().split("\\.");
		String projetPath = "";
		for(int i = 0; i < projet.length-1;i++)
			projetPath += projet[i] + "/";
		
		/**
		 * Commentaire de bienvenue dans le programme
		 * La méthode d'affichage du commentaire se trouve dans
		 * un fichier "interface" dans le package outil du projet.
		 */
		Chapeau.comment("Bienvenue dans le fichier principal du programme\n");
		
		/**
		 * SOMMAIRE DES CLASSES CONTENUES DANS CE PROJET
		 * La méthode afficheProgrammesList() affiche, dans ce fichier Main, la
		 * liste des fichiers du projet
		 */
		ListeDesFichiers.afficheProgrammesList(projetPath, "yes"); // "yes": use this method (else: "no")
	   	 
	}// Ferme 	public static void main(String[] args) {
}// Ferme public class Main {
