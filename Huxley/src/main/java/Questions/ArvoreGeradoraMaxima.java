package Questions;

import java.util.ArrayList;
import java.util.HashMap;

import TesteSW.Huxley.Graph;
import TesteSW.Huxley.Node;

public class ArvoreGeradoraMaxima {
	
	Graph graph;
	
	public ArvoreGeradoraMaxima(Graph graph) {
		this.graph = graph;
	}
	
	public int resolve(String source) {
		return -graph.maxst(source);		
	}

}
