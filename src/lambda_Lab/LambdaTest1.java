package lambda_Lab;



interface MyInterface {
	void sayHello();
	
}





public class LambdaTest1 {

	public static void main(String[] args) {
		
		// 매개변수를 가지지 않는 람다식 
		MyInterface hello = () -> System.out.println("Hello Lambda!");
		
		hello.sayHello();
	}

}
