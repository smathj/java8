package interface_Lab;


interface MyInterface2 {
	
	static void print(String msg) {
		System.out.println(msg + ": 인터페이스의 정적 메소드 호출, [body 를 갖는다] ");
	}
}



public class StaticMethodTest implements MyInterface2 {

	public static void main(String[] args) {
		
		MyInterface2.print("짖어 !");

	}

}
