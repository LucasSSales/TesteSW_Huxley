package TesteSW.Huxley;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Questions.DadosDaSorte;

class DadosDaSorteTest {

	@Test
	void test01() {
		int jog = 10, tam = 9;
		int oracle = 60466176;
		DadosDaSorte ds = new DadosDaSorte(jog, tam);
		
		assertAll(
				() -> { assertNotNull(ds); },
				() -> { assertEquals(jog, ds.getJog()); },
				() -> { assertEquals(tam, ds.getTam()); },
				() -> { assertEquals(0, ds.getSoma()); },
				() -> { assertEquals(0, ds.getCont()); },
				() -> { assertEquals(jog, ds.getA().length); },
				() -> { assertEquals(oracle, ds.resolve()); }
				);
	}
	
	@Test
	void test02() {
		int jog = 5, tam = 88;
		int oracle = 0;
		DadosDaSorte ds = new DadosDaSorte(jog, tam);
		
		assertAll(
				() -> { assertNotNull(ds); },
				() -> { assertEquals(jog, ds.getJog()); },
				() -> { assertEquals(tam, ds.getTam()); },
				() -> { assertEquals(0, ds.getSoma()); },
				() -> { assertEquals(0, ds.getCont()); },
				() -> { assertEquals(jog, ds.getA().length); },
				() -> { assertEquals(oracle, ds.resolve()); }
				);
	}
	
	@Test
	void test03() {
		int jog = 2, tam = 11;
		int oracle = 3;
		DadosDaSorte ds = new DadosDaSorte(jog, tam);
		
		assertAll(
				() -> { assertNotNull(ds); },
				() -> { assertEquals(jog, ds.getJog()); },
				() -> { assertEquals(tam, ds.getTam()); },
				() -> { assertEquals(0, ds.getSoma()); },
				() -> { assertEquals(0, ds.getCont()); },
				() -> { assertEquals(jog, ds.getA().length); },
				() -> { assertEquals(oracle, ds.resolve()); }
				);
	}
	
	@Test
	void test04() {
		int jog = 1, tam = 8;
		int oracle = 0;
		DadosDaSorte ds = new DadosDaSorte(jog, tam);
		
		assertAll(
				() -> { assertNotNull(ds); },
				() -> { assertEquals(jog, ds.getJog()); },
				() -> { assertEquals(tam, ds.getTam()); },
				() -> { assertEquals(0, ds.getSoma()); },
				() -> { assertEquals(0, ds.getCont()); },
				() -> { assertEquals(jog, ds.getA().length); },
				() -> { assertEquals(oracle, ds.resolve()); }
				);
	}


}
