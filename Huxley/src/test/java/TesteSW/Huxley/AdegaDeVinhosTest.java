package TesteSW.Huxley;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Questions.AdegaDeVinhos;

class AdegaDeVinhosTest {
		
	@Test
	void test01() {
		
		int[] price = {2, 3, 5, 1, 4};
		AdegaDeVinhos adv = new AdegaDeVinhos(price);
		
		assertAll(
				() -> { assertNotNull(adv); },
				() -> { assertEquals(price, adv.getPrice()); },
				() -> { assertEquals(price.length, adv.getBottles()); },
				()->{
					for (int i = 0; i < adv.getBottles(); i++) {
						for (int j = 0; j < adv.getBottles(); j++) {
							assertEquals(-1, adv.getMemo()[i][j]);
						}
					}
				},
				() -> { assertEquals(50, adv.resolve()); }
				);
		
	}
	
	@Test
	void test02() {
		
		int[] price = {10,20,15,6,7,12,9};
		AdegaDeVinhos adv = new AdegaDeVinhos(price);
		
		assertAll(
				() -> { assertNotNull(adv); },
				() -> { assertEquals(price, adv.getPrice()); },
				() -> { assertEquals(price.length, adv.getBottles()); },
				()->{
					for (int i = 0; i < adv.getBottles(); i++) {
						for (int j = 0; j < adv.getBottles(); j++) {
							assertEquals(-1, adv.getMemo()[i][j]);
						}
					}
				},
				() -> { assertEquals(358, adv.resolve()); }
				);
		
	}
	
	@Test
	void test03() {
		
		int[] price = new int[0];
		AdegaDeVinhos adv = new AdegaDeVinhos(price);
		
		assertAll(
				() -> { assertNotNull(adv); },
				() -> { assertEquals(price, adv.getPrice()); },
				() -> { assertEquals(price.length, adv.getBottles()); },
				()->{
					for (int i = 0; i < adv.getBottles(); i++) {
						for (int j = 0; j < adv.getBottles(); j++) {
							assertEquals(-1, adv.getMemo()[i][j]);
						}
					}
				},
				() -> { assertEquals(0, adv.resolve()); }
				);
		
	}
	
	@Test
	void test04() {
		
		int[] price = {123,54,89,14,20,	57,77,34,90,100};
		AdegaDeVinhos adv = new AdegaDeVinhos(price);
		
		assertAll(
				() -> { assertNotNull(adv); },
				() -> { assertEquals(price, adv.getPrice()); },
				() -> { assertEquals(price.length, adv.getBottles()); },
				()->{
					for (int i = 0; i < adv.getBottles(); i++) {
						for (int j = 0; j < adv.getBottles(); j++) {
							assertEquals(-1, adv.getMemo()[i][j]);
						}
					}
				},
				() -> { assertEquals(3621, adv.resolve()); }
				);
		
	}

}
