package fr.marcharnist.garage;

public class VitreElectrique implements Option {
	
	private Double prix = 212.35;
	public static String nom = "Vitre électrique";
	
	public Double getPrix(){
		return this.prix;
	}

	/**
	 * @param prix the prix to set
	 */
	public void setPrix(Double prix) {
		this.prix = prix;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return nom;
	}

}
