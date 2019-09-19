package fr.marcharnist.outils;

/**
 * My first enum file!
 * 
 * @author Marc L. Harnist
 * @since 2019-05-11
 * @see Openclassrooms Apprenez � programmer en Java / D�couvrez les �num�rations. 
 *
 */
public enum CheminBureau {

	BureauSalon("C:/Users/Isabelle/Desktop/"),
	BureauChambre("C:/Users/ADB/Desktop/");
	
	private String path;
	
	CheminBureau(String path){
		
		this.path = path;
	}
	
	public String toString() {
		return path;
	}
	
}
