package multiThread_Lab.synchronize;

// ������ ���
public class User2 extends Thread {
	
	
	private Calculator calculator;
	
	
	public void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}
	
	// �۾� ������ �κ�
	public void run() {
		calculator.setMemory(50);	// calculator ��ü�� ����ȭ �޼��� ����
	}
	
}
