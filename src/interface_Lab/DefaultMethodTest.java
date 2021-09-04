package interface_Lab;


interface MyInterface {
	public void myMethod1();
	
	default void myMethod2() {
		System.out.println("myMethod2() , 인터페이스의 메서드 몸체가있는 디폴트 메서드 !");
	}
}



public class DefaultMethodTest implements MyInterface {

	@Override
	public void myMethod1() {
		System.out.println("myMethod1()");
	}

	public static void main(String[] args) {

		DefaultMethodTest obj = new DefaultMethodTest();
		obj.myMethod1();	// 메소드 몸체를 구현해야만 함,       오버라이드 해야만한다
		obj.myMethod2();	// 디폴트 메서드로 이미 구현되어있어서, 오버라이드 하지않는다
		MyInterface2.print("짖어 !");		// 다른 인터페이스의 정적 메소드 호출하였다.
	}


}
