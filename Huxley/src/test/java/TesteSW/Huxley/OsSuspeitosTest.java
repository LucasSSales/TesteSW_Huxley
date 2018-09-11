package TesteSW.Huxley;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Questions.OsSuspeitos;

class OsSuspeitosTest {

	@Test
	void test01() {
	    Graph graph = new Graph();
	    int tam = 100, num = 4;
	    
	    for(int i=0; i<tam; i++)
	    	graph.putVertex(""+i);
	    
	    graph.putNode("10", new Node("13", 1));
		graph.putNode("13", new Node("11", 1));
		graph.putNode("11", new Node("12", 1));
		graph.putNode("12", new Node("14", 1));
		graph.putNode("14", new Node("10", 1));
		graph.putNode("1", new Node("2", 1));
		graph.putNode("0", new Node("1", 1));
		graph.putNode("99", new Node("2", 1));
				
		OsSuspeitos s = new OsSuspeitos(graph, tam, num);
		
		assertAll(
				() -> { assertNotNull(s); },
				() -> { assertEquals(tam, s.getTam()); },
				() -> { assertEquals(num, s.getNum()) ;},
				() -> { assertEquals(graph, s.getGraph()); },
				() -> { assertEquals(4, s.resolve()); }
				);
	}
	
	@Test
	void test02() {
	    Graph graph = new Graph();
	    int tam = 200, num = 2;
	    
	    for(int i=0; i<tam; i++)
	    	graph.putVertex(""+i);
	    
		graph.putNode("1", new Node("2", 1));
		graph.putNode("1", new Node("3", 1));
		graph.putNode("1", new Node("4", 1));
		graph.putNode("1", new Node("5", 1));
				
		OsSuspeitos s = new OsSuspeitos(graph, tam, num);
		
		assertAll(
				() -> { assertNotNull(s); },
				() -> { assertEquals(tam, s.getTam()); },
				() -> { assertEquals(num, s.getNum()) ;},
				() -> { assertEquals(graph, s.getGraph()); },
				() -> { assertEquals(1, s.resolve()); }
				);
	}
	
	@Test
	void test03() {
	    Graph graph = new Graph();
	    int tam = 1, num = 0;
	    
	    for(int i=0; i<tam; i++)
	    	graph.putVertex(""+i);
				
		OsSuspeitos s = new OsSuspeitos(graph, tam, num);
		
		assertAll(
				() -> { assertNotNull(s); },
				() -> { assertEquals(tam, s.getTam()); },
				() -> { assertEquals(num, s.getNum()) ;},
				() -> { assertEquals(graph, s.getGraph()); },
				() -> { assertEquals(1, s.resolve()); }
				);
	}
	
//	500 10
//	10 	
//	10 	
//	10 	
//	10 	
//	5 
//	5 
//	4 
//	4 
//	4 
//	4 
	
	@Test
	void test04() {
	    Graph graph = new Graph();
	    int tam = 500, num = 10;
	    int[][] test = {{260, 319, 157, 229, 489, 137, 38, 321, 450, 339},
			    {204, 58, 425,	224, 104, 69, 5,216, 168, 477},
			    {20, 297, 158,	216, 457, 162, 15, 165, 284, 207},
			    {133, 60, 181,	468, 125, 13, 291, 159, 123,	54},
			    {260, 185, 49, 191, 438},
			    {461, 456, 177,	177, 311},
			    {364, 266, 408, 445},
			    {37,149,183,60},
			    {410, 403, 457, 189},
			    {108, 96, 270, 341}};
	    
	    for(int i=0; i<tam; i++)
	    	graph.putVertex(""+i);
	    
	    for(int i = 0; i < test.length; i++) {
	    	for(int j = 0; j < test[i].length; j++) {
	    		System.out.print(test[i][j] + " ");
	    	}
	    }
	    
		graph.putNode("1", new Node("2", 1));
		graph.putNode("1", new Node("3", 1));
		graph.putNode("1", new Node("4", 1));
		graph.putNode("1", new Node("5", 1));
				
		OsSuspeitos s = new OsSuspeitos(graph, tam, num);
		
		assertAll(
				() -> { assertNotNull(s); },
				() -> { assertEquals(tam, s.getTam()); },
				() -> { assertEquals(num, s.getNum()) ;},
				() -> { assertEquals(graph, s.getGraph()); },
				() -> { assertEquals(1, s.resolve()); }
				);
	}

}
