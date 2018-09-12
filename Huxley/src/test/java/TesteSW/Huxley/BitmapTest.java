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
	
	@Test
	void test04() {
		int[][] matrix = {{0,0,0,0,0,1,0,1,1,1}, {0,1,0,1,0,1,0,1,1,1}, {0,1,0,1,0,1,0,1,1,1}, {1,0,1,1,1,1,0,1,0,1}, {0,0,1,0,1,0,1,0,1,0},
				{0,1,1,1,0,1,0,0,1,0}, {1,1,1,0,0,1,0,1,0,1}, {1,1,0,0,1,0,1,0,1,0}, {1,0,1,0,1,0,1,0,1,0}, {0,1,1,1,1,1,1,1,1,1}};
	
		Bitmap b = new Bitmap(matrix);
		String expected = "DDDD00010D010DD01010DD10101D1101DDD10101D1011DD101\n" + 
				"D010D0110DDD0111110DD10001DD101D011D0111DDD1010D01\n" + 
				"D010DD10D0110DD01011D1011";
		
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
