package TesteSW.Huxley;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Questions.Frete;

class FreteTest {
	
	@Test
	void test01() {
		int[][] nodes = {{1, 2, 5}, {3, 1, 32}, {1, 4, 3},
				{2, 3, 4},{2, 6, 20},  {6, 3, 1},
				{6, 4, 9}, {6, 5, 6}, {3, 7, 18}, {5, 7, 2}};
		Frete f = new Frete(nodes);
		
		assertAll(
				 () -> { assertNotNull(f);},
				 () -> { assertEquals(nodes, f.getNodes()); },
				 () -> { assertEquals(18, f.resolve()); }
				);
	}
	
	@Test
	void test02() {
		int[][] nodes = {{1, 2, 4},{1, 3, 3},{4, 3, 6},	{4, 5, 2},{2, 4, 1},{3, 5, 5}};
		Frete f = new Frete(nodes);
		
		assertAll(
				 () -> { assertNotNull(f);},
				 () -> { assertEquals(nodes, f.getNodes()); },
				 () -> { assertEquals(7, f.resolve());  }
				);
	}
	
	@Test
	void test03() {
		int[][] nodes = new int[0][0];
		Frete f = new Frete(nodes);
		
		assertAll(
				 () -> { assertNotNull(f);},
				 () -> { assertEquals(nodes, f.getNodes()); },
				 () -> { assertEquals(0, f.resolve());   }
				);
	}
	
	@Test
	void test04() {
		int[][] nodes = {{1,2,5}, {1,3,7}, {1,6,5}, {2,5,7}, {3,6,3}, {3,7,2}, {4,5,8}, {4,6,10}, {5,6,2}, {6,7,4} };
		Frete f = new Frete(nodes);
		
		assertAll(
				 () -> { assertNotNull(f);},
				 () -> { assertEquals(nodes, f.getNodes()); },
				 () -> { assertEquals(9, f.resolve());   }
				);
	}
	
}
