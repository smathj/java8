package generic;

public class MyArrayAlg {
	public static <T> void swap(T[] a, int i , int j) {
		
		// 교환법칙
		T tmp = a[i];
		
		a[i] = a[j];
		
		a[j] = tmp;
		
	}
}
