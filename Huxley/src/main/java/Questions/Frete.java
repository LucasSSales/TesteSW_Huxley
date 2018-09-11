package Questions;

import java.util.HashMap;
import java.util.Set;

import TesteSW.Huxley.Graph;
import TesteSW.Huxley.Node;

public class Frete extends Graph{
	
    int[][] nodes;
    
    public Frete(int[][] nodes) {
    	super();
    	this.nodes = nodes;
        for(int i = 0; i<nodes.length; i++) {
        	putNode(Integer.toString(nodes[i][0]), new Node(Integer.toString(nodes[i][1]), nodes[i][2]));
        	System.out.println(nodes[i][0] + " " + nodes[i][1] + " " + nodes[i][2]);
        }
	}
    
	
	public int resolve() {
		if(nodes.length == 0)
			return 0;
		distances = dijkstra("1");
		return distances.get(""+(distances.size()));
	}
}
