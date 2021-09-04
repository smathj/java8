package inherit_Lab.equals;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car firstCar  = new Car("HMW520");
		Car secondCar = new Car("HMW520");
		
		if(firstCar.equals(secondCar)) {
			System.out.println("동일한 종류의 자동차입니다");
		} else {
			System.out.println("서로 다른 종류의 자동차입니다");
		}
		
		
	}

}
