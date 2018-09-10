package Questions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import TesteSW.Huxley.Graph;
import TesteSW.Huxley.Node;

public class Orkut extends Graph{
	
	private HashMap<String, Integer> indegrees;
	private HashMap<String, Boolean> visited;
	
	public Orkut(String[] friends) {
		super();
		
		 for(String s : friends) {
			 if(!adj_list.containsKey(s))
				 adj_list.put(s, new ArrayList<Node>());
			 if(!indegrees.containsKey(s))
				 indegrees.put(s, 0);
			 if(!visited.containsKey(s))
				 visited.put(s, false);
		 }
		
	}
	
	public void resolve() {
		
	}
	
	public void setIndegrees(int[] idegrees) {
		this.indegrees = indegrees;
	}
	
	@Override
	public void putNode(String source, Node destiny) {
		if( !adj_list.containsKey(source) )
			adj_list.put(source, new ArrayList<Node>());
		
		adj_list.get(source).add(destiny);
	}
	
	
	
	public String topologicalSort() {
		
		ArrayList<String> queue = new ArrayList<String>();
		Set<String> keys = adj_list.keySet();
		for(String s: keys) {
			if(indegrees.get(s) == 0)
				queue.add(s);
		}
		
		ArrayList<String> stack = new ArrayList<String>();
		
		if(queue.isEmpty())
			return "impossivel"; //Impossivel
		else {
			int conf=0;
			while(!queue.isEmpty()) {
				String deq = queue.remove(0);
				
				ArrayList<Node> al = adj_list.get(deq);
				
				for(Node n : al) {
					String s = n.getStrValue();
					indegrees.put(s, indegrees.get(s) - 1);
					if(!visited.get(s)) {
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
				return "impossivel"; //Impossivel
			else {
				for(String s : stack) {
					System.out.print(s + " ");
				}
			}
		}
		return "c";
		
	}
	
}
//
//x = int(input())
//case = 1
//while (x != 0):
//    dic = {}
//    visited = {}
//    indegree = {}
//    friends = input().split()
//
//    for i in range(len(friends)):
//        if friends[i] not in visited:
//            visited[friends[i]] = 0
//        if friends[i] not in dic:
//            dic[friends[i]] = []
//        if friends[i] not in indegree:
//            indegree[friends[i]] = -1
//
//
//
//    for i in range(len(friends)):
//        linha = input().split()
//
//        indegree[linha[0]] = int(linha[1])
//
//
//        for j in range(int(linha[1])):
//            if linha[j+2] not in dic:
//                dic[linha[j+2]] = [linha[0]]
//            else:
//                dic[linha[j+2]].append(linha[0])
//
//    conf = 0
//
//    print("Teste "+str(case))
//
//    queue = []
//    for i in range(len(friends)):
//        if(indegree[friends[i]] == 0):
//            queue.append(friends[i])
//
//    stack = []
//
//    if(len(queue) == 0):
//        print("impossivel", end="")
//    else:
//        conf = 0
//        while len(queue) != 0 :
//            deq = queue.pop(0)
//
//            for i in range(len(dic[deq])):
//                indegree[dic[deq][i]] -= 1
//                if(visited[dic[deq][i]] == 1):
//                    conf = 1
//                    break
//                if(indegree[dic[deq][i]] == 0):
//                    queue.append(dic[deq][i])
//                    visited[dic[deq][i]] = 1
//
//            stack.append(deq)
//
//        if(conf == 1 or len(stack) != len(friends)):
//            print("impossivel", end="")
//        else:
//            for i in range(len(stack)):
//                print(stack[i], end="")
//                if(i!= len(stack)-1):
//                    print(" ", end="")
//    print("\n")
//
//    case += 1
//    x = int(input())