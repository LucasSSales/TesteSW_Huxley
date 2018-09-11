package Questions;

public class SubconjuntosComplementares {
	
	int[][] table;
	private int[] s;
	private int l;
	private int d;
	private int sum;
	
	public SubconjuntosComplementares(int[] s, int d) {
		
		this.s = new int[s.length + 1];
		for(int i = 0; i < s.length; i++) {
			this.sum += s[i];
			this.s[i] = s[i];
		}
		this.s[s.length] = d;
		this.sum += d;
		this.d = d;
		this.l = s.length+1;
		
		
		this.table = new int[(sum/2)+1][l+1];
		for (int i = 0; i < (sum/2)+1; i++) {
			for (int j = 0; j < l+1; j++) {
				this.table[i][j] = -1;
				if(i == 0)
					table[i][j] = 1;
				if(i!=0 && j==0)
					table[i][j] = 0;
			}
		}
		
	}
	
	public String resolve() {
		
		if(this.sum % 2 != 0)
			return "No";
		else {
		    for(int i = 0; i < (this.sum/2)+1; i++)
		        this.table[i][0] = 0;
		    for (int j = 0; j < l+1; j++)
		        this.table[0][j] = 1;
		        
		    for(int i = 1; i < (this.sum/2)+1; i++) {
		    	for (int j = 1; j < l+1; j++) {
		            this.table[i][j] = this.table[i][j-1];
		            if(i >= this.s[j-1]) {
		                if(this.table[i][j] < this.table[i - this.s[j-1]][j-1])
		                	this.table[i][j] = this.table[ i - this.s[j-1] ][j-1];
		            }
		    	}

		    }

		
		    if(this.table[this.sum/2][l] == 1)
		        return "Yes";
		    else
		        return "No";	
		}
		
	}

	public int[][] getTable() {
		return table;
	}

	public int[] getS() {
		return s;
	}

	public int getL() {
		return l;
	}

	public int getD() {
		return d;
	}

	public int getSum() {
		return sum;
	}
	

}