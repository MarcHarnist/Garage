package fr.marcharnist.outils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * @author Marc Harnist
 * @since 2019-05-15
 * 
 * 	Affiche la liste des fichiers, puis la liste des r�pertoires
 *  du r�pertoire bin/ nom du package / nom du projet
 *  Exemple: bin/fr/marcharnist/stream
 *
 */
public interface ListeDesFichiers {
	static void afficheProgrammesList(String projetPath, String afficherCetteMethode) {
		if(afficherCetteMethode == "yes") {
			
			String repertoireBin = CheminBin.trouveCheminBin(projetPath);// va chercher le chemin du r�pertoire bin dans une �num�ration
			if(repertoireBin != null) {
				File folder = new File(repertoireBin); // Ex: repertoireBin =  fr/marcharnist/(nom du "projet")
				if(folder.exists()) {
					Chapeau.comment("Liste des fichiers et r�pertoires de " + repertoireBin + "\n");
					File[] listOfFiles = folder.listFiles();// Liste les fichiers du r�pertoire du projet
					List<Object> fichiers = new ArrayList<>();// Cr�e une liste de fichier vide
					List<Object> dossiers = new ArrayList<>();// Cr�e une liste de repertoire vide
					for(File list:listOfFiles) { // parcours la liste de fichiers et r�pertoires du r�pertoire "projet"
						if(list.isFile())
							fichiers.add(list.getName());// ajoute les fichiers dans la liste des fichiers
						else
							dossiers.add(list.getName());// ajoute les dossiers dans la liste des dossiers
					}
		            System.out.println();
		            System.out.println("// **** Nombre de fichiers: " + fichiers.size()); // Affiche le nombre de fichiers
		            for(Object line:fichiers)
		            	System.out.println(line); // affiche chaque nom de fichier
		            System.out.println();
		            System.out.println("// **** Nombre de dossiers: " + dossiers.size()); // Affiche le nombre de r�pertoires
		            for(Object line:dossiers)
		            	System.out.println(line);// affiche chaque nom de r�pertoire
					}
				else
					System.out.println("\n Erreur 1: Message du fichier ListeDesFichiers: R�pertoire bin introuvable");
					
				}
			else
				System.out.println("\n Erreur 2: Message du fichier ListeDesFichiers:  R�pertoire bin introuvable (null)");
		}
		else
			Chapeau.comment("no");
	}
}
