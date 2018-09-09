package Questions;

public class Mochila {
	
	private int[] prices;
	private int[] weights;
	private int maxCapacity;
	private int numberOfItems;
	private int[][] memo;
	
	public Mochila(int numberOfItems, int maxCapacity, int[] prices, int[] weights) {
		
		this.prices = prices;
		this.weights = weights;
		this.numberOfItems = numberOfItems;
		this.maxCapacity = maxCapacity;
		
		this.memo = new int[numberOfItems+1][maxCapacity+1];
		for (int i = 0; i <= numberOfItems; i++) {
			for (int j = 0; j <= maxCapacity; j++) {
				this.memo[i][j] = -1;
			}
		}
		
	}
	
	public int resolve() {
		return this.mochilaSolved(0, this.maxCapacity);
	}
	
	public int mochilaSolved(int item, int peso) {
		
		if(this.memo[item][peso] != -1)
			return this.memo[item][peso];
		
		if(item == this.numberOfItems)
			return 0;
		
		if(peso - this.weights[item] < 0)
			return this.mochilaSolved(item+1, peso);
		else {
			int put = this.prices[item] + this.mochilaSolved(item+1, peso-this.weights[item]);
			int ignore = this.mochilaSolved(item+1, peso);
			this.memo[item][peso] = (put > ignore) ? put : ignore;
			return memo[item][peso];
		}
	}
	
	public String arrays() {
		String s="[";
		for(int i = 0; i < prices.length; i++) {
			s += prices[i];
			if(i == prices.length-1)
				s+="]";
			else
				s+=",";
		}
		return s;
	}
	
//	@Override
//	public String toString() {
//		return "Mochila: " + this.maxCapacity + "\n"
//				+ "Prices: " + this.arrays() + "\n";
//	}

}