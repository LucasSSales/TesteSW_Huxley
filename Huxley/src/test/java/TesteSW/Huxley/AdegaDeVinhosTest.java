package TesteSW.Huxley;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Questions.AdegaDeVinhos;

class AdegaDeVinhosTest {
	
    int[] price1 = {2, 3, 5, 1, 4}; //50
    int[] price2 = {10,20,15,6,7,12,9}; //358
	
	AdegaDeVinhos adv1 = new AdegaDeVinhos(price1);
	AdegaDeVinhos adv2 = new AdegaDeVinhos(price2);
	AdegaDeVinhos adv3 = new AdegaDeVinhos(new int[0]);

	@Test
	void testAdegaDeVinhos() {
		assertAll(
				() -> { assertNotNull(adv1); },
				() -> { assertNotNull(adv2); },
				() -> { assertNotNull(adv3); }
				);
	}

	@Test
	void testResolve() {
		assertAll(
				() -> { assertEquals(50, adv1.resolve()); },
				() -> { assertEquals(358, adv2.resolve()); },
				() -> { assertEquals(0, adv3.resolve()); }
				);
	}

}
