package Questions;

import TesteSW.Huxley.Graph;

public class ReduzindoMapas {
	
	Graph graph;
	
	public ReduzindoMapas(Graph graph) {
		this.graph = graph;
	}
	
	public int resolve(String source) {
		return graph.mst(source);		
	}

}
