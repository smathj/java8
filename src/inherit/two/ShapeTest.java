package inherit.two;

// 부모 클래스
class Shape {
	
	
	protected int x,y;
	
	public void draw() {
		System.out.println("Shape Draw");
	}
}


// 자식 클래스
class Rectangle extends Shape {
	
	
	@SuppressWarnings("unused")
	private int width, height;
	
	public void draw() {
		System.out.println("Rectangle Draw");
	}
	
	public Rectangle() {
		super.x = 1;
		super.y = 2;
	}
}

//자식 클래스
class Triangle extends Shape {
	
	
	@SuppressWarnings("unused")
	private int base, height;
	
	public void draw() {
		System.out.println("Triangle Draw");
	}
	
	public Triangle() {
		super.x = 3;
		super.y = 4;
	}
	
}

//자식 클래스
class Circle extends Shape {
	
	
	@SuppressWarnings("unused")
	private int radius;
	
	public void draw() {
		System.out.println("Circle Draw");
	}
	
	public Circle() {
		super.x = 5;
		super.y = 6;
	}
}


public class ShapeTest {
	
	public static void printLocation(Shape s) {
		System.out.println("x= " + s.x + ", y=" + s.y);
	}
	
	private static Shape[] arrayOfShape;
	
	public static void main(String[] args) {
		
		init();
		drawAll();
		
		Rectangle s1 = new Rectangle();
		Triangle s2 = new Triangle();
		Circle s3 = new Circle();
		
		if(s1 instanceof Rectangle) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
		
		
		printLocation(s1);
		printLocation(s2);
		printLocation(s3);
	}
	
	public static void init() {
		
		arrayOfShape = new Shape[3];
		
		arrayOfShape[0] = new Rectangle();
		arrayOfShape[1] = new Triangle();
		arrayOfShape[2] = new Circle();
	}
	
	public static void drawAll() {
		
		for(int i=0; i< arrayOfShape.length; i++) {
			arrayOfShape[i].draw();
		}
		
	}
	
}
