package TesteSW.Huxley;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Set;

public class Graph {
	
	//ESSA CLASSE GRAPH É IMPLEMENTADA USANDO UMA HashMap<String, ArrayList<Node>> COMO LISTA DE ADJACENCIA
	//TODAS OS VERTICES DEVEM SER STRINGS
	protected HashMap<String, ArrayList<Node>> adj_list;
	protected HashMap<String, Integer> distances;
	
	public Graph() {
		this.adj_list = new HashMap<String, ArrayList<Node>>();
		this.distances = new HashMap<String, Integer>();
	}
	
	//CONSTRUTOR QUE RECEBE UMA HASHMAP PRONTA
	public Graph(HashMap<String, ArrayList<Node>> adj_list) {
		this.adj_list = adj_list;
		this.distances = new HashMap<String, Integer>();
	}
	
	//ADICIONA DE MANEIRA NAO-DIRECIONADA NÓS AO GRAFO
	//RECEBE UMA STRING CHAVE E UM NODE DE VALOR PARA ADICIONAR
	//RETORNA TRUE SE AMBOS OS NÓS FOREM ADICIONADOS
	public boolean putNode(String source, Node destiny) {
		if( !adj_list.containsKey(source) )
			adj_list.put(source, new ArrayList<Node>());
		
		if( !adj_list.containsKey(destiny.getStrValue()) )
			adj_list.put(destiny.getStrValue(), new ArrayList<Node>());
		
		return adj_list.get(source).add(destiny) && adj_list.get(destiny.getStrValue()).add(new Node(source, destiny.getDistance()));
	}
	
	//ADICIONA VERTICES AO GRAFO
	//RECEBE O VALOR EM STRING DO VERTICE A SER ADICIONADO
	public void putVertex(String vertex) {
		if(!this.adj_list.containsKey(vertex))
			this.adj_list.put(vertex, new ArrayList<Node>());
	}
	
//	//FUNÇÃO PARA IMPRIMIR O GRAFO
//	public void printGraph() {
//		Set<String> keys = adj_list.keySet();
//		for (String s : keys) {
//			ArrayList<Node> al = adj_list.get(s);
//			System.out.print(s + " -> ");
//			for (Node n : al) 
//				System.out.print(n + " ");
//			System.out.println("");
//		}
//	}
	
	
	protected void setDistances() {
		for(String s : adj_list.keySet()) {
			distances.put(s, new Integer(Integer.MAX_VALUE));
		}
	}
	
	//RETORNA A LISTA DE CHAVES DA LISTA DE ADJACENCIA
	public Set<String> keys() {
		return this.adj_list.keySet();
	}
	
//	public void bfs(String source) {
//		ArrayList<Node> queue = new ArrayList<Node>();
//		HashMap<String, Boolean> visited = new HashMap<String, Boolean>();
//		
//		queue.add(new Node(source, 0));
//		visited.put(source, true);
//		
//		while(!queue.isEmpty()) {
//			Node deq = queue.remove(0);
//			
//			ArrayList<Node> al = adj_list.get(deq.getStrValue());
//			System.out.println("VISITANDO " + deq.getStrValue());
//			for (Node n : al) {
//				if(!visited.containsKey(n.getStrValue())) {
//					queue.add(n);
//					visited.put(n.getStrValue(), true);
//					System.out.println("nao visitado: " + n.getStrValue());
//				}
//			}
//			System.out.println(deq.getStrValue());
//		}
//	}	
		
//	public void dfs(String source) {
//		HashMap<String, Boolean> visited = new HashMap<String, Boolean>();
//		visited.put(source, true);
//		this.dfs(source, visited);
//	}
//	
//	private void dfs(String source, HashMap<String, Boolean> visited) {
//		ArrayList<Node> al = adj_list.get(source);
//		System.out.println(">" + source +"<");
//		
//		for (Node n : al) {
//			if(!visited.containsKey(n.getStrValue())) {
//				visited.put(n.getStrValue(), true);
//				dfs(n.getStrValue(), visited);
//			}
//		}
//		
//	}
	
	//FUNÇÃO QUE EXECUTA O ALGORITMO DE DIJKSTRA
	//RECEBE UM VERTICE DE PARTIDA
	//RETORNA UMA HashMap<String, Integer> DE VERTICES E MENORES DISTANCIAS DELES ATE A PARTIDA
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
	
	//FUNÇÃO PARA OBTER ARVORE GERADORA MINIMA
	//RECEBE O VERTICE DE PARTIDA
	//RETORNA O VALOR DA MST
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
	
	//FUNÇÃO PARA RETORNA A ARVORE GERADORA MÁXIMA
	//SIMILIAR A MST, COM O DIFERENCIAL DE RECEBER VALORES NEGATIVOS PARA DISTANCIAS
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
	
	//BFS UTILIZADA NA QUESTÃO OS SUSPEITOS
	public int bfsOsSuspeitos(String source) {
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
		return cont;
	}

	public HashMap<String, ArrayList<Node>> getAdj_list() {
		return adj_list;
	}

	public HashMap<String, Integer> getDistances() {
		return distances;
	}
	
	

}
