package multiThread_Lab.backup;

import java.awt.Toolkit;

// 작업 내용을 가지고있는 객체가 되고
public class BeepTask implements Runnable {
	
	// 작업 스레드가 실행할 내용이다
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i<5; i++) {
			
			toolkit.beep();
			try {
				Thread.sleep(500);	// 0.5초간 정지
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
