package lambda_Lab;



interface MyInterface {
	void sayHello();
	
}





public class LambdaTest1 {

	public static void main(String[] args) {
		
		// �Ű������� ������ �ʴ� ���ٽ� 
		MyInterface hello = () -> System.out.println("Hello Lambda!");
		
		hello.sayHello();
	}

}
