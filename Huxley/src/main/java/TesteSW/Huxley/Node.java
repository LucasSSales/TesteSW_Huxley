package TesteSW.Huxley;

public class Node {
	
	private Integer distance;
	//private int intValue;
	private String strValue;
	boolean visited = false;
	
//	public Node(int value, int distance) {
//		this.distance = distance;
//		this.intValue = value;
//	}
	
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

//	public int getIntValue() {
//		return intValue;
//	}

	public String getStrValue() {
		return strValue;
	}
	
	public String toString() {
		return "(" + this.strValue + " , " + this.distance + ")";
	}
	
	protected void setDistance(int distance) {
		this.distance = distance;
	}
	
	

	

}
