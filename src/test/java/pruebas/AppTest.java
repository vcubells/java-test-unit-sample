package pruebas;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
    @Test
    public void testNumberOfNodes()
    {
    	Graph <Character, Integer> mapa = new Graph<Character, Integer>("Guía Roji");
        
        /* Crear vértices */
        Vertex<Character, Integer>  A = new Vertex<Character, Integer>('A');
        Vertex<Character, Integer>  B = new Vertex<Character, Integer>('B');
        Vertex<Character, Integer>  C = new Vertex<Character, Integer>('C');
        Vertex<Character, Integer>  D = new Vertex<Character, Integer>('D');
        Vertex<Character, Integer>  E = new Vertex<Character, Integer>('E');
        
        /* Adicionar vértices al grafo */
        mapa.addVertex(A);
        mapa.addVertex(B);
        mapa.addVertex(C);
        mapa.addVertex(D);
        mapa.addVertex(E);
        
        assertEquals("Deben ser 5 nodos", 5, mapa.getNodes().size());
    }
    
    @Test
    public void testGraphName()
    {
    	Graph <Character, Integer> mapa = new Graph<Character, Integer>("Guía Roji");
        
        assertEquals("El nombre debe ser Guía Roji ", "Guía Roji", mapa.getName());
    }
    
}
