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

}
