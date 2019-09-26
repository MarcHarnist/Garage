package fr.marcharnist.outils;

public interface Header {

	public String deco = "_________________________";
	static void titre(String titre) {
		System.out.println(deco + "" + titre + "" + deco);
	}
}
