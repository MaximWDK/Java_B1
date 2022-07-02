package io;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

public class Fichier {

	public static boolean ecrireToutesLesLignes(String cheminFichier, String[] lignes) {
		return ecrireToutesLesLignes(cheminFichier, lignes, StandardCharsets.UTF_8);
	}

	public static boolean ecrireToutesLesLignes(String cheminFichier, String[] lignes, Charset encodage) {
		boolean reussite = true;
		Path chemin = Paths.get(cheminFichier);
		if (Files.notExists(chemin)) {
			reussite = new File(cheminFichier.substring(0, cheminFichier.lastIndexOf('/'))).mkdirs();
		}
		if (reussite) {
			try {
				Files.write(chemin, List.of(lignes), encodage);
			} catch (IOException e) {
				e.printStackTrace();
				reussite = false;
			}
		}
		return reussite;
	}

	public static String[] lireToutesLesLignes(String cheminFichier) {
		return lireToutesLesLignes(cheminFichier, StandardCharsets.UTF_8);
	}

	public static String[] lireToutesLesLignes(String cheminFichier, Charset encodage) {
		List<String> lignes;
		Path chemin = Paths.get(cheminFichier);
		try {
			lignes = Files.readAllLines(chemin, encodage);
		} catch (IOException e) {
			lignes = new LinkedList<String>();
		}
		return lignes.toArray(new String[0]);
	}

}
