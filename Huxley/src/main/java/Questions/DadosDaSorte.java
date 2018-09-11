package Questions;

public class DadosDaSorte {
	
	private int cont;
	private int soma;
	private int[] a;
	private int jog;
	private int tam;
	
	public DadosDaSorte(int jog, int tam) {
		this.jog = jog;
		this.tam = tam;
		this.cont = 0;
		this.soma = 0;
		this.a = new int[jog];
	}
	
	public int resolve() {
		this.cleanData();
		this.dados(0);
		return this.cont;
	}
	
	private void cleanData() {
		this.cont = 0;
		this.soma = 0;
		this.a = new int[jog];
	}
	
	private void dados(int ind){
	    int i, j;
	    if (ind == jog-1){
	        for (i=0;i<6; i++){
	            a[ind]=i+1;
	            soma+=a[ind];
	            if (soma>=tam)
	                cont++;
	            soma-=a[ind];
	        }
	    }
	    else{
	        for (i=0;i<6; i++){
	            a[ind]=i+1;
	            soma+=a[ind];
	            this.dados(ind+1);
	            soma-=a[ind];
	        }
	    }
	}

	public int getCont() {
		return cont;
	}

	public int getSoma() {
		return soma;
	}

	public int[] getA() {
		return a;
	}

	public int getJog() {
		return jog;
	}

	public int getTam() {
		return tam;
	}
	
	

}

