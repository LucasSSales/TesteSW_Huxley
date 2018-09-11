package Questions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import TesteSW.Huxley.Graph;
import TesteSW.Huxley.Node;

public class Orkut extends Graph{
	
	private HashMap<String, Integer> indegrees = new HashMap<String, Integer>();
	private HashMap<String, Boolean> visited = new HashMap<String, Boolean>();
	String[] friends;
	
	public Orkut(String[] friends) {
		super();
		this.friends = friends;
		 for(String s : friends) {
			 if(!adj_list.containsKey(s))
				 adj_list.put(s, new ArrayList<Node>());
			 if(!visited.containsKey(s))
				 visited.put(s, false);
		 }
		
	}
	
	public String resolve() {
		return this.topologicalSort();
	}
	
	public void setIndegrees(HashMap<String, Integer> idegrees) {
		this.indegrees = idegrees;
	}
	
	@Override
	public boolean putNode(String source, Node destiny) {
		if( !adj_list.containsKey(source) )
			adj_list.put(source, new ArrayList<Node>());
		
		return adj_list.get(source).add(destiny);
	}
	
	public void putIndegrees(String vertex, int indegree) {
		this.indegrees.put(vertex, indegree);
	}
	
	private String topologicalSort() {
		
		ArrayList<String> queue = new ArrayList<String>();
		for(String s: friends) {
			if(indegrees.get(s) == 0)
				queue.add(s);
		}
		
		ArrayList<String> stack = new ArrayList<String>();
		
		if(queue.isEmpty())
			return "impossivel\n";
		else {
			int conf=0;
			while(!queue.isEmpty()) {
				String deq = queue.remove(0);
				ArrayList<Node> al = adj_list.get(deq);
				
				for(Node n : al) {
					String s = n.getStrValue();
					indegrees.put(s, indegrees.get(s) - 1);
					if(visited.get(s)) {
						conf =1;
						break;
					}
					if(indegrees.get(s) == 0) {
						queue.add(s);
						visited.put(s, true);
					}
				}
				stack.add(deq);
			}
			
			if(conf == 1 || stack.size() != adj_list.size())
				return "impossivel\n";
			else {
				String o = "";
				int cont = 0;
				for(String s : stack) {
					o += s;
					if(cont == stack.size()-1)
						o += "\n";
					else o += " ";
					cont++;
				}
				return o;
			}
		}
	}

	public HashMap<String, Integer> getIndegrees() {
		return indegrees;
	}

	public HashMap<String, Boolean> getVisited() {
		return visited;
	}

	public String[] getFriends() {
		return friends;
	}
	
}