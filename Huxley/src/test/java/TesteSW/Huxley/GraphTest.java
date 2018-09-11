package TesteSW.Huxley;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.Test;

class GraphTest {

	@Test
	void test01() {
		Graph g = new Graph();		
		
		assertAll(
				() -> { assertNotNull(g); },
				() -> {//putVertex()
					String[] vertex = { "A", "B", "C", "D", "E", "F", "G" };
					for(String v : vertex) {
						g.putVertex(v);
						assertTrue(g.getAdj_list().containsKey(v));
						assertNotNull(g.getAdj_list().get(v));
					}					
				},
				
				() -> {//putNode()
					String[][] nodes = {{"1", "2"}, {"1", "3"}, {"1", "6"}, {"2","5"}, {"3", "6"} ,
										{"3","7"}, {"4", "5"}, {"4", "6"}, {"5", "6"}, {"6", "7"}};
					int[] dists = {5,7,5,7,3,2,8,10,2,4};
					
					for(int i = 0; i < dists.length; i++) {
						Node n = new Node(nodes[i][1], dists[i]);
						assertTrue(g.putNode(nodes[i][0], n));
					}
				},
				
				() -> {assertNotNull(g.getDistances());}
				//dijkstra, mst, maxst
				
				);
		
		
	}

}
