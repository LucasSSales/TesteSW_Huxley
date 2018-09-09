package Questions;

public class SubconjuntosComplementares {
	
	int[][] table;
	private int[] s;
	private int l;
	private int d;
	private int sum;
	
	public SubconjuntosComplementares(int[] s, int d) {
		
		this.s = new int[s.length + 1];
		for(int i = 0; i < s.length; i++) {
			this.sum += s[i];
			this.s[i] = s[i];
		}
		this.s[s.length] = d;
		this.sum += d;
		this.d = d;
		this.l = s.length+1;
		
		//int aux = 
		
		this.table = new int[(sum/2)+1][l+1];
		for (int i = 0; i < (sum/2)+1; i++) {
			for (int j = 0; j < l+1; j++) {
				this.table[i][j] = -1;
				if(i == 0)
					table[i][j] = 1;
				if(i!=0 && j==0)
					table[i][j] = 0;
			}
		}
		
	}
	
	public String resolve() {
		
		if(this.sum % 2 != 0)
			return "No";
		else {
		    for(int i = 0; i < (this.sum/2)+1; i++)
		        this.table[i][0] = 0;
		    for (int j = 0; j < l+1; j++)
		        this.table[0][j] = 1;
		        
		    for(int i = 1; i < (this.sum/2)+1; i++) {
		    	for (int j = 1; j < l+1; j++) {
		            this.table[i][j] = this.table[i][j-1];
		            if(i >= this.s[j-1]) {
		                if(this.table[i][j] < this.table[i - this.s[j-1]][j-1])
		                	this.table[i][j] = this.table[ i - this.s[j-1] ][j-1];
		            }
		    	}

		    }

		
		    if(this.table[this.sum/2][l] == 1)
		        return "Yes";
		    else
		        return "No";	
		}
		
	}

}
//
//s = input().split()
//l = len(s)
//for i in range(l):
//    s[i] = int(s[i])
//
//d = int(input())
//
//s.append(d)
//sum = sum(s)
//l = len(s)
//
//tabela = []
//for i in range(sum//2 + 1):
//    tabela.append([])
//    for j in range(l + 1):
//        tabela[i].append(-1)
//        if(i == 0):
//            tabela[i][j] = 1
//        if(i!=0 and j==0):
//            tabela[i][j] = 0
//
//if (sum % 2 == 1):
//    print("No")
//else:
//    for i in range(sum//2 + 1):
//        tabela[i][0] = 0
//    for j in range(l + 1):
//        tabela[0][j] = 1
//        
//    for i in range(1, sum//2 +1):
//        for j in range(1, l + 1):
//            tabela[i][j] = tabela[i][j-1]
//            if(i >= s[j-1]):
//                if(tabela[i][j] < tabela[i - s[j-1]][j-1]):
//                    tabela[i][j] = tabela[ i - s[j-1] ][j-1]
//
//    if(tabela[sum//2][l] == 1):
//        print("Yes")
//    else:
//        print("No")

