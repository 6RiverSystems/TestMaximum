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
	
	@Test
	public void testCompfuncUc2TT1() {
		Double n1 = 3.3;
		Double n2 = 2.2;
		Double n3 = 1.1;
		
		Double expectedResult = 3.3;
		try {
			Double actualResult = TestMaximum.class.newInstance().compfunc(n1, n2, n3);
			assertEquals(expectedResult, actualResult);
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testCompfuncUc2TT2() {
		Double n1 = 2.2;
		Double n2 = 3.3;
		Double n3 = 1.1;
		
		Double expectedResult = 3.3;
		try {
			Double actualResult = TestMaximum.class.newInstance().compfunc(n1, n2, n3);
			assertEquals(expectedResult, actualResult);
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testCompfuncUc2TT3() {
		Double n1 = 1.1;
		Double n2 = 2.2;
		Double n3 = 3.3;
		
		Double expectedResult = 3.3;
		try {
			Double actualResult = TestMaximum.class.newInstance().compfunc(n1, n2, n3);
			assertEquals(expectedResult, actualResult);
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	

}
