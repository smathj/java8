package interface_Lab;

@SuppressWarnings("rawtypes")
public class Rectangle implements Comparable {
	
	private int width = 0;
	private int height = 0;
	
	@Override
	public String toString() {
		
		return "Rectangle [width = " + width + " , height = " + height + "]";
	}
	
	public Rectangle(int w, int h) {
		width = w;
		height = h;
		System.out.println(this);
	}
	
	public int getArea() {
		return width * height;
	}
	
	
	
	@Override
	public int compareTo(Object o) {
		
		Rectangle otherRect = (Rectangle) o;
		
		if(this.getArea() < otherRect.getArea()) {
			return -1;
		
		} else if(this.getArea() > otherRect.getArea()) {
			return 1;

		} else {
			return 0;
		}
		
	}
	
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(100,30);
		Rectangle r2 = new Rectangle(200,10);
		
		int result = r1.compareTo(r2);
		
		if(result ==1) {
			System.out.println(r1 + " 가 더 큽니다");
		} else if(result == 0) {
			System.out.println("같습니다");
		} else {
			System.out.println(r2 + " 가 더 큽니다");
		}
	}
	
	
	
	
}
