package multiThread_Lab.synchronize;

public class MainThreadExample {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();	// calculator 객체 생성
		
		User1 user1 = new User1();					// user1 객체 생성(스레드 상속)
		user1.setCalculator(calculator);			// calculator, Thread-Name 초기화
		user1.start();								// 작업 스레드 실행 memory 필드 100 으로 초기화
		
		
		User2 user2 = new User2();					// user2 객체 생성(스레드 상속)
		user2.setCalculator(calculator);			//  calculator, Thread-Name 초기화
		user2.start();								// 작업 스레드 실행 memory 필드 50 으로 초기화
		
		
	}

}
