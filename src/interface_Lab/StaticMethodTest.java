package interface_Lab;


interface MyInterface2 {
	
	static void print(String msg) {
		System.out.println(msg + ": �������̽��� ���� �޼ҵ� ȣ��, [body �� ���´�] ");
	}
}



public class StaticMethodTest implements MyInterface2 {

	public static void main(String[] args) {
		
		MyInterface2.print("¢�� !");

	}

}
