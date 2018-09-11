package TesteSW.Huxley;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Questions.EnergiaXTempo;

class EnergiaXTempoTest {
	
	@Test
	void test01() {
		int[][] table = { {50*120, 100*90}, {500*600, 600*500}, {400*1000, 500*700}, {0, 0} };
		EnergiaXTempo ext = new EnergiaXTempo(2, 3, 10, 10, table);
		assertAll(
				() -> { assertNotNull(ext); },
				() -> { assertEquals(3, ext.getProg()); },
				() -> { assertEquals(2, ext.getFreq()); },
				() -> { assertEquals(10*10, ext.getMudarF()); },
				() -> { assertEquals(table, ext.getTable()); },
				() -> {
						for(int i = 0; i<ext.getProg(); i++) {
							for(int j = 0; j < ext.getFreq(); j++) {
								if(i==0){
									if(j==0)
										assertEquals(ext.getTable()[i][j], ext.getMemo()[i][j]);
									else
										assertEquals(ext.getTable()[i][j]+ext.getMudarF(), ext.getMemo()[i][j]);
								}else
									assertEquals(-1, ext.getMemo()[i][j]);
							}
						}
					},
				() -> { assertEquals(656100, ext.resolve()); }
				);
	}

	@Test
	void test02() {
		int[][] table = { {7*10, 8*5, 15*4}, {12*4, 11*5, 12*4}, {7*10, 8*5, 15*4}, {0, 0, 0} };
		EnergiaXTempo ext = new EnergiaXTempo(3, 3, 2, 5, table);
		assertAll(
				() -> { assertNotNull(ext); },
				() -> { assertEquals(3, ext.getProg()); },
				() -> { assertEquals(3, ext.getFreq()); },
				() -> { assertEquals(2*5, ext.getMudarF()); },
				() -> { assertEquals(table, ext.getTable()); },
				() -> {
						for(int i = 0; i<ext.getProg(); i++) {
							for(int j = 0; j < ext.getFreq(); j++) {
								if(i==0){
									if(j==0)
										assertEquals(ext.getTable()[i][j], ext.getMemo()[i][j]);
									else
										assertEquals(ext.getTable()[i][j]+ext.getMudarF(), ext.getMemo()[i][j]);
								}else
									assertEquals(-1, ext.getMemo()[i][j]);
							}
						}
					},
				() -> { assertEquals(145, ext.resolve()); }
				);
	}
	
	@Test
	void test03() {
		int[][] table = { {10*2, 10*3, 10*4, 10*5}, {8*2, 8*3, 8*4, 8*5}, {6*1, 6*2, 6*3, 6*4}, {4*4, 4*2, 4*3, 4*5}, {0, 0, 0, 0} };
		EnergiaXTempo ext = new EnergiaXTempo(4, 4, 2, 5, table);
		assertAll(
				() -> { assertNotNull(ext); },
				() -> { assertEquals(4, ext.getProg()); },
				() -> { assertEquals(4, ext.getFreq()); },
				() -> { assertEquals(2*5, ext.getMudarF()); },
				() -> { assertEquals(table, ext.getTable()); },
				() -> {
						for(int i = 0; i<ext.getProg(); i++) {
							for(int j = 0; j < ext.getFreq(); j++) {
								if(i==0){
									if(j==0)
										assertEquals(ext.getTable()[i][j], ext.getMemo()[i][j]);
									else
										assertEquals(ext.getTable()[i][j]+ext.getMudarF(), ext.getMemo()[i][j]);
								}else
									assertEquals(-1, ext.getMemo()[i][j]);
							}
						}
					},
				() -> { assertEquals(58, ext.resolve()); }
				);
	}


}
