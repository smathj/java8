package multiThread_Lab.synchronize;

// ������ ���
public class User1 extends Thread {
	
	
	private Calculator calculator;
	
	
	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;	
	}
	
	// �۾� ������ �κ�
	public void run() {
		calculator.setMemory(100);	// calculator ��ü�� ����ȭ �޼��� ����
	}
	
}
