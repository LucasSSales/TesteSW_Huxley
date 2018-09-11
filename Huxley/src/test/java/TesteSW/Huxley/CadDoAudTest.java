package TesteSW.Huxley;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Questions.CadDoAud;

class CadDoAudTest {

	@Test
	void test01() {
		int[][] matrix = {{4,3},{2,1}};
		CadDoAud ca = new CadDoAud(matrix);
		int[] um = {1,1};
		
		assertAll(
				() -> { assertNotNull(ca); },
				() -> { assertEquals(matrix, ca.getMatrix()); },
				() -> { assertEquals(matrix.length, ca.getLin()); },
				() -> { assertEquals(matrix[0].length, ca.getCol()); },
				() -> { assertArrayEquals(um, ca.getOne()); },
				() -> { assertEquals(2, ca.resolve());}
				);
	}
	
	@Test
	void test02() {
		int[][] matrix = {{38, 36, 39, 40, 37, 34 ,32, 35, 33, 31},{18, 16, 19, 10, 17, 14, 12, 15, 13, 11}, 
				{28, 26, 29, 30, 27, 24, 22, 25, 23, 21}, {8, 6, 9, 10, 7, 4, 2, 5, 3, 1}};
		CadDoAud ca = new CadDoAud(matrix);
		int[] um = {3, 9};
		
		assertAll(
				() -> { assertNotNull(ca); },
				() -> { assertEquals(matrix, ca.getMatrix()); },
				() -> { assertEquals(matrix.length, ca.getLin()); },
				() -> { assertEquals(matrix[0].length, ca.getCol()); },
				() -> { assertArrayEquals(um, ca.getOne()); },
				() -> { assertEquals(9, ca.resolve());}
				);
	}
	
	
	@Test
	void test03() {
						
		int[][] matrix = {{10, 8, 12, 14, 13, 11, 9},{24, 22, 26, 28, 27, 25,23}, 
				{31, 29, 33, 35, 34, 32, 30}, {3, 1, 5, 7, 6,4, 2}, {17, 15, 19, 21, 20, 18, 16}};
		CadDoAud ca = new CadDoAud(matrix);
		int[] um = {3, 1};
		
		assertAll(
				() -> { assertNotNull(ca); },
				() -> { assertEquals(matrix, ca.getMatrix()); },
				() -> { assertEquals(matrix.length, ca.getLin()); },
				() -> { assertEquals(matrix[0].length, ca.getCol()); },
				() -> { assertArrayEquals(um, ca.getOne()); },
				() -> { assertEquals(9, ca.resolve());}
				);
	}
	
	@Test
	void test04() {
		int[][] matrix = {{1, 4, 2, 3}, {9, 12, 10, 11}, {5, 8, 6, 7}};
		CadDoAud ca = new CadDoAud(matrix);
		int[] um = {0, 0};
		
		assertAll(
				() -> { assertNotNull(ca); },
				() -> { assertEquals(matrix, ca.getMatrix()); },
				() -> { assertEquals(matrix.length, ca.getLin()); },
				() -> { assertEquals(matrix[0].length, ca.getCol()); },
				() -> { assertArrayEquals(um, ca.getOne()); },
				() -> { assertEquals(3, ca.resolve());}
				);
	}

}
