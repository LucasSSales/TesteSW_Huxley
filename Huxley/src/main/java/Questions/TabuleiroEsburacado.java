package Questions;

import java.util.ArrayList;
import java.util.HashMap;

public class TabuleiroEsburacado {
	
	private int cont;
	private HashMap<String, Boolean> holes;
	private int[] movs;
	private int num;
	
	public TabuleiroEsburacado(int[] moves) {
		this.movs = moves;
		this.num = moves.length;
		this.cont = 0;
		holes = new HashMap<String, Boolean>();
		holes.put("(3, 1)", true);
		holes.put("(3, 2)", true);
		holes.put("(5, 2)", true);
		holes.put("(4, 5)", true);
	}
	
	public int resolve() {
		return this.tabEsb(0, 3, 4);
	}
	
	private int tabEsb (int k, int i, int j){
	    if (k==num || holes.containsKey("("+ i + ", " + j + ")")) {
	        return this.cont;
	    }else{
	        if (movs[k]==1){
	            i+=2;
	            j+=1;}
	        else if (movs[k]==2){
	            j+=2;
	            i+=1;}
	        else if (movs[k]==3){
	            j+=2;
	            i-=1;}
	        else if (movs[k]==4){
	            i-=2;
	            j+=1;}
	        else if (movs[k]==5){
	            i-=2;
	            j-=1;}
	        else if (movs[k]==6){
	            j-=2;
	            i-=1;}
	        else if (movs[k]==7){
	            j-=2;
	            i+=1;}
	        else if (movs[k]==8){
	            i+=2;
	            j-=1;}
	        this.cont+=1;
	        k+=1;
	        return tabEsb(k, i, j);
	    }
	}

}

//
//#include <stdio.h>
//int tab_esb (int movs[], int num, int cont[], int ind[], int i[], int j[])
//{
//    int k = ind[0];
//    if (k==num || ((i[0]==3 && j[0]==1) || (i[0]==3 && j[0]==2) || (i[0]==5 && j[0]==2) || (i[0]==4 && j[0]==5)))
//    {
//        return cont[0];
//    }
//    else
//    {
//        if (movs[k]==1){
//            i[0]+=2;
//            j[0]+=1;}
//        else if (movs[k]==2){
//            j[0]+=2;
//            i[0]+=1;}
//        else if (movs[k]==3){
//            j[0]+=2;
//            i[0]-=1;}
//        else if (movs[k]==4){
//            i[0]-=2;
//            j[0]+=1;}
//        else if (movs[k]==5){
//            i[0]-=2;
//            j[0]-=1;}
//        else if (movs[k]==6){
//            j[0]-=2;
//            i[0]-=1;}
//        else if (movs[k]==7){
//            j[0]-=2;
//            i[0]+=1;}
//        else if (movs[k]==8){
//            i[0]+=2;
//            j[0]-=1;}
//        cont[0]+=1;
//        ind[0]+=1;
//        tab_esb(movs, num, cont, ind, i, j);
//    }
//}
//int main ()
//{
//    int num, i[1]={3}, j[1]={4}, cont[1]={0}, saida, k[1]={0}, c;
//    scanf("%d\n", &num);
//    int movs[num];
//    for (c=0; c<num; c++)
//    {
//        scanf("%d", &movs[c]);
//    }
//    saida = tab_esb(movs, num, cont, k, i, j);
//    printf("%d\n", saida);
//    return 0;
//}
