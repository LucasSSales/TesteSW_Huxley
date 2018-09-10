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
		this.dados(0);
		return this.cont;
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
	

}

//#include <stdio.h>
//int dados(int ind, int jog, int tam, int cont[], int soma[], int a[])
//{
//    int i, j;
//    if (ind == jog-1)
//    {
//        for (i=0;i<6; i++)
//        {
//            a[ind]=i+1;
//            soma[0]+=a[ind];
//            //printf("soma-> %d\n", soma[0]);
//            if (soma[0]>=tam)
//            {
//                cont[0]++;
//            }
//            soma[0]-=a[ind];
//        }
//    }
//    else
//    {
//        for (i=0;i<6; i++)
//        {
//            a[ind]=i+1;
//            soma[0]+=a[ind];
//            dados(ind+1, jog, tam, cont, soma, a);
//            soma[0]-=a[ind];
//        }
//    }
//}
//int main ()
//{
//    int jog, tam, array[1000], cont[1]={0}, soma[1]={0};
//    scanf("%d%d", &jog, &tam);
//    dados(0, jog, tam, cont, soma, array);
//    printf("%d\n", cont[0]);
//    return 0;
//}

