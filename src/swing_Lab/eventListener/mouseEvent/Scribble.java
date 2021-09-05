package swing_Lab.eventListener.mouseEvent;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Point {
	int x, y;
}

class MyPanel2 extends JPanel implements MouseMotionListener {
	private int index = 0;
	Point[] array = new Point[1000];

	public MyPanel2() {
		this.addMouseMotionListener(this);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		if (index > 1000) {
			return;
		}
		array[index] = new Point();
		array[index].x = e.getX();
		array[index].y = e.getY();
		index++;
		repaint();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (Point p : array) {
			if (p != null) {
				g.drawRect(p.x, p.y, 1, 1);
			}
		}
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
	}

}

public class Scribble extends JFrame {
	public Scribble() {
		setSize(300, 300);
		setTitle("���콺�� �׸� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel2());
		setVisible(true);
	}

	public static void main(String[] args) {
		Scribble s = new Scribble();
	}
}
