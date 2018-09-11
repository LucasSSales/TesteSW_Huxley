package TesteSW.Huxley;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Questions.ArvoreGeradoraMaxima;

class ArvoreGeradoraMaximaTest {
	
	@Test
	void test01() {
		ArvoreGeradoraMaxima max = new ArvoreGeradoraMaxima();
	    
	    max.putNode("1", new Node("2",2));
	    max.putNode("2", new Node("3",3));
	    max.putNode("1", new Node("3",4));
	    
	    
	    
	    assertAll(
	    		() -> { assertNotNull(max); },
	    		() -> { assertEquals(7, max.resolve("1")); }
	    		);
		
	}
	
	@Test
	void test02() {
	    Graph g = new Graph();
	    ArvoreGeradoraMaxima max = new ArvoreGeradoraMaxima();
	    max.putNode("1", new Node("2", 5));
	    max.putNode("1", new Node("3", 7));
	    max.putNode("1", new Node("6", 5));
	    max.putNode("2", new Node("5", 7));
		max.putNode("3", new Node("6", 3));
		max.putNode("1", new Node("7", 2));
		max.putNode("4", new Node("5", 8));
		max.putNode("4", new Node("6", 10));
		max.putNode("5", new Node("6", 2));
		max.putNode("6", new Node("7", 4));
	    	    
	    assertAll(
	    		() -> { assertNotNull(max); },
	    		() -> { assertEquals(41, max.resolve("1")); }
	    		);
		
	}



}
