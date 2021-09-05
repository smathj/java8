package swing_Lab.eventListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame4 extends JFrame {
	
	private JButton button;
	private JLabel label;
	
	
	public MyFrame4() {
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ ����");
		
		JPanel p = new JPanel();	// �����̳�
		
		
		button = new JButton("��ư�� �����ÿ�");			// ��ư
		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�");	// ��
		
		// �̺�Ʈ �����ʸ� ��ư�� ����
		// �͸� Ŭ���� ���
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button) {
					label.setText("��ħ�� ��ư�� ���������ϴ�");
				}
			}
		});
		
		p.add(button);
		p.add(label);
		
		this.add(p);
		this.setVisible(true);
		
	}
	
	
}


public class ActionEventTest4 {

	public static void main(String[] args) {

		MyFrame4 f = new MyFrame4();
	}

}
