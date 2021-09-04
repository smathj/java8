package inherit_Lab.getClass;


class Car {
	
	Car() {
		System.out.println("Car 객체 생성");
	}
}


public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car obj = new Car();
		System.out.println("obj is of type " + obj.getClass().getName());
		// 절대경로가 나오는것같은데 프로젝트 패키지
	}

}
