package Questions;

public class Costa {
	
	private int costa;
	private char[][] mapa;
	private int l;
	private int c;	
	
	public Costa(char[][] mapa) {
		this.mapa = mapa;
		this.l = mapa.length;
		this.c = mapa[0].length;
	}
	
	public int resolve() {
      for(int i=0; i<l; i++){
          for(int j=0; j<c; j++){
              if (mapa[i][j]=='#'){
                  if (i==0 || j==0 || i==l-1 || j==c-1)
                      costa++;
                  else if (mapa[i][j-1]== '.'|| mapa[i][j+1]== '.' || mapa[i-1][j]== '.' || mapa[i+1][j]== '.')
                      costa++;
              }
          }
      }
      return costa;
	}

	public int getCosta() {
		return costa;
	}

	public char[][] getMapa() {
		return mapa;
	}

	public int getL() {
		return l;
	}

	public int getC() {
		return c;
	}

}

