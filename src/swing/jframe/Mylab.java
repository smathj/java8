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
		
		// ���� ȭ���� ũ�⸦ ��´�
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		Image img = kit.getImage("����dog.jpg");
		
		
		JFrame f = new JFrame();		// ������(�ֻ��� �����̳�)
		JPanel panel = new JPanel();	// �г�  (�����̳�)
		
		f.add(panel);					// �����ӿ� �����̳� ����
		
		JLabel label1 = new JLabel("ȭ�� �µ�");
		JLabel label2 = new JLabel("���� �µ�");
		
		JTextField filed1 = new JTextField(15);		// input maxLength 15
		JTextField filed2 = new JTextField(15);		// input maxLength 15
		
		JButton button = new JButton("��ȯ");			// button
		
		
		panel.add(label1);
		panel.add(filed1);
		
		panel.add(label2);
		panel.add(filed2);
		
		panel.add(button);
		
		
		f.setIconImage(img);
		f.setSize(300,150);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("�µ� ��ȯ����");
		f.setVisible(true);
		
		
		
		
		
		
	}

}
