package pruebas;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;

@RunWith(MockitoJUnitRunner.class)
public class EdgeTest {

	@ Mock private Vertex<Character, Integer> target;
	
	@Rule public MockitoRule mockitoRule = MockitoJUnit.rule();
	
	@Category(GettersAndSettersTests.class)
	@Test
	public final void testGetInfo() {
        //Vertex<Character, Integer>  target = new Vertex<Character, Integer>('A');
        
		//Vertex<Character, Integer> target = Mockito.mock(Vertex.class);
 
        Edge<Character, Integer> edge = new Edge<Character, Integer>(30, target );
        
        assertEquals((Integer)30, edge.getInfo());
	}

	@Category(GettersAndSettersTests.class)
	@Test
	public final void testSetInfo() {
        Edge<Character, Integer> edge = new Edge<Character, Integer>();
        
        edge.setInfo(50);
        
        assertEquals((Integer)50, edge.getInfo());
	}

	@Category(GettersAndSettersTests.class)
	@Test
	public final void testGetTarget() {
		//Vertex<Character, Integer>  target = new Vertex<Character, Integer>('A');
        
        Edge<Character, Integer> edge = new Edge<Character, Integer>(30, target );
        
        assertEquals(target, edge.getTarget());
	}

	@Category(GettersAndSettersTests.class)
	@Test
	public final void testSetTarget() {
		//Vertex<Character, Integer>  target = new Vertex<Character, Integer>('A');
        
        Edge<Character, Integer> edge = new Edge<Character, Integer>();
        
        Mockito.when(target.getInfo()).thenReturn('B');
        
        edge.setTarget(target);
        
        assertEquals((Character)'B', edge.getTarget().getInfo());
	}

}
