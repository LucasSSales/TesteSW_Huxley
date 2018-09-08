package Questions;

import java.util.Scanner;

public class CorteDeHastes {
	
	private int[] memo;
	private int cases;
	private int[] values;
	
	public CorteDeHastes(int[] values) {
		this.cases = values.length;
		this.values = values;
		this.memo = new int[cases+1];
		this.memo[0] = 0;
		for (int i = 1; i <= cases; i++)
			this.memo[i] = -1;
	}
	
	public int resolve() {	
		if(cases == 0)
			return 0;
		int best = 0;
		for (int i = 0; i < values.length; i++) {
			best = 0;
			int k = i;
			for (int j = 0; j < i+1; j++) {
				best = (best >  values[j] + memo[k]) ? best :  values[j] + memo[k];
				k--;
			}
			memo[i + 1] = best;
		}
		return memo[values.length];		
	}

}
