package Questions;

import java.util.ArrayList;
import java.util.HashMap;

import TesteSW.Huxley.Graph;
import TesteSW.Huxley.Node;

public class OsSuspeitos {
	
	Graph graph;
	private int tam;
	private int num;
	
	public OsSuspeitos(Graph graph, int tam, int num) {
		this.graph = graph;
		this.tam = tam;
		this.num = num;
	}
	
	public int resolve() {
		return graph.bfsOsSuspeitos("0");
	}

	public Graph getGraph() {
		return graph;
	}

	public int getTam() {
		return tam;
	}

	public int getNum() {
		return num;
	}
	

}
