import static org.junit.Assert.*;

import org.junit.Test;

public class TestMaximumTest {

	@Test
	public void testCompfunc() {
		Integer n1 = 3;
		Integer n2 = 2;
		Integer n3 = 1;
		
		Integer expectedResult = 3;
		try {
			Integer actualResult = TestMaximum.class.newInstance().compfunc(n1, n2, n3);
			assertEquals(expectedResult, actualResult);
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}

}
