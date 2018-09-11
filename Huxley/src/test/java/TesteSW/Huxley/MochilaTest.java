package TesteSW.Huxley;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Questions.Mochila;

class MochilaTest {
	
	@Test 
	void test01(){
		int[] prices = {4, 2, 10};
		int[] weights = {12, 1, 4};
		Mochila m = new Mochila(3, 15, prices, weights);

		assertAll(
				() -> { assertNotNull(m); },
				() -> { assertEquals(prices, m.getPrices()); },
				() -> { assertEquals(weights, m.getWeights()); },
				() -> { assertEquals(3, m.getNumberOfItems()); },
				() -> { assertEquals(15, m.getMaxCapacity()); },
				() -> { assertEquals(12, m.resolve()); }
				);
	}

	@Test 
	void test02(){
		int[] prices = {4, 2, 10, 2, 1};
		int[] weights = {12, 1, 4, 2, 1};
		Mochila m = new Mochila(5, 15, prices, weights); 

		assertAll(
				() -> { assertNotNull(m); },
				() -> { assertEquals(prices, m.getPrices()); },
				() -> { assertEquals(weights, m.getWeights()); },
				() -> { assertEquals(5, m.getNumberOfItems()); },
				() -> { assertEquals(15, m.getMaxCapacity()); },
				() -> { assertEquals(15, m.resolve()); }
				);
	}
	
	@Test 
	void test03(){
		int[] prices = {10, 20, 12, 38, 15, 18, 30, 45, 10, 16};
		int[] weights = {5, 3, 20, 14, 7, 19, 30, 28, 10, 27};
		Mochila m = new Mochila(10, 38, prices, weights);

		assertAll(
				() -> { assertNotNull(m); },
				() -> { assertEquals(prices, m.getPrices()); },
				() -> { assertEquals(weights, m.getWeights()); },
				() -> { assertEquals(10, m.getNumberOfItems()); },
				() -> { assertEquals(38, m.getMaxCapacity()); },
				() -> { assertEquals(83, m.resolve()); }
				);
	}
	
	@Test 
	void test04(){
		Mochila m = null;

		assertAll(
				() -> { assertNull(m); },
				() -> { assertThrows(NullPointerException.class, () -> { m.resolve(); }); }
				);
	}

}
