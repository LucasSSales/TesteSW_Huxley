package TesteSW.Huxley;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import Questions.AdegaDeVinhos;
import Questions.ArvoreGeradoraMaxima;
import Questions.Bitmap;
import Questions.Costa;
//import Questions.CadeirasDoAuditorio;
import Questions.DadosDaSorte;
import Questions.EnergiaXTempo;
import Questions.Frete;
import Questions.Mochila;
import Questions.MultMatrizes;
import Questions.Orkut;
import Questions.OsSuspeitos;
import Questions.Palindromo;
import Questions.Pizzaria;
import Questions.ReduzindoMapas;
import Questions.SubconjuntosComplementares;
import Questions.SuperSales;
import Questions.TabuleiroEsburacado;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
//        1
//        7 10
//        1 2 5
//        1 6 5
//        1 3 7
//        2 5 7
//        3 6 3
//        3 7 2
//        4 5 8
//        4 6 10
//        5 6 2
//        6 7 4
        
        
        
        
///////////////////////////////////////////////////////////////////////////////  
     
        
//        2
        
//        3 2
//        2 1 230
//        1 3 430
        
//        2
//        3 2
        
//        3 3
//        1 2 250
//        1 3 928
//        2 3 305
//        2
//        2 2
        
        
        

        
 ///////////////////////////////////////////////////////////////////////////////      
        
//        100 4
//        2 1 2
//        5 10 13 11 12 14
//        2 0 1
//        2 99 2
        
//        200 2
//        1 5
//        5 1 2 3 4 5
        
//        1 0 //1
        
//        0 0
//        
        
//        
//        Graph graph = new Graph();
//                
////        for(int i = 0; i < 100; i++)
////        	graph.putNode(source, destiny);
//        
//	    graph.putNode("10", new Node("13", 250));
//	    graph.putNode("13", new Node("11", 928));
//	    graph.putNode("11", new Node("12", 305));
//	    graph.putNode("12", new Node("14", 250));
//	    graph.putNode("14", new Node("10", 928));
//	    
//	    graph.putNode("1", new Node("2", 305));
//	    graph.putNode("0", new Node("1", 305));
//	    
//	    graph.putNode("99", new Node("2", 305));
//
//        OsSuspeitos s = new OsSuspeitos(graph, 100, 4);
//        s.resolve();
//              
        
//////////////////////////////////////////////////////////////////////////////
//        
//        
//        DadosDaSorte ds = new DadosDaSorte(1, 8);
//        System.out.println(ds.resolve());
//        DadosDaSorte ds1 = new DadosDaSorte(2, 11);
//        System.out.println(ds1.resolve());
        
////////////////////////////////////////////////////////////////////////////////////

        
        
//        int[][] matrix = {{4,3},{2,1}};
//        CadeirasDoAuditorio ca = new CadeirasDoAuditorio(matrix);
//        System.out.println(ca.resolve());
        
        
////////////////////////////////////////////////////////////////////////////////////
        
        
        String[] friends = {"Joao", "Maria", "Tadeu", "Jose", "Ricardo"};
        
        Orkut o = new Orkut(friends);
        
        HashMap<String, Integer> in = new HashMap<>();
        in.put("Joao", 2);
        in.put("Maria", 1);
        in.put("Jose", 1);
        in.put("Tadeu", 0);
        in.put("Ricardo", 0);
        
        
         //Joao 2 Maria Ricardo 
         //Maria 1 Tadeu 
         //Jose 1 Joao 
         //Tadeu 0 
         //Ricardo 0
         
         o.putNode("Maria", new Node("Joao", 1));
         o.putNode("Ricardo", new Node("Joao", 1));
         o.putNode("Tadeu", new Node("Maria", 1));
         o.putNode("Joao", new Node("Jose", 1));
         //o.putNode("", new Node("Tadeu", 1));
         //o.putNode("", new Node("Ricardo", 1));
         
//         Joao Maria Renata
//         Maria 1 Joao
//         Joao 1 Renata
//         Renata 1 Maria

         
        
        o.setIndegrees(in);
        System.out.println(o.resolve());

        
        
////////////////////////////////////////////////////////////////////////////////////  
        
        char[][] mapa = {
        		{'#', '#', '#', '#', '#'}, 
        		{'#', '.', '.', '.', '#'}, 
        		{'.', '.', '.', '.', '.'}, 
        		{'#', '.', '.', '.', '.'}, 
        		{'#', '#', '.', '.', '#'}};
        
        
        Costa c = new Costa(mapa);
        System.out.println(c.resolve());
        
        
        
//        7 10
        int[][] x = {{1, 2, 5},
        {3, 1, 32},
        {1, 4, 3},
        {2, 3, 4},
        {2, 6, 20},
        {6, 3, 1},
        {6, 4, 9},
        {6, 5, 6},
        {3, 7, 18},
        {5, 7, 2}};
        
//        5 6
//        1 2 4
//        1 3 3
//        4 3 6
//        4 5 2
//        2 4 1
//        3 5 5

        
//        Graph g = new Graph();
//        
//        for(int i = 0; i<x.length; i++) {
//        	g.putNode(Integer.toString(x[i][0]), new Node(Integer.toString(x[i][1]), x[i][2]));
//        	System.out.println(x[i][0] + " " + x[i][1] + " " + x[i][2]);
//        }
//        g.printGraph();
//        HashMap<String, Integer> d = g.dijkstra("1");
//        
//        Set<String> k = d.keySet();
//        for(String s : k)
//        	System.out.println(s + " " + d.get(s));
//        
//        System.out.println(d.get(""+d.size()));
        
        Frete f = new Frete(x);
        System.out.println(f.resolve());
        
        
        
        
        
        
        
        
        
        
        
    }
}