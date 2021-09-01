package inherit.one;

public class Rectangle extends Shape {
	
	private int width, height;
	
	// 추상 메소드 구현
	public void draw() {
		System.out.println(" 사각형 그리기 메소드");
	}
}
