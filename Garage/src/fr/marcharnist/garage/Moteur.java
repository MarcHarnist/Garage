package fr.marcharnist.garage;

public abstract class Moteur{
	
	private TypeMoteur type;
	private String cylindre;
	private Double prix;
	
	/**
	 * @param type essence, electrique, diesel ou hybride
	 * @param cylindre cylindrée
	 * @param prix du véhicule
	 * @param immatriculation du véhicule - elle doit être unique
	 */
	public Moteur(TypeMoteur type, String cylindre, Double prix) {
		this.type = type;
		this.cylindre = cylindre;
		this.prix = prix;
	}

	/**
	 * @return the type
	 */
	public TypeMoteur getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(TypeMoteur type) {
		this.type = type;
	}

	/**
	 * @return the cylindre
	 */
	public String getCylindre() {
		return cylindre;
	}

	/**
	 * @param cylindre the cylindre to set
	 */
	public void setCylindre(String cylindre) {
		this.cylindre = cylindre;
	}

	/**
	 * @return the prix
	 */
	public Double getPrix() {
		return prix;
	}

	/**
	 * @param prix the prix to set
	 */
	public void setPrix(Double prix) {
		this.prix = prix;
	}
}
