package TesteSW.Huxley;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Questions.ReduzindoMapas;

class ReduzindoMapasTest {
	
	ReduzindoMapas rm;

	
	
	

	@Test
	void testReduzindoMapas() {
		
	}

	@Test
	void testResolve1() {
		Graph graph1 = new Graph();	
		graph1.putNode("1", new Node("2", 15));
		graph1.putNode("1", new Node("3", 10));
		graph1.putNode("2", new Node("3", 1));
		graph1.putNode("3", new Node("4", 3));
		graph1.putNode("2", new Node("4", 5));
		graph1.putNode("4", new Node("5", 20)); 
		
		rm = new ReduzindoMapas(graph1); //pegar no huxley
		
		
		
		
	}
	
	@Test
	void testResolve2() {
		Graph graph = new Graph();
	    graph.putNode("A", new Node("B", 5));
	    graph.putNode("A", new Node("D", 10));
	    graph.putNode("B", new Node("C", 3));
	    graph.putNode("B", new Node("E", 12));
	    graph.putNode("C", new Node("E", 4));
	    graph.putNode("D", new Node("E", 5)); 
		
	    rm = new ReduzindoMapas(graph); //esperado 17
		
	}
	
	@Test
	void testResolve3() {
		Graph graph3 = new Graph();

		
		
		
	}

}
