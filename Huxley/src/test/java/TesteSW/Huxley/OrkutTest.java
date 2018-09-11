package TesteSW.Huxley;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import Questions.Orkut;

class OrkutTest {

	@Test
	void test01() {
		 String[] friends = {"Joao", "Maria", "Tadeu", "Jose", "Ricardo"};
		 Orkut o = new Orkut(friends);
		 
		 for(String s : friends)
			 o.putVertex(s);
		 		 
	     o.putNode("Maria", new Node("Joao", 1));
	     o.putNode("Ricardo", new Node("Joao", 1));
	     o.putNode("Tadeu", new Node("Maria", 1));
	     o.putNode("Joao", new Node("Jose", 1));
	     
	     String expected = "Tadeu Ricardo Maria Joao Jose\n";
	     
	     assertAll(
	    		 () -> { assertNotNull(o); },
	    		 () -> { assertNotNull(o.getIndegrees()); },
	    		 () -> {
	    			 o.putIndegrees("Joao", 2);
	    			 assertTrue(o.getIndegrees().containsKey("Joao"));
	    			 assertEquals("2", o.getIndegrees().get("Joao").toString());
	    			 
	    			 o.putIndegrees("Maria", 1);
	    			 assertTrue(o.getIndegrees().containsKey("Maria"));
	    			 assertEquals("1", o.getIndegrees().get("Maria").toString());
	    			 
	    			 o.putIndegrees("Jose", 1);
	    			 assertTrue(o.getIndegrees().containsKey("Jose"));
	    			 assertEquals("1", o.getIndegrees().get("Jose").toString());
	    			 
	    			 o.putIndegrees("Tadeu", 0);
	    			 assertTrue(o.getIndegrees().containsKey("Tadeu"));
	    			 assertEquals("0", o.getIndegrees().get("Tadeu").toString());
	    			 
	    			 o.putIndegrees("Ricardo", 0);
	    			 assertTrue(o.getIndegrees().containsKey("Ricardo"));
	    			 assertEquals("0", o.getIndegrees().get("Ricardo").toString());
	    		 },
	    		 () -> { assertArrayEquals(friends, o.getFriends()); },
	    		 () -> {
	    			 for(String s : friends) {
	    				 assertTrue(o.getAdj_list().containsKey(s));
	    				 assertNotNull(o.getAdj_list().get(s));
	    				 assertTrue(o.getVisited().containsKey(s));
	    				 assertFalse(o.getVisited().get(s));
	    			 }
	    		 },
	    		 () -> { assertEquals(expected, o.resolve()); }
	    		 );
	}
	
	@Test
	void test02() {
		 String[] friends = {"Joao", "Maria", "Renata"}; 

		 Orkut o = new Orkut(friends);
		 
		 for(String s : friends)
			 o.putVertex(s);
		 		 
	     o.putNode("Maria", new Node("Joao", 1));
	     o.putNode("Joao", new Node("Renata", 1));
	     o.putNode("Renata", new Node("Maria", 1));
	     
	     
	     String expected = "impossivel\n";
	     
	     assertAll(
	    		 () -> { assertNotNull(o); },
	    		 () -> { assertNotNull(o.getIndegrees()); },
	    		 () -> {
	    			 o.putIndegrees("Maria", 1);
	    			 assertTrue(o.getIndegrees().containsKey("Maria"));
	    			 assertEquals("1", o.getIndegrees().get("Maria").toString());
	    			 
	    			 o.putIndegrees("Joao", 1);
	    			 assertTrue(o.getIndegrees().containsKey("Joao"));
	    			 assertEquals("1", o.getIndegrees().get("Joao").toString());
	    			 	    			 
	    			 o.putIndegrees("Renata", 1);
	    			 assertTrue(o.getIndegrees().containsKey("Renata"));
	    			 assertEquals("1", o.getIndegrees().get("Renata").toString());
	    		 },
	    		 () -> { assertArrayEquals(friends, o.getFriends()); },
	    		 () -> {
	    			 for(String s : friends) {
	    				 assertTrue(o.getAdj_list().containsKey(s));
	    				 assertNotNull(o.getAdj_list().get(s));
	    				 assertTrue(o.getVisited().containsKey(s));
	    				 assertFalse(o.getVisited().get(s));
	    			 }
	    		 },
	    		 () -> { assertEquals(expected, o.resolve()); }
	    		 );
	}
	
	@Test
	void test03() {
		 String[] friends = {"Joao", "Maria", "Tadeu", "Jose", "Ricardo"};
		 Orkut o = new Orkut(friends);
		 
		 for(String s : friends)
			 o.putVertex(s);
		 		 
	     o.putNode("Maria", new Node("Joao", 1));
	     o.putNode("Ricardo", new Node("Joao", 1));
	     o.putNode("Tadeu", new Node("Maria", 1));
	     o.putNode("Joao", new Node("Jose", 1));
	     o.putNode("Ricardo", new Node("Tadeu", 1));
	     
	     String expected = "Ricardo Tadeu Maria Joao Jose\n";
	     
	     assertAll(
	    		 () -> { assertNotNull(o); },
	    		 () -> { assertNotNull(o.getIndegrees()); },
	    		 () -> {
	    			 o.putIndegrees("Joao", 2);
	    			 assertTrue(o.getIndegrees().containsKey("Joao"));
	    			 assertEquals("2", o.getIndegrees().get("Joao").toString());
	    			 
	    			 o.putIndegrees("Maria", 1);
	    			 assertTrue(o.getIndegrees().containsKey("Maria"));
	    			 assertEquals("1", o.getIndegrees().get("Maria").toString());
	    			 
	    			 o.putIndegrees("Jose", 1);
	    			 assertTrue(o.getIndegrees().containsKey("Jose"));
	    			 assertEquals("1", o.getIndegrees().get("Jose").toString());
	    			 
	    			 o.putIndegrees("Tadeu", 1);
	    			 assertTrue(o.getIndegrees().containsKey("Tadeu"));
	    			 assertEquals("1", o.getIndegrees().get("Tadeu").toString());
	    			 
	    			 o.putIndegrees("Ricardo", 0);
	    			 assertTrue(o.getIndegrees().containsKey("Ricardo"));
	    			 assertEquals("0", o.getIndegrees().get("Ricardo").toString());
	    		 },
	    		 () -> { assertArrayEquals(friends, o.getFriends()); },
	    		 () -> {
	    			 for(String s : friends) {
	    				 assertTrue(o.getAdj_list().containsKey(s));
	    				 assertNotNull(o.getAdj_list().get(s));
	    				 assertTrue(o.getVisited().containsKey(s));
	    				 assertFalse(o.getVisited().get(s));
	    			 }
	    		 },
	    		 () -> { assertEquals(expected, o.resolve()); }
	    		 );
	}
	
	@Test
	void test04() {
		 String[] friends = {"Joao", "Maria", "Renata"}; 

		 Orkut o = new Orkut(friends);
		 
		 for(String s : friends)
			 o.putVertex(s);
		 		 
	     o.putNode("Joao", new Node("Maria", 1));
	     o.putNode("Renata", new Node("Joao", 1));
	     o.putNode("Maria", new Node("Renata", 1));
	     o.putNode("Joao", new Node("Renata", 1));
	     
	     
	     String expected = "impossivel\n";
	     
	     assertAll(
	    		 () -> { assertNotNull(o); },
	    		 () -> { assertNotNull(o.getIndegrees()); },
	    		 () -> {
	    			 o.putIndegrees("Maria", 1);
	    			 assertTrue(o.getIndegrees().containsKey("Maria"));
	    			 assertEquals("1", o.getIndegrees().get("Maria").toString());
	    			 
	    			 o.putIndegrees("Joao", 1);
	    			 assertTrue(o.getIndegrees().containsKey("Joao"));
	    			 assertEquals("1", o.getIndegrees().get("Joao").toString());
	    			 	    			 
	    			 o.putIndegrees("Renata", 2);
	    			 assertTrue(o.getIndegrees().containsKey("Renata"));
	    			 assertEquals("2", o.getIndegrees().get("Renata").toString());
	    		 },
	    		 () -> { assertArrayEquals(friends, o.getFriends()); },
	    		 () -> {
	    			 for(String s : friends) {
	    				 assertTrue(o.getAdj_list().containsKey(s));
	    				 assertNotNull(o.getAdj_list().get(s));
	    				 assertTrue(o.getVisited().containsKey(s));
	    				 assertFalse(o.getVisited().get(s));
	    			 }
	    		 },
	    		 () -> { assertEquals(expected, o.resolve()); }
	    		 );
	}
	
	

}
