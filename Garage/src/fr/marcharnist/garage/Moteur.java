package fr.marcharnist.garage;

public abstract class Moteur{
	
	TypeMoteur type;
	String cylindre;
	Double prix;
	
	public Moteur(String cylindre, Double prix, TypeMoteur type){
		this.cylindre = cylindre;
		this.prix = prix;
		this.type = type;
	};
	
}
