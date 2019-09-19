package fr.marcharnist.garage;

/**
 * 
 * @author Marc Harnist
 * @since 2019-05-21
 * 
 * Les seules fonctions de la classe "Lagouna" sont:
 *  - déclarer les deux attributs statiques de la classe: un nom et un prix;
 *  - instancier la classe mère "Vehicule" avec ce nom et ce prix grâce à 
 *  la méthode Java "super()" qui appelle le constructeur de la classe mère.
 * 
 */

public class Lagouna extends Vehicule {

	static String nomDuVehicule = "Lagouna";
	static Double prixSansOption = 23123.0;
	
	/**
	 * Constructeur de la classe "Lagouna"
	 */
	public Lagouna() {
		super(nomDuVehicule, prixSansOption);// instancie la classe mère "Vehicule"
	}
}
