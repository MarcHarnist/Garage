package fr.marcharnist.outils;

import java.text.NumberFormat;

public interface SeparerMilliers {
	
	public static String separerMilliers(Double soldeBancaire) {
		
		//Exemple: soldeBancaire = 56789.12;
	
        NumberFormat numberFormat = NumberFormat.getInstance(java.util.Locale.FRENCH);
 
        //resultat: 56 789,12   
        
        String retour = numberFormat.format(soldeBancaire);
		return retour;
	}

	/**
	 * Source: 
	 * 
	 	import java.text.NumberFormat;
		import java.util.Currency;
	 
	/**
	 * Formater un nombre avec NumberFormat
	 * http://www.fobec.com/java/915/formater-nombre-avec-numberformat.html
	 * @author fobec 2010
	 */
		
		/**
			public class FormatFr {
			 
			    public static void main(String[] args) {
			        double soldeBancaire = 56789.12;
			        NumberFormat numberFormat = NumberFormat.getInstance(java.util.Locale.FRENCH);
			 
			        /**
			         * Afficher avec le regles du pays
			         */
			     
				
				/**
				System.out.println(numberFormat.format(soldeBancaire));
			        //resultat: 56 789,12   
			    }
			}
	 */
}

