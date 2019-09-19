package fr.marcharnist.garage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	String nomFichierDeSauvegardeDuGarage = "Garage.txt"; // Le fichier texte qui va contenir la sauvegarde
	String contenuDuFichierGarageTxt = "";
	public int nombreDeVoiture = 0;// Compteur de voitures pour l'affichage final
	List<String> voitures = new ArrayList<>();// Liste détaillée des voitures créées
	
	
	public void add(Vehicule voit) {
		// Déclare la variable voiture dans la méthode car elle ne sert qu'ici
		String voiture = " + Voiture " + voit.nomMarque + " : " + voit.getNomDuVehicule() 
		+ " Moteur " + voit.getMoteurType() + " " + voit.getMoteurCylindre()
		+ " (" + voit.getPrixSansOption() + " €) "
		+ voit.options.toString()
		+ " d'une valeur totale de "
		+ (voit.getPrixTotalOptions() + voit.getPrixSansOption())
		+ " €.";
		
		//Ajoute la voiture à la liste des voitures du garage: List<String> voitures
		voitures.add(voiture);
		
		// Ajoute 1 au nombre de voitures
		this.nombreDeVoiture++;
	}
	
	/**
	 * Cette méthode enregistre les véhicules du garage dans un fichier texte Garage.txt
	 */
	public void enregister() {
		File file = new File(nomFichierDeSauvegardeDuGarage);// Instanciation de la classe File de Java
		
		//Si le fichier n'existe pas on tente de le créer
		if(!file.exists()) {
			try {
				file.createNewFile();//création
			} catch (IOException e) {
				e.printStackTrace();//il y une erreur on l'attrape
			}
		}else {
			// If flag = on: second time that this program is running
			try {
				FileWriter writer = new FileWriter(file);//Si le fichier existe on l'ouvre
				BufferedWriter bw = new BufferedWriter(writer);//Création d'une mémoire temporaire

				/**
				 *  On parcourt la liste de ligne du contenu créé plus haut
				 */
				for(String line: voitures) {
					bw.write(line);//on écrit une ligne de la liste dans le fichier
					bw.newLine();//A la ligne
				}
				
				bw.close();//Fermeture de la mémoire tampon
				writer.close();//Fermeture du writer
			}catch(IOException e) {
				e.printStackTrace();// Capture et affiche l'erreur s'il y en a une
			} // Ferme catch(IOException e)
		} // Ferme else
	} // Ferme public void enregister()

	/**
	 * Cette méthode est utilisée dans Test.java ligne 138 pour afficher le contenu du fichier
	 * Garage.txt dans la console.
	 */
	public void lireGarageTxt() {
		
		// Instancie la classe File de Java avec notre fichier Garage.txt déclaré dans le head de la classe
		File file = new File(nomFichierDeSauvegardeDuGarage);

		//Si le fichier n'existe pas on tente de le créer
		if(file.exists()) {
			BufferedReader reader = null;
			try {
				//Buffered reader est la mémoire tampon qui stocke le fichier
				reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace(); // Affiche l'erreur d'encodage si elle est rencontrée
			} catch (FileNotFoundException e) {
				e.printStackTrace(); // Affiche l'erreur si le fichier n'est pas trouvé
			}
			String line = null; // on déclare la première ligne
			try {
				line = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();// affiche l'erreur attrapée si elle existe
			}
			
			while(line != null) {
				
				//Ajoute les lignes du fichier dans l'attribut contenu Du Fichier Garage.txt
				this.contenuDuFichierGarageTxt += line + "\n"; // avec un petit retour chariot
				
				try {
					line = reader.readLine();
				} catch (IOException e) {
					e.printStackTrace(); // Affiche l'erreur attrapée si elle existe
				}
			}
			try {
				reader.close();// Ferme le lecteur
			} catch (IOException e) {
				e.printStackTrace(); // Affiche l'erreur attrapée si elle existe
			} // Ferme catch (IOException e)
		} // Ferme 		if(file.exists())
	} // Ferme public void lireGarageTxt()
} // Ferme public class Garage 

