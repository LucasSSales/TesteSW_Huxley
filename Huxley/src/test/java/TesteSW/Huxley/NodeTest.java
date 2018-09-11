package TesteSW.Huxley;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NodeTest {

	@Test
	void test01() {
		Node n = new Node("node01", 10);
		assertAll(
				() -> { assertNotNull(n); },
				() -> { assertEquals("10", n.getDistance().toString()); },
				() -> { assertEquals("node01", n.getStrValue()); },
				() -> { assertEquals("("+n.getStrValue() + " , " + n.getDistance()+")", n.toString()); }
				);
	}
	
	@Test
	void test02() {
		Node n = new Node("node02", 125);
		assertAll(
				() -> { assertNotNull(n); },
				() -> { assertEquals("125", n.getDistance().toString()); },
				() -> { assertEquals("node02", n.getStrValue()); },
				() -> { assertEquals("("+n.getStrValue() + " , " + n.getDistance()+")", n.toString()); }
				);
	}

}
