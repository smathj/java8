package interface_Lab;

interface Drivable1 {
	void drive();
}

interface Flyable1 {
	void fly();
}


// �������̽��� �̿��� ���� ���
// �ΰ��� �������̽��� ���� ��ӹ޴� ���
public class FlyingCar1 implements Drivable1, Flyable1 {

	// �������̵�(������) GO Go !
	@Override
	public void drive() {
		System.out.println("�����ϰ� �־��");
	}
	
	
	@Override
	public void fly() {
		System.out.println("�ϴ��� ���� �־��");
	}

	
	public static void main(String[] args) {
		FlyingCar1 obj = new FlyingCar1();
		
		obj.drive();
		obj.fly();
		MyInterface2.print("¢�� !");		// �ٸ� �������̽��� ���� �޼ҵ� ȣ���Ͽ���.
		
	}
}
