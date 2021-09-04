package anonymousClass_Lab;



interface RemoteControl {
	void turnOn();
	void turnOff();
	
}


public class AnnoymousClassTest {

	public static void main(String[] args) {
		
		// 익명 클래스 , new 이름() { ... } ; 
		// 1. 상속받고자 하는 부모 클래스
		// 2. 구현하고자 하는 인터페이스
		RemoteControl ac = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("TV turnOn() 실행");
			}

			@Override
			public void turnOff() {
				System.out.println("TV turnOn() 실행");
			}
		};	// 익명 클래스 정의
		
		
		
		ac.turnOn();
		ac.turnOff();
		

	}

}
