package pruebas;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ AppTest.class, EdgeTest.class, VertexTest.class })
public class AllTests {

}
