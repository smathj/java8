package multiThread.status;

// 스레드 상속
public class TargetThread extends Thread {

	//작업 스레드 내용
	@Override
	public void run() {
		
		for(long i=0; i<100000000; i++) {}
		
		
		try {
			// 1.5 초간 일시 정지
			Thread.sleep(1500);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		for(long i=0; i<100000000; i++) {}
		
		
		
	}
	
	
}
