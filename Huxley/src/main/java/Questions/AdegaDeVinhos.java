package Questions;

public class AdegaDeVinhos {
	
	private int[][] memo;
	private int bottles;
	private int[] price;
	
	public AdegaDeVinhos(int[] price) {
		this.bottles = price.length;
		this.price = price;
		this.memo = new int[bottles][bottles];
		for (int i = 0; i < bottles; i++) {
			for (int j = 0; j < bottles; j++) {
				this.memo[i][j] = -1;
			}
		}
	}
	
	public int resolve() {
		if(bottles == 0)
			return 0;
		return this.resolve(0, this.bottles-1, 1);
	}
	
	private int resolve(int left, int right, int year) {
		
		if(this.memo[left][right] != -1)
			return this.memo[left][right];
		
		if(left == right) {
			this.memo[left][right] = price[left]*year;
			return this.memo[left][right];
		}else {
			int l = price[left]*year + this.resolve(left+1, right, year+1);
			int r = price[right]*year + this.resolve(left, right-1, year+1);
			this.memo[left][right] = l > r ? l : r;
			return this.memo[left][right];
		}
	}
	

	
	
//	def adega(price, left, right, year):
//	    global memo
//	    if(memo[left][right]!=-1):
//	        return memo[left][right]
//	    if(left == right):
//	        memo[left][right] = price[left]*year
//	        return memo[left][right]
//	    else:
//	        memo[left][right] = max( price[left]*year+adega(price, left+1, right, year+1) , price[right]*year + adega(price, left, right-1, year+1) )
//	        return memo[left][right]

}
