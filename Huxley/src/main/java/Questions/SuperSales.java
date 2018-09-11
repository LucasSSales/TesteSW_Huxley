package Questions;

public class SuperSales {
	
	Mochila[] backpack;

	
	public SuperSales(int[] prices, int[] weights, int[] max) {
		backpack = new Mochila[max.length];
		for (int i = 0; i < max.length; i++) {
			this.backpack[i] = new Mochila(prices.length, max[i], prices, weights);
		}
	}
	
	public int resolve() {
		int sum = 0;
		for(int i = 0; i < this.backpack.length; i++) {
			sum += backpack[i].resolve();
		}
		return sum;
	}

	public Mochila[] getBackpack() {
		return backpack;
	}	
	

}
