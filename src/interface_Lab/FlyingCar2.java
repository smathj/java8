package interface_Lab;


interface Flyable2 {
	void fly();
	
	// �������̽����� ������ ������ �ڵ������� �����(public static final)�� �ȴ�
	int nowMonth = 9;
}

class Car {
	
	int speed;
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
}





public class FlyingCar2 extends Car implements Flyable2 {

	

	@Override
	public void fly() {
		System.out.println("�ϴ��� ���� �־��");
	}	
	
	
	
	
	public static void main(String[] args) {
		FlyingCar2 obj = new FlyingCar2();
		obj.setSpeed(300);
		obj.fly();
		System.out.println(nowMonth);
		MyInterface2.print("¢�� !");		// �ٸ� �������̽��� ���� �޼ҵ� ȣ���Ͽ���.
	}


}
