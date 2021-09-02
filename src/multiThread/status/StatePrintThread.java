package multiThread.status;

public class StatePrintThread extends Thread {

	private Thread targetThrad;
	
	
	// ������
	public StatePrintThread(Thread targetThread) {
		this.targetThrad = targetThread;
	}
	
	@Override
	public void run() {
		
		while(true) {
			
			Thread.State state = targetThrad.getState();	// ������ ���� ���
			System.out.println("Ÿ�� ������ ���´� : " + state);
			
			// ������ ��ü�� �����Ǿ��ٸ�
			if(state == Thread.State.NEW) {
				
				// ���� ��� ���·� �����
				targetThrad.start();	// for�� ������
			}
			
			// ������ ������ �����ٸ�
			if(state == Thread.State.TERMINATED) {
				
				// while�� ����
				break;
			}
			
			try {
				// 0.5�ʰ� �Ͻ� ����
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
