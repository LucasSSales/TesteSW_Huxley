package TesteSW.Huxley;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Set;

public class Graph {
	
	private HashMap<String, ArrayList<Node>> adj_list;
	private HashMap<String, Integer> distances;
	
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
	
	
//	def dijkstra (grafo, source, visited):
//	    pq, x = [(0, source)], 0
//	    
//	    while(len(pq)!=0):
//	        dequeued = heapq.heappop(pq)
//
//	        if(visited[dequeued[1]]==0):
//	            x += dequeued[0]
//	        else:
//	            continue
//
//	        visited[dequeued[1]] = 1
//
//	        for i in range(0,len(grafo[dequeued[1]])):
//	            if(visited[grafo[dequeued[1]][i][1]] == 0):
//	                heapq.heappush(pq, (grafo[dequeued[1]][i][0], grafo[dequeued[1]][i][1]))
//	    print(x)
		

}
