package swing_Lab.eventListener.keyEvent;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel {
	BufferedImage img = null;
	int img_x = 100;
	int img_y = 100;
	
	public MyPanel() {
		try {
			img = ImageIO.read(new File("동.jpg"));
			
		} catch (IOException e) {
			System.out.println("no image");
			System.exit(1);
		}
		
		addKeyListener(new KeyListener() {
			//키가 눌릴때
			public void keyPressed(KeyEvent e) {
				int keycode = e.getKeyCode();
				switch(keycode) {
					case KeyEvent.VK_UP :
						img_y -= 10;
						break;
					case KeyEvent.VK_DOWN :
						img_y += 10;
						break;
					case KeyEvent.VK_LEFT :
						img_x -= 10;
						break;
					case KeyEvent.VK_RIGHT :
						img_x += 10;
						break;
				}
				repaint();
			}
			
			//키를 땔때
			public void keyReleased(KeyEvent arg0) { }
			//입력이 될때
			public void keyTyped(KeyEvent arg0) { }
			
		});
		
		this.requestFocus();	// 패널이 키보드 포커스를 요청
		setFocusable(true);		// 패널이 포커스(키입력)를 받을 수 있게 한다, 디폴트로는 패널이 키보드 포커스를 받을 수 없다
		
	}
	
	// 자동차 이미지를 화면의 x,y위치에 그린다
	public void paintComponent(Graphics g) {
		super.paintComponent(g);				// super는 패널, 패널.painComponent
		g.drawImage(img, img_x, img_y,null);	// 패널에 그린다
	}
}



public class CarGameTest extends JFrame {

	public CarGameTest() {
		setSize(300,300);
		setTitle("하북아 똥사러가자");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel());
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		CarGameTest s = new CarGameTest();
	}

}
