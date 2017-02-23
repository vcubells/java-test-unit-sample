package pruebas;

import java.util.ArrayList;

public class Graph <V, E> {
	String name;
    ArrayList< Vertex<V, E> > nodes;
    
    public Graph() 
    { 
    	this("vacío");
    }
    
    public Graph(String _name) 
	{ 
		this.name = _name;
		nodes = new ArrayList< Vertex<V, E> >();
	}
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Vertex<V, E>> getNodes() {
		return nodes;
	}

	public void setNodes(ArrayList<Vertex<V, E>> nodes) {
		this.nodes = nodes;
	}

	public void addVertex(Vertex<V, E> vertex)
    {
        nodes.add(vertex);
    }

    public void addEdge(Vertex<V, E> source, Vertex<V, E> target, E info)
    {
        Edge<V, E> edge = new Edge<V, E>(info, target);
        
        source.addEdge(edge);
    }
    
    public void removeEdge(Vertex<V, E> source, Vertex<V, E> target, E info)
    {  	
    	ArrayList < Edge<V, E> > edges = source.getEdges();
    	
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
    
    public void imprime()
    {
    	 System.out.print("--- Graph: ");
    	 System.out.print(name);
    	 System.out.println(" ---");
    	    
    	    for (Vertex<V, E> v : nodes) {
    	        v.imprime();
    	    }
    }

    
    
}
