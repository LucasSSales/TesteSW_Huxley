package Questions;

public class MultMatrizes {
	
	private int[][] cost;
	private int[] values;
	private int[][] topological;
	private String[] pOpen;
	private String[] pClose;
	private int n;
	
	public MultMatrizes(int[] values) {
		this.values = values;
		this.n= values.length-1;
		this.pOpen = new String[this.n];
		this.pClose = new String[this.n];
		
		this.cost = new int[this.n][this.n];
		this.topological = new int[this.n][this.n];
		
		for (int i = 0; i < this.n; i++) {
			this.pOpen[i] = "";
			this.pClose[i] = "";
			for (int j = 0; j < this.n; j++) {
				this.cost[i][j] = -1;
				this.topological[i][j] = -1;
			}
		}
	}
	
	public String resolve() {
		if(this.n == 1)
			return "(A1)";
		else {
			this.setTable(this.n);
			this.defOrder(0,  this.n-1);
			return this.printOrder(this.n);
		}
	}
	
	private void setTable(int n) {
		for (int i = 0; i < n; i++) {
			int aux = 0;
			for (int j = i; j < n; j++) {
				if(aux == j){
					this.cost[aux][j] = 0;
				}else{
					int min = Integer.MAX_VALUE;
					for(int k = aux; k < j; k++) {
						int q = this.cost[aux][k] + this.cost[k+1][j] + (this.values[aux] * this.values[k+1] * this.values[j+1]);
						if(q < min) {
							this.topological[aux][j] = k;
							min = q;
						}
					}
					this.cost[aux][j] = min;
				}
				aux += 1;
			}
		}
	}
	
	private void defOrder(int begin, int end) {
		if(begin > end)
			return;
		if(begin == end)
			return;
		else if(end - begin == 1) {
			this.pOpen[begin] += "(";
			this.pClose[end] += ")";
		}else {
			this.pOpen[begin] += "(";
			this.pClose[end] += ")";
			defOrder(begin, topological[begin][end]);
			defOrder(topological[begin][end]+1, end);
		}
	}
	
	private String printOrder(int n) {
		String s = "";
		for(int i = 0; i < n; i++) {
			s +=pOpen[i];
			s += "A" + (i+1);
			
			s+=pClose[i];
			
			if(i != n-1)
				s+= " x ";
		}
		return s;
	}

	public int[][] getCost() {
		return cost;
	}

	public int[] getValues() {
		return values;
	}

	public int[][] getTopological() {
		return topological;
	}

	public String[] getpOpen() {
		return pOpen;
	}

	public String[] getpClose() {
		return pClose;
	}

	public int getN() {
		return n;
	}
		

}
