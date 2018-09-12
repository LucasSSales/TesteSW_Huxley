package TesteSW.Huxley;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Questions.TabuleiroEsburacado;

class TabEsbTest {
    
	@Test
	void test01() {
		int[] moves = {2, 4, 7, 8, 8, 5, 4, 3, 8, 8};
		TabuleiroEsburacado te = new TabuleiroEsburacado(moves);
		String[] holes = {"(3, 1)", "(3, 2)", "(5, 2)","(4, 5)"};
		
		assertAll(
				() -> { assertNotNull(te); },
				() -> { assertEquals(moves, te.getMovs());},
				() -> { assertEquals(moves.length, te.getNum());},
				() -> { assertEquals(0, te.getCont());},
				() ->{
					for(String s : holes) {
						assertTrue(te.getHoles().containsKey(s));
					}
				},
				() -> { assertEquals(6, te.resolve()); }
				);
	}
	
	@Test
	void test02() {
		char[] m = {'5', '7', '1', '6', '4', '2', '6', '2', '4', '1', '4', '1', '8', '5', '6', '2', '4', '8', '2', '6', '5', '1', '8', '4', '8', '2', '4', '6', '5', '7', '7', '3', '1', '3', '3', '7', '4', '7', '7', '3', '7', '4', '8', '3', '6', '1', '5', '8', '8', '4'};
		int[] moves = new int[m.length];
		for(int i = 0; i < m.length; i++)
			moves[i] = Integer.parseInt(""+m[i]); 
		
			
		
		TabuleiroEsburacado te = new TabuleiroEsburacado(moves);
		String[] holes = {"(3, 1)", "(3, 2)", "(5, 2)","(4, 5)"};
		
		assertAll(
				() -> { assertNotNull(te); },
				() -> { assertEquals(moves, te.getMovs());},
				() -> { assertEquals(moves.length, te.getNum());},
				() -> { assertEquals(0, te.getCont());},
				() ->{
					for(String s : holes) {
						assertTrue(te.getHoles().containsKey(s));
					}
				},
				() -> { assertEquals(50, te.resolve()); }
				);
	}
	
	@Test
	void test03() {
		char[] m = {'3', '1', '6', '7', '4', '6', '3', '1', '7', '3', '5', '8', '6', '2', '3', '6', '8', '8', '1', '3'};
		int[] moves = new int[m.length];
		for(int i = 0; i < m.length; i++)
			moves[i] = Integer.parseInt(""+m[i]); 

		
		TabuleiroEsburacado te = new TabuleiroEsburacado(moves);
		String[] holes = {"(3, 1)", "(3, 2)", "(5, 2)","(4, 5)"};
		
		assertAll(
				() -> { assertNotNull(te); },
				() -> { assertEquals(moves, te.getMovs());},
				() -> { assertEquals(moves.length, te.getNum());},
				() -> { assertEquals(0, te.getCont());},
				() ->{
					for(String s : holes) {
						assertTrue(te.getHoles().containsKey(s));
					}
				},
				() -> { assertEquals(20, te.resolve()); }
				);
	}
	
	
	@Test
	void test04() {
		char[] m = {'6', '8', '1', '6', '1', '3', '5', '1', '6', '2'};
		int[] moves = new int[m.length];
		for(int i = 0; i < m.length; i++)
			moves[i] = Integer.parseInt(""+m[i]); 
		
		TabuleiroEsburacado te = new TabuleiroEsburacado(moves);
		String[] holes = {"(3, 1)", "(3, 2)", "(5, 2)","(4, 5)"};
		
		assertAll(
				() -> { assertNotNull(te); },
				() -> { assertEquals(moves, te.getMovs());},
				() -> { assertEquals(moves.length, te.getNum());},
				() -> { assertEquals(0, te.getCont());},
				() ->{
					for(String s : holes) {
						assertTrue(te.getHoles().containsKey(s));
					}
				},
				() -> { assertEquals(10, te.resolve()); }
				);
	}

}
