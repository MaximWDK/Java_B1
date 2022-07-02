package util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TableauChainesTests {

	@Test
	void testAjouterUnElementTableau() {
		assertArrayEquals(new String[] { "aa", "bb" }, TableauChaines.ajouterElement(new String[] { "aa" }, "bb"));
	}
	
	@Test
	void testAjouterPlusieursElementTableau() {
		assertArrayEquals(new String[] { "aa", "bb", "cc", "dd", "ee" }, TableauChaines.ajouterElement(new String[] { "aa", "bb", "cc", "dd" }, "ee"));
	}
	
	@Test
	void testAjouterUnElementTableauVide() {
		assertArrayEquals(new String[] { "aa" }, TableauChaines.ajouterElement(new String[0], "aa"));
	}
	
	@Test
	void testAjouterLigneTableauVide() {
		assertArrayEquals(new String[][] { { "aa" } }, TableauChaines.ajouterLigne(new String[0][], new String[] { "aa" }));
	}
	
	@Test
	void testAjouterLigneTableauUneLigne() {
		assertArrayEquals(new String[][] { { "aa" }, { "bb" } }, TableauChaines.ajouterLigne(new String[][] { { "aa" } }, new String[] { "bb" }));
	}
	
	@Test
	void testAjouterLigneTableauPlusieursLignes() {
		assertArrayEquals(new String[][] { { "aa" }, { "bb", "cc" }, { "dd", "ee", "ff" } }, TableauChaines.ajouterLigne(new String[][] { { "aa" }, { "bb", "cc" } }, new String[] { "dd", "ee", "ff" }));
	}

}
