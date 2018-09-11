package TesteSW.Huxley;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Questions.Bitmap;

class BitmapTest {
	
	@Test
	void test01() {
		int[][] matrix = {{0,0,1,0},{0,0,0,1},{1,0,1,1}};
		Bitmap b = new Bitmap(matrix);
		String expected = "D0D1001D101";
		
		assertAll(
				() -> { assertNotNull(b); },
				() -> { assertEquals(matrix, b.getMatrix()); },
				() -> { assertEquals("", b.getBitmap()); },
				() -> { assertEquals(0, b.getCont()); },
				() -> { assertEquals(expected, b.resolve()); },
				() -> { assertEquals(expected, b.getBitmap()); }
				);
	}
	
	@Test
	void test02() {
		int[][] matrix = {{1}};
		Bitmap b = new Bitmap(matrix);
		String expected = "1";
		
		assertAll(
				() -> { assertNotNull(b); },
				() -> { assertEquals(matrix, b.getMatrix()); },
				() -> { assertEquals("", b.getBitmap()); },
				() -> { assertEquals(0, b.getCont()); },
				() -> { assertEquals(expected, b.resolve()); },
				() -> { assertEquals(expected, b.getBitmap()); }
				);
	}
	
	@Test
	void test03() {
		int[][] matrix = {{0,1,0,1}, {0,1,0,1}, {0,1,0,1}, {0,1,0,1}};
		Bitmap b = new Bitmap(matrix);
		String expected = "DD0101D0101D0101D0101";
		
		assertAll(
				() -> { assertNotNull(b); },
				() -> { assertEquals(matrix, b.getMatrix()); },
				() -> { assertEquals("", b.getBitmap()); },
				() -> { assertEquals(0, b.getCont()); },
				() -> { assertEquals(expected, b.resolve()); },
				() -> { assertEquals(expected, b.getBitmap()); }
				);
	}

}
