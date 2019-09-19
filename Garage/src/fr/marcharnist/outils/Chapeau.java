package fr.marcharnist.outils;

public interface Chapeau {
	/**
	 * Affiche un chapeau de commentaire
	 * @param commentaire
	 */
	static void comment(String commentaire) {
		if(commentaire == "no") {
			// Cherche le nom de la m�thode qui appelle la m�thode courante
			StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
			StackTraceElement e = stacktrace[2];//The methode calling this method
			String methodName = e.getMethodName();
			
			// Affiche le chapeau: commentaire de pr�sentation de la m�thode
			System.out.println(" - m�thode d�sactiv�e: \"" + methodName + "()\";");
		}
		else
		{	
			// Cherche le nom de la m�thode qui appelle la m�thode courante
			StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
			StackTraceElement e = stacktrace[2];//The methode calling this method
			String methodName = e.getMethodName();
			
			// Affiche le chapeau: commentaire de pr�sentation de la m�thode
			System.out.println("_________________________________________________________________________");
			System.out.println("\n/**  M�thode \"" + methodName + "()\"\n"
					+ "*\n"
					+ "*");
			System.out.print("* " + commentaire);
			
		}
	}
}
