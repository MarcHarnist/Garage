package fr.marcharnist.garage;

public class BarreDeToit implements Option {

	private Double prix = 29.9;
	public static String nom = "BarreDeToit";
	
	@Override
	public Double getPrix() {
		// TODO Auto-generated method stub
		return prix;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return nom;
	}

}
