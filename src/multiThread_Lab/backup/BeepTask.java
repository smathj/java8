package multiThread_Lab.backup;

import java.awt.Toolkit;

// �۾� ������ �������ִ� ��ü�� �ǰ�
public class BeepTask implements Runnable {
	
	// �۾� �����尡 ������ �����̴�
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i<5; i++) {
			
			toolkit.beep();
			try {
				Thread.sleep(500);	// 0.5�ʰ� ����
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
