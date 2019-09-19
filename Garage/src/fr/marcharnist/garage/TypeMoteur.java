package fr.marcharnist.garage;

public enum TypeMoteur {

	DIESEL("DIESEL"),
	ESSENCE("Essence"),
	HYBRIDE("HYBRIDE"),
	ELECTRIQUE("ELECTRIQUE");
	
	private String type;
	
	TypeMoteur(String type){
		this.setMoteur(type);
	}

	/**
	 * @return the moteur
	 */
	public String getMoteur() {
		return type;
	}

	/**
	 * @param moteur the moteur to set
	 */
	public void setMoteur(String moteur) {
		this.type = moteur;
	}
	
	
			
	
	
	
	
}
