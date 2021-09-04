package swing_Lab.eventListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame3 extends JFrame implements ActionListener {
	
	private JButton button;
	private JLabel label;
	
	public MyFrame3() {
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ ����");
		
		JPanel p = new JPanel();
		button = new JButton("��ư�� �����ÿ�");
		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�");
		
		button.addActionListener(this);
		p.add(button);
		p.add(label);
		
		this.add(p);
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == button) {
			label.setText("��ħ�� ��ư�� ���������ϴ�.");
		}
		
	}
	
}






public class ActionEventTest3 {

	public static void main(String[] args) {
		MyFrame3 f = new MyFrame3();
		
	}

}

