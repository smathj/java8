package swing.jframe;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Mylab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 현재 화면의 크기를 얻는다
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		Image img = kit.getImage("동경dog.jpg");
		
		
		JFrame f = new JFrame();		// 프레임(최상위 컨테이너)
		JPanel panel = new JPanel();	// 패널  (컨테이너)
		
		f.add(panel);					// 프레임에 컨테이너 장착
		
		JLabel label1 = new JLabel("화씨 온도");
		JLabel label2 = new JLabel("섭씨 온도");
		
		JTextField filed1 = new JTextField(15);		// input maxLength 15
		JTextField filed2 = new JTextField(15);		// input maxLength 15
		
		JButton button = new JButton("변환");			// button
		
		
		panel.add(label1);
		panel.add(filed1);
		
		panel.add(label2);
		panel.add(filed2);
		
		panel.add(button);
		
		
		f.setIconImage(img);
		f.setSize(300,150);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("온도 변환기쿤");
		f.setVisible(true);
		
		
		
		
		
		
	}

}
