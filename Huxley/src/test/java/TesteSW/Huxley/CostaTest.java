package TesteSW.Huxley;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Questions.Costa;

class CostaTest {

	@Test
	void test01() {
        char[][] mapa = {
        		{'#', '#', '#', '#', '#'}, 
        		{'#', '.', '.', '.', '#'}, 
        		{'.', '.', '.', '.', '.'}, 
        		{'#', '.', '.', '.', '.'}, 
        		{'#', '#', '.', '.', '#'}};
		Costa c = new Costa(mapa);
		
		assertAll(
				() -> {assertNotNull(c);},
				() -> {assertEquals(mapa, c.getMapa());},
				() -> { assertEquals(mapa.length, c.getL()); },
				() -> { assertEquals(mapa[0].length, c.getC()); },
				() -> { assertEquals(11, c.resolve()); }
				);
	}
	
	@Test
	void test02() {
        char[][] mapa = {
        		{'#', '.', '.', '.'}, 
        		{'.', '#', '.', '.'}, 
        		{'.', '.', '#', '.'}, 
        		{'.', '.', '.', '#'}};
		Costa c = new Costa(mapa);
		
		assertAll(
				() -> {assertNotNull(c);},
				() -> {assertEquals(mapa, c.getMapa());},
				() -> { assertEquals(mapa.length, c.getL()); },
				() -> { assertEquals(mapa[0].length, c.getC()); },
				() -> { assertEquals(4, c.resolve()); }
				);
	}
	
	@Test
	void test03() {
        char[][] mapa = {
        		{'.', '.', '.', '#', '#', '#', '#', '.', '.'}, 
        		{'.', '.', '.', '.', '.', '.', '.', '.', '.'},
        		{'.', '#', '#', '#', '.', '.', '.', '#', '#'},
        		{'.', '#', '#', '.', '.', '#', '#', '.', '#'},
        		{'#', '#', '#', '#', '#', '#', '.', '.', '.'},
        		{'.', '#', '#', '.', '.', '.', '.', '.', '.'},
        		{'.', '.', '.', '.', '.', '.', '.', '.', '.'},
        		{'.', '.', '.', '.', '.', '.', '.', '#', '#'},
        		{'#', '.', '.', '#', '#', '#', '#', '.', '.'},
        		{'.', '.', '.', '.', '.', '#', '#', '.', '.'}}; 
		Costa c = new Costa(mapa);
		
		assertAll(
				() -> {assertNotNull(c);},
				() -> {assertEquals(mapa, c.getMapa());},
				() -> { assertEquals(mapa.length, c.getL()); },
				() -> { assertEquals(mapa[0].length, c.getC()); },
				() -> { assertEquals(29, c.resolve()); }
				);
	}
	
	@Test
	void test04() {
        char[][] mapa = {
        		{'.', '.', '.', '.', '.', ',', '.'}, 
        		{'.', '.', '.', '.', '.', ',', '.'},
        		{'.', '.', '.', '.', '.', ',', '.'},
        		{'.', '.', '.', '.', '.', ',', '.'},
        		{'.', '.', '.', '.', '.', ',', '.'},
        		{'.', '.', '.', '.', '.', ',', '.'},
        		{'.', '.', '.', '.', '.', ',', '.'},
        		{'.', '.', '.', '.', '.', ',', '.'},
        		{'.', '.', '.', '.', '.', ',', '.'},
        		{'.', '.', '.', '.', '.', ',', '.'}}; 
		Costa c = new Costa(mapa);
		
		assertAll(
				() -> {assertNotNull(c);},
				() -> {assertEquals(mapa, c.getMapa());},
				() -> { assertEquals(mapa.length, c.getL()); },
				() -> { assertEquals(mapa[0].length, c.getC()); },
				() -> { assertEquals(0, c.resolve()); }
				);
	}
	
	@Test
	void test05() {
        char[][] mapa = {
        		{'#', '#', '#', '#', '#'}, 
        		{'#', '#', '#', '#', '#'},
        		{'#', '#', '#', '#', '#'},
        		{'#', '#', '#', '#', '#'},
        		{'#', '#', '#', '#', '#'}}; 
		Costa c = new Costa(mapa);
		
		assertAll(
				() -> {assertNotNull(c);},
				() -> {assertEquals(mapa, c.getMapa());},
				() -> { assertEquals(mapa.length, c.getL()); },
				() -> { assertEquals(mapa[0].length, c.getC()); },
				() -> { assertEquals(16, c.resolve()); }
				);
	}

}
