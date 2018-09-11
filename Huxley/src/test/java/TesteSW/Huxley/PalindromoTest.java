package TesteSW.Huxley;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Questions.Palindromo;

class PalindromoTest {

	@Test
	void test01() {
		String word = "ADAM";
		Palindromo p = new Palindromo(word);
		assertAll(
				() -> { assertNotNull(p); },
				() -> { assertEquals(word, p.getWord()); },
				() -> { assertEquals(word.length(), p.getN()); },
				() -> { 
					for(int i = 0; i < p.getN(); i++) {
						for(int j = 0; j< p.getN(); j++) {
							assertEquals(0, p.getMatrix()[i][j]);
						}
					}
				},
				() -> { assertEquals(3, p.resolve()); }
				);
	}
	
	@Test
	void test02() {
		String word = "MADAM";
		Palindromo p = new Palindromo(word);
		assertAll(
				() -> { assertNotNull(p); },
				() -> { assertEquals(word, p.getWord()); },
				() -> { assertEquals(word.length(), p.getN()); },
				() -> { 
					for(int i = 0; i < p.getN(); i++) {
						for(int j = 0; j< p.getN(); j++) {
							assertEquals(0, p.getMatrix()[i][j]);
						}
					}
				},
				() -> { assertEquals(5, p.resolve()); }
				);
	}
	
	@Test
	void test03() {
		String word = "";
		Palindromo p = new Palindromo(word);
		assertAll(
				() -> { assertNotNull(p); },
				() -> { assertEquals(word, p.getWord()); },
				() -> { assertEquals(word.length(), p.getN()); },
				() -> { 
					for(int i = 0; i < p.getN(); i++) {
						for(int j = 0; j< p.getN(); j++) {
							assertEquals(0, p.getMatrix()[i][j]);
						}
					}
				},
				() -> { assertEquals(0, p.resolve()); }
				);
	}
	
	@Test
	void test04() {
		String word = "POIJNBVCRTHJLMNBGAODOPIHFRUGB";
		Palindromo p = new Palindromo(word);
		assertAll(
				() -> { assertNotNull(p); },
				() -> { assertEquals(word, p.getWord()); },
				() -> { assertEquals(word.length(), p.getN()); },
				() -> { 
					for(int i = 0; i < p.getN(); i++) {
						for(int j = 0; j< p.getN(); j++) {
							assertEquals(0, p.getMatrix()[i][j]);
						}
					}
				},
				() -> { assertEquals(9, p.resolve()); }
				);
	}
	
	@Test
	void test05() {
		String word = "POPOPOOPOPOP";
		Palindromo p = new Palindromo(word);
		assertAll(
				() -> { assertNotNull(p); },
				() -> { assertEquals(word, p.getWord()); },
				() -> { assertEquals(word.length(), p.getN()); },
				() -> { 
					for(int i = 0; i < p.getN(); i++) {
						for(int j = 0; j< p.getN(); j++) {
							assertEquals(0, p.getMatrix()[i][j]);
						}
					}
				},
				() -> { assertEquals(12, p.resolve()); }
				);
	}

}
