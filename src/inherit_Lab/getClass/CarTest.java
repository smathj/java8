package inherit_Lab.getClass;


class Car {
	
	Car() {
		System.out.println("Car ��ü ����");
	}
}


public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car obj = new Car();
		System.out.println("obj is of type " + obj.getClass().getName());
		// �����ΰ� �����°Ͱ����� ������Ʈ ��Ű��
	}

}
