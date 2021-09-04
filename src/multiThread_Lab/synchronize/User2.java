package multiThread_Lab.synchronize;

// 스레드 상속
public class User2 extends Thread {
	
	
	private Calculator calculator;
	
	
	public void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}
	
	// 작업 스레드 부분
	public void run() {
		calculator.setMemory(50);	// calculator 객체의 동기화 메서드 실행
	}
	
}
