package multiThread.backup;

import java.awt.Toolkit;

public class BeepPrintExample1 {

	public static void main(String[] args) {

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i<5; i++) {
			
			toolkit.beep();
			try {
				Thread.sleep(500);	// 0.5�ʰ� ����
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		for(int i = 0; i<5; i++) {
			
			System.out.println("��");
			try {
				Thread.sleep(500);	// 0.5�ʰ� ����
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		// �Ҹ� 5�� �� �� "��" �� 5�� ����Ѵ�
		// �̱� �����尡 �Ǿ���.
		
		
	}
}
