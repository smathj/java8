package swing_Lab.jframe;

import javax.swing.JFrame;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ������ �����ϱ� #1
		JFrame f = new JFrame("Frame Test");
		
		f.setSize(300,200);									// ������ ũ�� ����
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// "â�ݱ�"��ư
		f.setVisible(true);									// ������ ���� ���� ����
		
		
	}

}
