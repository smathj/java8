package interface_Lab;

interface Drivable1 {
	void drive();
}

interface Flyable1 {
	void fly();
}


// 인터페이스를 이용한 다중 상속
// 두개의 인터페이스를 각각 상속받는 방식
public class FlyingCar1 implements Drivable1, Flyable1 {

	// 오버라이드(재정의) GO Go !
	@Override
	public void drive() {
		System.out.println("운전하고 있어용");
	}
	
	
	@Override
	public void fly() {
		System.out.println("하늘을 날고 있어용");
	}

	
	public static void main(String[] args) {
		FlyingCar1 obj = new FlyingCar1();
		
		obj.drive();
		obj.fly();
		MyInterface2.print("짖어 !");		// 다른 인터페이스의 정적 메소드 호출하였다.
		
	}
}
