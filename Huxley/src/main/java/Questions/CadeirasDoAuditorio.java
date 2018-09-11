package Questions;

public class CadeirasDoAuditorio {
	
	private int[][] matrix;
	private int lin;
	private int col;
	private int[] um = new int[2];
	
	public CadeirasDoAuditorio(int[][] matrix) {
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
	    for (int i=0; i<lin; i++)
	    {
	        if (coluna[i]!=var)
	        {
	            for (int j=0; j<lin; j++)
	            {
	                if (coluna[j]==var)
	                {
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

}
//
//#include <stdio.h>
//int main ()
//{
//    int lin, col, i, j, c, l, aux, cont=0, var;
//    scanf("%d%d", &lin, &col);
//    int matriz[lin][col], linha[col], coluna[lin];
//    for (i=0; i<lin; i++)
//    {
//        for(j=0; j<col; j++)
//        {
//            scanf("%d", &matriz[i][j]);
//            if (matriz[i][j]==1)
//            {
//                l=i;
//                c=j;
//            }
//        }
//    }
//
//    for (i=0; i<lin; i++)
//    {
//        coluna[i]= matriz[i][c];
//    }
//
//    for (i=0; i<col; i++)
//    {
//        linha[i]= matriz[l][i];
//    }
//
//    for (i=0; i<col; i++)
//    {
//        if (linha[i]!=i+1)
//        {
//            for (j=0; j<col; j++)
//            {
//                if (linha[j]==i+1)
//                {
//                    aux=linha[i];
//                    linha[i]=linha[j];
//                    linha[j]=aux;
//                    cont++;
//                }
//            }
//        }
//    }
//
//    var = 1;
//    for (i=0; i<lin; i++)
//    {
//        if (coluna[i]!=var)
//        {
//            for (j=0; j<lin; j++)
//            {
//                if (coluna[j]==var)
//                {
//                    aux=coluna[i];
//                    coluna[i]=coluna[j];
//                    coluna[j]=aux;
//                    cont++;
//                }
//            }
//        }
//        var+=col;
//    }
//
//    printf("%d\n", cont);
//    return 0;
//}
