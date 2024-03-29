package fr.marcharnist.garage;

import java.util.ArrayList;
import java.util.List;

public class Vehicule extends Garage {
	
	private String nomDuVehicule; // Nom du v�hicule. Exemple: Laguna
	private Double prixSansOption;// Prix de base du v�hicule sans option
	public List<String> options = new ArrayList<>();// Liste des options de ce v�hicule
	public String nomMarque; // Cette attribut va stocker le nom de la marque de ce v�hicule
	private TypeMoteur moteurType;
	private String moteurCylindre;
	private Double prixTotalOptions = 0.0; // Initialise le prix total du v�hicule sans option
	
	
	/** Constructeurs simple
	 * 
	 */
	public Vehicule() {} // Constructeur sans param�tres
	
	/**
	 * Constructeur avec deux param�tres
	 * @param nomDuVehicule
	 * @param prixSansOption
	 */
	public Vehicule(String nomDuVehicule, Double prixSansOption) {
		this.nomDuVehicule = nomDuVehicule;// nom du v�hicule
		this.prixSansOption = prixSansOption;// Prix sans option
		this.setNomMarque(nomDuVehicule);// Recherche du nom de la marque
	}

	/**
	 * Recherche le nom de la marque de ce v�hicule dans la 
	 * liste du fichier "enum" Marque et  donne � ce v�hicule
	 *  son nom de marque en initiant l'attribut "nomMarque".
	 * @param nom
	 */
	private void setNomMarque(String nomDuVehicule) {

		/**
		 * Marque est le nom du fichier de la liste d'�num�ration du m�me nom.
		 * C'est la liste des marques avec les noms des v�hicules correspondants
		 * 
		 * La boucle for cherche le nom du v�hicule dans la liste du fichier
		 * d'�num�ration "Marque" marque et affecte la marque � la variable
		 * nomMarque si le nom du v�hicule est trouv� dans la liste.
		 */
		for(Marque marque: Marque.values()) {
			if(nomDuVehicule == marque.getMarque()) // Si le nom du v�hicule est trouv� dans la liste
				this.nomMarque = marque.name();// Affecte le nom de la marque au v�hicule
		}
	}

	/**
	 * @return the nomDuVehicule
	 */
	public String getNomDuVehicule() {
		return nomDuVehicule;
	}

	/**
	 * Retourne le prix
	 * @return prixSansOption
	 */
	public Double getPrixSansOption() {
		return prixSansOption;
	}

	/**
	 * Calcule le prix total des options pour ce v�hicule
	 * @param prixNouvelleOption
	 */
	private void addPrixTotalOptions(Double prixNouvelleOption) {

		this.prixTotalOptions += prixNouvelleOption;
	}


	/**
	 * @param nomDuVehicule
	 */
	public void setNomDuVehicule(String nomDuVehicule) {
		this.nomDuVehicule = nomDuVehicule;
	}

	/**
	 * Mutateur
	 * @param moteurEssence cr�e deux attributs: type et cylindr�e
	 */
	public void setMoteur(MoteurEssence moteurEssence) {
		this.setMoteurType(moteurEssence.type);
		this.setMoteurCylindre(moteurEssence.cylindre);
	}


	public void setMoteur(MoteurElectrique moteurElectrique) {
		this.setMoteurType(moteurElectrique.type);
		this.setMoteurCylindre(moteurElectrique.cylindre);
	}

	public void setMoteur(MoteurDiesel moteurDiesel) {
		this.setMoteurType(moteurDiesel.type);
		this.setMoteurCylindre(moteurDiesel.cylindre);
		
	}

	public void setMoteur(MoteurHybride moteurHybride) {
		this.setMoteurType(moteurHybride.type);
		this.setMoteurCylindre(moteurHybride.cylindre);
	}
	
	/**
	 * @return the moteurType
	 */
	public TypeMoteur getMoteurType() {
		return moteurType;
	}

	/**
	 * @param typeMoteur the moteurType to set
	 */
	public void setMoteurType(TypeMoteur typeMoteur) {
		this.moteurType = typeMoteur;
	}

	/**
	 * @return the moteurCylindre
	 */
	public String getMoteurCylindre() {
		return moteurCylindre;
	}

	/**
	 * @param moteurCylindre the moteurCylindre to set
	 */
	public void setMoteurCylindre(String moteurCylindre) {
		this.moteurCylindre = moteurCylindre;
	}
	
	/**
	 * Ajoute une option au v�hicule
	 * @param nouvelleOption
	 */
	public void addOption(Option nouvelleOption) {
		String newLine = nouvelleOption.getName() + "(" + nouvelleOption.getPrix() + " �)";
		this.addPrixTotalOptions(nouvelleOption.getPrix());
		this.options.add(newLine);		
	}
	/**
	 * Retourne le prix total des options
	 * @return the prixTotalOptions
	 */
	public Double getPrixTotalOptions() {
		return prixTotalOptions;
	}
}
