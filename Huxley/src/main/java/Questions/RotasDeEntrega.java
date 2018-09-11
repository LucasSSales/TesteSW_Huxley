package Questions;

import TesteSW.Huxley.Graph;

public class RotasDeEntrega {
	
	public Graph routes;
	
	public RotasDeEntrega(Graph routes) {
		this.routes = routes;
	}
	
	public String resolve(String origin, String destiny, int size) {
		if(!routes.dijkstra(origin).containsKey(destiny) || routes.dijkstra(origin).get(destiny).equals(Integer.MAX_VALUE))
			return "NO SHIPMENT POSSIBLE";		
		return "$" + (routes.dijkstra(origin).get(destiny) * size * 100);
	}

	public Graph getRoutes() {
		return routes;
	}
	
	

}
