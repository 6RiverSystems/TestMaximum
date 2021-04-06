
public class TestMaximum {

	public <T extends Number & Comparable<T>> T compfunc(T n1, T n2, T n3) {
	    T max = n1;
		if (n2.compareTo(n1) > 0) {
			max = n2;
		}
		if(n3.compareTo(max) > 0) {
			max = n3;
		}
		return max;
	}

}
