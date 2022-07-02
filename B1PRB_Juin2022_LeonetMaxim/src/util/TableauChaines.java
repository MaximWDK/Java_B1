package util;

import java.util.Arrays;

public class TableauChaines {
	/**
	 * Retourne la copie d'un tableau à une dimension à laquelle l'élément spécifié
	 * est ajouté à la suite des éléments copiés
	 * @param t = La référence du tableau original
	 * @param element = l'élément à ajouter au tableau à la suite des autres éléments
	 * @return La référence du nouveau tableau
	 */
	public static String[] ajouterElement(String[] t, String element) {
		final int LENGTH;
		if(t != null) {
			LENGTH = t.length;
			String[] newTab = Arrays.copyOf(t, LENGTH + 1);
			newTab[LENGTH] = element;
			return newTab;	
		}
		String[] newTab = new String[0];
		newTab[0] = element;
		return newTab;
	}
	
	/**
	 * @param t = La référence du tableau original
	 * @param ligne = La référence de la ligne à ajouter au nouveau tableau.
	 * @return La référence du nouveau tableau
	 */
	public static String[][] ajouterLigne(String[][] t, String[] ligne) {
		final int LENGTH = t.length;
		String[][] newTab = Arrays.copyOf(t, LENGTH + 1);
		newTab[LENGTH] = ligne;
		return newTab;	
	}
}