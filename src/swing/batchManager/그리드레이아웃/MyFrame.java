package swing.batchManager.�׸��巹�̾ƿ�;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MyFrame extends JFrame {
	
	public MyFrame() {
		
		setTitle("GridLayout Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(0,3));	// �׸��� ��ġ ������
		
		add(new JButton("Button1"));
		add(new JButton("Button2"));
		add(new JButton("Button3"));
		add(new JButton("B4"));
		add(new JButton("Long Button5"));
		
		pack();				// JFrame�� ������ ������ũ�⿡ �˸°� ���� , �̰ž����� �ȳ���
		setVisible(true);	// ���������� view�� �����ٰ����� 
		
		
	}
	
	
	
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
	
	
	
	
	
}

	
