package interface_Lab;


interface MyInterface {
	public void myMethod1();
	
	default void myMethod2() {
		System.out.println("myMethod2() , �������̽��� �޼��� ��ü���ִ� ����Ʈ �޼��� !");
	}
}



public class DefaultMethodTest implements MyInterface {

	@Override
	public void myMethod1() {
		System.out.println("myMethod1()");
	}

	public static void main(String[] args) {

		DefaultMethodTest obj = new DefaultMethodTest();
		obj.myMethod1();	// �޼ҵ� ��ü�� �����ؾ߸� ��,       �������̵� �ؾ߸��Ѵ�
		obj.myMethod2();	// ����Ʈ �޼���� �̹� �����Ǿ��־, �������̵� �����ʴ´�
		MyInterface2.print("¢�� !");		// �ٸ� �������̽��� ���� �޼ҵ� ȣ���Ͽ���.
	}


}
