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


	@Test
	void test03() {
		int[] values = 	{402,	333,	252,	117,	302,	64,	349,	202,	455,	167,	
				330,	101,	135,	25,	214,	76,	219,	439,	173,	371,	
				11,	191,	424,	370,	41,	197,	453,	58	,297,	43,	
				158,	459,	437,	56,	298,	216,	335,	314,	207,	160,	
				323,	484,	474,	481,	364,	352,	125,	13,	498,	417};
		CorteDeHastes ch = new CorteDeHastes(values);
		assertAll(
				() -> { assertNotNull(ch); },
				() -> { assertEquals(values, ch.getValues()); },
				() -> { assertEquals(values.length, ch.getCases()); },
				() -> {
					for (int i = 1; i <= ch.getCases(); i++)
						assertEquals(-1, ch.getMemo()[i]);
				},
				() -> { assertEquals(20100, ch.resolve()); }
				);
	}
}
