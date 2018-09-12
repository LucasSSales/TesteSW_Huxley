package TesteSW.Huxley;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Questions.Mochila;
import Questions.SuperSales;

class SuperSalesTest {
	
	@Test
	void test01() {
	    int[] prices = {72, 44, 31};
	    int[] weights = {17, 23, 24};
	    int[] max = {26};
	  
	    SuperSales ss = new SuperSales(prices, weights, max);
	    
		assertAll(
				() -> { assertNotNull(ss); },
				() -> { assertNotNull(ss.getBackpack()); },
				() -> {
					int i = 0;
					for(Mochila m : ss.getBackpack()) {
						assertEquals(max[i], m.getMaxCapacity());
						assertEquals(prices, m.getPrices());
						assertEquals(weights, m.getWeights());
						assertEquals(prices.length, m.getNumberOfItems());
						i++;
					}
					
				},
				() -> { assertEquals(72, ss.resolve()); }
				);
		
	}
	
	@Test
	void test02() {
	    int[] prices = {64, 85, 52, 99, 39, 54};
	    int[] weights = {26, 22, 4, 18, 13, 9};
	    int[] max = {23, 20, 20, 26};
	  
	    SuperSales ss = new SuperSales(prices, weights, max);
	    
		assertAll(
				() -> { assertNotNull(ss); },
				() -> { assertNotNull(ss.getBackpack()); },
				() -> {
					int i = 0;
					for(Mochila m : ss.getBackpack()) {
						assertEquals(max[i], m.getMaxCapacity());
						assertEquals(prices, m.getPrices());
						assertEquals(weights, m.getWeights());
						assertEquals(prices.length, m.getNumberOfItems());
						i++;
					}
				},
				() -> { assertEquals(514, ss.resolve()); }
				);
		
	}
	
	@Test
	void test03() {
	    int[] prices = {1,	49,	6,	51,	67,	84,	68,	57,	73,	100,	54	,42	,68	,80	,16	,96	,24,	4	,88,	87}	;
	    int[] weights = {25,	43,	74,	22,	61,	72,	99,	80,	21,	89,	14,	77,	14,	36,	91,	71,	71,	54,	71,	37	};
	    int[] max = {81,27,	12,	87,	39,	67,	45,	5,	79};

	    SuperSales ss = new SuperSales(prices, weights, max);
	    	    
		assertAll(
				() -> { assertNotNull(ss); },
				() -> { assertNotNull(ss.getBackpack()); },
				() -> {
					int i = 0;
					for(Mochila m : ss.getBackpack()) {
						assertEquals(max[i], m.getMaxCapacity());
						assertEquals(prices, m.getPrices());
						assertEquals(weights, m.getWeights());
						assertEquals(prices.length, m.getNumberOfItems());
						i++;
					}
				},
				() -> { assertEquals(1338, ss.resolve()); }
				);
		
	}

}
