package fr.marcharnist.garage;

public class Climatisation implements Option {

	private Double prix = 347.3;
	public static String nom = "Climatisation";
	
	@Override
	public Double getPrix() {
		// TODO Auto-generated method stub
		return prix;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return nom;
	}

	/**
	 * @param prix the prix to set
	 */
	public void setPrix(Double prix) {
		this.prix = prix;
	}

}
