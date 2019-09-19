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
 *  Ce fichier Main est utilis� comme sommaire qui liste et affiche la liste
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
 *   - cr�ation de classes;
 *   - h�ritage;
 *   - packages;
 *   - �num�ration;
 *   - g�n�rique;
 *   - fichiers.
 *   
 *   
 *  BESOINS DU DEMANDEUR
 *  Liste des t�ches
 *  1. Cr�er le projet Java Garage et ses fichiers avec Eclipse
 *  2. Rendre le projet dans une archive Zip
 *  
 *
 *  TACHES DU PROGRAMME
 *  1. Cr�er un garage,
 *  2. Le sauvegarder dans un fichier,
 *  3. A chaque fois qu'un nouveau v�hicule est ajout� dans le garage,
 *     celui-ci se sauvegarde automatiquement dans un fichier.
 *  4. Charger automatiquement le garage lors de son instanciation.
 *
 *	EFFETS VISUELS AU LANCEMENT DU PROGRAMME (CLASSE "TEST")
 *    Au premier lancement de la classe "Test", la console doit afficher:
 *  	Aucune voiture sauvegard�e!
 *  	***************************
 *  	* Garage Openclassrooms   *
 *  	***************************
 *  
 *    Au second lancement de la classe "Test", la console doit afficher:
 *     + Voiture RENO: Lagouna Moteur ESSENCE 150 Chevaux (23123.0�) [les options] d'une valeur totale de 24011.75�
 *     ... les 5 autres voitures
 *
 *
 *	INVENTAIRE DES FICHIERS A ECRIRE
 *  Selon le diagramme des classes, il va falloir cr�er 18 fichiers
 *  1. classe Garage 
 *  2. enum Marque
 *  3. classe abstraite Moteur
 *  4. enum TypeMoteur
 *  5. classe V�hicule li� � l'�num�ration Marque et enfant de la classe Garage: les donn�es vont dans les deux sens
 *  6. interface Option
 *  7. classe MoteurHybride qui h�rite de la classe Moteur
 *  8. classe MoteurDiesel qui h�rite de la classe Moteur
 *  9. classe MoteurElectrique qui h�rite de la classe Moteur
 *  10.classe MoteurEssence qui h�rite de la classe Moteur
 *  11.classe GPS qui impl�mente l'interface Option
 *  12.classe BarreDeToit qui impl�mente l'interface Option
 *  13.classe Climatisation qui impl�mente l'interface Option
 *  14.classe SiegeChauffant qui impl�mente l'interface Option
 *  15. classe VitreElectrique qui impl�mente l'interface Option
 *  16.classe Lagouna  qui h�rite de la classe Vehicule
 *  17.classe D4 qui h�rite de la classe Vehicule
 *  18.classe A300B qui h�rite de la classe Vehicule
 *  
 */
public class Main {

	public static void main(String[] args) {
		
		/**
		 * Recherche du chemin (path) du r�pertoire bin
		 */
		String projet[] = Main.class.getName().split("\\.");
		String projetPath = "";
		for(int i = 0; i < projet.length-1;i++)
			projetPath += projet[i] + "/";
		
		/**
		 * Commentaire de bienvenue dans le programme
		 * La m�thode d'affichage du commentaire se trouve dans
		 * un fichier "interface" dans le package outil du projet.
		 */
		Chapeau.comment("Bienvenue dans le fichier principal du programme\n");
		
		/**
		 * SOMMAIRE DES CLASSES CONTENUES DANS CE PROJET
		 * La m�thode afficheProgrammesList() affiche, dans ce fichier Main, la
		 * liste des fichiers du projet
		 */
		ListeDesFichiers.afficheProgrammesList(projetPath, "yes"); // "yes": use this method (else: "no")
	   	 
	}// Ferme 	public static void main(String[] args) {
}// Ferme public class Main {
