package swing_Lab.eventListener.keyEvent;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
class MyPanel2 extends JPanel implements ActionListener {

	boolean flag = false;
	private int light_number = 0;
	
	public MyPanel2() {
		setLayout(new BorderLayout());
		JButton b = new JButton("traffic light turn on");
		b.addActionListener(this);	// ��ư�� ������ ���
		add(b, BorderLayout.SOUTH);	// �гο� ������Ʈ�� �ϴܿ� ���
	}
	
	//ȭ�鿡 �׸��� �׸��� �޼ҵ�
	@Override
	protected void paintComponent(Graphics g) {
	
		super.paintComponent(g);
		g.setColor(Color.black);
		g.drawOval(100, 100, 100, 100);
		g.drawOval(100, 200, 100, 100);
		g.drawOval(100, 300, 100, 100);
		
		if(light_number == 0) {
			g.setColor(Color.red);
			g.fillOval(100, 100, 100, 100);
		} else if(light_number == 1) {
			g.setColor(Color.green);
			g.fillOval(100, 200, 100, 100);
		} else {
			g.setColor(Color.yellow);
			g.fillOval(100, 300, 100, 100);
		}
	}
	
	// �׼� ������ ����
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(++light_number >= 3) { // 1,2,3 ��ȣ��������ϰ�, 3�̻���ʹ� 0���� �ʱ�ȭ��
			light_number = 0;
		}
		repaint();
	}
}



@SuppressWarnings("serial")
public class TrafficLight extends JFrame {

	public TrafficLight() {
		add(new MyPanel2());
		setTitle("��ȣ��");
		setSize(300,500);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		
		new TrafficLight();
	}

}
