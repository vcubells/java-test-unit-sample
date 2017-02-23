package pruebas;

public class Edge <V, E> {
	 
	 E info;
	 Vertex<V, E> target = null;
	 
	 public Edge() 
	 { 
		 
	 }
	 
	 public Edge(E _info, Vertex<V, E> _target)
	 {
		 info = _info;
		 target = _target;
	 }
	 
	 public E getInfo() 
	 {
	     return info;
	 }

	 public void setInfo(E value)
	 {
	     info = value;
	 }

	 public Vertex<V, E> getTarget()
	 {
	     return target;
	 }

	 public void setTarget(Vertex<V, E> vertex)
	 {
	     target = vertex;
	 }
	 
	 public boolean equals (Edge<V, E> other)
	 {
		 return (other.getInfo().equals(info) && other.getTarget().equals(target));
	 }

	 public void imprime()
	 {
	     System.out.print(info);
	     System.out.print(" ---> ");
	     System.out.println(target.getInfo());
	 }   

}
