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
	
	@Test
	void test05() {
		 String[] friends = {"Jonathan", "Joseph", "Jotaro", "Josuke", "Giorno", "Jolyne", "Dio", "Speedwagon", "Shiza", "Stroheim"};
		 Orkut o = new Orkut(friends);
		 int[] indegrees = {0,1,1,2,1,1,2,2,1,1};
		 
		 for(String s : friends)
			 o.putVertex(s);
		 		 
	     o.putNode("Jonathan", new Node("Joseph", 1));
	     o.putNode("Joseph", new Node("Jotaro", 1));     
	     o.putNode("Joseph", new Node("Josuke", 1));
	     o.putNode("Jotaro", new Node("Josuke", 1));
	     o.putNode("Jonathan", new Node("Giorno", 1));
	     o.putNode("Jotaro", new Node("Jolyne", 1));
	     o.putNode("Jonathan", new Node("Dio", 1)); 
	     o.putNode("Giorno", new Node("Dio", 1));  
	     o.putNode("Jonathan", new Node("Speedwagon", 1));
	     o.putNode("Joseph", new Node("Speedwagon", 1));	     
	     o.putNode("Joseph", new Node("Shiza", 1));	     
	     o.putNode("Joseph", new Node("Stroheim", 1));
	      
	     String expected = "Jonathan Joseph Giorno Jotaro Speedwagon Shiza Stroheim Dio Josuke Jolyne\n";
	     
	     assertAll(
	    		 () -> { assertNotNull(o); },
	    		 () -> { assertNotNull(o.getIndegrees()); },
	    		 () -> {
	    			 for(int i = 0; i < indegrees.length; i++) {
		    			 o.putIndegrees(friends[i], indegrees[i]);
		    			 assertTrue(o.getIndegrees().containsKey(friends[i]));
		    			 assertEquals(""+indegrees[i], o.getIndegrees().get(friends[i]).toString());
	    			 }
	    		 },
	    		 () -> { assertArrayEquals(friends, o.getFriends()); },
	    		 () -> {
	    			 for(String s : friends) {
	    				 System.out.println(o.getIndegrees().get(s));
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
