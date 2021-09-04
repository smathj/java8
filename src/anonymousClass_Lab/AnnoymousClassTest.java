package anonymousClass_Lab;



interface RemoteControl {
	void turnOn();
	void turnOff();
	
}


public class AnnoymousClassTest {

	public static void main(String[] args) {
		
		// �͸� Ŭ���� , new �̸�() { ... } ; 
		// 1. ��ӹް��� �ϴ� �θ� Ŭ����
		// 2. �����ϰ��� �ϴ� �������̽�
		RemoteControl ac = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("TV turnOn() ����");
			}

			@Override
			public void turnOff() {
				System.out.println("TV turnOn() ����");
			}
		};	// �͸� Ŭ���� ����
		
		
		
		ac.turnOn();
		ac.turnOff();
		

	}

}
