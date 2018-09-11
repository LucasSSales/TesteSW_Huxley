package Questions;

public class EnergiaXTempo {
	
	private int[][] memo;
	private int[][] table;
	private int freq;
	private int prog; 
	private int mudarF;
	
	public EnergiaXTempo (int freq, int prog, int energy, int time, int[][] table) {
		this.freq = freq;
		this.prog = prog;
		this.mudarF = energy * time;
		this.table = table;
		
		this.memo = new int[prog+1][freq];
		for (int i = 0; i <= prog; i++) {
			for (int j = 0; j < freq; j++) {
				if(i==0){
					if(j==0)
						this.memo[i][j] = table[i][j];
					else
						this.memo[i][j] = table[i][j] + this.mudarF;
				}else
					this.memo[i][j] = -1;
			}
		}
	}
	
	public int resolve() {	
		int min = Integer.MAX_VALUE;
		this.mochila(table.length-1, 0);
		for(int i=0; i<this.freq; i++) {
			if(this.memo[memo.length-2][i] < min)
				min = this.memo[memo.length-2][i];
		}
		return min;
	}
	
	private int mochila(int prog, int freq) {
		
		if(this.memo[prog][freq] != -1)
			return this.memo[prog][freq];
		
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < this.freq; i++) {
			int n = this.table[prog][freq] + mochila(prog-1, i);
			if(i != freq)
				n += this.mudarF;
			if(n < min)
				min = n;
		}
		memo[prog][freq] = min;
		return min;
	}

	public int[][] getMemo() {
		return memo;
	}

	public int[][] getTable() {
		return table;
	}

	public int getFreq() {
		return freq;
	}

	public int getProg() {
		return prog;
	}

	public int getMudarF() {
		return mudarF;
	}	
	
	

}
