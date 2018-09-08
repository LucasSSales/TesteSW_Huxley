package Question874;

import java.util.Scanner;

public class CorteDeHastes {
//[1, 5, 8, 9, 10, 17, 17, 20, 24, 30]
	public static void main(String[] args) {		
		
		Scanner ints = new Scanner(System.in);
		int cases = ints.nextInt();
		
		while(cases != 0) {
			int[] values = new int[cases];
			int[] memo = new int[cases+1];
			memo[0] = 0;
			for (int i = 1; i<memo.length; i++) {
				memo[i] = -1;
				values[i-1] = ints.nextInt();
			}
			
			int best = 0;
			
			for (int i = 0; i < values.length; i++) {
				best = 0;
				int k = i;
				for (int j = 0; j < i+1; j++) {
					best = (best >  values[j] + memo[k]) ? best :  values[j] + memo[k];
					k--;
				}
				memo[i + 1] = best;
			}
	
			System.out.println(memo[values.length]);
			
			cases = ints.nextInt();
		}
		

		
		

		
//		int size = 7;
//		int best = 0;
//		
//		for (int i = 0; i < values.length; i++) {
//			best = 0;
//			int k = i;
//			for (int j = 0; j < i+1; j++) {
//				best = (best >  values[j] + memo[k]) ? best :  values[j] + memo[k];
//				k--;
//			}
//			memo[i + 1] = best;
//		}
//
//		System.out.println(memo[size]);
				
		

	}

}
