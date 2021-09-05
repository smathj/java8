package swing_Lab.eventListener.mouseEvent;

import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel {
	
	BufferedImage img = null;
	int img_x = 0;
	int img_y = 0;
	
	public MyPanel() {
		try {
			img = ImageIO.read(new File("��.JPG"));
		} catch (IOException e) {
			System.out.println("no image");
			System.exit(1);
		}
		
		// �гο� ���콺 ������ �߰�, ����Ŭ���� ���
		addMouseListener(new MouseListener() {
			
			
			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
				img_x = e.getX();
				img_y = e.getY();
				repaint();
				
			}
			
			@Override
			public void mouseReleased(java.awt.event.MouseEvent e) {
			}
			
			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
			}
			
			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
			}
			
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
			}
		});
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y, null);
	}
}



public class MouseEvent extends JFrame {
	
	// �ֻ��� �����̳ʰ��Ǵ� ������
	public MouseEvent() {
		add(new MyPanel());
		setSize(300,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new MouseEvent();

	}

}
