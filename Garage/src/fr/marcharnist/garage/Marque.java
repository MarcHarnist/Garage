package fr.marcharnist.garage;

public enum Marque {

	RENO("Lagouna"),
	PIGEOT("A300B"),
	TROEN("D4");
	
	private String marque;
	
	Marque(String marque){
		this.setMarque(marque);
	}

	/**
	 * @return the marque
	 */
	public String getMarque() {
		return marque.toString();
	}

	/**
	 * @param marque the marque to set
	 */
	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	
}
