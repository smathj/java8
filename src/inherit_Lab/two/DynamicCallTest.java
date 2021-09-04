package inherit_Lab.two;

public class DynamicCallTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		Animal obj;
		
		obj = animal;
		obj.sound();	// � sound()�� ȣ���� �������� ���� �ð��� �����Ǵ� ��ü�� Ÿ�Կ� ���� �����ȴ�
		
		if(obj instanceof Animal) {
			System.out.println("obj ��ü�� " + "Animal Ÿ���Դϴ�.");
		} else {
			System.out.println("obj ��ü�� " + "Animal Ÿ���� �ƴ��Դϴ�.");
		}
		
		obj = dog;
		obj.sound();	// � sound()�� ȣ���� �������� ���� �ð��� �����Ǵ� ��ü�� Ÿ�Կ� ���� �����ȴ�
		
		if(obj instanceof Dog) {
			System.out.println("obj ��ü�� " + "Dog Ÿ���Դϴ�.");
		} else {
			System.out.println("obj ��ü�� " + "Dog Ÿ���� �ƴ��Դϴ�.");
		}
		
		obj = cat;
		obj.sound();	// � sound()�� ȣ���� �������� ���� �ð��� �����Ǵ� ��ü�� Ÿ�Կ� ���� �����ȴ�
		
		if(obj instanceof Cat) {
			System.out.println("obj ��ü�� " + "Cat Ÿ���Դϴ�.");
		} else {
			System.out.println("obj ��ü�� " + "Cat Ÿ���� �ƴ��Դϴ�.");
		}
				
	}

}

class Animal {
	void sound() {
		System.out.println("Animal Ŭ������ sound()");
	}
}

class Dog extends Animal {
	@Override	//�������̵�
	void sound() {
		System.out.println("�п�");
	}
}

class Cat extends Animal {
	@Override	//�������̵�
	void sound() {
		System.out.println("�߿�");
	}
}
