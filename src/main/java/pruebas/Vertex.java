package pruebas;

import java.util.ArrayList;

public class Vertex <V, E> {

		V info;
		ArrayList< Edge<V, E> > edges;
		
		public Vertex() 
		{ 

		}
	    
		public Vertex(V _info) 
		{ 
			info = _info;
			edges = new ArrayList< Edge<V, E> > ();
		}
		
		public V getInfo() 
		{
		    return info;
		}

		public void setInfo(V value)
		{
			info = value;
		}

		public ArrayList< Edge<V, E>> getEdges()
		{
		    return edges;
		}

		public void addEdge(Edge<V, E> edge)
		{
		    edges.add(edge);
		}

		public void removeEdge(Edge<V, E> edge)
		{
		    edges.remove(edge);
		}
		
		public void removeEdges()
		{
		    edges.clear();
		}


		public boolean equals (Vertex<V, E> other)
		{
		    return info.equals(other.info);
		}

		public void imprime()
		{
			System.out.print("Vertex: ");
			System.out.println(info);
		    
		    for (Edge<V, E> e : edges) {
		        e.imprime();
		    }
		}	
		
}
