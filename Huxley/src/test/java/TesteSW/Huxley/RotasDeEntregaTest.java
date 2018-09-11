package TesteSW.Huxley;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

import Questions.RotasDeEntrega;

class RotasDeEntregaTest {

	@Test
	void test01() {
		Graph routes = new Graph();
		routes.putVertex("AA");
		routes.putVertex("CC");	
		routes.putVertex("QR");
		routes.putVertex("FF");	
		routes.putVertex("DD");
		routes.putVertex("AB");
		
		routes.putNode("AA", new Node("CC", 1));routes.putNode("CC", new Node("QR", 1));
		routes.putNode("DD", new Node("CC", 1));routes.putNode("AA", new Node("DD", 1));
		routes.putNode("AA", new Node("AB", 1));routes.putNode("DD", new Node("QR", 1));
		routes.putNode("AB", new Node("DD", 1));
		RotasDeEntrega re = new RotasDeEntrega(routes);
		
		String[][] testNodes = {{"AA","AB"},{"DD","CC"},{"CC","DD"},{"AA","FF"}};
		int[] testValues = {5,14,1,2};
		String[] oracle = {"$500","$1400","$100","NO SHIPMENT POSSIBLE","$2600"};
		
		assertAll(
				() -> { assertNotNull(re); },
				() -> {assertNotNull(re.getRoutes());},
				() -> { 
					for(int i=0; i<testValues.length; i++ )
						assertEquals(oracle[i], re.resolve(testNodes[i][0], testNodes[i][1], testValues[i]));
				}
				);
	}
	
	@Test
	void test02() {
		Graph routes = new Graph();
		RotasDeEntrega re = new RotasDeEntrega(routes);
		
		routes.putVertex("AA");
		routes.putVertex("BB");
		routes.putVertex("CC");	
		
		String[][] testNodes = {{"AA","CC"}};
		int[] testValues = {5};
		String[] oracle = {"NO SHIPMENT POSSIBLE"};
		
		assertAll(
				() -> { assertNotNull(re); },
				() -> {assertNotNull(re.getRoutes());},
				() -> { 
					for(int i=0; i<testValues.length; i++ )
						assertEquals(oracle[i], re.resolve(testNodes[i][0], testNodes[i][1], testValues[i]));
				}
				);
	}
	
	@Test
	void test03() {
		Graph routes = new Graph();
		RotasDeEntrega re = new RotasDeEntrega(routes);
		
		routes.putVertex("AA");
		routes.putVertex("BB");
		routes.putVertex("CC");	
		routes.putVertex("DD");
		routes.putVertex("EE");
		routes.putVertex("FF");
		routes.putVertex("GG");
		routes.putVertex("HH");
		routes.putVertex("II");
		
		routes.putNode("AA", new Node("BB", 1));routes.putNode("BB", new Node("EE", 1));
		routes.putNode("EE", new Node("DD", 1));routes.putNode("CC", new Node("HH", 1));
		routes.putNode("CC", new Node("GG", 1));routes.putNode("FF", new Node("HH", 1));
		
		String[][] testNodes = {{"AA","DD"}, {"AA","HH"}, {"HH","FF"}, {"FF","CC"}, 
				{"BB","AA"}, {"BB","DD"}, {"BB","CC"}, {"II","AA"}, {"GG", "II"} };
		int[] testValues = {20,14,14,10,1,11,16,8,18};
		String[] oracle = {"$6000", "NO SHIPMENT POSSIBLE", "$1400", "$2000", "$100", 
				"$2200", "NO SHIPMENT POSSIBLE", "NO SHIPMENT POSSIBLE", "NO SHIPMENT POSSIBLE"};
		
		assertAll(
				() -> { assertNotNull(re); },
				() -> {assertNotNull(re.getRoutes());},
				() -> { 
					for(int i=0; i<oracle.length; i++ )
						assertEquals(oracle[i], re.resolve(testNodes[i][0], testNodes[i][1], testValues[i]));
				}
				);
	}

}
