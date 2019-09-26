package fr.marcharnist.garage;

import java.util.ArrayList;
import java.util.List;

public class Vehicule extends Garage {
	
	private String nomDuVehicule; // Nom du véhicule. Exemple: Laguna
	private Double prixSansOption;// Prix de base du véhicule sans option
	public List<String> options = new ArrayList<>();// Liste des options de ce véhicule
	public String nomMarque; // Cette attribut va stocker le nom de la marque de ce véhicule
	private TypeMoteur moteurType;
	private String moteurCylindre;
	private Double prixTotalOptions = 0.0; // Initialise le prix total du véhicule sans option
	private Double prixTotalVehicule = 0.0;
	private String immatriculation;
	private boolean doublon = false;
		
	/** Constructeurs simple
	 * 
	 */
	public Vehicule() {} // Constructeur sans paramètres
	
	/**
	 * Constructeur avec deux paramètres
	 * @param nomDuVehicule
	 * @param prixSansOption
	 */
	public Vehicule(String nomDuVehicule, Double prixSansOption) {
		this.nomDuVehicule = nomDuVehicule;// nom du véhicule
		this.prixSansOption = prixSansOption;// Prix sans option
		this.setNomMarque(nomDuVehicule);// Recherche du nom de la marque
	}

	/**
	 * Recherche le nom de la marque de ce véhicule dans la 
	 * liste du fichier "enum" Marque et  donne à ce véhicule
	 *  son nom de marque en initiant l'attribut "nomMarque".
	 * @param nom
	 */
	private void setNomMarque(String nomDuVehicule) {

		/**
		 * Marque est le nom du fichier de la liste d'énumération du même nom.
		 * C'est la liste des marques avec les noms des véhicules correspondants
		 * 
		 * La boucle for cherche le nom du véhicule dans la liste du fichier
		 * d'énumération "Marque" marque et affecte la marque à la variable
		 * nomMarque si le nom du véhicule est trouvé dans la liste.
		 */
		for(Marque marque: Marque.values()) {
			if(nomDuVehicule == marque.getMarque()) // Si le nom du véhicule est trouvé dans la liste
				this.nomMarque = marque.name();// Affecte le nom de la marque au véhicule
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
	 * Calcule le prix total des options pour ce véhicule
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
	 * @param moteurEssence crée deux attributs: type et cylindrée
	 */
	public void setMoteur(MoteurEssence moteurEssence) {
		this.setMoteurType(moteurEssence.getType());
		this.setMoteurCylindre(moteurEssence.getCylindre());
		this.setImmatriculation(getImmatriculation());
	}


	public void setMoteur(MoteurElectrique moteurElectrique) {
		this.setMoteurType(moteurElectrique.getType());
		this.setMoteurCylindre(moteurElectrique.getCylindre());
	}

	public void setMoteur(MoteurDiesel moteurDiesel) {
		this.setMoteurType(moteurDiesel.getType());
		this.setMoteurCylindre(moteurDiesel.getCylindre());
		
	}

	public void setMoteur(MoteurHybride moteurHybride) {
		this.setMoteurType(moteurHybride.getType());
		this.setMoteurCylindre(moteurHybride.getCylindre());
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
	 * Ajoute une option au véhicule
	 * @param nouvelleOption
	 */
	public void addOption(Option nouvelleOption) {
		String newLine = nouvelleOption.getName() + "(" + nouvelleOption.getPrix() + " €)";
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

	public Double getPrixTotalVehicule() {
		this.prixTotalVehicule = getPrixSansOption()+getPrixTotalOptions(); 
		return this.prixTotalVehicule;
	}

	public void setPrixTotalVehicule(Double prixTotalVehicule) {
		this.prixTotalVehicule = prixTotalVehicule;
		
	}

	@Override
	public String toString() {
		return "Vehicule [nomDuVehicule=" + nomDuVehicule + ", immatriculation: " + getImmatriculation() + " prixSansOption=" + prixSansOption + ", options="
				+ options + ", nomMarque=" + nomMarque + ", moteurType=" + moteurType + ", moteurCylindre="
				+ moteurCylindre + ", prixTotalOptions=" + prixTotalOptions + ", prixTotalVehicule=" + getPrixTotalVehicule()
				+ "]";
	}

	public String toStringSortByPrice() {
		if(prixTotalOptions == 0) {
			return "Vehicule " + nomDuVehicule + ", immatriculation: " + getImmatriculation() + " prix total avec options: " + getPrixTotalVehicule() + " (prixSansOption=" + prixSansOption + ", options="
					+ options + ", nomMarque=" + nomMarque + ", moteurType=" + moteurType + ", moteurCylindre="
					+ moteurCylindre + ", prixTotalOptions= (ce vehicule n'a pas d'options)" 
					+ ")";		
		}
		return "Vehicule " + nomDuVehicule + ", immatriculation: " + getImmatriculation() + " prix total avec options: " + getPrixTotalVehicule() + " (prixSansOption=" + prixSansOption + ", options="
				+ options + ", nomMarque=" + nomMarque + ", moteurType=" + moteurType + ", moteurCylindre="
				+ moteurCylindre + ", prixTotalOptions=" + prixTotalOptions 
				+ ")";
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public void addImmatriculation(String immatriculation) {
		setImmatriculation(immatriculation);
	}

	public boolean getDoublon() {
		return doublon;
	}

	public void setDoublon(boolean doublon) {
		this.doublon = doublon;
	}
}
