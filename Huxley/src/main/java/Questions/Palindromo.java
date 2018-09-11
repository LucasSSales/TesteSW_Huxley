package Questions;

public class Palindromo {
	
	private String word;
	private int[][] matrix;
	private int n;
	
	public Palindromo(String word) {
		this.word = word;
		this.n= word.length();
		this.matrix = new int[this.n][this.n];
		for(int i = 0; i < this.n; i++) {
			for(int j = 0; j<this.n; j++) {
				matrix[i][j] = 0;
			}
		}
	}
	
	public int resolve() {
		if(this.word.equals(""))
			return 0;
		else {
			this.palindromoSolved();
			return matrix[0][word.length()-1];
		}		
	}
	
	public void palindromoSolved() {
		for(int i = 0; i < this.n; i++) {
			int aux = 0;
			for (int j = i; j < this.n; j++) {
				if(aux == j) {
					matrix[aux][j] = 1;
				}else{
					if(word.charAt(aux) == word.charAt(j))
						this.matrix[aux][j] = 2 + this.matrix[aux+1][j-1];
					else
						this.matrix[aux][j] = (this.matrix[aux+1][j] > this.matrix[aux][j-1]) ? this.matrix[aux+1][j] : this.matrix[aux][j-1];
				}
				aux += 1;
			}
		}
	}

	public String getWord() {
		return word;
	}

	public int[][] getMatrix() {
		return matrix;
	}

	public int getN() {
		return n;
	}
	
	

}