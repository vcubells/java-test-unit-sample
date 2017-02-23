package pruebas;

public class App 
{
    public static void main( String[] args )
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
        
        /* Adicionar aristas */
        mapa.addEdge(A, B, 30);
        mapa.addEdge(A, E, 100);
        mapa.addEdge(B, A, 50);
        mapa.addEdge(B, D, 75);
        mapa.addEdge(C, D, 20);
        mapa.addEdge(D, B, 60);
        mapa.addEdge(E, C, 15);
        
        /* Eliminar una arista */;
        mapa.removeEdge(A, B, 30);
        
        /* Mostrar el grafo */
        mapa.imprime();
    }
}
