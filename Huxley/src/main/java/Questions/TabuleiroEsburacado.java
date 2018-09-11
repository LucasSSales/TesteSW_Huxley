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

	public int getCont() {
		return cont;
	}

	public HashMap<String, Boolean> getHoles() {
		return holes;
	}

	public int[] getMovs() {
		return movs;
	}

	public int getNum() {
		return num;
	}
	
	

}