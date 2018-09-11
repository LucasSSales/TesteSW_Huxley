package TesteSW.Huxley;

public class Node {
	
	private Integer distance;
	private String strValue;
	boolean visited = false;
	
	public Node(String value, int distance) {
		this.distance = distance;
		this.strValue = value;
	}

	public Integer getDistance() {
		return distance;
	}
	
	public Integer getNegativeDistance() {
		return -distance;
	}

	public String getStrValue() {
		return strValue;
	}
	
	public String toString() {
		return "(" + this.strValue + " , " + this.distance + ")";
	}	

}
