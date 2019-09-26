package fr.marcharnist.garage;

public class GPS implements Option{
	
	private Double prix = 113.5;
	public static String nom = "GPS";
	
	public GPS() {
	}

	public GPS(double prix) {
		setPrix(prix);
	}
	
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
