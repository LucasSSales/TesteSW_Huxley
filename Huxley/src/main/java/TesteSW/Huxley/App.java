package TesteSW.Huxley;

import java.util.ArrayList;
import java.util.HashMap;

import Questions.AdegaDeVinhos;
import Questions.ArvoreGeradoraMaxima;
import Questions.Bitmap;
import Questions.EnergiaXTempo;
//import Questions.HorarioDosOnibus;
import Questions.Mochila;
import Questions.MultMatrizes;
import Questions.OsSuspeitos;
import Questions.Pizzaria;
import Questions.ReduzindoMapas;
import Questions.SubconjuntosComplementares;
import Questions.SuperSales;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
//        int[] prices = {4, 2, 10};
//        int[] weights = {12, 1, 4};
//        
//        Mochila m = new Mochila(3, 15, prices, weights); 
//        
//        System.out.println(m.resolve());//12
//        
//
//        
//        int[] prices1 = {4, 2, 10, 2, 1};
//        int[] weights1 = {12,1, 4, 2, 1};
//        
//        Mochila m1 = new Mochila(5, 15, prices1, weights1); 
//        
//        System.out.println(m1.resolve());//15
//        
        
        
        
        ////////////////////////////////////////////////////
        
//        3
//        72 17
//        44 23
//        31 24
//        1
//        26
//        
//        int[] prices = {72, 44, 31};
//        int[] weights = {17, 23, 24};
//        int[] max = {26};
//        
//        SuperSales ss = new SuperSales(prices, weights, max);
//        
//        System.out.println(ss.resolve());//72
//        
//        6
//        64 26
//        85 22
//        52 4
//        99 18
//        39 13
//        54 9
//        4
//        23
//        20
//        20
//        26
//        
//        int[] prices1 = {64, 85, 52, 99, 39, 54};
//        int[] weights1 = {26, 22, 4, 18, 13, 9};
//        int[] max1 = {23, 20, 20, 26};
//        
//        SuperSales ss1 = new SuperSales(prices1, weights1, max1);
//        
//        System.out.println(ss1.resolve());//514
//        
//        
        /////////////////////////////////////////////////////
        
        //int[] s = {2,3,6};
        //int[] s = {2,4,6};
//        SubconjuntosComplementares sc = new SubconjuntosComplementares(s, 7); //Yes
        //SubconjuntosComplementares sc = new SubconjuntosComplementares(s, 2); //No
//        SubconjuntosComplementares sc = new SubconjuntosComplementares(s, 11); //Yes
//        System.out.println(sc.resolve());
        
        
        
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
        
        
        
       // Graph graph = new Graph();
//        graph.putNode("2", new Node("1", 230));
//        graph.putNode("1", new Node("3", 430));
//        int[] orders = {3,2};
        
        
//	     graph.putNode("1", new Node("2", 250));
//	     graph.putNode("1", new Node("3", 928));
//	     graph.putNode("2", new Node("3", 305));
//	     int[] orders = {2,2};        
//        
//        
//        Pizzaria p = new Pizzaria(graph, orders);
        //System.out.println(p.resolve());;
        
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
        
/////////////////////////////////////////////////////////////////////////////
//PARADA ATE SEGUNDA ORDEM
//        Cavaleiro Tancredo 50 5
//        Cavaleiro Barro 12
//        Barro Macaxeira 30
//        Macaxeira Tancredo 15
//        Barro Joana 5
//        Joana Tancredo 24
        
//        
//        HorarioDosOnibus hdo = new HorarioDosOnibus();
//        
//        hdo.putNode("Cavaleiro", new Node("Barro", 12));
//        hdo.putNode("Barro", new Node("Macaxeira", 12));
//        hdo.putNode("Macaxeira", new Node("Tancredo", 12));
//        hdo.putNode("Barro", new Node("Joana", 12));
//        hdo.putNode("Joana", new Node("Tancredo", 12));
//        
//        hdo.resolve("Cavaleiro", "Tancredo");
        
//NAO COMPLETADA
        
        
//////////////////////////////////////////////////////////////////////////////
        
        //int[] values = {1,5,20,1}; //(A1 x (A2 x A3))
        int[] values = {5,10,20,35}; // ((A1 x A2) x A3)
        //int[] values = {30,35,15,5,10,20,25}; // ((A1 x (A2 x A3)) x ((A4 x A5) x A6))
        
        MultMatrizes mm = new MultMatrizes(values);
        
        System.out.println(mm.resolve());
        

    }
}