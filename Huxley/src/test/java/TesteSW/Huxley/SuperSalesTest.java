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

}
