package multiThread.status;

// ������ ���
public class TargetThread extends Thread {

	//�۾� ������ ����
	@Override
	public void run() {
		
		for(long i=0; i<100000000; i++) {}
		
		
		try {
			// 1.5 �ʰ� �Ͻ� ����
			Thread.sleep(1500);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		for(long i=0; i<100000000; i++) {}
		
		
		
	}
	
	
}
