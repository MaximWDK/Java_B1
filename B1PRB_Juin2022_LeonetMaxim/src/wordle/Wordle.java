package wordle;

import io.Console;
import io.Fichier;
import util.Aleatoire;
import util.TableauChaines;

public class Wordle {
	public static void main(String[] args) {
		String tabGlobal[][] = new String[0][];
		String[] lignes = Fichier.lireToutesLesLignes("data/mots.txt");
		int aleatoire = Aleatoire.aleatoire(lignes.length);
		String motSolution;
		motSolution = lignes[aleatoire];
		TableauChaines.ajouterLigne(tabGlobal, nouvellePartie(1, motSolution, 6, lignes));
		}
	
	/**
	 * Retourne un string composé de caractères se basant sur la comparaison des
	 * charactères des 2 paramètres (affiche le caractère "+" si les lettres sont les mêmes
	 * à un certaine position et un espace " " si les caractères ne sont pas les mêmes à une
	 * certaine position). L'entièreté des 2 chaines de caractère sont analysées en même temps 
	 * @param motJoueur = Le mot que le joueur a envoyé
	 * @param motSolution = Le mot que le joueur doit trouver
	 * @return La référence d'un tableau
	 */
	
	public static String getIndices(String motJoueur, String motSolution) {
		char[] newMotJoueur = new char[5];
		char vide = ' ';
		char vrai = '+';
		for (int i = 0; i < newMotJoueur.length; i++) {
			if (motJoueur.charAt(i) == motSolution.charAt(i)) {
				newMotJoueur[i] = vrai;
			} else {
				newMotJoueur[i] = vide;
			}
		}
		String tab = new String(newMotJoueur);
		return tab;
	}
	
	public static String[] nouvellePartie(int numeroPartie, String motSolution, int maxEssais, String[] motsAdmis) {
		String motJoueur = "";
		String[] tab = new String[maxEssais-1];
		for(int i = 0; i < maxEssais && motJoueur.compareTo(motSolution) != 0; i++) {
			System.out.print("Mot " + i + " ? ");
			motJoueur = Console.lireString();
			System.out.println("");
			String indice = getIndices(motJoueur, motSolution);
			System.out.println(indice);
			TableauChaines.ajouterElement(tab, motJoueur);
		}
		if(motJoueur.compareTo(motSolution) == 0) {
			System.out.print("Bravo !");
		} else {
			System.out.print("Dommage ! Le mot à deviner était " + motSolution);
		}
		return tab;
	}

}
