package TesteSW.Huxley;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Questions.Pizzaria;

class PizzariaTest {

	@Test
	void test01() {
		Graph graph = new Graph();
        graph.putNode("2", new Node("1", 230));
        graph.putNode("1", new Node("3", 430));
        int[] orders = {3,2};
        Pizzaria p = new Pizzaria(graph, orders);
        
        assertAll(
        		() -> { assertNotNull(p); },
        		() -> { assertNotNull(p.getGraph());},
        		() -> { assertEquals(orders, p.getOrders());},
        		() -> { assertEquals(graph, p.getGraph()); },
        		() -> { assertEquals(1320, p.resolve()); }
        		);
	}
	
	@Test
	void test02() {
		Graph graph = new Graph();
	    graph.putNode("1", new Node("2", 250));
	    graph.putNode("1", new Node("3", 928));
	    graph.putNode("2", new Node("3", 305));
	    int[] orders = {2,2};
        Pizzaria p = new Pizzaria(graph, orders);
        
        assertAll(
        		() -> { assertNotNull(p); },
        		() -> { assertNotNull(p.getGraph());},
        		() -> { assertEquals(orders, p.getOrders());},
        		() -> { assertEquals(graph, p.getGraph()); },
        		() -> { assertEquals(1000, p.resolve()); }
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
	    int[] orders = {4, 6, 5, 3, 4, 6, 5, 4, 2, 5};
        Pizzaria p = new Pizzaria(g, orders);
        
        assertAll(
        		() -> { assertNotNull(p); },
        		() -> { assertNotNull(p.getGraph());},
        		() -> { assertEquals(orders, p.getOrders());},
        		() -> { assertEquals(g, p.getGraph()); },
        		() -> { assertEquals(176, p.resolve()); }
        		);
	}
	
	@Test
	void test04() {
		Graph g = new Graph();
		g.putNode("1", new Node("2", 5));
		g.putNode("1", new Node("3", 7));
		g.putNode("1", new Node("6", 5));
		g.putNode("2", new Node("5", 7));
		g.putNode("3", new Node("6", 3));
		g.putNode("1", new Node("7", 2));
		g.putNode("4", new Node("5", 8));
		g.putNode("4", new Node("6", 10));
		g.putNode("5", new Node("6", 2));
		g.putNode("6", new Node("7", 4));
	    int[] orders = new int[0];
        Pizzaria p = new Pizzaria(g, orders);
        
        assertAll(
        		() -> { assertNotNull(p); },
        		() -> { assertNotNull(p.getGraph());},
        		() -> { assertEquals(orders, p.getOrders());},
        		() -> { assertEquals(g, p.getGraph()); },
        		() -> { assertEquals(0, p.resolve()); }
        		);
	}

}
