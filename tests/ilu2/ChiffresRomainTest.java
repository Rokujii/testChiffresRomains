package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ChiffresRomainTest {
	private ChiffresRomain cr;

	@BeforeEach
	void setUp() throws Exception {
		cr = new ChiffresRomain();
	}

	@Test
	void testPremiereIteration() {
		assertEquals("I", cr.toChiffresRomains(1));
	}
	
	@Test
	void testSecondeIteration() {
		assertEquals("II", cr.toChiffresRomains(2));
		assertEquals("III", cr.toChiffresRomains(3));
	}
	
	@Test
	void testTroisiemeIteration() {
		assertThrows(IllegalArgumentException.class, () -> cr.toChiffresRomains(0));
		assertThrows(IllegalArgumentException.class, () -> cr.toChiffresRomains(4000));
		assertThrows(IllegalArgumentException.class, () -> cr.toChiffresRomains(-5));
	}

}
