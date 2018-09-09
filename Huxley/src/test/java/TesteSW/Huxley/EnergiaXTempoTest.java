package TesteSW.Huxley;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Questions.EnergiaXTempo;

class EnergiaXTempoTest {
	//tables
	int[][] table = { {50*120, 100*90}, {500*600, 600*500}, {400*1000, 500*700}, {0, 0} };
	int[][] table2 = { {7*10, 8*5, 15*4}, {12*4, 11*5, 12*4}, {7*10, 8*5, 15*4}, {0, 0, 0} };
	int[][] table3 = { {10*2, 10*3, 10*4, 10*5}, {8*2, 8*3, 8*4, 8*5}, {6*1, 6*2, 6*3, 6*4}, {4*4, 4*2, 4*3, 4*5}, {0, 0, 0, 0} };
	
	//constructors
	EnergiaXTempo ext = new EnergiaXTempo(2, 3, 10, 10, table);
	EnergiaXTempo ext2 = new EnergiaXTempo(3, 3, 2, 5, table2);
	EnergiaXTempo ext3 = new EnergiaXTempo(4, 4, 2, 5, table3);

	@Test
	void testEnergiaXTempo() {
		//fail("Not yet implemented");
	}

	@Test
	void testResolve() {
		
		assertAll(
				() -> { assertEquals(656100, ext.resolve()); },
				() -> { assertEquals(145, ext2.resolve()); },
				() -> { assertEquals(58, ext3.resolve()); }
				);
	}

}
