package fr.marcharnist.garage;

public class MoteurDiesel extends Moteur {

	public MoteurDiesel(String cylindre, double prix) {
		
		/**
		 * super() : instancie la classe mère Moteur avec le "type essence",
		 *           ainsi que son cylindré et son prix.
		 */
		super(TypeMoteur.DIESEL, cylindre, prix);
		
	}
}
