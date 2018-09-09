package TesteSW.Huxley;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Set;

public class Graph {
	
	protected HashMap<String, ArrayList<Node>> adj_list;
	protected HashMap<String, Integer> distances;
	protected int[][] adjmatrix;
	
	public Graph() {
		this.adj_list = new HashMap<String, ArrayList<Node>>();
		this.distances = new HashMap<String, Integer>();
	}
	
	public Graph(HashMap<String, ArrayList<Node>> adj_list) {
		this.adj_list = adj_list;
		this.distances = new HashMap<String, Integer>();
	}
			
	public void putNode(String source, Node destiny) {
		if( !adj_list.containsKey(source) )
			adj_list.put(source, new ArrayList<Node>());
		
		if( !adj_list.containsKey(destiny.getStrValue()) )
			adj_list.put(destiny.getStrValue(), new ArrayList<Node>());
		
		adj_list.get(source).add(destiny);
		adj_list.get(destiny.getStrValue()).add(new Node(source, destiny.getDistance()));
	}
	
	public void printGraph() {
		Set<String> keys = adj_list.keySet();
		for (String s : keys) {
			ArrayList<Node> al = adj_list.get(s);
			System.out.print(s + " -> ");
			for (Node n : al) 
				System.out.print(n + " ");
			System.out.println("");
		}
	}
	
	private void setDistances() {
		for(String s : adj_list.keySet()) {
			distances.put(s, new Integer(Integer.MAX_VALUE));
		}
	}
	
	public void bfs(String source) {
		ArrayList<Node> queue = new ArrayList<Node>();
		HashMap<String, Boolean> visited = new HashMap<String, Boolean>();
		
		queue.add(new Node(source, 0));
		visited.put(source, true);
		
		while(!queue.isEmpty()) {
			Node deq = queue.remove(0);
			
			ArrayList<Node> al = adj_list.get(deq.getStrValue());
			System.out.println("VISITANDO " + deq.getStrValue());
			for (Node n : al) {
				if(!visited.containsKey(n.getStrValue())) {
					queue.add(n);
					visited.put(n.getStrValue(), true);
					System.out.println("nao visitado: " + n.getStrValue());
				}
			}
			System.out.println(deq.getStrValue());
		}
	}	
		
	public void dfs(String source) {
		HashMap<String, Boolean> visited = new HashMap<String, Boolean>();
		visited.put(source, true);
		this.dfs(source, visited);
	}
	
	private void dfs(String source, HashMap<String, Boolean> visited) {
		ArrayList<Node> al = adj_list.get(source);
		System.out.println(">" + source +"<");
		
		for (Node n : al) {
			if(!visited.containsKey(n.getStrValue())) {
				visited.put(n.getStrValue(), true);
				dfs(n.getStrValue(), visited);
			}
		}
		
	}
	
	public HashMap<String, Integer> dijkstra(String source) {
		
		Comparator<Node> c = new Comparator<Node>() {
			public int compare(Node n1, Node n2) {			
				return n1.getDistance().compareTo(n2.getDistance());
			}
		};
		PriorityQueue<Node> pq = new PriorityQueue<Node>(c);
		pq.add(new Node(source, 0));
		
		this.setDistances();
		this.distances.put(source, 0);
				
		while(!pq.isEmpty()) {
			Node deq = pq.poll();
			deq.visited = true;
			ArrayList<Node> al = this.adj_list.get(deq.getStrValue());

			Integer deqd = deq.getDistance();
			for (Node n : al) {
				if(n.visited)
					continue;
					
				Integer currentd = distances.get(n.getStrValue());
				if( deqd + n.getDistance() < currentd ) {
					pq.add(new Node(n.getStrValue(), deqd + n.getDistance()));
					distances.put(n.getStrValue(), deqd + n.getDistance());
				}
			}
		}
		
		return distances;		
		
	}
	
	
	public int mst (String source) {
		Comparator<Node> c = new Comparator<Node>() {
			public int compare(Node n1, Node n2) {			
				return n1.getDistance().compareTo(n2.getDistance());
			}
		};
		PriorityQueue<Node> pq = new PriorityQueue<Node>(c);
		pq.add(new Node(source, 0));
		HashMap<String, Boolean> visited = new HashMap<String, Boolean>();
		int sum = 0;
		
		while(!pq.isEmpty()) {
			Node deq = pq.poll();
						
			if(!visited.containsKey(deq.getStrValue()))
				sum += deq.getDistance();
			else
				continue;
				
			visited.put(deq.getStrValue(), true);
			ArrayList<Node> al = adj_list.get(deq.getStrValue());
			
			for (Node n : al) {
				if(!visited.containsKey(n.getStrValue()))
					pq.add(n);
			}
		}
		return sum;
	}
	
	public int maxst (String source) {
		Comparator<Node> c = new Comparator<Node>() {
			public int compare(Node n1, Node n2) {			
				return n1.getNegativeDistance().compareTo(n2.getNegativeDistance());
			}
		};
		PriorityQueue<Node> pq = new PriorityQueue<Node>(c);
		pq.add(new Node(source, 0));
		HashMap<String, Boolean> visited = new HashMap<String, Boolean>();
		int sum = 0;
		
		while(!pq.isEmpty()) {
			Node deq = pq.poll();
						
			if(!visited.containsKey(deq.getStrValue()))
				sum += deq.getNegativeDistance();
			else
				continue;
				
			visited.put(deq.getStrValue(), true);
			ArrayList<Node> al = adj_list.get(deq.getStrValue());
			
			for (Node n : al) {
				if(!visited.containsKey(n.getStrValue()))
					pq.add(n);
			}
		}
		return sum;
	}
	
	public void bfsOsSuspeitos(String source) {
		ArrayList<Node> queue = new ArrayList<Node>();
		HashMap<String, Boolean> visited = new HashMap<String, Boolean>();
		int cont = 1;
		queue.add(new Node(source, 0));
		visited.put(source, true);
		
		while(!queue.isEmpty()) {
			Node deq = queue.remove(0);
			
			ArrayList<Node> al = adj_list.get(deq.getStrValue());
			for (Node n : al) {
				if(!visited.containsKey(n.getStrValue())) {
					queue.add(n);
					visited.put(n.getStrValue(), true);
					cont += 1;
				}
			}
		}
		System.out.println(cont);
	}
	
//	public void buildMatrix() {
//		
//		this.adjmatrix = new int[this.adj_list.size()][this.adj_list.size()];
//		
//		for(int i = 0; i < this.adj_list.size(); i++) {
//			for(int j = 0; j < this.adj_list.size(); j++) {
//				this.adjmatrix[i][j] = Integer.MAX_VALUE;
//			}
//		}
//		
//		Set<String> keys = adj_list.keySet();
//		
//		for(String s : keys) {
//			ArrayList<Node> al = adj_list.get(s);
//			for(Node n : al) {
//				adjmatrix[Integer.parseInt(s)][Integer.parseInt(n.getStrValue())] = n.getDistance();
//				adjmatrix[Integer.parseInt(n.getStrValue())][Integer.parseInt(s)] = n.getDistance();
//			}
//		}
//		
//		for(int i = 0; i < this.adj_list.size(); i++) {
//			for(int j = 0; j < this.adj_list.size(); j++) {
//				System.out.println(this.adjmatrix[i][j] + " ");
//			}
//		}
//		
//	}
	
//	public void floydWarshall() {
//		
//		for(int k = 0; k < adj_list.size(); k++) {
//			
//			for(int i = 0; i < )
//			
//			
//		}
//		
//	}
	


}
