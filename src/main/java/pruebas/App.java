package pruebas;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Graph <Character, Integer> mapa = new Graph<Character, Integer>("Guía Roji");
        
        /* Crear vértices */
        Vertex<Character, Integer>  a = new Vertex<Character, Integer>('A');
        Vertex<Character, Integer>  b = new Vertex<Character, Integer>('B');
        Vertex<Character, Integer>  c = new Vertex<Character, Integer>('C');
        Vertex<Character, Integer>  d = new Vertex<Character, Integer>('D');
        Vertex<Character, Integer>  e = new Vertex<Character, Integer>('E');
        
        /* Adicionar vértices al grafo */
        mapa.addVertex(a);
        mapa.addVertex(b);
        mapa.addVertex(c);
        mapa.addVertex(d);
        mapa.addVertex(e);
        
        /* Adicionar aristas */
        mapa.addEdge(a, b, 30);
        mapa.addEdge(a, e, 100);
        mapa.addEdge(b, a, 50);
        mapa.addEdge(b, d, 75);
        mapa.addEdge(c, d, 20);
        mapa.addEdge(d, b, 60);
        mapa.addEdge(e, c, 15);
        
        /* Eliminar una arista */
        mapa.removeEdge(a, b, 30);
        
        /* Mostrar el grafo */
        mapa.imprime();
    }
}
