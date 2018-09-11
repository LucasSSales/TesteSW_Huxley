package Questions;

import java.util.HashMap;

import TesteSW.Huxley.Graph;

public class Pizzaria {
	
	Graph graph;
	private int[] orders;
	HashMap<String, Integer> dij;
	
	
	public Pizzaria(Graph graph, int[] orders) {
		this.graph = graph;
		this.orders = orders;
	}
	
	public int resolve() {
		this.dij = this.graph.dijkstra("1");
		int anwser = 0;
		for(int i = 0; i < orders.length; i++) {
			anwser += this.dij.get(Integer.toString(orders[i])) * 2;
		}
		return anwser;
	}

	public Graph getGraph() {
		return graph;
	}

	public int[] getOrders() {
		return orders;
	}

	public HashMap<String, Integer> getDij() {
		return dij;
	}

}