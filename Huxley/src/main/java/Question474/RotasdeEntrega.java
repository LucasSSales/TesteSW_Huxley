package Question474;

import java.util.ArrayList;
import java.util.HashMap;

import TesteSW.Huxley.Graph;
import TesteSW.Huxley.Node;

public class RotasdeEntrega {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<String, ArrayList<Node>> routes = new HashMap<String, ArrayList<Node>>();
		routes.put("AA", new ArrayList<Node>());
		routes.put("CC", new ArrayList<Node>());
		routes.put("QR", new ArrayList<Node>());
		routes.put("FF", new ArrayList<Node>());
		routes.put("DD", new ArrayList<Node>());
		routes.put("AB", new ArrayList<Node>());
		Graph g = new Graph(routes);
			
		
		
		g.putNode("AA", new Node("CC", 1));
		g.putNode("CC", new Node("QR", 1));
		g.putNode("DD", new Node("CC", 1));
		g.putNode("AA", new Node("DD", 1));
		g.putNode("AA", new Node("AB", 1));
		g.putNode("DD", new Node("QR", 1));
		g.putNode("AB", new Node("DD", 1));
		
		g.printGraph();
		System.out.println();
		
		g.dijkstra("AA");
		System.out.println();
		g.dijkstra("DD");
		System.out.println();
		g.dijkstra("CC");
		System.out.println();
		g.dijkstra("AB");
		

		//g.dijkstra("DD");
		
		

	}

}
