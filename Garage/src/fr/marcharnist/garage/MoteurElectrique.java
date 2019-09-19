package fr.marcharnist.garage;

public class MoteurElectrique extends Moteur {

	public MoteurElectrique(String cylindre, double prix) {
		/**
		 * super() : instancie la classe m�re Moteur avec le "type essence",
		 *           ainsi que son cylindr� et son prix.
		 */
		super(cylindre, prix, TypeMoteur.ELECTRIQUE);
	}

}
