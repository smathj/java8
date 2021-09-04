package swing_Lab.eventListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		
		JButton button = (JButton) e.getSource(); // �̺�Ʈ�� �߻��� �̺�Ʈ �ҽ��� �����´�(�̺�Ʈ ��ü)
		String msg = button.getText();
		
		if(msg.equals("��ħ�� ��ư�� �������׿�")) {
			
			button.setText("��ư�� �����ּ���");
		} else {
			button.setText("��ħ�� ��ư�� �������׿�");
		}
		
		
		
		
		// ���̺��� MyFrame Ŭ���� �ȿ� �־ �����ϱ� ��ƴ�
		//label.setText("��ħ�� ��ư�� �������׿�");	
	}
}


class MyFrame extends JFrame {
	
	private JButton button;
	private JLabel label;
	
	public MyFrame() {
		
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ ����");
		
		JPanel p = new JPanel();
		button = new JButton("��ư�� ��������");
		label = new JLabel("��ư�� ������ �Ӵٸ� ���ٸ��մϴ�");
		
		
		button.addActionListener(new MyListener());
		
		p.add(button);
		p.add(label);
		
		this.add(p);
		this.setVisible(true);
	}
}


public class ActionEventTest1 {
	public static void main(String[] args) {
		
		MyFrame t = new MyFrame();
	}

}
