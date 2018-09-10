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

}

//#include <stdio.h>
//int main ()
//{
//    int l, c, i, j, costa=0;
//    scanf("%d%d\n", &l, &c);
//    char mapa[l][c];
//    for (i=0; i<l; i++)
//    {
//        for (j=0; j<c; j++)
//        {
//            scanf("%c", &mapa[i][j]);
//            //printf("j-> %d\n", j);
//        }
//        getchar();
//    }
//
//        for (i=0; i<l; i++)
//        {
//            for (j=0; j<c; j++)
//            {
//                if (mapa[i][j]=='#')
//                {
//                    if (i==0 || j==0 || i==l-1 || j==c-1)
//                    {
//                        costa++;
//                    }
//                    else if (mapa[i][j-1]== '.'|| mapa[i][j+1]== '.' || mapa[i-1][j]== '.' || mapa[i+1][j]== '.')
//                    {
//                        costa++;
//                        //printf("i->%d j->%d\n", i, j);
//                    }
//                }
//            }
//        }
//
//        printf("%d\n", costa);
//
//    return 0;
//}
//

