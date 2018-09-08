package Question474;

import java.util.ArrayList;
import java.util.HashMap;

import Questions.RotasDeEntrega;
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
		RotasDeEntrega r = new RotasDeEntrega(g);
		
		r.routes.putNode("AA", new Node("CC", 1));
		r.routes.putNode("CC", new Node("QR", 1));
		r.routes.putNode("DD", new Node("CC", 1));
		r.routes.putNode("AA", new Node("DD", 1));
		r.routes.putNode("AA", new Node("AB", 1));
		r.routes.putNode("DD", new Node("QR", 1));
		r.routes.putNode("AB", new Node("DD", 1));
		
		
			
		
		System.out.println(r.resolve("DD", "CC", 14));
		
		

	}

}
