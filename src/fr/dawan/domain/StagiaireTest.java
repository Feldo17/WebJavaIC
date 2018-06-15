package fr.dawan.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StagiaireTest {

	@Test
	public void testStagiaire() {
		Stagiaire s = new Stagiaire();
		s.setNom("DOE");
		assertEquals("DOE", s.getNom());
	}
}
