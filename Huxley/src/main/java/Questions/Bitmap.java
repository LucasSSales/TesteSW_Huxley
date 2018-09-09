package Questions;

public class Bitmap {
	
	private int[][] matrix;
	String bitmap = "";
	private int cont = 0;
	
	public Bitmap(int[][] matrix) {
		this.matrix = matrix;
	}
	
	public String resolve() {
		this.bitmapSolve(0, 0, matrix.length-1, matrix[0].length-1);
		return this.bitmap;
	}
	
	private void bitmapSolve(int li, int ci, int lf, int cf) {
		if(this.verify(li, ci, lf, cf) == -1) {
			this.cont++;
			this.bitmap += "D";
			if(cont % 50 == 0)
				this.bitmap += "\n";
			
			int lm = (lf+1+li)/2;
			int cm = (cf+1+ci)/2;
			if(((lf-li)+1)%2 != 0)
				lm += 1;
			if(((cf-ci)+1)%2 != 0)
				cm += 1;
			
			this.bitmapSolve(li, ci, lm - 1, cm - 1);
		    if((cf-ci)>0)
		    	this.bitmapSolve(li, cm, lm - 1, cf);
		    if((lf-li)>0)
		    	this.bitmapSolve(lm, ci, lf, cm - 1);
		    if((cf-ci)>0 && (lf-li)>0)
		    	this.bitmapSolve(lm, cm, lf, cf);
		}else{
			this.cont += 1;
			this.bitmap += matrix[li][ci];
			if(cont % 50 == 0)
				this.bitmap += "\n";
		}
	}
	
	
	private int verify(int li, int ci, int lf, int cf) {
		int v = this.matrix[li][ci];
		for(int i = li; i <= lf; i++) {
			for(int j = ci; j <= cf; j++) {
				if(this.matrix[i][j] != v)
					return -1;
			}
		}
		return v;
	}
	
}


