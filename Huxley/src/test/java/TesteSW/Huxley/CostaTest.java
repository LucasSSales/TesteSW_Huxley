package TesteSW.Huxley;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Questions.Costa;

class CostaTest {

	@Test
	void testCosta() {
		//fail("Not yet implemented");
	}

	@Test
	void testResolve() {
		
        char[][] mapa1 = {
        		{'#', '#', '#', '#', '#'}, 
        		{'#', '.', '.', '.', '#'}, 
        		{'.', '.', '.', '.', '.'}, 
        		{'#', '.', '.', '.', '.'}, 
        		{'#', '#', '.', '.', '#'}};
        
        char[][] mapa2 = {
        		{'#', '.', '.', '.'}, 
        		{'.', '#', '.', '.'}, 
        		{'.', '.', '#', '.'}, 
        		{'.', '.', '.', '#'}};
        
        char[][] mapa3 = {
        		{'.', '.', '.', '#', '#', '#', '#', '.', '.'}, 
        		{'.', '.', '.', '.', '.', '.', '.', '.', '.'},
        		{'.', '#', '#', '#', '.', '.', '.', '#', '#'},
        		{'.', '#', '#', '.', '.', '#', '#', '.', '#'},
        		{'#', '#', '#', '#', '#', '#', '.', '.', '.'},
        		{'.', '#', '#', '.', '.', '.', '.', '.', '.'},
        		{'.', '.', '.', '.', '.', '.', '.', '.', '.'},
        		{'.', '.', '.', '.', '.', '.', '.', '#', '#'},
        		{'#', '.', '.', '#', '#', '#', '#', '.', '.'},
        		{'.', '.', '.', '.', '.', '#', '#', '.', '.'}};       
        
        Costa c1 = new Costa(mapa1);
        Costa c2 = new Costa(mapa2);
        Costa c3 = new Costa(mapa3);
        
        assertAll(
        		() -> { assertEquals(11, c1.resolve()); },
        		() -> { assertEquals(4, c2.resolve()); },
        		() -> { assertEquals(29, c3.resolve()); }
        		);
		
		
		//fail("Not yet implemented");
	}

}
