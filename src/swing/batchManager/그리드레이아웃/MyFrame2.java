package swing.batchManager.�׸��巹�̾ƿ�;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame2 extends JFrame {
	JPanel p1;
	
	public MyFrame2() {
		
		setSize(300,200);
		setTitle("�׸��� ���̾ƿ� �׽�Ʈ");
		
		p1 = new JPanel();
		p1.setLayout(new GridLayout(0,3));
		for(int i = 0; i < 10; i++) 
		{
			p1.add(new JButton("Button" + i));
			
		}
//		p1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT); 
		add(p1);
		pack();	
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		
		MyFrame2 f = new MyFrame2();
	}
	
}
