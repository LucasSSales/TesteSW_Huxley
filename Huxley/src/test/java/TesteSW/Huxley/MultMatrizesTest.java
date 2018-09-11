package TesteSW.Huxley;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Questions.Bitmap;
import Questions.Mochila;
import Questions.MultMatrizes;

class MultMatrizesTest {
	
	@Test
	void test01() {
		int[] values = {1,5,20,1};
		String expected = "(A1 x (A2 x A3))";
		MultMatrizes mm = new MultMatrizes(values);
		
		assertAll(
				() -> { assertNotNull(mm); },
				() -> { assertEquals(values, mm.getValues()); },
				() -> { assertEquals(values.length-1, mm.getN()); },
				() -> {
						for(int i = 0; i<mm.getN(); i++) {
							assertEquals("", mm.getpOpen()[i]);
							assertEquals("", mm.getpClose()[i]);
							for(int j = 0; j < mm.getN(); j++) {
								assertEquals(-1, mm.getTopological()[i][j]);
								assertEquals(-1, mm.getCost()[i][j]);
							}
						}
					
				},
				() -> { assertEquals(expected, mm.resolve()); }
				);
	}
	
	@Test
	void test02() {
		int[] values = {5,10,20,35};
		String expected = "((A1 x A2) x A3)";
		MultMatrizes mm = new MultMatrizes(values);
		
		assertAll(
				() -> { assertNotNull(mm); },
				() -> { assertEquals(values, mm.getValues()); },
				() -> { assertEquals(values.length-1, mm.getN()); },
				() -> {
						for(int i = 0; i<mm.getN(); i++) {
							assertEquals("", mm.getpOpen()[i]);
							assertEquals("", mm.getpClose()[i]);
							for(int j = 0; j < mm.getN(); j++) {
								assertEquals(-1, mm.getTopological()[i][j]);
								assertEquals(-1, mm.getCost()[i][j]);
							}
						}
					
				},
				() -> { assertEquals(expected, mm.resolve()); }
				);
	}
	
	@Test
	void test03() {
		int[] values = {30,35,15,5,10,20,25};
		String expected = "((A1 x (A2 x A3)) x ((A4 x A5) x A6))";
		MultMatrizes mm = new MultMatrizes(values);
		
		assertAll(
				() -> { assertNotNull(mm); },
				() -> { assertEquals(values, mm.getValues()); },
				() -> { assertEquals(values.length-1, mm.getN()); },
				() -> {
						for(int i = 0; i<mm.getN(); i++) {
							assertEquals("", mm.getpOpen()[i]);
							assertEquals("", mm.getpClose()[i]);
							for(int j = 0; j < mm.getN(); j++) {
								assertEquals(-1, mm.getTopological()[i][j]);
								assertEquals(-1, mm.getCost()[i][j]);
							}
						}
					
				},
				() -> { assertEquals(expected, mm.resolve()); }
				);
	}
	
	@Test
	void test04() {
		int[] values = {10, 4};
		String expected = "(A1)";
		MultMatrizes mm = new MultMatrizes(values);
		
		assertAll(
				() -> { assertNotNull(mm); },
				() -> { assertEquals(values, mm.getValues()); },
				() -> { assertEquals(values.length-1, mm.getN()); },
				() -> {
						for(int i = 0; i<mm.getN(); i++) {
							assertEquals("", mm.getpOpen()[i]);
							assertEquals("", mm.getpClose()[i]);
							for(int j = 0; j < mm.getN(); j++) {
								assertEquals(-1, mm.getTopological()[i][j]);
								assertEquals(-1, mm.getCost()[i][j]);
							}
						}
					
				},
				() -> { assertEquals(expected, mm.resolve()); }
				);
	}


}
