package TesteSW.Huxley;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

class GraphTest {

	@Test
	void test01() {
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
		
		HashMap<String, Integer> d;
		
		assertAll(
				
				() -> {
					
					
				}
				
				);
		
		
	}

}
