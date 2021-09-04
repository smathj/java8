package lambda_Lab;



interface MyInterface2 {
	public void calculate(int x, int y);
	
}





public class LambdaTest2 {

	public static void main(String[] args) {
		
		// 매개변수를 가지는 람다식
		MyInterface2 hello = (a,b) -> {
			int result =a * b;
			System.out.println("계산 결과는 : " + result);
		};
		
//		MyInterface2 hello = (int a,int b) -> {
//			int result =a * b;
//			System.out.println("계산 결과는 : " + result);
//		};
//		
		hello.calculate(10,20);
		
	
	}

}
