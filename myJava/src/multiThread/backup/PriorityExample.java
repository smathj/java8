package multiThread.backup;

public class PriorityExample {

	public static void main(String[] args) {
		
		for(int i = 1; i<=10; i++) {
			
			// 1. ������ 10�� ����
			// 2. 1~9�� ������ ������ �켱����
			// 3. 10�� ������ �ֿ켱 �켱����
			// 4. 20��� �ڱ� ������ �̸��� ����!
			
			Thread thread = new CalcThread("thread" + i);
			if(i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY); // ��Ÿ��
			} else {
				thread.setPriority(Thread.MAX_PRIORITY); // ��Ÿ��
			}
			
			thread.start();
			
		}

	}

}
