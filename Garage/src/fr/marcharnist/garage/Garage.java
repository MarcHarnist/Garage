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
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;



public class Garage {
	
	public String nomFichierDeSauvegardeDuGarage = "Garage.txt"; // Le fichier texte qui va contenir la sauvegarde
	public String contenuDuFichierGarageTxt = "";
	public int nombreDeVoiture = 0;// Compteur de voitures pour l'affichage final
	public List<String> voitures = new ArrayList<>();// Liste d�taill�e des voitures cr��es en mai 2019 une liste de string!
	public List<Vehicule> listeVehicules = new ArrayList<Vehicule>();// Cr��e pour Gecko 20/09/19 apr�s formation ENI: liste d'objets!
	private Double valeurGarage = 0.0;
	private int nombreVehiculesMoinsChers = 3;
	private String listeVehiculesMoinsChersToString = "";
	
	
	public void add(Vehicule voit) {
		// D�clare la variable voiture dans la m�thode car elle ne sert qu'ici
		int prixTotalVoiture = (int) (voit.getPrixSansOption() + voit.getPrixTotalOptions());
		String voiture = " + Voiture " + voit.nomMarque + " : " + voit.getNomDuVehicule() 
		+ ", immatriculation: " + voit.getImmatriculation() + ", moteur " + voit.getMoteurType() + " " + voit.getMoteurCylindre()
		+ " (" + voit.getPrixSansOption() + " �) "
		+ voit.options.toString()
		+ ", d'une valeur totale de "
		+ prixTotalVoiture
		+ " �.";
		
		// Ajoute la voiture � la liste des voitures du garage: List<String> voitures
		voitures.add(voiture);
		
		// Ajoute 1 au nombre de voitures
		this.nombreDeVoiture++;
		
		// Ajoute la voiture � la liste des v�hicules du garage pour calculer la valeur de ce dernier
		listeVehicules.add(voit);
		
		// Mise � jour de la valeur du garage
		calculerValeurStock();
	}
	
	/**
	 * Cette m�thode enregistre les v�hicules du garage dans un fichier texte Garage.txt
	 */
	public void enregister() {
		File file = new File(nomFichierDeSauvegardeDuGarage);// Instanciation de la classe File de Java
		
		//Si le fichier n'existe pas on tente de le cr�er
		if(!file.exists()) {
			try {
				file.createNewFile();//cr�ation
			} catch (IOException e) {
				e.printStackTrace();//il y une erreur on l'attrape
			}
		}else {
			// If flag = on: second time that this program is running
			try {
				FileWriter writer = new FileWriter(file);//Si le fichier existe on l'ouvre
				BufferedWriter bw = new BufferedWriter(writer);//Cr�ation d'une m�moire temporaire

				/**
				 *  On parcourt la liste de ligne du contenu cr�� plus haut
				 */
				for(String line: voitures) {
					bw.write(line);//on �crit une ligne de la liste dans le fichier
					bw.newLine();//A la ligne
				}
				bw.newLine();
				bw.write(" - Valeur du garage: " + this.getValeurGarage());
				bw.newLine();
				bw.newLine();
				bw.write(" - Liste des vehicules les moins chers par prix croissants");
				bw.newLine();
                bw.write(getVoituresMoinsCher());				
				
				bw.close();//Fermeture de la m�moire tampon
				writer.close();//Fermeture du writer
			}catch(IOException e) {
				e.printStackTrace();// Capture et affiche l'erreur s'il y en a une
			} // Ferme catch(IOException e)
		} // Ferme else
	} // Ferme public void enregister()

	/**
	 * Cette m�thode est utilis�e dans Test.java ligne 138 pour afficher le contenu du fichier
	 * Garage.txt dans la console.
	 */
	public void lireGarageTxt() {
		
		// Instancie la classe File de Java avec notre fichier Garage.txt d�clar� dans le head de la classe
		File file = new File(nomFichierDeSauvegardeDuGarage);

		//Si le fichier n'existe pas on tente de le cr�er
		if(file.exists()) {
			BufferedReader reader = null;
			try {
				//Buffered reader est la m�moire tampon qui stocke le fichier
				reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace(); // Affiche l'erreur d'encodage si elle est rencontr�e
			} catch (FileNotFoundException e) {
				e.printStackTrace(); // Affiche l'erreur si le fichier n'est pas trouv�
			}
			String line = null; // on d�clare la premi�re ligne
			try {
				line = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();// affiche l'erreur attrap�e si elle existe
			}
			
			while(line != null) {
				
				//Ajoute les lignes du fichier dans l'attribut contenu Du Fichier Garage.txt
				this.contenuDuFichierGarageTxt += line + "\n"; // avec un petit retour chariot
				
				try {
					line = reader.readLine();
				} catch (IOException e) {
					e.printStackTrace(); // Affiche l'erreur attrap�e si elle existe
				}
			}
			try {
				reader.close();// Ferme le lecteur
			} catch (IOException e) {
				e.printStackTrace(); // Affiche l'erreur attrap�e si elle existe
			} // Ferme catch (IOException e)
		} // Ferme 		if(file.exists())
	} // Ferme public void lireGarageTxt()
	
	
	// Nouvelle m�thode demand�e par Julien: calculer la valeur du stock du garage
	public void calculerValeurStock() {
		double valeurStock = 0.0;
		for(Vehicule vehicule : listeVehicules) {
			valeurStock += vehicule.getPrixTotalVehicule();
		}
		setValeurGarage(valeurStock);
	}
	
	// Tri n voitures les moins ch�res avec leurs options
	public void trierVehiculesMoinsChers() {
		
		// Trie les v�hicules de la liste en fonction d'un attribut. Ici: prix total du v�hicule
		listeVehicules.sort(Comparator.comparing(Vehicule::getPrixTotalVehicule));
	}
	
	/**
	 * M�thode pour supprimer les doublons entre deux liste
	 * Achem 2019-09-24
	 * @param listeVehicules1 premi�re liste de v�hicule
	 * @param listeVehicules2 seconde liste.
	 */
	public static void supprimerDoublonsDansDesListes(List<Vehicule> listeVehicules1, List<Vehicule> listeVehicules2) { 
		
		//Compare la liste 2 � la liste 1
		for(Vehicule v : listeVehicules2) {
			
			//V�hicule examin�
			System.out.println(" *  V�hicule examin�: ");
			System.out.println("\t Nom: " + v.getNomDuVehicule() + ", immat: " + v.getImmatriculation());
			
			// v�rifie si l'immatriculation de ce v�hicule de la liste 2 existe dans la listeVehicule1
			Vehicule vehiculeReturned = getVehiculeByImmatriculation(v.getImmatriculation(), listeVehicules1);
			
			// affiche dans la console le v�hicule retourn� par la m�thode getVehiculeByImmatriculation s'il n'est pas null
			System.out.print("\t Variable \"vehiculeReturned\" : " );
			if(vehiculeReturned != null) {
				System.out.println("un v�hicule trouv�: ");
				System.out.print("\t ");
				System.out.println(vehiculeReturned);
				System.out.println("\t - Ce v�hicule doit �tre supprim� !");
				
				//suppression du v�hicule de la liste
				boolean suppresssion = supprimerVehiculeDansUneListe(vehiculeReturned.getImmatriculation(), listeVehicules1);
				if(suppresssion == true) {
					System.out.println("\tMessage du fichier Garage.java ligne 190:");
					System.out.println("\t - V�hicule bien supprim�");
				}
				else {
					System.out.println("Message du fichier Garage.java ligne 194:");
					System.out.println("V�hicule non supprim�");
				}
			}
			else {
				System.out.println("Pas de v�hicule trouv�. Il n'y a pas de doublon");
			}
		}
	}
	/**
	 * @author Achem
	 * @since 2019-09-24
	 * @param immatriculation
	 * @return Vehicule
	 */
	public static Vehicule getVehiculeByImmatriculation(String immatriculation, List<Vehicule> listeVehicule1) {
		
		Vehicule immatriculationRecherchee = null;
		
		for(Vehicule v:listeVehicule1) {
			if(v.getImmatriculation() == immatriculation) {
				return v; // cas I: un objet est retourn�: c'est l'immatriculation recherch�e
			}
		}
		return immatriculationRecherchee; // Cas II (peu probable) retourne l'immatriculation dans tous les autres cas imaginables: normalement non!
	}
	
	/**
	 * Supprime un v�hicule d'une liste en fonction de son immatriculation
	 * @return boul�en: true si l'�l�ment est bien supprim� de la liste
	 */
	public static boolean supprimerVehiculeDansUneListe(String immatriculation, List<Vehicule> listeV�hicules) {
		boolean bienSupprime = false;

		for (Iterator<Vehicule> iter = listeV�hicules.listIterator(); iter.hasNext(); ) {
		    Vehicule a = iter.next();
		    if (immatriculation.contentEquals(a.getImmatriculation())) {
		        iter.remove(); // suppression de l'�l�ment de la liste
		        bienSupprime = true; // bienSupprim� devient vrai
		    }
		}
		return bienSupprime;
	}
	
	// Les accesseurs et mutateurs de la valeur du garage
	public Double getValeurGarage() {
		return valeurGarage;
	}

	public void setValeurGarage(Double double1) {
		this.valeurGarage = double1;
	}

	public String getVoituresMoinsCher() {
		trierVehiculesMoinsChers();
		int i = 0;
		for(Vehicule vehicule:listeVehicules) {
			if(i < nombreVehiculesMoinsChers) {
				this.listeVehiculesMoinsChersToString += "\t " + (i + 1) + ".- " + vehicule.toStringSortByPrice() + "\n";
				i++;
			}
		}
		return listeVehiculesMoinsChersToString;
	}

	public void setListeVehiculesMoinsChersToString(String listeVehiculesMoinsChers) {
		this.listeVehiculesMoinsChersToString = listeVehiculesMoinsChers;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Garage [nomFichierDeSauvegardeDuGarage=" + nomFichierDeSauvegardeDuGarage
				+ ", contenuDuFichierGarageTxt=" + contenuDuFichierGarageTxt + ", nombreDeVoiture=" + nombreDeVoiture
				+ ", voitures=" + voitures + ", listeVehicules=" + listeVehicules + ", valeurGarage=" + valeurGarage
				+ ", nombreVehiculesMoinsChers=" + nombreVehiculesMoinsChers + ", listeVehiculesMoinsChersToString="
				+ listeVehiculesMoinsChersToString + "]";
	}
} // Ferme public class Garage 

