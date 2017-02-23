package pruebas;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class VertexTest {

	@Category(GettersAndSettersTests.class)
	@Test
	public void testGetInfo() {
		Vertex<Character, Integer>  vertex = new Vertex<Character, Integer>('A');
                
        assertEquals((Character)'A', vertex.getInfo());
	}

	@Category(GettersAndSettersTests.class)
	@Test
	public void testSetInfo() {
		Vertex<Character, Integer>  vertex = new Vertex<Character, Integer>();
        
		vertex.setInfo('A');
		
        assertEquals((Character)'A', vertex.getInfo());
	}

	@Category(GettersAndSettersTests.class)
	@Test
	public void testGetEdges() {
		
		/* Crear vértices */
        Vertex<Character, Integer>  vertex = new Vertex<Character, Integer>('A');
        Vertex<Character, Integer>  B = new Vertex<Character, Integer>('B');
        Vertex<Character, Integer>  C = new Vertex<Character, Integer>('C');
        
        /* Adicionar aristas */
        Edge<Character, Integer> vertexToB = new Edge<Character, Integer>(1,B);
        Edge<Character, Integer> vertexToC = new Edge<Character, Integer>(2,C);
        
        vertex.addEdge(vertexToB);
        vertex.addEdge(vertexToC);
        
        assertEquals(2, vertex.getEdges().size());
        assertEquals((Character)'B', vertex.getEdges().get(0).target.info);
	}

	@Test
	public void testAddEdge() {
		/* Crear vértices */
        Vertex<Character, Integer>  vertex = new Vertex<Character, Integer>('A');
        Vertex<Character, Integer>  B = new Vertex<Character, Integer>('B');
        Vertex<Character, Integer>  C = new Vertex<Character, Integer>('C');
        
        /* Adicionar aristas */
        Edge<Character, Integer> vertexToB = new Edge<Character, Integer>(1,B);
        Edge<Character, Integer> vertexToC = new Edge<Character, Integer>(2,C);
        
        vertex.addEdge(vertexToB);
        vertex.addEdge(vertexToC);
        
        assertEquals(2, vertex.getEdges().size());
        assertEquals((Character)'B', vertex.getEdges().get(0).target.info);
	}

	@Test
	public void testRemoveEdge() {
		/* Crear vértices */
        Vertex<Character, Integer>  vertex = new Vertex<Character, Integer>('A');
        Vertex<Character, Integer>  B = new Vertex<Character, Integer>('B');
        Vertex<Character, Integer>  C = new Vertex<Character, Integer>('C');
        
        /* Adicionar aristas */
        Edge<Character, Integer> vertexToB = new Edge<Character, Integer>(1,B);
        Edge<Character, Integer> vertexToC = new Edge<Character, Integer>(2,C);
        
        vertex.addEdge(vertexToB);
        vertex.addEdge(vertexToC);
        
        vertex.removeEdge(vertexToB);
        
        assertEquals(1, vertex.getEdges().size());
        assertEquals((Character)'C', vertex.getEdges().get(0).target.info);
	}

	@Test
	public void testRemoveEdges() {
		/* Crear vértices */
        Vertex<Character, Integer>  vertex = new Vertex<Character, Integer>('A');
        Vertex<Character, Integer>  B = new Vertex<Character, Integer>('B');
        Vertex<Character, Integer>  C = new Vertex<Character, Integer>('C');
        
        /* Adicionar aristas */
        Edge<Character, Integer> vertexToB = new Edge<Character, Integer>(1,B);
        Edge<Character, Integer> vertexToC = new Edge<Character, Integer>(2,C);
        
        vertex.addEdge(vertexToB);
        vertex.addEdge(vertexToC);
        
        vertex.removeEdges();
        
        assertEquals(0, vertex.getEdges().size());
	}

}
