package inherit_Lab.one;

// �߻� Ŭ���� ����
public abstract class Shape {
	
	private int x,y;

	// �߻� Ŭ������, �Ϲ����� �޼ҵ带 ���� �� �ִ�.
	public void move(int x, int y ) {
		this.x = x;
		this.y = y;
	}
	
	// �߻� �޼ҵ尡 �ϳ��� �ִٸ�, �ش� Ŭ������ "abstract" ������ �ݵ�� �־���Ѵ�
	public abstract void draw();
	
}


