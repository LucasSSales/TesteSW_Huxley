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

}

//def palindromo (word):
//    for i in range(len(matriz)):
//        aux = 0
//        for j in range(i, len(matriz)):
//            if(aux == j):
//                matriz[aux][j] = 1
//            else:
//                if (word[aux] == word[j]):
//                    matriz[aux][j] = 2 + matriz[aux + 1][j - 1]
//                else:
//                    matriz[aux][j] = matriz[aux+1][j] if matriz[aux+1][j] > matriz[aux][j-1] else matriz[aux][j-1]
//            aux+=1
//
//
//n = int(input())
//for i in range(n):
//    matriz = []
//    word = list(input())
//    if(word==[]):
//        print("0")
//    else:
//        for j in range(len(word)):
//            matriz.append([])
//            for k in range(len(word)):
//                matriz[j].append(0)
//        palindromo(word)
//        print(matriz[0][len(word)-1])


