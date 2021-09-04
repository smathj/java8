package swing_Lab.jframe;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class MyFrame extends JFrame {
	// ������ �����ϱ� #2
	
	// JFrame�� ��ӹް� , ������ ����
	public MyFrame() {
		
		setSize(800,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("�������� ���ڰ� ���ƴ�");
		
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		
		JLabel label1 = new JLabel("������ ���ڱ����� ���Ű� ȯ���մϴ�. ������ ��󺸽ð�");
		
		panelA.add(label1);
		
		JButton button1 = new JButton("Ű��&�Ϻ� ��������");
		JButton button2 = new JButton("���l&���� ��������");
		JButton button3 = new JButton("����&�븮���� ��������");
		
		panelB.add(button1);
		panelB.add(button2);
		panelB.add(button3);
		
		
		JLabel label2 = new JLabel("����");
		
		JTextField field1 = new JTextField(10);
		
		panelB.add(label2);	// �г�B�� "����" �߰�
		panelB.add(field1);	// �г�B�� ��ǲ�ڽ� �߰�
		panelB.setBackground(Color.black);
		
		
		panel.add(panelA);	// ���� �ܺ� �гο� �г�A �߰�
		panel.add(panelB);	// ���� �ܺ� �гο� �г�B �߰�
		
		add(panel);
		
		
		
		
		
		
		
		
		
		// ���� ȭ���� ũ�⸦ ��´�
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setLocation(screenSize.width/2, screenSize.height/2); // ȭ�� �߾ӿ� ��Ÿ����!
		Image img = kit.getImage("����dog.jpg");
		setIconImage(img);
		
		
//		setLayout(new FlowLayout());			// ���������� ������Ʈ�� ��ġ�ϴ� ��� ���
//		JButton button = new JButton("��ư");		// ��ư ����
//		this.add(button);						// ��ư �߰�
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		MyFrame f = new MyFrame();
	}
	
}
