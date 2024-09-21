package packagetest1;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import package1.Hello_World;

public class Test1 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}


	@Before
	public void setUp() throws Exception {
	}

	@Test
	public final void testMain() {
		
		String[] array1 = {"a", "b", "c", "d", "e"};
		
		Hello_World x1 = new Hello_World();
		x1.main(array1);
	}

}
