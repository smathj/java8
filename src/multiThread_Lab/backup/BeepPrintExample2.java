package multiThread_Lab.backup;

//멀티스레드
// 메인 스레드와 작업 스레드가 동시에 실행한다!
public class BeepPrintExample2 {

	public static void main(String[] args) {

		// 1. Runnable 객체 생성
		// 2. Thread 생성자에 Runnable를 파라미터로 한다
		// 3. Thread를 start() 메서드로 실행
		
		Runnable beepTask = new BeepTask();	  // 작업 내용을 가진 객체 생성
		Thread thread = new Thread(beepTask); // 작업 스레드 생성
		thread.start();						  // 작업 내용을 가진 객체의 run() 메서드(작업 스레드) 실행
		
		// 울어라, 비프음이여-
		// 같이 울어라 print여-
		
		for(int i = 0; i<5; i++) {
			
			System.out.println("띵");
			try {
				Thread.sleep(500);	// 0.5초간 정지
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}
}
