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
    public static void main( String[] args ) {
    	
        System.out.println( "Hello World!" );
        
//////////////////////////////////////////////////////////////////////////////
//        
//        
//        DadosDaSorte ds = new DadosDaSorte(1, 8);
//        System.out.println(ds.resolve());
//        DadosDaSorte ds1 = new DadosDaSorte(2, 11);
//        System.out.println(ds1.resolve());
//     
////////////////////////////////////////////////////////////////////////////////////
//      
//        int[][] matrix = {{4,3},{2,1}};
//        CadeirasDoAuditorio ca = new CadeirasDoAuditorio(matrix);
//        System.out.println(ca.resolve());
//              
////////////////////////////////////////////////////////////////////////////////////
//
//        String[] friends = {"Joao", "Maria", "Tadeu", "Jose", "Ricardo"};
//        
//        Orkut o = new Orkut(friends);
//        
//        HashMap<String, Integer> in = new HashMap<>();
//        in.put("Joao", 2);
//        in.put("Maria", 1);
//        in.put("Jose", 1);
//        in.put("Tadeu", 0);
//        in.put("Ricardo", 0);
//        
//        
//         //Joao 2 Maria Ricardo 
//         //Maria 1 Tadeu 
//         //Jose 1 Joao 
//         //Tadeu 0 
//         //Ricardo 0
//         
//         o.putNode("Maria", new Node("Joao", 1));
//         o.putNode("Ricardo", new Node("Joao", 1));
//         o.putNode("Tadeu", new Node("Maria", 1));
//         o.putNode("Joao", new Node("Jose", 1));
//         //o.putNode("", new Node("Tadeu", 1));
//         //o.putNode("", new Node("Ricardo", 1));
//         
////         Joao Maria Renata
////         Maria 1 Joao
////         Joao 1 Renata
////         Renata 1 Maria
//
//         
//        
//        o.setIndegrees(in);
//        System.out.println(o.resolve());
//  
////////////////////////////////////////////////////////////////////////////////////  
//        
//        char[][] mapa = {
//        		{'#', '#', '#', '#', '#'}, 
//        		{'#', '.', '.', '.', '#'}, 
//        		{'.', '.', '.', '.', '.'}, 
//        		{'#', '.', '.', '.', '.'}, 
//        		{'#', '#', '.', '.', '#'}};
//        
//        
//        Costa c = new Costa(mapa);
//        System.out.println(c.resolve());
//        
////////////////////////////////////////////////////////////////////////////////////        
//        
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
//        
//        Frete f = new Frete(x);
//        System.out.println(f.resolve());
                
        
    }
}