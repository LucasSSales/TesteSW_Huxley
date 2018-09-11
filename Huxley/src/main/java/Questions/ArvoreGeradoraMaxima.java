package Questions;

import java.util.ArrayList;
import java.util.HashMap;

import TesteSW.Huxley.Graph;
import TesteSW.Huxley.Node;

public class ArvoreGeradoraMaxima extends Graph {
	
	public ArvoreGeradoraMaxima() {
		super();
	}
	
	public int resolve(String source) {
		return -maxst(source);		
	}	

}
