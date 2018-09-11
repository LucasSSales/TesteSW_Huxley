package TesteSW.Huxley;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Questions.Frete;

class FreteTest {
	
	Frete f;
	
	int[][] e1 = {{1, 2, 5}, {3, 1, 32}, {1, 4, 3},
				{2, 3, 4},{2, 6, 20},  {6, 3, 1},
				{6, 4, 9}, {6, 5, 6}, {3, 7, 18}, {5, 7, 2}};
	
	int[][] e2 = {{1, 2, 4},{1, 3, 3},{4, 3, 6},
				{4, 5, 2},{2, 4, 1},{3, 5, 5}};

	@Test
	void testFrete() {
		assertAll(
				() -> { assertThrows(NullPointerException.class, ()-> { f.resolve(); }); },
				() -> {f = new Frete(e1); assertNotNull(f); }
				);
	}

	@Test
	void testResolve() {
		assertAll(
				()->{
					f = new Frete(e1);
					assertEquals(18, f.resolve()); 
				},
				()->{ 
					f = new Frete(e2);
					assertEquals(7, f.resolve()); 
				},
				()->{
					f = new Frete(new int[0][0]);
					assertEquals(0, f.resolve()); 
				}
				
				);
	}

}
