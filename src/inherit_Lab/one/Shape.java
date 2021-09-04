package inherit_Lab.one;

// 추상 클래스 선언
public abstract class Shape {
	
	private int x,y;

	// 추상 클래스도, 일반적인 메소드를 가질 수 있다.
	public void move(int x, int y ) {
		this.x = x;
		this.y = y;
	}
	
	// 추상 메소드가 하나라도 있다면, 해당 클래스의 "abstract" 선언이 반드시 있어야한다
	public abstract void draw();
	
}


