package TesteSW.Huxley;

import java.util.ArrayList;
import java.util.HashMap;

import Questions.AdegaDeVinhos;
import Questions.ReduzindoMapas;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Graph graph = new Graph();
        
//        graph.putNode("1", new Node("2", 15));
//        graph.putNode("1", new Node("3", 10));
//        graph.putNode("2", new Node("3", 1));
//        graph.putNode("3", new Node("4", 3));
//        graph.putNode("2", new Node("4", 5));
//        graph.putNode("4", new Node("5", 20));        
        
//        5 6
//        1 2 5
//        1 4 10
//        2 3 3
//        2 5 12
//        3 5 4
//        4 5 5
        //ESPERADO: 17
        
	    graph.putNode("A", new Node("B", 5));
	    graph.putNode("A", new Node("D", 10));
	    graph.putNode("B", new Node("C", 3));
	    graph.putNode("B", new Node("E", 12));
	    graph.putNode("C", new Node("E", 4));
	    graph.putNode("D", new Node("E", 5)); 
        
        ReduzindoMapas rm = new ReduzindoMapas(graph);
        
        System.out.println(rm.resolve("A"));
    }
}
