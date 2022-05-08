package uni.pu.fmi.st;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class CategoryTests {

	@Test
	@Category(FatsTest.class)
	public void testFastTest() {
		System.out.println("--------------------FatsTest--------------");
	}

	@Test
	@Category({ SlowTest.class, FatsTest.class })
	public void testTest() {
		System.out.println("--------------------testTest--------------");
	}

	@Test
	@Category(SlowTest.class)
	public void testSlowTest() {
		System.out.println("--------------------SlowTest--------------");
	}

}
