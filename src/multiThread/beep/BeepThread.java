package multiThread.beep;

import java.awt.Toolkit;
// Runnable로 실행할 작업 스레드를 만들지 않고
// Thread의 하위 클래스로 작업 스레드를 정의하면서, 작업내용 내포하는 방식 
public class BeepThread extends Thread {
	
	// 작업 스레드 실행 내용
	@Override
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
