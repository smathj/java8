package multiThread.backup;

//��Ƽ������
// ���� ������� �۾� �����尡 ���ÿ� �����Ѵ�!
public class BeepPrintExample3 {

	public static void main(String[] args) {

		// 1. Thread �����ڿ� Runnable�� �Ķ���ͷ� �Ѵ�
		// 2. Thread�� start() �޼���� ����
		
		Thread thread = new BeepThread(); 	  // �۾� ������ ����
		thread.start();						  // �۾� ������ ���� ��ü�� run() �޼���(�۾� ������) ����
		
		// ����, �������̿�-
		// ���� ���� print��-
		
		for(int i = 0; i<5; i++) {
			
			System.out.println("��");
			try {
				Thread.sleep(500);	// 0.5�ʰ� ����
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}
}
