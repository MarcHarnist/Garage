package fr.marcharnist.garage;

public class SiegeChauffant implements Option {
	
	
	private Double prix = 562.9;
	public static String nom = "Siège chauffant";
	
	public SiegeChauffant() {

	}

	@Override
	public Double getPrix() {
		// TODO Auto-generated method stub
		return this.prix;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return SiegeChauffant.nom;
	}

	/**
	 * @param prix the prix to set
	 */
	public void setPrix(Double prix) {
		this.prix = prix;
	}

}
