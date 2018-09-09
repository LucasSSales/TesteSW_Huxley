package TesteSW.Huxley;

import java.util.ArrayList;
import java.util.HashMap;

import Questions.AdegaDeVinhos;
import Questions.ArvoreGeradoraMaxima;
import Questions.Bitmap;
import Questions.EnergiaXTempo;
import Questions.Mochila;
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
        
        int[] prices = {72, 44, 31};
        int[] weights = {17, 23, 24};
        int[] max = {26};
        
        SuperSales ss = new SuperSales(prices, weights, max);
        
        System.out.println(ss.resolve());//72
        
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
        
        int[] prices1 = {64, 85, 52, 99, 39, 54};
        int[] weights1 = {26, 22, 4, 18, 13, 9};
        int[] max1 = {23, 20, 20, 26};
        
        SuperSales ss1 = new SuperSales(prices1, weights1, max1);
        
        System.out.println(ss1.resolve());//514
        
        
        /////////////////////////////////////////////////////
        
        int[] s = {2,3,6};
        //int[] s = {2,4,6};
//        SubconjuntosComplementares sc = new SubconjuntosComplementares(s, 7); //Yes
        //SubconjuntosComplementares sc = new SubconjuntosComplementares(s, 2); //No
        SubconjuntosComplementares sc = new SubconjuntosComplementares(s, 11); //Yes
        System.out.println(sc.resolve());
        
//        [[1, 1, 1, 1, 1], 
//         [0, -1, -1, -1, -1], 
//         [0, -1, -1, -1, -1],
        
//         [0, -1, -1, -1, -1], 
//         [0, -1, -1, -1, -1],
//         [0, -1, -1, -1, -1], 
//         [0, -1, -1, -1, -1],
        
//         [0, -1, -1, -1, -1], 
//         [0, -1, -1, -1, -1], 
//         [0, -1, -1, -1, -1]]
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    }
}