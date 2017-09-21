package dbAccess;

import junit.framework.TestCase;

public class CarTest extends TestCase {

	protected void setUp() throws Exception {
		// super.setUp(); --- - - we remove "super"
	}

	protected void tearDown() throws Exception {
		// super.tearDown();  // super.setUp(); - - we remove "super"
	}

	public void testRegisterCar() {
		//fail("Not yet implemented");
		Car test1 = new Car();
		String output = test1.registerCar("abcdefg");
		assertEquals( "abcdefg", output );		
	}
	

}
