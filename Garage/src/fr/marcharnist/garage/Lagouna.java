package fr.marcharnist.garage;

/**
 * 
 * @author Marc Harnist
 * @since 2019-05-21
 * 
 * Les seules fonctions de la classe "Lagouna" sont:
 *  - d�clarer les deux attributs statiques de la classe: un nom et un prix;
 *  - instancier la classe m�re "Vehicule" avec ce nom et ce prix gr�ce � 
 *  la m�thode Java "super()" qui appelle le constructeur de la classe m�re.
 * 
 */

public class Lagouna extends Vehicule {

	static String nomDuVehicule = "Lagouna";
	static Double prixSansOption = 23123.0;
	
	/**
	 * Constructeur de la classe "Lagouna"
	 */
	public Lagouna() {
		super(nomDuVehicule, prixSansOption);// instancie la classe m�re "Vehicule"
	}
}
