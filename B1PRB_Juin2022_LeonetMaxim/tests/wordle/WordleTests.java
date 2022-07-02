package wordle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class WordleTests {

	@Test
	void testGetIndicesWithAllCorrect() {
		String motSolution = "ABACA";
		String motJoueur = "ABACA";
		String tab = "+++++";
		assertEquals(tab, Wordle.getIndices(motJoueur, motSolution));
	}
	
	@Test
	void testGetIndicesWithOneCorrectAtMiddle() {
		String motSolution = "ABACA";
		String motJoueur = "BCABC";
		String tab = "  +  ";
		assertEquals(tab, Wordle.getIndices(motJoueur, motSolution));
	}
	
	@Test
	void testGetIndicesWithNoOneCorrect() {
		String motSolution = "ABACA";
		String motJoueur = "FGHJK";
		String tab = "     ";
		assertEquals(tab, Wordle.getIndices(motJoueur, motSolution));
	}
	
	@Test
	void testGetIndicesWithLastCorrect() {
		String motSolution = "ABACK";
		String motJoueur = "FGHJK";
		String tab = "    +";
		assertEquals(tab, Wordle.getIndices(motJoueur, motSolution));
	}
}
