package multiThread_Lab.backup;

//��Ƽ������
// ���� ������� �۾� �����尡 ���ÿ� �����Ѵ�!
public class BeepPrintExample2 {

	public static void main(String[] args) {

		// 1. Runnable ��ü ����
		// 2. Thread �����ڿ� Runnable�� �Ķ���ͷ� �Ѵ�
		// 3. Thread�� start() �޼���� ����
		
		Runnable beepTask = new BeepTask();	  // �۾� ������ ���� ��ü ����
		Thread thread = new Thread(beepTask); // �۾� ������ ����
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
