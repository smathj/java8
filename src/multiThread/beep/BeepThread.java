package multiThread.beep;

import java.awt.Toolkit;
// Runnable�� ������ �۾� �����带 ������ �ʰ�
// Thread�� ���� Ŭ������ �۾� �����带 �����ϸ鼭, �۾����� �����ϴ� ��� 
public class BeepThread extends Thread {
	
	// �۾� ������ ���� ����
	@Override
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
