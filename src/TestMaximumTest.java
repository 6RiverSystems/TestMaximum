import static org.junit.Assert.*;

import org.junit.Test;

public class TestMaximumTest {

	@Test
	public void testCompfuncUc1TT1() {
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
	
	@Test
	public void testCompfuncUc1TT2() {
		Integer n1 = 2;
		Integer n2 = 3;
		Integer n3 = 1;
		
		Integer expectedResult = 3;
		try {
			Integer actualResult = TestMaximum.class.newInstance().compfunc(n1, n2, n3);
			assertEquals(expectedResult, actualResult);
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testCompfuncUc1TT3() {
		Integer n1 = 1;
		Integer n2 = 2;
		Integer n3 = 3;
		
		Integer expectedResult = 3;
		try {
			Integer actualResult = TestMaximum.class.newInstance().compfunc(n1, n2, n3);
			assertEquals(expectedResult, actualResult);
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}

}
