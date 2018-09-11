package TesteSW.Huxley;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Questions.CorteDeHastes;

class CorteDeHastesTest {

	@Test
	void test01() {
		int[] values = {1,5,8,9,10,	17,17};
		CorteDeHastes ch = new CorteDeHastes(values);
		assertAll(
				() -> { assertNotNull(ch); },
				() -> { assertEquals(values, ch.getValues()); },
				() -> { assertEquals(values.length, ch.getCases()); },
				() -> {
					for (int i = 1; i <= ch.getCases(); i++)
						assertEquals(-1, ch.getMemo()[i]);
				},
				() -> { assertEquals(18, ch.resolve()); }
				);
	}
	
	
	@Test
	void test02() {
		int[] values = {80,14,78,100,34,23,98,58,110,89};
		CorteDeHastes ch = new CorteDeHastes(values);
		assertAll(
				() -> { assertNotNull(ch); },
				() -> { assertEquals(values, ch.getValues()); },
				() -> { assertEquals(values.length, ch.getCases()); },
				() -> {
					for (int i = 1; i <= ch.getCases(); i++)
						assertEquals(-1, ch.getMemo()[i]);
				},
				() -> { assertEquals(800, ch.resolve()); }
				);
	}

}
