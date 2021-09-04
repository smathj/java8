package interface_Lab;


interface Flyable2 {
	void fly();
	
	// 인터페이스에서 선언한 변수는 자동적으로 상수로(public static final)이 된다
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
		System.out.println("하늘을 날고 있어용");
	}	
	
	
	
	
	public static void main(String[] args) {
		FlyingCar2 obj = new FlyingCar2();
		obj.setSpeed(300);
		obj.fly();
		System.out.println(nowMonth);
		MyInterface2.print("짖어 !");		// 다른 인터페이스의 정적 메소드 호출하였다.
	}


}
