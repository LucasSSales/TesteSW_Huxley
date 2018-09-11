package TesteSW.Huxley;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.junit.jupiter.api.Test;

import Questions.ReduzindoMapas;

class ReduzindoMapasTest {
	
	ReduzindoMapas rm;
		

	@Test
	void test01() {
		Graph graph = new Graph();	
		graph.putNode("1", new Node("2", 15));
		graph.putNode("1", new Node("3", 10));
		graph.putNode("2", new Node("3", 1));
		graph.putNode("3", new Node("4", 3));
		graph.putNode("2", new Node("4", 5));
		graph.putNode("4", new Node("5", 20)); 
		
		rm = new ReduzindoMapas(graph);
		
		assertAll(
				() -> { assertNotNull(rm); },
				() -> { assertNotNull(rm.getGraph()); },
				() -> { assertEquals(graph, rm.getGraph()); },
				() -> { 
					Set<String> keys = graph.keys();
					for(String s : keys)
						assertEquals(34, rm.resolve(s));
				}
				);		
		
	}
	
	@Test
	void test02() {
		Graph graph = new Graph();
	    graph.putNode("A", new Node("B", 5));
	    graph.putNode("A", new Node("D", 10));
	    graph.putNode("B", new Node("C", 3));
	    graph.putNode("B", new Node("E", 12));
	    graph.putNode("C", new Node("E", 4));
	    graph.putNode("D", new Node("E", 5)); 
		
	    rm = new ReduzindoMapas(graph);
	    
		assertAll(
				() -> { assertNotNull(rm); },
				() -> { assertNotNull(rm.getGraph()); },
				() -> { assertEquals(graph, rm.getGraph()); },
				() -> { 
					Set<String> keys = graph.keys();
					for(String s : keys)
						assertEquals(17, rm.resolve(s));
				}
				);	
		
	}
	
	@Test
	void test03() {
		Graph g = new Graph();
		g.putNode("1", new Node("2", 5));
		g.putNode("1", new Node("3", 7));
		g.putNode("1", new Node("6", 5));
		g.putNode("2", new Node("5", 7));
		g.putNode("3", new Node("6", 3));
		g.putNode("3", new Node("7", 2));
		g.putNode("4", new Node("5", 8));
		g.putNode("4", new Node("6", 10));
		g.putNode("5", new Node("6", 2));
		g.putNode("6", new Node("7", 4));

	    rm = new ReduzindoMapas(g);
	    
		assertAll(
				() -> { assertNotNull(rm); },
				() -> { assertNotNull(rm.getGraph()); },
				() -> { assertEquals(g, rm.getGraph()); },
				() -> { 
					Set<String> keys = g.keys();
					for(String s : keys)
						assertEquals(25, rm.resolve(s));
				}
				);	
		
		
	}

}
