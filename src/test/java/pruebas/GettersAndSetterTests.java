package pruebas;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(GettersAndSettersTests.class)
@SuiteClasses({ EdgeTest.class, VertexTest.class })
public class GettersAndSetterTests {

}
