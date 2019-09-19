package fr.marcharnist.garage;

public interface Option {
	
	Option name = null;
	Option prix = null;
	
	public Double getPrix();
	public String getName();

}
