package pruebas;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Vertex<V, E> {

	V info;
	List<Edge<V, E>> edges;

	private static final Logger LOGGER = Logger.getLogger(Vertex.class.getName());

	public Vertex() {

	}

	public Vertex(V info) {
		this.info = info;
		edges = new ArrayList<Edge<V, E>>();
	}

	public V getInfo() {
		return info;
	}

	public void setInfo(V value) {
		info = value;
	}

	public List<Edge<V, E>> getEdges() {
		return edges;
	}

	public void addEdge(Edge<V, E> edge) {
		edges.add(edge);
	}

	public void removeEdge(Edge<V, E> edge) {
		edges.remove(edge);
	}

	public void removeEdges() {
		edges.clear();
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;

		if (this.getClass() != o.getClass())
			return false;

		Vertex<V, E> other = (Vertex<V, E>) o;

		return info.equals(other.info);
	}

	public void imprime() {
		LOGGER.log(Level.INFO, "Vertex: ");
		LOGGER.log(Level.INFO, info);

		for (Edge<V, E> e : edges) {
			e.imprime();
		}
	}

}
