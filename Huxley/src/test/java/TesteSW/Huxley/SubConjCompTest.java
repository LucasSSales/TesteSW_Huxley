package TesteSW.Huxley;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Questions.SubconjuntosComplementares;

class SubConjCompTest {

	@Test
	void test01() {
		int[] s = {2,3,6};
		int d = 7;
		SubconjuntosComplementares scc = new SubconjuntosComplementares(s, d);
			
		assertAll(
				() -> { assertNotNull(scc); },
				() -> { 
					int[] a = {2,3,6,d};
					for(int i =0 ; i<a.length; i++)
						assertEquals(a[i], scc.getS()[i]); 
					},
				() -> {assertEquals(d, scc.getD());},
				() -> {assertEquals(s.length+1, scc.getL());},
				() -> {
					int sum = 0;
					for(int i : s) {
						sum += i;
					}
					assertEquals(sum+d, scc.getSum());
					
				},
				() -> {
					
					for (int i = 0; i < (scc.getSum()/2)+1; i++) {
						for (int j = 0; j < scc.getL()+1; j++) {
							if(i == 0)
								assertEquals(1, scc.getTable()[i][j]);
							else if(i!=0 && j==0)
								assertEquals(0, scc.getTable()[i][j]);
							else
								assertEquals(-1, scc.getTable()[i][j]);
						}
					}
				},
				() -> { assertEquals("Yes", scc.resolve()); }
				);
	}
	
	@Test
	void test02() {
		int[] s = {2,3,6};
		int d = 4;
		SubconjuntosComplementares scc = new SubconjuntosComplementares(s, d);
			
		assertAll(
				() -> { assertNotNull(scc); },
				() -> { 
					int[] a = {2,3,6,d};
					for(int i =0 ; i<a.length; i++)
						assertEquals(a[i], scc.getS()[i]); 
					},
				() -> {assertEquals(d, scc.getD());},
				() -> {assertEquals(s.length+1, scc.getL());},
				() -> {
					int sum = 0;
					for(int i : s) {
						sum += i;
					}
					assertEquals(sum+d, scc.getSum());
					
				},
				() -> {
					
					for (int i = 0; i < (scc.getSum()/2)+1; i++) {
						for (int j = 0; j < scc.getL()+1; j++) {
							if(i == 0)
								assertEquals(1, scc.getTable()[i][j]);
							else if(i!=0 && j==0)
								assertEquals(0, scc.getTable()[i][j]);
							else
								assertEquals(-1, scc.getTable()[i][j]);
						}
					}
				},
				() -> { assertEquals("No", scc.resolve()); }
				);
	}
	
	@Test
	void test03() {
		int[] s = {2,3,6};
		int d = 11;
		SubconjuntosComplementares scc = new SubconjuntosComplementares(s, d);
			
		assertAll(
				() -> { assertNotNull(scc); },
				() -> { 
					int[] a = {2,3,6,d};
					for(int i =0 ; i<a.length; i++)
						assertEquals(a[i], scc.getS()[i]); 
					},
				() -> {assertEquals(d, scc.getD());},
				() -> {assertEquals(s.length+1, scc.getL());},
				() -> {
					int sum = 0;
					for(int i : s) {
						sum += i;
					}
					assertEquals(sum+d, scc.getSum());
					
				},
				() -> {
					
					for (int i = 0; i < (scc.getSum()/2)+1; i++) {
						for (int j = 0; j < scc.getL()+1; j++) {
							if(i == 0)
								assertEquals(1, scc.getTable()[i][j]);
							else if(i!=0 && j==0)
								assertEquals(0, scc.getTable()[i][j]);
							else
								assertEquals(-1, scc.getTable()[i][j]);
						}
					}
				},
				() -> { assertEquals("Yes", scc.resolve()); }
				);
	}
	
	@Test
	void test04() {
		int[] s = {2, 4, 6};
		int d = 2;
		SubconjuntosComplementares scc = new SubconjuntosComplementares(s, d);
			
		assertAll(
				() -> { assertNotNull(scc); },
				() -> { 
					int[] a = {2, 4, 6,d};
					for(int i =0 ; i<a.length; i++)
						assertEquals(a[i], scc.getS()[i]); 
					},
				() -> {assertEquals(d, scc.getD());},
				() -> {assertEquals(s.length+1, scc.getL());},
				() -> {
					int sum = 0;
					for(int i : s) {
						sum += i;
					}
					assertEquals(sum+d, scc.getSum());
					
				},
				() -> {
					
					for (int i = 0; i < (scc.getSum()/2)+1; i++) {
						for (int j = 0; j < scc.getL()+1; j++) {
							if(i == 0)
								assertEquals(1, scc.getTable()[i][j]);
							else if(i!=0 && j==0)
								assertEquals(0, scc.getTable()[i][j]);
							else
								assertEquals(-1, scc.getTable()[i][j]);
						}
					}
				},
				() -> { assertEquals("No", scc.resolve()); }
				);
	}
	
	@Test
	void test05() {
        String caso = "4372	3688	980\t446\t1515	3278	4025	3222	4087	1395	37	1433	1565	2213	3938	2920	899	4090	2566	4435	2483	3454	937	3570	4280	2793	2677	2378	1927	1834	3171	2267	1380	1601	3776	3420	3458	2460	3227	1790	3598	1210	732	3585	3007	3278	1890	108	2166	1513	201	226	2561	7	2166	583	2852	2310	3954	781	2439	798	2025	2881	3647	3051	771	4412	2146	4154	1596	2892	1084	848	3708	4993	179	2052	4104	1414	525	164	2157	260	225	323	2368	1528	1164	601	993	4931	2189	4769	2079	4741	1399	3239	2579	4536	";
        String[] casos = caso.split("\t");
        int[] s = new int[casos.length];
        int cont = 0;
        for(String h : casos)
        	s[cont++] = Integer.parseInt(h);
		int d = 300;
		SubconjuntosComplementares scc = new SubconjuntosComplementares(s, d);
			
		assertAll(
				() -> { assertNotNull(scc); },
				() -> { 
					for(int i =0 ; i<s.length-1; i++)
						assertEquals(s[i], scc.getS()[i]);
					assertEquals(d, scc.getS()[s.length]);
					},
				() -> {assertEquals(d, scc.getD());},
				() -> {assertEquals(s.length+1, scc.getL());},
				() -> {
					int sum = 0;
					for(int i : s) {
						sum += i;
					}
					assertEquals(sum+d, scc.getSum());
					
				},
				() -> {
					
					for (int i = 0; i < (scc.getSum()/2)+1; i++) {
						for (int j = 0; j < scc.getL()+1; j++) {
							if(i == 0)
								assertEquals(1, scc.getTable()[i][j]);
							else if(i!=0 && j==0)
								assertEquals(0, scc.getTable()[i][j]);
							else
								assertEquals(-1, scc.getTable()[i][j]);
						}
					}
				},
				() -> { assertEquals("No", scc.resolve()); }
				);
	}



}
