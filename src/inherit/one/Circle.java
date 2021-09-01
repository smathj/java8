package inherit.one;


public class Circle extends Shape {
	
	private int radius;
	
	// 추상 메소드 구현
	public void draw() {
		System.out.println(" 원 그리기 메소드");
	}
}
