package Question738;

import java.util.ArrayList;
import java.util.Scanner;

import TesteSW.Huxley.Graph;
import TesteSW.Huxley.Node;

public class HorarioDosOnibus {
	
	
	public static <E> void resolve(ArrayList<E> data) {
		
		
		
	}
	
	

	public static void main(String[] args) {
		
//		Scanner ints = new Scanner(System.in);
//		Scanner strs = new Scanner(System.in);
//		
//		Graph g = new Graph();
//		
//		int numCases = ints.nextInt();
//		
//		System.out.println(numCases);
//		
//		for (int i = 0; i< numCases; i++) {
//			
//			String origin = strs.next();
//			String destiny = strs.next();
//			int time = Integer.parseInt(strs.next());
//			int busLines = Integer.parseInt(strs.next());
//			
//			System.out.println(origin + "/" + destiny + "/" + time + "/" + busLines);
//			
//			for (int j = 0; j<busLines; j++) {
//				String o = strs.next();
//				String d = strs.next();
//				int t = Integer.parseInt(strs.next());
//				
//				g.putNode(o, d);
//				
//			}
//		}
		
		Graph g = new Graph();
		
		g.putNode("a", new Node("b", 5));
		g.putNode("a", new Node("d", 10));
		g.putNode("b", new Node("c", 3));
		g.putNode("b", new Node("e", 12));
		g.putNode("c", new Node("e", 4));		
		g.putNode("d", new Node("e", 5));
		
				
		
		//g.printGraph();
		g.dijkstra("a");
		
		

	}

}
