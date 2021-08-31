package multiThread.backup;

import java.awt.Toolkit;

public class BeepPrintExample1 {

	public static void main(String[] args) {

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i<5; i++) {
			
			toolkit.beep();
			try {
				Thread.sleep(500);	// 0.5초간 정지
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		for(int i = 0; i<5; i++) {
			
			System.out.println("띵");
			try {
				Thread.sleep(500);	// 0.5초간 정지
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		// 소리 5번 낸 후 "띵" 을 5번 출력한다
		// 싱글 스레드가 되었다.
		
		
	}
}
