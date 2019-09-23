package fr.marcharnist.garage;

public class MoteurEssence extends Moteur{

	public MoteurEssence(String cylindre, double prix) {
		
		/**
		 * super() : instancie la classe m�re Moteur avec le "type essence",
		 *           ainsi que son cylindr� et son prix.
		 */
		super(TypeMoteur.ESSENCE, cylindre, prix);
		
	}
}
