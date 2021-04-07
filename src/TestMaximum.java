import java.util.Arrays;

public class TestMaximum <T extends Comparable<T>>{
	T n1;
	T n2;
	T n3;
	
	public TestMaximum(T n1, T n2, T n3) {
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	
	private T testMaximum() {
		return testMaximum(n1, n2, n3);
	}
	
	public static <T extends Comparable<T>> T testMaximum(T ...n) {
		
		Arrays.sort(n);
		
	    /*T max = n1;
		if (n2.compareTo(n1) > 0) {
			max = n2;
		}
		if(n3.compareTo(max) > 0) {
			max = n3;
		}*/
		return n[n.length - 1];
	}

}
