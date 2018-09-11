package pruebas;

import java.util.logging.Logger;
import java.util.logging.Level;

public class Edge<V, E> {

	E info;
	Vertex<V, E> target = null;

	private static final Logger LOGGER = Logger.getLogger(Edge.class.getName());

	public Edge() {

	}

	public Edge(E info, Vertex<V, E> target) {
		this.info = info;
		this.target = target;
	}

	public E getInfo() {
		return info;
	}

	public void setInfo(E value) {
		info = value;
	}

	public Vertex<V, E> getTarget() {
		return target;
	}

	public void setTarget(Vertex<V, E> vertex) {
		target = vertex;
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

		Edge<V, E> other = (Edge<V, E>) o;

		return (other.getInfo().equals(info) && other.getTarget().equals(target));
	}

	public void imprime() {
		LOGGER.log(Level.INFO, info);
		LOGGER.log(Level.INFO, "---> ");
		LOGGER.log(Level.INFO, target.getInfo());
	}

}
