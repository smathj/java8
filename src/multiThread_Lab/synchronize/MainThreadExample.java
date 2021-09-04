package multiThread_Lab.synchronize;

public class MainThreadExample {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();	// calculator ��ü ����
		
		User1 user1 = new User1();					// user1 ��ü ����(������ ���)
		user1.setCalculator(calculator);			// calculator, Thread-Name �ʱ�ȭ
		user1.start();								// �۾� ������ ���� memory �ʵ� 100 ���� �ʱ�ȭ
		
		
		User2 user2 = new User2();					// user2 ��ü ����(������ ���)
		user2.setCalculator(calculator);			//  calculator, Thread-Name �ʱ�ȭ
		user2.start();								// �۾� ������ ���� memory �ʵ� 50 ���� �ʱ�ȭ
		
		
	}

}
