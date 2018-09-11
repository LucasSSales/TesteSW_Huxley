package Questions;

public class CadDoAud {
	
	private int[][] matrix;
	private int lin;
	private int col;
	private int[] um = new int[2];
	
	public CadDoAud(int[][] matrix) {
		this.matrix = matrix;
		this.lin = matrix.length;
		this.col = matrix[0].length;
	}
	
	public int resolve() {
		
		
		int[] coluna = new int[lin];
		int[] linha = new int[col];
		this.um = this.getOne();
		
		
	    for (int i=0; i<lin; i++)
	        coluna[i]= this.matrix[i][um[1]];
	    
	    for (int i=0; i<col; i++)
	        linha[i]= this.matrix[um[0]][i];
	    
	    int cont=0;
	    for (int i=0; i<col; i++){
	        if (linha[i]!=i+1){
	            for (int j=0; j<col; j++){
	                if (linha[j]==i+1){
	                    int aux=linha[i];
	                    linha[i]=linha[j];
	                    linha[j]=aux;
	                    cont++;
	                }
	            }
	        }
	    }
	       
	    int var = 1;
	    for (int i=0; i<lin; i++){
	        if (coluna[i]!=var) {
	            for (int j=0; j<lin; j++){
	                if (coluna[j]==var){
	                    int aux=coluna[i];
	                    coluna[i]=coluna[j];
	                    coluna[j]=aux;
	                    cont++;
	                }
	            }
	        }
	        var+=col;
	    }
	    
	    return cont;
	    
		
	}
	
	public int[] getOne() {
		for(int i = 0; i < this.lin; i++) {
			for(int j = 0; j < this.col; j++) {
				if(this.matrix[i][j] == 1){
					int[] s = {i, j};
					return s;
				}
			}
		}
		return new int[0];
		
	}

	public int[][] getMatrix() {
		return matrix;
	}

	public int getLin() {
		return lin;
	}

	public int getCol() {
		return col;
	}

	public int[] getUm() {
		return um;
	}
	
	

}
