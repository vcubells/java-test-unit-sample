package pruebas;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Graph<V, E> {
	String name;
	List<Vertex<V, E>> nodes;

	private static final Logger LOGGER = Logger.getLogger(Graph.class.getName());

	public Graph() {
		this("vacío");
	}

	public Graph(String name) {
		this.name = name;
		nodes = new ArrayList<Vertex<V, E>>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Vertex<V, E>> getNodes() {
		return nodes;
	}

	public void setNodes(List<Vertex<V, E>> nodes) {
		this.nodes = nodes;
	}

	public void addVertex(Vertex<V, E> vertex) {
		nodes.add(vertex);
	}

	public void addEdge(Vertex<V, E> source, Vertex<V, E> target, E info) {
		Edge<V, E> edge = new Edge<V, E>(info, target);

		source.addEdge(edge);
	}

	public void removeEdge(Vertex<V, E> source, Vertex<V, E> target, E info) {
		List<Edge<V, E>> edges = source.getEdges();

		Edge<V, E> edge = null;

		for (Edge<V, E> e : edges) {
			if (e.getInfo().equals(info) && e.getTarget().equals(target)) {
				edge = e;
				break;
			}
		}

		if (edge != null) {
			source.removeEdge(edge);
		}

	}

	public void imprime() {
		LOGGER.log(Level.INFO, "--- Graph: ");
		LOGGER.log(Level.INFO, name);
		LOGGER.log(Level.INFO, " ---");

		for (Vertex<V, E> v : nodes) {
			v.imprime();
		}
	}

}
