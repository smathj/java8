package inherit_Lab.two;

public class DynamicCallTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		Animal obj;
		
		obj = animal;
		obj.sound();	// 어떤 sound()를 호출할 것인지는 실행 시간에 참조되는 객체의 타입에 따라서 결정된다
		
		if(obj instanceof Animal) {
			System.out.println("obj 객체는 " + "Animal 타입입니다.");
		} else {
			System.out.println("obj 객체는 " + "Animal 타입이 아닙입니다.");
		}
		
		obj = dog;
		obj.sound();	// 어떤 sound()를 호출할 것인지는 실행 시간에 참조되는 객체의 타입에 따라서 결정된다
		
		if(obj instanceof Dog) {
			System.out.println("obj 객체는 " + "Dog 타입입니다.");
		} else {
			System.out.println("obj 객체는 " + "Dog 타입이 아닙입니다.");
		}
		
		obj = cat;
		obj.sound();	// 어떤 sound()를 호출할 것인지는 실행 시간에 참조되는 객체의 타입에 따라서 결정된다
		
		if(obj instanceof Cat) {
			System.out.println("obj 객체는 " + "Cat 타입입니다.");
		} else {
			System.out.println("obj 객체는 " + "Cat 타입이 아닙입니다.");
		}
				
	}

}

class Animal {
	void sound() {
		System.out.println("Animal 클래스의 sound()");
	}
}

class Dog extends Animal {
	@Override	//오버라이딩
	void sound() {
		System.out.println("왈왈");
	}
}

class Cat extends Animal {
	@Override	//오버라이딩
	void sound() {
		System.out.println("야옹");
	}
}
