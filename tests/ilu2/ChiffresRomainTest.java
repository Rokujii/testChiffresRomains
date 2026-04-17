package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ChiffresRomainsTest {
	private ChiffresRomain cr;

	@BeforeEach
	void setUp() throws Exception {
		cr = new ChiffresRomain();
	}

	@Test
	void testPremierChiffre() {
		assertEquals("I", cr.play());
	}

}
