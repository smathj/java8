package generic;

public class MyArrayAlg {
	public static <T> void swap(T[] a, int i , int j) {
		
		// ��ȯ��Ģ
		T tmp = a[i];
		
		a[i] = a[j];
		
		a[j] = tmp;
		
	}
}
